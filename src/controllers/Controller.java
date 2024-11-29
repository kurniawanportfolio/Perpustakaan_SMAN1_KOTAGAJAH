/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;
import tables.BukuTablePrintModel;
import tables.AnggotaTablePrintModel;
import tables.TextTableLeft;
import tables.TextTableCenter;
import tables.PeminjamanTablePrintModel;
import tables.TextTableRight;
import form.MainWindow;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import models.Admin;
import models.Anggota;
import models.Buku;
import models.Peminjaman;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRTableModelDataSource;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;
import requests.AdminRequest;
import requests.AnggotaRequest;
import requests.BukuRequest;
import requests.PeminjamanRequest;
import requests.PengembalianRequest;
import tables.FormPendaftaranTablePrintModel;
import tables.KartuAnggotaFrontPrintTable;

/**
 *
 * @author ACER
 */
public final class Controller extends MainWindow{
    protected Admin admin;
    protected Anggota anggota;
    protected Buku buku;
    protected Peminjaman peminjaman;
    protected final TableCellRenderer textTableLeft = new TextTableLeft();
    protected final TableCellRenderer textTableCenter = new TextTableCenter();
    protected final TableCellRenderer textTableRight = new TextTableRight();
    
    protected Controller(){
        startApp();
    }
    
    public static void main(String[] args) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Controller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {new Controller().setVisible(true);
        });
    }
    
    protected void startApp(){
        this.admin = new Admin();
        this.anggota = new Anggota();
        this.buku = new Buku();
        this.peminjaman = new Peminjaman();
        
        ((DefaultTableModel)buku_tabel.getModel()).setRowCount(0);
        ((DefaultTableModel)peminjaman_tabel.getModel()).setRowCount(0);
        ((DefaultTableModel)anggota_tabel.getModel()).setRowCount(0);
        
        this.buku.setTable(buku_tabel);
        this.peminjaman.setTable(peminjaman_tabel);
        this.anggota.setTable(anggota_tabel);
        
        auth(this.admin.isAuth());
    }
    
    public void moveFile(String currentPath, String filename){
        try {
            String path = new File(".").getCanonicalPath();
            String newPath = path+"\\src\\uploads\\"+filename;
            File source = new File(currentPath);
            File dest = new File(newPath);
            try{
                OutputStream os;
                try (InputStream is = new FileInputStream(source)) {
                    os = new FileOutputStream(dest);
                    byte[] buffer = new byte[4096];
                    int length;
                    while((length = is.read(buffer)) > 0){
                        os.write(buffer, 0, length);
                    }
                    is.close();
                }
                os.close();
            }catch(IOException ex){
                
            }
        } catch (IOException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public String updateFile(String currentPath, String filename){
        try {
            String path = new File(".").getCanonicalPath();
            String newPath = path+"\\src\\uploads\\"+filename;
            File source = new File(currentPath);
            File dest = new File(newPath);
            if(dest.exists() && currentPath.trim().equals(newPath.trim())){
                return newPath;
            }
            try{
                OutputStream os;
                try (InputStream is = new FileInputStream(source)) {
                    os = new FileOutputStream(dest);
                    byte[] buffer = new byte[4096];
                    int length;
                    while((length = is.read(buffer)) > 0){
                        os.write(buffer, 0, length);
                    }
                    is.close();
                }
                os.close();
                return newPath;
            }catch(IOException ex){
                
            }
        } catch (IOException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";
    }
    
    protected String getTanggalPinjamLaporan(String bulan, String tahun){
        String tanggalPinjam = "(peminjaman.tanggal_pinjam ";
        if(tahun.contains("-")){
            int tb = Integer.parseInt(tahun.split("-")[0]);
            int te = Integer.parseInt(tahun.split("-")[1]);
            if(tb == te){
                tanggalPinjam += "like '%"+tb+"-"+bulan+"%') ";
            }
            else{
                for(int i = tb; i <= te; i++){
                    if(i == tb){
                        tanggalPinjam += "like '%"+i+"-"+bulan+"%' ";
                    }
                    if(i == te){
                        tanggalPinjam += "or peminjaman.tanggal_pinjam like '%"+i+"-"+bulan+"%') ";
                    }
                    if(i > tb && i < te){
                        tanggalPinjam += "or peminjaman.tanggal_pinjam like '%"+i+"-"+bulan+"%' ";   
                    }
                }
            }
        }
        else{
            Date tahun_sekarang = Calendar.getInstance(new Locale("id", "ID")).getTime();
            int tb = Integer.parseInt(tahun);
            int te = Integer.parseInt(new SimpleDateFormat("yyyy").format(tahun_sekarang));
            if(tb == te){
                tanggalPinjam += "like '%"+tb+"-"+bulan+"%') ";
            }
            else{
                for(int i = tb; i <= te; i++){
                    if(i == tb){
                        tanggalPinjam += "like '%"+i+"-"+bulan+"%' ";
                    }
                    if(i == te){
                        tanggalPinjam += "or peminjaman.tanggal_pinjam like '%"+i+"-"+bulan+"%') ";
                    }
                    if(i > tb && i < te){
                        tanggalPinjam += "or peminjaman.tanggal_pinjam like '%"+i+"-"+bulan+"%' ";
                    }
                }
            }
        }
        return tanggalPinjam;
    }
    protected String generateNoInvent(String noInvent){
        int curr = Integer.parseInt(noInvent);
        if(curr%100 < 99){
            curr ++;
        }
        else{
            int temp = curr%100;
            curr /= 100;
            return String.format("%s%s", curr,temp+1);
        }
        return ""+curr;
    }
    protected void saveAttemptCache(String username, String password, boolean rememberMe){
        try {
            String path = new File(".").getCanonicalPath() + "\\src\\cache\\login.txt";
            try (FileWriter file = new FileWriter(path, false)) {
                if(rememberMe){
                    file.write(username+","+password+",true");
                    return;
                }
                file.write("Username...,password,false");
            }
        } catch (IOException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    protected void useAttemptCache(){
        try {
            String path = new File(".").getCanonicalPath() + "\\src\\cache\\login.txt";
            File file = new File(path);
            if(file.exists()){
                try {
                    FileReader reader = new FileReader(file);
                    String[] cache;
                    int chr;
                    String result = "";
                    while((chr = reader.read()) != -1){
                        result += (char)chr;
                    }
                    cache = result.split(",");
                    username_field_log.setText(cache[0].trim());
                    password_field_log.setText(cache[1].trim());
                    remember_me.setSelected(cache[2].equals("true"));
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    protected void set_buku_input_baru_message(boolean isSuccess, String message){
        if(isSuccess){
            buku_baru_alert_message.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_box_important-success_16.png")));
            buku_baru_alert_message.setForeground(new Color(0,0,255));
            buku_baru_alert_message.setText(message);
        }
        else{
            buku_baru_alert_message.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_box_important-danger_16.png")));
            buku_baru_alert_message.setForeground(new Color(255,0,0));
            buku_baru_alert_message.setText(message);
        }
    }
    protected void set_buku_input_edit_message(boolean isSuccess, String message){
        if(isSuccess){
            buku_edit_alert_message.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_box_important-success_16.png")));
            buku_edit_alert_message.setForeground(new Color(0,0,255));
            buku_edit_alert_message.setText(message);            
        }
        else{
            buku_edit_alert_message.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_box_important-danger_16.png")));
            buku_edit_alert_message.setForeground(new Color(255,0,0));
            buku_edit_alert_message.setText(message);
        }
    }
    protected void reset_buku_input_baru(){
        buku_baru_alert_message.setIcon(null);
        buku_baru_alert_message.setForeground(new Color(0,0,0));
        buku_baru_alert_message.setText(null);
        no_invent_baru.setText(null);
        judul_buku_baru.setText(null); 
        no_isbn_baru.setText(null);
        pengarang_buku_baru.setText(null);
        penerbit_buku_baru.setText(null);
        path_image_buku = null;
        preview_buku_baru.setIcon(null);
    }
    protected void reset_buku_input_edit(){
        buku_edit_alert_message.setIcon(null);
        buku_edit_alert_message.setForeground(new Color(0,0,0));
        buku_edit_alert_message.setText(null);
        no_invent_edit.setText(null);
        judul_buku_edit.setText(null); 
        no_isbn_edit.setText(null);
        pengarang_buku_edit.setText(null);
        penerbit_buku_edit.setText(null);
        path_image_buku_edit = null;
        preview_buku_edit.setIcon(null);
    }
    protected void set_buku_pinjam_message(boolean isSucces, String message){
        if(isSucces){
            buku_pinjam_alert_message.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_box_important-success_16.png")));
            buku_pinjam_alert_message.setForeground(new Color(0,0,255));
            buku_pinjam_alert_message.setText(message);
            buku_pinjam_alert_message.setVisible(true);
        }
        else{
            buku_pinjam_alert_message.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_box_important-danger_16.png")));
            buku_pinjam_alert_message.setForeground(new Color(255,0,0));
            buku_pinjam_alert_message.setText(message);
            buku_pinjam_alert_message.setVisible(true);
        }
    }
    protected void set_buku_kembali_message(boolean isSucces, String message){
        if(isSucces){
            buku_kembali_alert_message.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_box_important-success_16.png")));
            buku_kembali_alert_message.setForeground(new Color(0,0,255));
            buku_kembali_alert_message.setText(message);
        }
        else{
            buku_kembali_alert_message.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_box_important-danger_16.png")));
            buku_kembali_alert_message.setForeground(new Color(255,0,0));
            buku_kembali_alert_message.setText(message);
        }
    }
    protected void reset_peminjaman_buku(){
        buku_pinjam_alert_message.setIcon(null);
        buku_pinjam_alert_message.setForeground(new Color(0,0,0));
        buku_pinjam_alert_message.setText(null);
        id_anggota_pinjam.setText(null);
        kelas_1_pinjam.setSelectedIndex(0);
        kelas_2_pinjam.setSelectedIndex(0);
        kelas_3_pinjam.setSelectedIndex(0);
        no_buku_pinjam.setText(null);
        lama_peminjaman_buku.setSelectedIndex(0);
        tanggal_pinjam.setDate(null);
    }
    protected void reset_pengembalian_buku(){
        buku_kembali_alert_message.setIcon(null);
        buku_kembali_alert_message.setForeground(new Color(0,0,0));
        buku_kembali_alert_message.setText(null);
        status_telat_alert_message.setText(null);
        status_telat_alert_message.setIcon(null);
        status_telat_alert_message.setForeground(null);
        id_pinjam.setText(null);
        tanggal_kembali.setDate(null);
    }
    protected void set_anggota_baru_message(boolean isSucces, String message){
        if(isSucces){
            anggota_baru_alert_message.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_box_important-success_16.png")));
            anggota_baru_alert_message.setForeground(new Color(0,0,255));
            anggota_baru_alert_message.setText(message);
        }
        else{
            anggota_baru_alert_message.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_box_important-danger_16.png")));
            anggota_baru_alert_message.setForeground(new Color(255,0,0));
            anggota_baru_alert_message.setText(message);
        }
    }
    protected void set_anggota_edit_message(boolean isSucces, String message){
        if(isSucces){
            anggota_edit_alert_message.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_box_important-success_16.png")));
            anggota_edit_alert_message.setForeground(new Color(0,0,255));
            anggota_edit_alert_message.setText(message);
        }
        else{
            anggota_edit_alert_message.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_box_important-danger_16.png")));
            anggota_edit_alert_message.setForeground(new Color(255,0,0));
            anggota_edit_alert_message.setText(message);
        }
    }
    protected void reset_anggota_baru_message(){
        anggota_baru_alert_message.setIcon(null);
        anggota_baru_alert_message.setForeground(new Color(0,0,0));
        anggota_baru_alert_message.setText(null);
        nama_siswa_baru.setText(null);
        nis_baru.setText(null);
        jenis_kelamin_baru.setSelectedIndex(0);
        tanggal_lahir_baru.setDate(null);
        alamat_baru.setText(null);
        kode_pos_baru.setText(null);
        no_telp_baru.setText(null);
    }
    protected void reset_anggota_edit_message(){
        anggota_edit_alert_message.setIcon(null);
        anggota_edit_alert_message.setForeground(new Color(0,0,0));
        anggota_edit_alert_message.setText(null);
        id_siswa_edit.setText(null);
        nama_siswa_edit.setText(null);
        nis_edit.setText(null);
        jenis_kelamin_edit.setSelectedIndex(0);
        tanggal_lahir_edit.setDate(null);
        alamat_edit.setText(null);
        kode_pos_edit.setText(null);
        no_telp_edit.setText(null);
        preview_anggota_edit.setIcon(null);
        path_image_anggota_edit = null;
    }
    protected void loadTabelBuku(){
        this.buku.loadData();
        buku_tabel.getColumnModel().getColumn(0).setCellRenderer(this.textTableCenter);
        buku_tabel.getColumnModel().getColumn(1).setCellRenderer(this.textTableLeft);
        buku_tabel.getColumnModel().getColumn(2).setCellRenderer(this.textTableCenter);
        buku_tabel.getColumnModel().getColumn(3).setCellRenderer(this.textTableLeft);
        buku_tabel.getColumnModel().getColumn(4).setCellRenderer(this.textTableCenter);
        buku_tabel.getColumnModel().getColumn(5).setCellRenderer(new tables.TableImageRenderer());
        jumlah_buku.setText(""+this.buku.getRecord()+" buku");
    }
    protected void loadTabelPeminjamanPengembalianBuku(){
        this.peminjaman.loadData();
        peminjaman_tabel.getColumnModel().getColumn(0).setCellRenderer(this.textTableCenter);
        peminjaman_tabel.getColumnModel().getColumn(1).setCellRenderer(this.textTableLeft);
        peminjaman_tabel.getColumnModel().getColumn(2).setCellRenderer(this.textTableCenter);
        peminjaman_tabel.getColumnModel().getColumn(3).setCellRenderer(this.textTableCenter);
        peminjaman_tabel.getColumnModel().getColumn(4).setCellRenderer(this.textTableCenter);
        peminjaman_tabel.getColumnModel().getColumn(5).setCellRenderer(this.textTableLeft);
        peminjaman_tabel.getColumnModel().getColumn(6).setCellRenderer(this.textTableLeft);
        peminjaman_tabel.getColumnModel().getColumn(7).setCellRenderer(this.textTableCenter);
        peminjaman_tabel.getColumnModel().getColumn(8).setCellRenderer(this.textTableCenter);
        peminjaman_tabel.getColumnModel().getColumn(9).setCellRenderer(this.textTableCenter);
        jumlah_peminjam.setText(""+this.peminjaman.getRecord()+" peminjaman buku");
    }
    protected void loadTabelAnggota(){
        this.anggota.loadData();
        anggota_tabel.getColumnModel().getColumn(0).setCellRenderer(this.textTableCenter);
        anggota_tabel.getColumnModel().getColumn(1).setCellRenderer(this.textTableLeft);
        anggota_tabel.getColumnModel().getColumn(2).setCellRenderer(this.textTableCenter);
        anggota_tabel.getColumnModel().getColumn(3).setCellRenderer(this.textTableCenter);
        anggota_tabel.getColumnModel().getColumn(4).setCellRenderer(this.textTableCenter);
        anggota_tabel.getColumnModel().getColumn(5).setCellRenderer(this.textTableCenter);
        anggota_tabel.getColumnModel().getColumn(6).setCellRenderer(this.textTableCenter);
        anggota_tabel.getColumnModel().getColumn(7).setCellRenderer(this.textTableCenter);
        anggota_tabel.getColumnModel().getColumn(8).setCellRenderer(new tables.TableImageRenderer());
        jumlah_anggota.setText(""+this.anggota.getRecord()+" orang");
    }
//    Function methods override
    @Override protected void auth(boolean isAuth){
        if(!isAuth){
            useAttemptCache();
            showLoginForm();
            return;
        }
        showMainWindow();
    }
    @Override protected void logout(){
        int confirm = JOptionPane.showConfirmDialog(this, "Anda yakin ingin logout?", "Logout", javax.swing.JOptionPane.YES_NO_OPTION);
        if(confirm == JOptionPane.YES_OPTION){
            startApp();
        }
    }
    @Override protected void setMenuIconBGColor(JLabel btn){
        if(btn == signout_icon || btn == signout_label){
            btn.setBackground(new Color(239,23,38));
            btn.setForeground(new Color(100,23,38));
            signout_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_sign_out-dark_32.png")));
            return;
        }
        if(btn == submit_login_btn || btn == submit_register_btn){
            btn.setBackground(new Color(5,93,133));
            btn.setForeground(new Color(204,204,255));
            return;
        }
        if(btn == menu_icon){
            menu_icon.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_squared_menu-dark_32.png")));
        }
        if(btn == home_icon || btn == home_label){
            home_icon.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_home-dark_32.png")));
        }
        if(btn == buku_icon || btn == buku_label){
            buku_icon.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_books-dark_32.png")));
        }
        if(btn == anggota_icon || btn == anggota_label){
            anggota_icon.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_people-dark_32.png")));
        }
        if(btn == peminjaman_icon || btn == peminjaman_label){
            peminjaman_icon.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_borrow_book-dark_32.png")));
        }
        if(btn == cetak_laporan_all_icon || btn == cetak_laporan_all_label){
            cetak_laporan_all_icon.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_add_new_print_dark_32.png")));
        }
        btn.setBackground(new Color(53,162,107));
        btn.setForeground(new Color(19, 72, 45));
    }
    @Override protected void resetMenuIconBGColor(JLabel btn){
        if(btn == submit_login_btn || btn == submit_register_btn){
            btn.setBackground(new Color(0,38,74));
            btn.setForeground(new Color(255,255,255));
            return;
        }
        if(btn == menu_icon){
            menu_icon.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_squared_menu_32.png")));
        }
        if(btn == home_icon || btn == home_label){
            home_icon.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_home_32.png")));
        }
        if(btn == buku_icon || btn == buku_label){
            buku_icon.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_books_32.png")));
        }
        if(btn == anggota_icon || btn == anggota_label){
            anggota_icon.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_people_32.png")));
        }
        if(btn == peminjaman_icon || btn == peminjaman_label){
            peminjaman_icon.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_borrow_book_32.png")));
        }
        if(btn == signout_icon || btn == signout_label){
            signout_icon.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_sign_out_32.png")));
        }
        if(btn == cetak_laporan_all_icon || btn == cetak_laporan_all_label){
            cetak_laporan_all_icon.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_add_new_print_light_32.png")));
        }
        btn.setBackground(new Color(54,70,78));
        btn.setForeground(new Color(204, 204, 204));
    }
    @Override protected void showLoginForm(){
        username_field_log.setFocusable(true);
        password_field_log.setFocusable(true);
        login_alert_message.setText(null);
        login_alert_message.setVisible(false);
        
        name_field_reg.setFocusable(false);
        username_field_reg.setFocusable(false);
        password_field_reg.setFocusable(false);
        confirm_password_field_reg.setFocusable(false);
        register_alert_message.setText(null);
        register_alert_message.setVisible(false);
        
        administrator_name.setText("");
        
        login_panel.setVisible(true);
        register_panel.setVisible(false);
        main_app_panel.setVisible(false);
    }
    @Override protected void showRegistrationForm(){
        username_field_log.setFocusable(false);
        password_field_log.setFocusable(false);
        login_alert_message.setText(null);
        login_alert_message.setVisible(false);
        
        name_field_reg.setFocusable(true);
        username_field_reg.setFocusable(true);
        password_field_reg.setFocusable(true);
        confirm_password_field_reg.setFocusable(true);
        register_alert_message.setText(null);
        register_alert_message.setVisible(false);
        

        administrator_name.setText("");
        
        login_panel.setVisible(false);
        register_panel.setVisible(true);
        main_app_panel.setVisible(false);
    }
    @Override protected void showMainWindow(){
        username_field_log.setFocusable(false);
        password_field_log.setFocusable(false);
        
        name_field_reg.setFocusable(false);
        username_field_reg.setFocusable(false);
        password_field_reg.setFocusable(false);
        confirm_password_field_reg.setFocusable(false);
        
        administrator_name.setText(this.admin.getNama());
        
        login_panel.setVisible(false);
        register_panel.setVisible(false);
        main_app_panel.setVisible(true);
        loadTabelBuku();
        loadTabelPeminjamanPengembalianBuku();
        loadTabelAnggota();
    }
    @Override protected void showHomePanel(){
        home_panel.setVisible(true);
        jumlah_buku.setText(""+this.buku.getRecord()+" buku");
        jumlah_anggota.setText(""+this.anggota.getRecord()+" orang");
        jumlah_peminjam.setText(""+this.peminjaman.getRecord()+" peminjaman buku");
        
        buku_panel.setVisible(false);
        anggota_panel.setVisible(false);
        peminjaman_panel.setVisible(false);
        cetak_laporan_all_panel.setVisible(false);
    }
    @Override protected void showBukuPanel(){
        home_panel.setVisible(false);
        buku_panel.setVisible(true);
        anggota_panel.setVisible(false);
        peminjaman_panel.setVisible(false);
        cetak_laporan_all_panel.setVisible(false);
    }
    @Override protected void showAnggotaPanel(){
        home_panel.setVisible(false);
        buku_panel.setVisible(false);
        anggota_panel.setVisible(true);
        peminjaman_panel.setVisible(false);
        cetak_laporan_all_panel.setVisible(false);
    }
    @Override protected void showPeminjamanPengembalianPanel(){
        home_panel.setVisible(false);
        buku_panel.setVisible(false);
        anggota_panel.setVisible(false);
        peminjaman_panel.setVisible(true);
        cetak_laporan_all_panel.setVisible(false);
    }
    @Override protected void showCetakLaporanAllPanel(){
        home_panel.setVisible(false);
        buku_panel.setVisible(false);
        anggota_panel.setVisible(false);
        peminjaman_panel.setVisible(false);
        cetak_laporan_all_panel.setVisible(true);
    }
    @Override protected void sideBarToggle(){
        int width = sidebar_labels.getWidth();
        int height = sidebar_labels.getHeight(); 
        Thread toggle = new Thread(){
            @Override public void run(){
                if(width >=240){
                    sidebar_labels.setSize(0, height);
                }
                else{
                    sidebar_labels.setSize(240, height);
                }
            }
        };
        toggle.start();
    }
//    Buttons
    @Override protected void submit_login_btnMousePressed(MouseEvent evt){
        String usr = username_field_log.getText();
        String pass = password_field_log.getText();
        boolean rememberMe = remember_me.isSelected();
        boolean attempt = this.admin.attempt(usr);
        if(attempt){
            if(!this.admin.getPassword().equals(pass)){
                login_alert_message.setText("Password salah.");
                login_alert_message.setVisible(true);
                return;
            }
            saveAttemptCache(usr, pass, rememberMe);
            showMainWindow();
            return;
        }
        login_alert_message.setText("User tidak ditemukan.");
        login_alert_message.setVisible(true);
    }
    @Override protected void submit_register_btnMousePressed(MouseEvent evt){
        AdminRequest adminRequest = new AdminRequest(
                name_field_reg.getText(), 
                username_field_reg.getText(), 
                password_field_reg.getText());
        String confirm_password = confirm_password_field_reg.getText();
        if(!adminRequest.validate()){
            register_alert_message.setText("Semua harus diisi!");
            register_alert_message.setVisible(true);
        }
        else{
            if(adminRequest.getPassword().equals(confirm_password)){
                if(this.admin.insert(adminRequest)){
                    saveAttemptCache(adminRequest.getUsername(), adminRequest.getPassword(), true);
                    auth(this.admin.isAuth());
                    JOptionPane.showMessageDialog(this, "Registrasi berhasil.");
                    return;
                }
                register_alert_message.setText("Username sudah ada.");
                register_alert_message.setVisible(true);
            }
            else{
                register_alert_message.setText("Konfimasi password tidak cocok.");
                register_alert_message.setVisible(true);
            }
        }
    }
//    Buttons buku
    @Override protected void insert_buku_baruMousePressed(java.awt.event.MouseEvent evt){
        BukuRequest bukuRequest = new BukuRequest(
                no_invent_baru.getText(), 
                judul_buku_baru.getText(), 
                no_isbn_baru.getText(), 
                pengarang_buku_baru.getText(),
                penerbit_buku_baru.getText()
        );
        if(!bukuRequest.validate() || path_image_buku == null){
            set_buku_input_baru_message(false, "Semua harus di isi");
            return;
        }
        if(bukuRequest.getNoBuku().contains("-")){
            System.out.println("-");
            return;
        }
        if(this.buku.insert(bukuRequest)){
            moveFile(path_image_buku, "buku\\" + no_invent_baru.getText() + ".jpg");
            set_buku_input_baru_message(true, "Input buku baru sukses.");
            no_invent_baru.setText(generateNoInvent(bukuRequest.getNoBuku()));
            loadTabelBuku();
        }
        else{
            set_buku_input_baru_message(false, "Nomor buku sudah dipakai");
        }
    }
    @Override protected void reset_buku_baruMousePressed(java.awt.event.MouseEvent evt){
        reset_buku_input_baru();
    }
    @Override protected void edit_buku_btnMousePressed(java.awt.event.MouseEvent evt){
        reset_buku_input_edit();
        try{
            no_invent_edit.setText(buku_tabel.getValueAt(buku_tabel.getSelectedRow(), 0).toString());
            judul_buku_edit.setText(buku_tabel.getValueAt(buku_tabel.getSelectedRow(), 1).toString());
            no_isbn_edit.setText(buku_tabel.getValueAt(buku_tabel.getSelectedRow(), 2).toString());
            pengarang_buku_edit.setText(buku_tabel.getValueAt(buku_tabel.getSelectedRow(), 3).toString());
            penerbit_buku_edit.setText(buku_tabel.getValueAt(buku_tabel.getSelectedRow(), 4).toString());
            String path = new File(".").getCanonicalPath() 
                    + "\\src\\uploads\\buku\\" 
                    + buku_tabel.getValueAt(buku_tabel.getSelectedRow(), 0).toString() + ".jpg";
            preview_buku_edit.setIcon(new ImageIcon(
                    new ImageIcon(path)
                    .getImage()
                    .getScaledInstance(preview_buku_edit.getWidth(), preview_buku_edit.getHeight(), Image.SCALE_SMOOTH)
                    ));
            path_image_buku_edit = path;
        }catch(IOException|IndexOutOfBoundsException e){
            JOptionPane.showMessageDialog(this, "Pilih buku mana yang ingin diedit!");
        }
    }
    @Override protected void update_bukuMousePressed(java.awt.event.MouseEvent evt){
        BukuRequest bukuRequest = new BukuRequest(
                no_invent_edit.getText(), 
                judul_buku_edit.getText(), 
                no_isbn_edit.getText(), 
                pengarang_buku_edit.getText(),
                penerbit_buku_edit.getText()
        );
        if(!bukuRequest.validate() || path_image_buku_edit == null){
            set_buku_input_edit_message(false, "Semua harus di isi!");
            return;
        }
        int selectedRow = 0;
        for(int i=0; i < this.buku.getRecord(); i++){
            if(this.buku.table().getValueAt(i, 0).toString().equals(bukuRequest.getNoBuku())){
                selectedRow = i;
                break;
            }
        }
        if(this.buku.update(bukuRequest)){
            set_buku_input_edit_message(true, "Edit buku sukses.");
            this.buku.table().setValueAt(bukuRequest.getJudulBuku(), selectedRow, 1);
            this.buku.table().setValueAt(bukuRequest.getNoISBN(), selectedRow, 2);
            this.buku.table().setValueAt(bukuRequest.getPengarang(), selectedRow, 3);
            this.buku.table().setValueAt(bukuRequest.getPenerbit(), selectedRow, 4);
            String path = updateFile(path_image_buku_edit, "buku\\" + bukuRequest.getNoBuku() + ".jpg");
            JLabel img = new JLabel();
            img.setIcon(
                    new ImageIcon(
                            new ImageIcon(path)
                                    .getImage()
                                    .getScaledInstance(100, 100, Image.SCALE_SMOOTH)));
            this.buku.table().setValueAt(img, selectedRow, 5);
        }
        else{
            set_buku_input_edit_message(false, "Update gagal! nomor buku sudah dipakai.");
        }
    }
    @Override protected void reset_buku_editMousePressed(java.awt.event.MouseEvent evt){
        reset_buku_input_edit();
    }
    @Override protected void hapus_buku_btnMousePressed(java.awt.event.MouseEvent evt){
        int[] rows = buku_tabel.getSelectedRows();
        if(rows.length <= 0){
            JOptionPane.showMessageDialog(this, "Pilih buku mana yang ingin dihapus!");
            return;
        }
        int confirm = JOptionPane.showConfirmDialog(this, "Anda yakin ingin menghapus ini?", "Peringatan", JOptionPane.YES_NO_OPTION);
        if(confirm == JOptionPane.YES_OPTION){
            try{
                int selectedRow = 0;
                for(int i = 0; i < this.buku.getRecord(); i++){
                    if(buku_tabel.getValueAt(rows[0], 0).equals(this.buku.table().getValueAt(i, 0))){
                        selectedRow = i;
                        break;
                    }
                }
                for(int row : rows){
                    if(this.buku.delete(buku_tabel.getValueAt(rows[0], 0).toString())){
                        ((DefaultTableModel)buku_tabel.getModel()).removeRow(selectedRow);
                    }
                }   
            }catch(ArrayIndexOutOfBoundsException e){
                JOptionPane.showMessageDialog(this, "Tabel kosong!");
            }
        }
    }
    @Override protected void cetak_laporan_buku_btnMousePressed(java.awt.event.MouseEvent evt){
        try {
            BukuTablePrintModel tempModel = new BukuTablePrintModel(buku_tabel);
            String path = new File(".").getCanonicalPath()+"\\src\\laporan\\buku_laporan.jrxml";
            JasperDesign design = JRXmlLoader.load(path);
            JasperReport report = JasperCompileManager.compileReport(design);
            JasperPrint print = JasperFillManager.fillReport(report, null, new JRTableModelDataSource(tempModel.getModel()));
            JasperViewer.viewReport(print, false);
        } catch (IOException | JRException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //    Buttons peminjaman & pengembalian
    @Override protected void insert_peminjamanMousePressed(java.awt.event.MouseEvent evt){
        try{
            PeminjamanRequest peminjamanRequest = new PeminjamanRequest(
            id_anggota_pinjam.getText(), 
            String.format("%s %s %s", kelas_1_pinjam.getSelectedItem().toString(), 
                    kelas_2_pinjam.getSelectedItem().toString(), 
                    kelas_3_pinjam.getSelectedItem().toString()),
            no_buku_pinjam.getText(), 
            lama_peminjaman_buku.getSelectedItem().toString(), 
            new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(tanggal_pinjam.getDate()));
            if(!peminjamanRequest.validate()){
                set_buku_pinjam_message(false, "Semua harus diisi!");
                return;
            }
            if(this.peminjaman.insert(peminjamanRequest)){
                set_buku_pinjam_message(true, "Input peminjaman sukses.");
                loadTabelPeminjamanPengembalianBuku();
            }
            else{
                set_buku_pinjam_message(false, "Input gagal, anggota atau buku belum terdaftar.");
            }
        }catch(NullPointerException e){
            set_buku_pinjam_message(false, "Semua harus diisi!");
        }
    }
    @Override protected void reset_peminjamanMousePressed(java.awt.event.MouseEvent evt){
        reset_peminjaman_buku();
    }
    @Override protected void hapus_peminjamanMousePressed(java.awt.event.MouseEvent evt){
        int[] rows = peminjaman_tabel.getSelectedRows();
        if(rows.length <= 0){
            JOptionPane.showMessageDialog(this, "Pilih peminjaman mana yang ingin dihapus!");
            return;
        }
        int confirm = JOptionPane.showConfirmDialog(this, "Anda yakin ingin menghapus ini?", "Peringatan", JOptionPane.YES_NO_OPTION);
        if(confirm == JOptionPane.YES_OPTION){
            try{
                int selectedRow = 0;
                for(int i = 0; i < this.peminjaman.getRecord(); i++){
                    if(peminjaman_tabel.getValueAt(rows[0], 0).equals(this.peminjaman.table().getValueAt(i, 0))){
                        selectedRow = i;
                        break;
                    }
                }
                for(int row : rows){
                    if(this.peminjaman.delete(peminjaman_tabel.getValueAt(rows[0], 0))){
                        ((DefaultTableModel)peminjaman_tabel.getModel()).removeRow(selectedRow);
                    }
                }   
            }catch(ArrayIndexOutOfBoundsException e){
                JOptionPane.showMessageDialog(this, "Tabel kosong!");
            }
        }
    }
    @Override protected void cetak_peminjamanMousePressed(java.awt.event.MouseEvent evt){
        try {
            PeminjamanTablePrintModel tempModel = new PeminjamanTablePrintModel(peminjaman_tabel);
            String path = new File(".").getCanonicalPath()+"\\src\\laporan\\peminjaman_dan_pengembalian_laporan.jrxml";
            JasperDesign design = JRXmlLoader.load(path);
            JasperReport report = JasperCompileManager.compileReport(design);
            JasperPrint print = JasperFillManager.fillReport(report, null, new JRTableModelDataSource(tempModel.getModel()));
            JasperViewer.viewReport(print, false);
        } catch (JRException | IOException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @Override protected void edit_peminjamanMousePressed(java.awt.event.MouseEvent evt){
        reset_pengembalian_buku();
        try{
            int row = peminjaman_tabel.getSelectedRow();
            String status = peminjaman_tabel.getValueAt(row, 9).toString();
            
            if(status.trim().equals("masih dipinjam") && !this.peminjaman.passCheckDurasiPeminjaman(
                    peminjaman_tabel.getValueAt(row, 8).toString(), 
                    peminjaman_tabel.getValueAt(row, 7).toString()))
            {
                status_telat_alert_message.setForeground(new Color(255,0,0));
                status_telat_alert_message.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_box_important-danger_16.png")));
                status_telat_alert_message.setText(this.peminjaman.getStatus());
            }
            else if(status.trim().equals("masih dipinjam") && this.peminjaman.passCheckDurasiPeminjaman(
                    peminjaman_tabel.getValueAt(row, 8).toString(), 
                    peminjaman_tabel.getValueAt(row, 7).toString())){
                
            }
            else{
                status_telat_alert_message.setForeground(new Color(0,0,255));
                status_telat_alert_message.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_box_important-success_16.png")));
                status_telat_alert_message.setText("Buku sudah dikembalikan.");
            }

            id_pinjam.setText(peminjaman_tabel.getValueAt(row, 0).toString());
        }catch(IndexOutOfBoundsException e){
            JOptionPane.showMessageDialog(this, "Pilih peminjaman buku mana yang ingin dikembalikan!");
        }
    }    
    @Override protected void insert_pengembalianMousePressed(java.awt.event.MouseEvent evt){
        try{
            PengembalianRequest pengembalianRequest = new PengembalianRequest(
            new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(tanggal_kembali.getDate())
            );
            if(!pengembalianRequest.validate()){
                set_buku_kembali_message(false, "Semua harus diisi!");
                return;
            }
            Integer id = Integer.parseInt(id_pinjam.getText());
            int selectedRow = 0;
            for(int i=0; i < this.peminjaman.getRecord(); i++){
                if(this.peminjaman.table().getValueAt(i, 0).toString().equals(id.toString())){
                    selectedRow = i;
                    break;
                }
            }
            if(this.peminjaman.insert(id, pengembalianRequest)){
                set_buku_kembali_message(true, "Pengembalian buku sukses.");
                this.peminjaman.table().setValueAt(pengembalianRequest.getTanggalKembali(), selectedRow, 9);
                
                status_telat_alert_message.setForeground(new Color(0,0,255));
                status_telat_alert_message.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_box_important-success_16.png")));
                status_telat_alert_message.setText("Buku sudah dikembalikan.");
            }
            else{
                set_buku_kembali_message(false, "Input gagal. ");
            }
        }catch(NullPointerException e){
            set_buku_kembali_message(false, "Semua harus diisi!");
        }
    }
    @Override protected void reset_pengembalianMousePressed(java.awt.event.MouseEvent evt){
        reset_pengembalian_buku();
    }
//    Buttons anggota
    @Override protected void insert_anggota_baruMousePressed(java.awt.event.MouseEvent evt){
        try{
            AnggotaRequest anggotaRequest = new AnggotaRequest(
                nama_siswa_baru.getText(),
                nis_baru.getText(),
                new SimpleDateFormat("yyyy-MM-dd").format(tanggal_lahir_baru.getDate()),
                jenis_kelamin_baru.getSelectedItem().toString().split(" ")[0],
                alamat_baru.getText(),
                kode_pos_baru.getText(),
                no_telp_baru.getText()
            );
            if(!anggotaRequest.validate()){
                set_anggota_baru_message(false, "Semua harus di isi");
                return;
            }
            if(this.anggota.insert(anggotaRequest)){
                moveFile(path_image_anggota, "anggota\\" + nis_baru.getText() + (new SimpleDateFormat("yyyy").format(
                    (Date)Calendar.getInstance().getTime())) +".jpg");
                set_anggota_baru_message(true, "Input anggota baru sukses.");
                loadTabelAnggota();
            }
            else{
                set_anggota_baru_message(false, "Anggota sudah terdaftar");
            }
        }catch(NullPointerException e){
            set_anggota_baru_message(false, "Semua harus di isi");
        }
    }
    @Override protected void reset_anggota_baruMousePressed(java.awt.event.MouseEvent evt){
        reset_anggota_baru_message();
    }
    @Override protected void edit_anggotaMousePressed(java.awt.event.MouseEvent evt){
        reset_anggota_edit_message();
        try{
            int row = anggota_tabel.getSelectedRow();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date date = sdf.parse(anggota_tabel.getValueAt(row, 3).toString());
            int selectedJL = anggota_tabel.getValueAt(row, 4).toString().trim().equals("L")?0:1;
            
            id_siswa_edit.setText(anggota_tabel.getValueAt(row, 0).toString());
            nama_siswa_edit.setText(anggota_tabel.getValueAt(row, 1).toString());
            nis_edit.setText(anggota_tabel.getValueAt(row, 2).toString());
            jenis_kelamin_edit.setSelectedIndex(selectedJL);
            tanggal_lahir_edit.setDate(date);
            alamat_edit.setText(anggota_tabel.getValueAt(row, 5).toString());
            kode_pos_edit.setText(anggota_tabel.getValueAt(row, 6).toString());
            no_telp_edit.setText(anggota_tabel.getValueAt(row, 7).toString());
            
            String path = new File(".").getCanonicalPath() 
                    + "\\src\\uploads\\anggota\\" 
                    + anggota_tabel.getValueAt(anggota_tabel.getSelectedRow(), 0).toString() + ".jpg";
            preview_anggota_edit.setIcon(new ImageIcon(
                    new ImageIcon(path)
                    .getImage()
                    .getScaledInstance(preview_anggota_edit.getWidth(), preview_anggota_edit.getHeight(), Image.SCALE_SMOOTH)
                    ));
            path_image_anggota_edit = path;
        }catch(IOException|IndexOutOfBoundsException e){
            JOptionPane.showMessageDialog(this, "Pilih anggota mana yang ingin edit!");
        } catch (ParseException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @Override protected void update_anggotaMousePressed(java.awt.event.MouseEvent evt){
        try{
            AnggotaRequest anggotaRequest = new AnggotaRequest(
                nama_siswa_edit.getText(),
                nis_edit.getText(),
                new SimpleDateFormat("yyyy-MM-dd").format(tanggal_lahir_edit.getDate()),
                jenis_kelamin_edit.getSelectedItem().toString().split(" ")[0],
                alamat_edit.getText(),
                kode_pos_edit.getText(),
                no_telp_edit.getText()
            );
            if(!anggotaRequest.validate()){
                set_anggota_edit_message(false, "Semua harus di isi");
                return;
            }
            int id = Integer.parseInt(id_siswa_edit.getText());
            int selectedRow = 0;
            for(int i=0; i < this.anggota.getRecord(); i++){
                if(this.anggota.table().getValueAt(i, 0).toString().equals(id_siswa_edit.getText())){
                    selectedRow = i;
                    break;
                }
            }
            if(this.anggota.update(id, anggotaRequest)){
                set_anggota_edit_message(true, "Edit anggota sukses.");
                this.anggota.table().setValueAt(anggotaRequest.getNama(), selectedRow, 1);
                this.anggota.table().setValueAt(anggotaRequest.getNIS(), selectedRow, 2);
                this.anggota.table().setValueAt(anggotaRequest.getTL(), selectedRow, 3);
                this.anggota.table().setValueAt(anggotaRequest.getJenisKel(), selectedRow, 4);
                this.anggota.table().setValueAt(anggotaRequest.getAlamat(), selectedRow, 5);
                this.anggota.table().setValueAt(anggotaRequest.getKodePos(), selectedRow, 6);
                this.anggota.table().setValueAt(anggotaRequest.getNoTelp(), selectedRow, 7);
                String path = updateFile(path_image_anggota_edit, "anggota\\" + id + ".jpg");
                JLabel img = new JLabel();
                img.setIcon(
                    new ImageIcon(
                            new ImageIcon(path)
                                    .getImage()
                                    .getScaledInstance(100, 100, Image.SCALE_SMOOTH)));
                this.anggota.table().setValueAt(img, selectedRow, 8);
            }
            else{
                set_anggota_edit_message(false, "Update gagal! terjadi masalah pada database.");
            }
        }catch(NullPointerException e){
            set_anggota_edit_message(false, "Semua harus di isi");
        }
    }
    @Override protected void reset_anggota_editMousePressed(java.awt.event.MouseEvent evt){
        reset_anggota_edit_message();
    }
    @Override protected void hapus_anggotaMousePressed(java.awt.event.MouseEvent evt){
        int[] rows = anggota_tabel.getSelectedRows();
        if(rows.length <= 0){
            JOptionPane.showMessageDialog(this, "Pilih anggota mana yang ingin dihapus!");
            return;
        }
        int confirm = JOptionPane.showConfirmDialog(this, "Anda yakin ingin menghapus ini?", "Peringatan", JOptionPane.YES_NO_OPTION);
        if(confirm == JOptionPane.YES_OPTION){
            try{
                int selectedRow = 0;
                for(int i = 0; i < this.anggota.getRecord(); i++){
                    if(anggota_tabel.getValueAt(rows[0], 0).equals(this.anggota.table().getValueAt(i, 0))){
                        selectedRow = i;
                        break;
                    }
                }
                for(int row : rows){
                    if(this.anggota.delete(anggota_tabel.getValueAt(rows[0], 0))){
                        ((DefaultTableModel)anggota_tabel.getModel()).removeRow(selectedRow);
                    }
                }   
            }catch(ArrayIndexOutOfBoundsException e){
                JOptionPane.showMessageDialog(this, "Tabel kosong!");
            }
        }
    }
    @Override protected void cetak_laporan_anggotaMousePressed(java.awt.event.MouseEvent evt){
        try {
            AnggotaTablePrintModel tempModel = new AnggotaTablePrintModel(anggota_tabel);
            String path = new File(".").getCanonicalPath()+"\\src\\laporan\\anggota_laporan.jrxml";
            JasperDesign design = JRXmlLoader.load(path);
            JasperReport report = JasperCompileManager.compileReport(design);
            JasperPrint print = JasperFillManager.fillReport(report, null, new JRTableModelDataSource(tempModel.getModel()));
            JasperViewer.viewReport(print, false);
        } catch (IOException|JRException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //    Cetak laporan
    @Override protected void cetak_all_bukuMousePressed(java.awt.event.MouseEvent evt){
        String arg;
        if(buku_semua.isSelected()){
            arg = "";
        }
        else if(buku_pilih_field.getText().trim().equals("Contoh 1, 1-6 dst")){
            JOptionPane.showMessageDialog(this, "Nomor buku tidak boleh kosong!");
            return;
        }
        else if(buku_pilih_field.getText().contains("-")){
            String[] no_inventaris = buku_pilih_field.getText().split("-");
            String only = "";
            for(int i = 0; i < no_inventaris[0].length()/2; i++){
                only += no_inventaris[0].charAt(i);
            }
            arg = String.format("where no_buku like '%s%s' and (no_buku >= %s and no_buku <= %s)", only, "%", no_inventaris[0], no_inventaris[1]);
        }
        else{
            String no_inventaris = buku_pilih_field.getText();
            String only = "";
            for(int i = 0; i < no_inventaris.length()/2; i++){
                only += no_inventaris.charAt(i);
            }
            arg = String.format("where no_buku like '%s%s' and no_buku >= %s", only, "%", no_inventaris);
        }
        try {
            BukuTablePrintModel tempModel = new BukuTablePrintModel(this.buku.find(arg));
            String path = new File(".").getCanonicalPath()+"\\src\\laporan\\buku_laporan.jrxml";
            JasperDesign design;
            design = JRXmlLoader.load(path);
            JasperReport report = JasperCompileManager.compileReport(design);
            JasperPrint print = JasperFillManager.fillReport(report, null, new JRTableModelDataSource(tempModel.getModel()));
            JasperViewer.viewReport(print, false);
        } catch (IOException|JRException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @Override protected void cetak_all_anggotaMousePressed(java.awt.event.MouseEvent evt){
        String arg;

        if(nis_semua.isSelected()){
            arg = "";
        }
        else if(nis_pilih_field.getText().trim().equals("Contoh 1, 1-6 dst")){
            JOptionPane.showMessageDialog(this, "NIS tidak boleh kosong!");
            return;
        }
        else if(nis_pilih_field.getText().contains("-")){
            String[] nis = nis_pilih_field.getText().split("-");
            arg = String.format("where nis >= %s and nis <= %s", nis[0], nis[1]);
        }
        else{
            String nis = nis_pilih_field.getText();
            arg = String.format("where nis >= %s", nis);
        }
        try {
            AnggotaTablePrintModel tempModel = new AnggotaTablePrintModel(this.anggota.find(arg));
            String path = new File(".").getCanonicalPath()+"\\src\\laporan\\anggota_laporan.jrxml";
            JasperDesign design = JRXmlLoader.load(path);
            JasperReport report = JasperCompileManager.compileReport(design);
            JasperPrint print = JasperFillManager.fillReport(report, null, new JRTableModelDataSource(tempModel.getModel()));
            JasperViewer.viewReport(print, false);
        } catch (IOException|JRException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @Override protected void cetak_all_peminjamanMousePressed(java.awt.event.MouseEvent evt){
        String arg;
        String bulan = bulan_peminjaman.getSelectedIndex() == 0?
                "":bulan_peminjaman.getSelectedIndex() >= 10?
                ""+bulan_peminjaman.getSelectedIndex():
                "0"+bulan_peminjaman.getSelectedIndex();
        String tahun = tahun_peminjaman.getText();
        
        if(tahun.trim().equals("") && 
           nis_pilih_peminjaman.isSelected() && 
           (nis_pilih_peminjaman_field.getText().trim().equals("Contoh 1, 1-6 dst")||
            nis_pilih_peminjaman_field.getText().trim().equals(""))){
            JOptionPane.showMessageDialog(this, "NIS dan tahun tidak boleh kosong kosong!");
            return;
        }
        
        if(tahun.trim().equals("")){
            JOptionPane.showMessageDialog(this, "Tahun tidak boleh kosong kosong!");
            return;
        }
        
        String tanggalPinjam = getTanggalPinjamLaporan(bulan, tahun);

        if(nis_semua_peminjaman.isSelected()){
            arg = String.format("where %s", tanggalPinjam);
        }
        else if(nis_pilih_peminjaman_field.getText().contains("-")){
            String[] nis = nis_pilih_peminjaman_field.getText().split("-");
            arg = String.format("where %s and (anggota.nis >= %s and anggota.nis <= %s)", tanggalPinjam, nis[0], nis[1]);
        }
        else{
            String nis = nis_pilih_peminjaman_field.getText();
            arg = String.format("where %s and anggota.nis >= %s", tanggalPinjam, nis);
        }
        try {
            PeminjamanTablePrintModel tempModel = new PeminjamanTablePrintModel(this.peminjaman.find(arg));
            String path = new File(".").getCanonicalPath()+"\\src\\laporan\\peminjaman_dan_pengembalian_laporan.jrxml";
            JasperDesign design = JRXmlLoader.load(path);
            JasperReport report = JasperCompileManager.compileReport(design);
            JasperPrint print = JasperFillManager.fillReport(report, null, new JRTableModelDataSource(tempModel.getModel()));
            JasperViewer.viewReport(print, false);
        } catch (IOException|JRException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @Override protected void show_kartu_anggotaMousePressed(java.awt.event.MouseEvent evt){
        int[] selectedRows = anggota_tabel.getSelectedRows();
        if(selectedRows.length <= 0){
            JOptionPane.showMessageDialog(this, "Pilih anggota!");
            return;
        }
        int action = JOptionPane.showConfirmDialog(null, IDCard, "", JOptionPane.OK_CANCEL_OPTION);
        if(action == JOptionPane.OK_OPTION){
            try {
                String path;
                if(front.isSelected()){
                    path = new File(".").getCanonicalPath()+"\\src\\laporan\\kartu_anggota_front.jrxml";
                }
                else{
                    path = new File(".").getCanonicalPath()+"\\src\\laporan\\kartu_anggota_back.jrxml";
                }
                String[] id = new String[selectedRows.length];
                String k = kep.getText();
                String n = nip.getText();
                int i = 0;
                for(int v : selectedRows){
                    id[i++] = anggota_tabel.getValueAt(v, 0).toString();
                }
                KartuAnggotaFrontPrintTable tempModel = new KartuAnggotaFrontPrintTable(this.anggota.find(id, k, n));
                JasperDesign design = JRXmlLoader.load(path);
                JasperReport report = JasperCompileManager.compileReport(design);
                JasperPrint print = JasperFillManager.fillReport(report, null, new JRTableModelDataSource(tempModel.getModel()));
                JasperViewer.viewReport(print, false);
            } catch (IOException|JRException ex) {
                Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    @Override protected void show_formulir_pendaftaranMousePressed(java.awt.event.MouseEvent evt){
        int action = JOptionPane.showConfirmDialog(null, FormPendaftaranAnggota, "", JOptionPane.OK_CANCEL_OPTION);
        if(action == JOptionPane.OK_OPTION){
            int length = 1;
            String k = kep_fp.getText();
            String n = nip_fp.getText();
            String tp = tp_fp.getText();
            
            String[][] data = new String[length][3];
            
            for(int i = 0; i < length; i++){
                data[i][0] = k;
                data[i][1] = n;
                data[i][2] = tp;
            }
            try {
                FormPendaftaranTablePrintModel tempModel = new FormPendaftaranTablePrintModel(data);
                String path = new File(".").getCanonicalPath()+"\\src\\laporan\\formulir_pendaftaran_anggota.jrxml";
                JasperDesign design = JRXmlLoader.load(path);
                JasperReport report = JasperCompileManager.compileReport(design);
                JasperPrint print = JasperFillManager.fillReport(report, null, new JRTableModelDataSource(tempModel.getModel()));
                JasperViewer.viewReport(print, false);
            } catch (IOException|JRException ex) {
                Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
