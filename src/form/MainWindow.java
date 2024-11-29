package form;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

public class MainWindow extends javax.swing.JFrame {
    protected String path_image_buku = null;
    protected String path_image_anggota = null;
    protected String path_image_buku_edit = null;
    protected String path_image_anggota_edit = null;
    
    public MainWindow() {
        initComponents();
    }
    protected void setMenuIconBGColor(javax.swing.JLabel btn){}
    protected void resetMenuIconBGColor(javax.swing.JLabel btn){}
    protected void sideBarToggle(){}
    protected void auth(boolean isAuth){}
    protected void showLoginForm(){}
    protected void showRegistrationForm(){}
    protected void showMainWindow(){}
    protected void showHomePanel(){}
    protected void showBukuPanel(){}
    protected void showAnggotaPanel(){}
    protected void showPeminjamanPengembalianPanel(){}
    protected void showCetakLaporanAllPanel(){}
    protected void logout(){}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        IDCard = new javax.swing.JPanel();
        kep_label = new javax.swing.JLabel();
        nip_label = new javax.swing.JLabel();
        kep = new javax.swing.JTextField();
        nip = new javax.swing.JTextField();
        front = new javax.swing.JRadioButton();
        back = new javax.swing.JRadioButton();
        FormPendaftaranAnggota = new javax.swing.JPanel();
        kep_form_pendaftaran_label = new javax.swing.JLabel();
        nip_form_pendaftaran_label = new javax.swing.JLabel();
        tp_form_pendaftaran_label = new javax.swing.JLabel();
        kep_fp = new javax.swing.JTextField();
        nip_fp = new javax.swing.JTextField();
        tp_fp = new javax.swing.JTextField();
        openFile = new javax.swing.JFileChooser();
        main_layered_container = new javax.swing.JLayeredPane();
        main_app_panel = new javax.swing.JPanel();
        navbar = new javax.swing.JPanel();
        sma_logo = new javax.swing.JLabel();
        sma_label = new javax.swing.JLabel();
        container = new javax.swing.JPanel();
        sidebar_icons = new javax.swing.JPanel();
        menu_icon = new javax.swing.JLabel();
        home_icon = new javax.swing.JLabel();
        buku_icon = new javax.swing.JLabel();
        anggota_icon = new javax.swing.JLabel();
        peminjaman_icon = new javax.swing.JLabel();
        cetak_laporan_all_icon = new javax.swing.JLabel();
        signout_icon = new javax.swing.JLabel();
        sidebar_labels = new javax.swing.JPanel();
        logo_label = new javax.swing.JLabel();
        administrator_name = new javax.swing.JLabel();
        home_label = new javax.swing.JLabel();
        buku_label = new javax.swing.JLabel();
        anggota_label = new javax.swing.JLabel();
        peminjaman_label = new javax.swing.JLabel();
        cetak_laporan_all_label = new javax.swing.JLabel();
        signout_label = new javax.swing.JLabel();
        panels = new javax.swing.JLayeredPane();
        home_panel = new javax.swing.JPanel();
        home_header = new javax.swing.JPanel();
        bg_header_home = new javax.swing.JLabel();
        home_section = new javax.swing.JPanel();
        card_buku = new javax.swing.JPanel();
        card_header_buku = new javax.swing.JLabel();
        jumlah_buku_label = new javax.swing.JLabel();
        jumlah_buku_panel = new javax.swing.JScrollPane();
        jumlah_buku = new javax.swing.JTextArea();
        card_anggota = new javax.swing.JPanel();
        card_header_anggota = new javax.swing.JLabel();
        jumlah_anggota_label = new javax.swing.JLabel();
        jumlah_anggota_panel = new javax.swing.JScrollPane();
        jumlah_anggota = new javax.swing.JTextArea();
        card_peminjam = new javax.swing.JPanel();
        card_header_peminjam = new javax.swing.JLabel();
        jumlah_peminjaman_label = new javax.swing.JLabel();
        jumlah_peminjam_panel = new javax.swing.JScrollPane();
        jumlah_peminjam = new javax.swing.JTextArea();
        buku_panel = new javax.swing.JPanel();
        buku_panel_left = new javax.swing.JPanel();
        buku_panel_title = new javax.swing.JPanel();
        buku_panel_title_label = new javax.swing.JLabel();
        buku_btn_navigator = new javax.swing.JPanel();
        buku_baru = new javax.swing.JLabel();
        edit_buku = new javax.swing.JLabel();
        buku_panel_container_crud = new javax.swing.JPanel();
        form_buku_baru = new javax.swing.JPanel();
        label_no_invent_baru = new javax.swing.JLabel();
        label_judul_buku_baru = new javax.swing.JLabel();
        label_no_isbn_baru = new javax.swing.JLabel();
        label_pengarang_buku_baru = new javax.swing.JLabel();
        label_penerbit_buku_baru = new javax.swing.JLabel();
        no_invent_baru = new javax.swing.JTextField();
        judul_buku_baru = new javax.swing.JTextField();
        no_isbn_baru = new javax.swing.JTextField();
        pengarang_buku_baru = new javax.swing.JTextField();
        penerbit_buku_baru = new javax.swing.JTextField();
        insert_buku_baru = new javax.swing.JButton();
        reset_buku_baru = new javax.swing.JButton();
        buku_baru_alert_message = new javax.swing.JLabel();
        preview_buku_baru = new javax.swing.JLabel();
        buku_filechooser = new javax.swing.JButton();
        form_edit_buku = new javax.swing.JPanel();
        label_no_invent_edit = new javax.swing.JLabel();
        label_judul_buku_edit = new javax.swing.JLabel();
        label_no_isbn_edit = new javax.swing.JLabel();
        label_pengarang_edit = new javax.swing.JLabel();
        label_penerbit_edit = new javax.swing.JLabel();
        no_invent_edit = new javax.swing.JTextField();
        judul_buku_edit = new javax.swing.JTextField();
        no_isbn_edit = new javax.swing.JTextField();
        pengarang_buku_edit = new javax.swing.JTextField();
        penerbit_buku_edit = new javax.swing.JTextField();
        update_buku = new javax.swing.JButton();
        reset_buku_edit = new javax.swing.JButton();
        buku_edit_alert_message = new javax.swing.JLabel();
        preview_buku_edit = new javax.swing.JLabel();
        buku_edit_filechooser = new javax.swing.JButton();
        buku_panel_right = new javax.swing.JPanel();
        buku_tabel_panel = new javax.swing.JScrollPane();
        buku_tabel = new javax.swing.JTable();
        buku_tabel_action_panel = new javax.swing.JPanel();
        cetak_laporan_buku_btn = new javax.swing.JButton();
        edit_buku_btn = new javax.swing.JButton();
        hapus_buku_btn = new javax.swing.JButton();
        search_buku_panel = new javax.swing.JPanel();
        filter_buku_title = new javax.swing.JLabel();
        petunjuk_filter_buku = new javax.swing.JLabel();
        no_inventaris_filter = new javax.swing.JTextField();
        judul_buku_filter = new javax.swing.JTextField();
        no_isbn_filter = new javax.swing.JTextField();
        pengarang_buku_filter = new javax.swing.JTextField();
        penerbit_buku_filter = new javax.swing.JTextField();
        penerbit_filter_label = new javax.swing.JLabel();
        no_inventaris_label = new javax.swing.JLabel();
        judul_buku_label = new javax.swing.JLabel();
        no_isbn_filter_label = new javax.swing.JLabel();
        pengarang_filter_label = new javax.swing.JLabel();
        anggota_panel = new javax.swing.JPanel();
        anggota_panel_left = new javax.swing.JPanel();
        anggota_panel_title = new javax.swing.JPanel();
        anggota_panel_title_label = new javax.swing.JLabel();
        anggota_btn_navigator = new javax.swing.JPanel();
        anggota_baru = new javax.swing.JLabel();
        edit_anggota = new javax.swing.JLabel();
        anggota_panel_container_crud = new javax.swing.JPanel();
        form_anggota_baru = new javax.swing.JPanel();
        label_nama_siswa_baru = new javax.swing.JLabel();
        label_nis_baru = new javax.swing.JLabel();
        label_tanggal_lahir_baru = new javax.swing.JLabel();
        label_jenis_kelamin_baru = new javax.swing.JLabel();
        label_alamat_baru = new javax.swing.JLabel();
        label_kode_pos_baru = new javax.swing.JLabel();
        label_no_telp_baru = new javax.swing.JLabel();
        nama_siswa_baru = new javax.swing.JTextField();
        nis_baru = new javax.swing.JTextField();
        tanggal_lahir_baru = new com.toedter.calendar.JDateChooser();
        jenis_kelamin_baru = new javax.swing.JComboBox<>();
        alamat_baru = new javax.swing.JTextField();
        kode_pos_baru = new javax.swing.JTextField();
        no_telp_baru = new javax.swing.JTextField();
        preview_anggota_baru = new javax.swing.JLabel();
        anggota_filechooser = new javax.swing.JButton();
        insert_anggota_baru = new javax.swing.JButton();
        reset_baru_anggota = new javax.swing.JButton();
        anggota_baru_alert_message = new javax.swing.JLabel();
        form_edit_anggota = new javax.swing.JPanel();
        label_id_siswa_edit = new javax.swing.JLabel();
        label_nama_siswa_edit = new javax.swing.JLabel();
        label_nis_edit = new javax.swing.JLabel();
        label_tanggal_lahir_edit = new javax.swing.JLabel();
        labe_jenis_kelaminl_edit = new javax.swing.JLabel();
        label_alamat_edit = new javax.swing.JLabel();
        label_kode_pos_edit = new javax.swing.JLabel();
        label_no_telp_edit = new javax.swing.JLabel();
        id_siswa_edit = new javax.swing.JTextField();
        nama_siswa_edit = new javax.swing.JTextField();
        nis_edit = new javax.swing.JTextField();
        tanggal_lahir_edit = new com.toedter.calendar.JDateChooser();
        jenis_kelamin_edit = new javax.swing.JComboBox<>();
        alamat_edit = new javax.swing.JTextField();
        kode_pos_edit = new javax.swing.JTextField();
        no_telp_edit = new javax.swing.JTextField();
        preview_anggota_edit = new javax.swing.JLabel();
        anggota_edit_filechooser = new javax.swing.JButton();
        update_anggota = new javax.swing.JButton();
        reset_edit_anggota = new javax.swing.JButton();
        anggota_edit_alert_message = new javax.swing.JLabel();
        anggota_panel_right = new javax.swing.JPanel();
        anggota_tabel_panel = new javax.swing.JScrollPane();
        anggota_tabel = new javax.swing.JTable();
        anggota_tabel_action_panel = new javax.swing.JPanel();
        hapus_anggota_btn = new javax.swing.JButton();
        edit_anggota_btn = new javax.swing.JButton();
        cetak_laporan_anggota_btn = new javax.swing.JButton();
        show_kartu_anggota = new javax.swing.JLabel();
        show_formulir_pendaftaran = new javax.swing.JLabel();
        search_anggota_panel = new javax.swing.JPanel();
        filter_anggota_title = new javax.swing.JLabel();
        petunjuk_filter_anggota = new javax.swing.JLabel();
        id_anggota_filter_label = new javax.swing.JLabel();
        nama_anggota_label = new javax.swing.JLabel();
        nis_anggota_label = new javax.swing.JLabel();
        tl_anggota_label = new javax.swing.JLabel();
        jk_anggota_label = new javax.swing.JLabel();
        alamat_anggota_label = new javax.swing.JLabel();
        id_anggota_filter = new javax.swing.JTextField();
        nama_anggota_filter = new javax.swing.JTextField();
        nis_anggota_filter = new javax.swing.JTextField();
        tl_anggota_filter = new javax.swing.JTextField();
        jk_anggota_filter = new javax.swing.JTextField();
        alamat_anggota_filter = new javax.swing.JTextField();
        peminjaman_panel = new javax.swing.JPanel();
        peminjaman_panel_left = new javax.swing.JPanel();
        peminjaman_panel_title = new javax.swing.JPanel();
        peminjaman_panel_titile_label = new javax.swing.JLabel();
        peminjaman_btn_navigator = new javax.swing.JPanel();
        peminjaman_buku = new javax.swing.JLabel();
        pengembalian_buku = new javax.swing.JLabel();
        peminjaman_panel_container_crud = new javax.swing.JPanel();
        form_peminjaman_buku = new javax.swing.JPanel();
        label_id_anggota_pinjam = new javax.swing.JLabel();
        label_kelas_pinjam = new javax.swing.JLabel();
        label_no_buku_pinjam = new javax.swing.JLabel();
        label_lama_peminjaman_buku = new javax.swing.JLabel();
        label_tanggal_pinjam = new javax.swing.JLabel();
        id_anggota_pinjam = new javax.swing.JTextField();
        kelas_1_pinjam = new javax.swing.JComboBox<>();
        kelas_2_pinjam = new javax.swing.JComboBox<>();
        kelas_3_pinjam = new javax.swing.JComboBox<>();
        no_buku_pinjam = new javax.swing.JTextField();
        lama_peminjaman_buku = new javax.swing.JComboBox<>();
        tanggal_pinjam = new com.toedter.calendar.JDateChooser();
        insert_peminjaman = new javax.swing.JButton();
        reset_peminjaman = new javax.swing.JButton();
        buku_pinjam_alert_message = new javax.swing.JLabel();
        form_pengembalian_buku = new javax.swing.JPanel();
        status_telat_alert_message = new javax.swing.JLabel();
        label_id_pinjam = new javax.swing.JLabel();
        label_tanggal_kembali = new javax.swing.JLabel();
        id_pinjam = new javax.swing.JTextField();
        tanggal_kembali = new com.toedter.calendar.JDateChooser();
        insert_pengembalian = new javax.swing.JButton();
        reset_pengembalian = new javax.swing.JButton();
        buku_kembali_alert_message = new javax.swing.JLabel();
        peminjaman_panel_right = new javax.swing.JPanel();
        peminjaman_tabel_panel = new javax.swing.JScrollPane();
        peminjaman_tabel = new javax.swing.JTable();
        peminjaman_tabel_action_panel = new javax.swing.JPanel();
        hapus_peminjaman_btn = new javax.swing.JButton();
        edit_peminjaman_btn = new javax.swing.JButton();
        cetak_laporan_peminjaman_btn = new javax.swing.JButton();
        search_peminjaman_panel = new javax.swing.JPanel();
        filter_peminjaman_buku_title = new javax.swing.JLabel();
        petunjuk_filter_peminjaman_buku = new javax.swing.JLabel();
        nama_siswa_filter_label = new javax.swing.JLabel();
        no_induk_label = new javax.swing.JLabel();
        kelas_label = new javax.swing.JLabel();
        tanggal_pinjam_filter_label = new javax.swing.JLabel();
        tanggal_kembali_filter_label = new javax.swing.JLabel();
        nama_siswa_filter = new javax.swing.JTextField();
        no_induk_filter = new javax.swing.JTextField();
        kelas_filter = new javax.swing.JTextField();
        tanggal_pinjam_filter = new javax.swing.JTextField();
        tanggal_kembali_filter = new javax.swing.JTextField();
        cetak_laporan_all_panel = new javax.swing.JPanel();
        cetak_laporan_buku_panel = new javax.swing.JPanel();
        laporan_buku_label = new javax.swing.JLabel();
        cetak_no_buku_label = new javax.swing.JLabel();
        buku_semua = new javax.swing.JRadioButton();
        buku_pilih = new javax.swing.JRadioButton();
        buku_pilih_field = new javax.swing.JTextField();
        cetak_buku_laporan = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        cetak_laporan_anggota_panel = new javax.swing.JPanel();
        laporan_anggota_label = new javax.swing.JLabel();
        cetak_nis_label = new javax.swing.JLabel();
        nis_semua = new javax.swing.JRadioButton();
        nis_pilih = new javax.swing.JRadioButton();
        nis_pilih_field = new javax.swing.JTextField();
        cetak_anggota_laporan = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        cetak_laporan_peminjaman_panel = new javax.swing.JPanel();
        laporan_peminjaman_label = new javax.swing.JLabel();
        cetak_nis_peminjam_label = new javax.swing.JLabel();
        nis_semua_peminjaman = new javax.swing.JRadioButton();
        nis_pilih_peminjaman = new javax.swing.JRadioButton();
        nis_pilih_peminjaman_field = new javax.swing.JTextField();
        cetak_bulan_peminjam_label = new javax.swing.JLabel();
        cetak_tahun_peminjam_label = new javax.swing.JLabel();
        bulan_peminjaman = new javax.swing.JComboBox<>();
        tahun_peminjaman = new javax.swing.JTextField();
        cetak_peminjaman_laporan = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        login_panel = new javax.swing.JPanel();
        form_login = new javax.swing.JPanel();
        show_toggle_password_login = new javax.swing.JLabel();
        hide_toggle_password_login = new javax.swing.JLabel();
        login_alert_message = new javax.swing.JLabel();
        password_field_log = new javax.swing.JPasswordField();
        submit_login_btn = new javax.swing.JLabel();
        log_sep_2 = new javax.swing.JSeparator();
        log_sep_1 = new javax.swing.JSeparator();
        username_field_log = new javax.swing.JTextField();
        register_link_label = new javax.swing.JLabel();
        register_link_btn = new javax.swing.JLabel();
        remember_me = new javax.swing.JCheckBox();
        label_password = new javax.swing.JLabel();
        label_username = new javax.swing.JLabel();
        label_login = new javax.swing.JLabel();
        sma_img_log = new javax.swing.JLabel();
        bg_input_login = new javax.swing.JLabel();
        register_panel = new javax.swing.JPanel();
        form_registrasi = new javax.swing.JPanel();
        show_toggle_confirm_pass_reg = new javax.swing.JLabel();
        hide_toggle_confirm_pass_reg = new javax.swing.JLabel();
        show_toggle_password_reg = new javax.swing.JLabel();
        hide_toggle_password_reg = new javax.swing.JLabel();
        register_alert_message = new javax.swing.JLabel();
        confirm_password_field_reg = new javax.swing.JPasswordField();
        password_field_reg = new javax.swing.JPasswordField();
        name_field_reg = new javax.swing.JTextField();
        username_field_reg = new javax.swing.JTextField();
        reg_sep_1 = new javax.swing.JSeparator();
        reg_sep_2 = new javax.swing.JSeparator();
        reg_sep_3 = new javax.swing.JSeparator();
        reg_sep_4 = new javax.swing.JSeparator();
        label_name_reg = new javax.swing.JLabel();
        label_confirm_password_reg = new javax.swing.JLabel();
        login_link_label = new javax.swing.JLabel();
        login_link_btn = new javax.swing.JLabel();
        submit_register_btn = new javax.swing.JLabel();
        label_password_reg = new javax.swing.JLabel();
        label_username_reg = new javax.swing.JLabel();
        label_register = new javax.swing.JLabel();
        sma_img_reg = new javax.swing.JLabel();
        bg_input_register = new javax.swing.JLabel();

        IDCard.setMaximumSize(new java.awt.Dimension(400, 115));
        IDCard.setMinimumSize(new java.awt.Dimension(400, 115));
        IDCard.setPreferredSize(new java.awt.Dimension(400, 115));

        kep_label.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        kep_label.setText("KEPALA PERPUSTAKAAN");
        kep_label.setMaximumSize(new java.awt.Dimension(160, 30));
        kep_label.setMinimumSize(new java.awt.Dimension(160, 30));
        kep_label.setPreferredSize(new java.awt.Dimension(160, 30));

        nip_label.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        nip_label.setText("NIP");
        nip_label.setMaximumSize(new java.awt.Dimension(34, 30));
        nip_label.setMinimumSize(new java.awt.Dimension(34, 30));
        nip_label.setPreferredSize(new java.awt.Dimension(34, 30));

        kep.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        kep.setMaximumSize(new java.awt.Dimension(240, 30));
        kep.setMinimumSize(new java.awt.Dimension(240, 30));
        kep.setPreferredSize(new java.awt.Dimension(240, 30));

        nip.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        nip.setMaximumSize(new java.awt.Dimension(240, 30));
        nip.setMinimumSize(new java.awt.Dimension(240, 30));
        nip.setPreferredSize(new java.awt.Dimension(240, 30));

        front.setSelected(true);
        front.setText("Cetak Depan");
        front.setPreferredSize(new java.awt.Dimension(93, 30));

        back.setText("Cetak Belakang");
        back.setPreferredSize(new java.awt.Dimension(93, 30));

        javax.swing.GroupLayout IDCardLayout = new javax.swing.GroupLayout(IDCard);
        IDCard.setLayout(IDCardLayout);
        IDCardLayout.setHorizontalGroup(
            IDCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IDCardLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(kep_label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(kep, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(IDCardLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(nip_label, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(nip, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(IDCardLayout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(front, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        IDCardLayout.setVerticalGroup(
            IDCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IDCardLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(IDCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kep_label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(IDCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nip_label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(IDCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(front, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        front.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                if(!back.isSelected()){
                    back.setSelected(true);
                }
                else{
                    back.setSelected(false);
                }
            }
        });
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                if(!front.isSelected()){
                    front.setSelected(true);
                }
                else{
                    front.setSelected(false);
                }
            }
        });

        FormPendaftaranAnggota.setMaximumSize(new java.awt.Dimension(400, 134));
        FormPendaftaranAnggota.setMinimumSize(new java.awt.Dimension(400, 134));
        FormPendaftaranAnggota.setPreferredSize(new java.awt.Dimension(400, 134));

        kep_form_pendaftaran_label.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        kep_form_pendaftaran_label.setText("KEPALA PERPUSTAKAAN");
        kep_form_pendaftaran_label.setMaximumSize(new java.awt.Dimension(160, 30));
        kep_form_pendaftaran_label.setMinimumSize(new java.awt.Dimension(160, 30));
        kep_form_pendaftaran_label.setPreferredSize(new java.awt.Dimension(160, 30));

        nip_form_pendaftaran_label.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        nip_form_pendaftaran_label.setText("NIP");
        nip_form_pendaftaran_label.setMaximumSize(new java.awt.Dimension(34, 30));
        nip_form_pendaftaran_label.setMinimumSize(new java.awt.Dimension(34, 30));
        nip_form_pendaftaran_label.setPreferredSize(new java.awt.Dimension(34, 30));

        tp_form_pendaftaran_label.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        tp_form_pendaftaran_label.setText("TAHUN PELAJARAN");
        tp_form_pendaftaran_label.setMaximumSize(new java.awt.Dimension(34, 30));
        tp_form_pendaftaran_label.setMinimumSize(new java.awt.Dimension(34, 30));
        tp_form_pendaftaran_label.setPreferredSize(new java.awt.Dimension(34, 30));

        kep_fp.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        kep_fp.setMaximumSize(new java.awt.Dimension(240, 30));
        kep_fp.setMinimumSize(new java.awt.Dimension(240, 30));
        kep_fp.setPreferredSize(new java.awt.Dimension(240, 30));

        nip_fp.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        nip_fp.setMaximumSize(new java.awt.Dimension(240, 30));
        nip_fp.setMinimumSize(new java.awt.Dimension(240, 30));
        nip_fp.setPreferredSize(new java.awt.Dimension(240, 30));

        tp_fp.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        tp_fp.setMaximumSize(new java.awt.Dimension(240, 30));
        tp_fp.setMinimumSize(new java.awt.Dimension(240, 30));
        tp_fp.setPreferredSize(new java.awt.Dimension(240, 30));

        javax.swing.GroupLayout FormPendaftaranAnggotaLayout = new javax.swing.GroupLayout(FormPendaftaranAnggota);
        FormPendaftaranAnggota.setLayout(FormPendaftaranAnggotaLayout);
        FormPendaftaranAnggotaLayout.setHorizontalGroup(
            FormPendaftaranAnggotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FormPendaftaranAnggotaLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(FormPendaftaranAnggotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FormPendaftaranAnggotaLayout.createSequentialGroup()
                        .addComponent(kep_form_pendaftaran_label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(kep_fp, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(FormPendaftaranAnggotaLayout.createSequentialGroup()
                        .addComponent(nip_form_pendaftaran_label, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(nip_fp, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(FormPendaftaranAnggotaLayout.createSequentialGroup()
                        .addComponent(tp_form_pendaftaran_label, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(tp_fp, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        FormPendaftaranAnggotaLayout.setVerticalGroup(
            FormPendaftaranAnggotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FormPendaftaranAnggotaLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(FormPendaftaranAnggotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kep_form_pendaftaran_label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kep_fp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(FormPendaftaranAnggotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nip_form_pendaftaran_label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nip_fp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(FormPendaftaranAnggotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tp_form_pendaftaran_label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tp_fp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
        setMinimumSize(new java.awt.Dimension(1080, 720));
        getContentPane().setLayout(new javax.swing.OverlayLayout(getContentPane()));

        main_layered_container.setMinimumSize(new java.awt.Dimension(1080, 720));
        main_layered_container.setLayout(new javax.swing.OverlayLayout(main_layered_container));

        main_app_panel.setMinimumSize(new java.awt.Dimension(1080, 720));
        main_app_panel.setLayout(new java.awt.BorderLayout());

        navbar.setBackground(new java.awt.Color(54, 70, 78));
        navbar.setMinimumSize(new java.awt.Dimension(1080, 45));
        navbar.setPreferredSize(new java.awt.Dimension(1080, 45));
        navbar.setLayout(new java.awt.GridBagLayout());

        sma_logo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        sma_logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sma_logo.setIcon(new javax.swing.ImageIcon(new javax.swing.ImageIcon("src/icon/smansaga-removebg.png").getImage().getScaledInstance(39, 45, java.awt.Image.SCALE_SMOOTH)));
        sma_logo.setMaximumSize(new java.awt.Dimension(200, 200));
        sma_logo.setMinimumSize(new java.awt.Dimension(45, 45));
        sma_logo.setPreferredSize(new java.awt.Dimension(45, 45));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 382, 0, 0);
        navbar.add(sma_logo, gridBagConstraints);

        sma_label.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        sma_label.setForeground(new java.awt.Color(255, 255, 255));
        sma_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sma_label.setText("SMA NEGERI 1 KOTAGAJAH");
        sma_label.setMaximumSize(new java.awt.Dimension(90, 45));
        sma_label.setMinimumSize(new java.awt.Dimension(90, 45));
        sma_label.setPreferredSize(new java.awt.Dimension(90, 45));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 274;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 6, 0, 328);
        navbar.add(sma_label, gridBagConstraints);

        main_app_panel.add(navbar, java.awt.BorderLayout.PAGE_START);

        container.setLayout(new javax.swing.BoxLayout(container, javax.swing.BoxLayout.LINE_AXIS));

        sidebar_icons.setBackground(new java.awt.Color(54, 70, 78));
        sidebar_icons.setMinimumSize(new java.awt.Dimension(45, 675));
        sidebar_icons.setPreferredSize(new java.awt.Dimension(45, 675));

        menu_icon.setBackground(new java.awt.Color(54, 70, 78));
        menu_icon.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        menu_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menu_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_squared_menu_32.png"))); // NOI18N
        menu_icon.setMaximumSize(new java.awt.Dimension(32767, 32767));
        menu_icon.setMinimumSize(new java.awt.Dimension(45, 45));
        menu_icon.setOpaque(true);
        menu_icon.setPreferredSize(new java.awt.Dimension(45, 45));

        home_icon.setBackground(new java.awt.Color(54, 70, 78));
        home_icon.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        home_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        home_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_home_32.png"))); // NOI18N
        home_icon.setMaximumSize(new java.awt.Dimension(32767, 32767));
        home_icon.setMinimumSize(new java.awt.Dimension(45, 45));
        home_icon.setOpaque(true);
        home_icon.setPreferredSize(new java.awt.Dimension(45, 45));

        buku_icon.setBackground(new java.awt.Color(54, 70, 78));
        buku_icon.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        buku_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        buku_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_books_32.png"))); // NOI18N
        buku_icon.setMaximumSize(new java.awt.Dimension(32767, 32767));
        buku_icon.setMinimumSize(new java.awt.Dimension(45, 45));
        buku_icon.setOpaque(true);
        buku_icon.setPreferredSize(new java.awt.Dimension(45, 45));

        anggota_icon.setBackground(new java.awt.Color(54, 70, 78));
        anggota_icon.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        anggota_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        anggota_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_people_32.png"))); // NOI18N
        anggota_icon.setMaximumSize(new java.awt.Dimension(32767, 32767));
        anggota_icon.setMinimumSize(new java.awt.Dimension(45, 45));
        anggota_icon.setOpaque(true);
        anggota_icon.setPreferredSize(new java.awt.Dimension(45, 45));

        peminjaman_icon.setBackground(new java.awt.Color(54, 70, 78));
        peminjaman_icon.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        peminjaman_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        peminjaman_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_borrow_book_32.png"))); // NOI18N
        peminjaman_icon.setMaximumSize(new java.awt.Dimension(32767, 32767));
        peminjaman_icon.setMinimumSize(new java.awt.Dimension(45, 45));
        peminjaman_icon.setOpaque(true);
        peminjaman_icon.setPreferredSize(new java.awt.Dimension(45, 45));

        cetak_laporan_all_icon.setBackground(new java.awt.Color(54, 70, 78));
        cetak_laporan_all_icon.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        cetak_laporan_all_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cetak_laporan_all_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_add_new_print_light_32.png"))); // NOI18N
        cetak_laporan_all_icon.setMaximumSize(new java.awt.Dimension(32767, 32767));
        cetak_laporan_all_icon.setMinimumSize(new java.awt.Dimension(45, 45));
        cetak_laporan_all_icon.setOpaque(true);
        cetak_laporan_all_icon.setPreferredSize(new java.awt.Dimension(45, 45));

        signout_icon.setBackground(new java.awt.Color(54, 70, 78));
        signout_icon.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        signout_icon.setForeground(new java.awt.Color(204, 204, 204));
        signout_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        signout_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_sign_out_32.png"))); // NOI18N
        signout_icon.setMaximumSize(new java.awt.Dimension(45, 45));
        signout_icon.setMinimumSize(new java.awt.Dimension(45, 45));
        signout_icon.setOpaque(true);
        signout_icon.setPreferredSize(new java.awt.Dimension(45, 45));

        javax.swing.GroupLayout sidebar_iconsLayout = new javax.swing.GroupLayout(sidebar_icons);
        sidebar_icons.setLayout(sidebar_iconsLayout);
        sidebar_iconsLayout.setHorizontalGroup(
            sidebar_iconsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu_icon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(home_icon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(buku_icon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(anggota_icon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(peminjaman_icon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(cetak_laporan_all_icon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(signout_icon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        sidebar_iconsLayout.setVerticalGroup(
            sidebar_iconsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidebar_iconsLayout.createSequentialGroup()
                .addComponent(menu_icon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(186, 186, 186)
                .addComponent(home_icon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(buku_icon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(anggota_icon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(peminjaman_icon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(cetak_laporan_all_icon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(signout_icon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(144, Short.MAX_VALUE))
        );

        menu_icon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menu_iconMousePressed(evt);
            }
            public void  mouseEntered(java.awt.event.MouseEvent evt) {
                setMenuIconBGColor(menu_icon);
            }
            public void  mouseExited(java.awt.event.MouseEvent evt) {
                resetMenuIconBGColor(menu_icon);
            }
        });
        home_icon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                home_iconMousePressed(evt);
            }
            public void  mouseEntered(java.awt.event.MouseEvent evt) {
                setMenuIconBGColor(home_icon); setMenuIconBGColor(home_label);
            }
            public void  mouseExited(java.awt.event.MouseEvent evt) {
                resetMenuIconBGColor(home_icon); resetMenuIconBGColor(home_label);
            }
        });
        buku_icon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                buku_iconMousePressed(evt);
            }
            public void  mouseEntered(java.awt.event.MouseEvent evt) {
                setMenuIconBGColor(buku_icon); setMenuIconBGColor(buku_label);
            }
            public void  mouseExited(java.awt.event.MouseEvent evt) {
                resetMenuIconBGColor(buku_icon); resetMenuIconBGColor(buku_label);
            }
        });
        anggota_icon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                anggota_iconMousePressed(evt);
            }
            public void  mouseEntered(java.awt.event.MouseEvent evt) {
                setMenuIconBGColor(anggota_icon); setMenuIconBGColor(anggota_label);
            }
            public void  mouseExited(java.awt.event.MouseEvent evt) {
                resetMenuIconBGColor(anggota_icon); resetMenuIconBGColor(anggota_label);
            }
        });
        peminjaman_icon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                peminjaman_iconMousePressed(evt);
            }
            public void  mouseEntered(java.awt.event.MouseEvent evt) {
                setMenuIconBGColor(peminjaman_icon); setMenuIconBGColor(peminjaman_label);
            }
            public void  mouseExited(java.awt.event.MouseEvent evt) {
                resetMenuIconBGColor(peminjaman_icon); resetMenuIconBGColor(peminjaman_label);
            }
        });
        cetak_laporan_all_icon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cetak_laporan_all_iconMousePressed(evt);
            }
            public void  mouseEntered(java.awt.event.MouseEvent evt) {
                setMenuIconBGColor(cetak_laporan_all_icon); setMenuIconBGColor(cetak_laporan_all_label);
            }
            public void  mouseExited(java.awt.event.MouseEvent evt) {
                resetMenuIconBGColor(cetak_laporan_all_icon); resetMenuIconBGColor(cetak_laporan_all_label);
            }
        });
        signout_icon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                signout_iconMousePressed(evt);
            }
            public void  mouseEntered(java.awt.event.MouseEvent evt) {
                setMenuIconBGColor(signout_icon); setMenuIconBGColor(signout_label);
            }
            public void  mouseExited(java.awt.event.MouseEvent evt) {
                resetMenuIconBGColor(signout_icon); resetMenuIconBGColor(signout_label);
            }
        });

        container.add(sidebar_icons);

        sidebar_labels.setBackground(new java.awt.Color(54, 70, 78));
        sidebar_labels.setMaximumSize(new java.awt.Dimension(240, 32767));
        sidebar_labels.setMinimumSize(new java.awt.Dimension(0, 675));
        sidebar_labels.setPreferredSize(new java.awt.Dimension(0, 675));

        logo_label.setBackground(new java.awt.Color(54, 70, 78));
        logo_label.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        logo_label.setForeground(new java.awt.Color(204, 204, 204));
        logo_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo_label.setIcon(new javax.swing.ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/smansaga-removebg.png")).getImage().getScaledInstance(105, 120, java.awt.Image.SCALE_SMOOTH)));
        logo_label.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        logo_label.setMaximumSize(new java.awt.Dimension(240, 125));
        logo_label.setMinimumSize(new java.awt.Dimension(240, 125));
        logo_label.setOpaque(true);
        logo_label.setPreferredSize(new java.awt.Dimension(240, 125));

        administrator_name.setBackground(new java.awt.Color(54, 70, 78));
        administrator_name.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        administrator_name.setForeground(new java.awt.Color(204, 204, 204));
        administrator_name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        administrator_name.setMaximumSize(new java.awt.Dimension(240, 22));
        administrator_name.setMinimumSize(new java.awt.Dimension(240, 22));
        administrator_name.setPreferredSize(new java.awt.Dimension(240, 22));

        home_label.setBackground(new java.awt.Color(54, 70, 78));
        home_label.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        home_label.setForeground(new java.awt.Color(204, 204, 204));
        home_label.setText("     Home");
        home_label.setMaximumSize(new java.awt.Dimension(240, 45));
        home_label.setMinimumSize(new java.awt.Dimension(0, 45));
        home_label.setOpaque(true);
        home_label.setPreferredSize(new java.awt.Dimension(240, 45));

        buku_label.setBackground(new java.awt.Color(54, 70, 78));
        buku_label.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        buku_label.setForeground(new java.awt.Color(204, 204, 204));
        buku_label.setText("     Inventaris buku");
        buku_label.setMaximumSize(new java.awt.Dimension(240, 45));
        buku_label.setMinimumSize(new java.awt.Dimension(0, 45));
        buku_label.setOpaque(true);
        buku_label.setPreferredSize(new java.awt.Dimension(240, 45));

        anggota_label.setBackground(new java.awt.Color(54, 70, 78));
        anggota_label.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        anggota_label.setForeground(new java.awt.Color(204, 204, 204));
        anggota_label.setText("     Anggota perpustakaan");
        anggota_label.setMaximumSize(new java.awt.Dimension(240, 45));
        anggota_label.setMinimumSize(new java.awt.Dimension(0, 45));
        anggota_label.setOpaque(true);
        anggota_label.setPreferredSize(new java.awt.Dimension(240, 45));

        peminjaman_label.setBackground(new java.awt.Color(54, 70, 78));
        peminjaman_label.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        peminjaman_label.setForeground(new java.awt.Color(204, 204, 204));
        peminjaman_label.setText("     Peminjaman & pengembalian buku");
        peminjaman_label.setMaximumSize(new java.awt.Dimension(240, 45));
        peminjaman_label.setMinimumSize(new java.awt.Dimension(0, 45));
        peminjaman_label.setOpaque(true);
        peminjaman_label.setPreferredSize(new java.awt.Dimension(240, 45));

        cetak_laporan_all_label.setBackground(new java.awt.Color(54, 70, 78));
        cetak_laporan_all_label.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        cetak_laporan_all_label.setForeground(new java.awt.Color(204, 204, 204));
        cetak_laporan_all_label.setText("     Cetak laporan");
        cetak_laporan_all_label.setMaximumSize(new java.awt.Dimension(240, 45));
        cetak_laporan_all_label.setMinimumSize(new java.awt.Dimension(0, 45));
        cetak_laporan_all_label.setOpaque(true);
        cetak_laporan_all_label.setPreferredSize(new java.awt.Dimension(240, 45));

        signout_label.setBackground(new java.awt.Color(54, 70, 78));
        signout_label.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        signout_label.setForeground(new java.awt.Color(204, 204, 204));
        signout_label.setText("     Logout");
        signout_label.setMaximumSize(new java.awt.Dimension(240, 45));
        signout_label.setMinimumSize(new java.awt.Dimension(0, 45));
        signout_label.setOpaque(true);
        signout_label.setPreferredSize(new java.awt.Dimension(240, 45));

        javax.swing.GroupLayout sidebar_labelsLayout = new javax.swing.GroupLayout(sidebar_labels);
        sidebar_labels.setLayout(sidebar_labelsLayout);
        sidebar_labelsLayout.setHorizontalGroup(
            sidebar_labelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logo_label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(administrator_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(home_label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(buku_label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(anggota_label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(peminjaman_label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(cetak_laporan_all_label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(signout_label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        sidebar_labelsLayout.setVerticalGroup(
            sidebar_labelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidebar_labelsLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(logo_label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(administrator_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(home_label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(buku_label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(anggota_label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(peminjaman_label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cetak_laporan_all_label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(signout_label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(144, Short.MAX_VALUE))
        );

        home_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                home_labelMousePressed(evt);
            }
            public void  mouseEntered(java.awt.event.MouseEvent evt) {
                setMenuIconBGColor(home_icon); setMenuIconBGColor(home_label);
            }
            public void  mouseExited(java.awt.event.MouseEvent evt) {
                resetMenuIconBGColor(home_icon); resetMenuIconBGColor(home_label);
            }
        });
        buku_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                buku_labelMousePressed(evt);
            }
            public void  mouseEntered(java.awt.event.MouseEvent evt) {
                setMenuIconBGColor(buku_icon); setMenuIconBGColor(buku_label);
            }
            public void  mouseExited(java.awt.event.MouseEvent evt) {
                resetMenuIconBGColor(buku_icon); resetMenuIconBGColor(buku_label);
            }
        });
        anggota_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                anggota_labelMousePressed(evt);
            }
            public void  mouseEntered(java.awt.event.MouseEvent evt) {
                setMenuIconBGColor(anggota_icon); setMenuIconBGColor(anggota_label);
            }
            public void  mouseExited(java.awt.event.MouseEvent evt) {
                resetMenuIconBGColor(anggota_icon); resetMenuIconBGColor(anggota_label);
            }
        });
        peminjaman_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                peminjaman_labelMousePressed(evt);
            }
            public void  mouseEntered(java.awt.event.MouseEvent evt) {
                setMenuIconBGColor(peminjaman_icon); setMenuIconBGColor(peminjaman_label);
            }
            public void  mouseExited(java.awt.event.MouseEvent evt) {
                resetMenuIconBGColor(peminjaman_icon); resetMenuIconBGColor(peminjaman_label);
            }
        });
        cetak_laporan_all_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cetak_laporan_all_labelMousePressed(evt);
            }
            public void  mouseEntered(java.awt.event.MouseEvent evt) {
                setMenuIconBGColor(cetak_laporan_all_icon); setMenuIconBGColor(cetak_laporan_all_label);
            }
            public void  mouseExited(java.awt.event.MouseEvent evt) {
                resetMenuIconBGColor(cetak_laporan_all_icon); resetMenuIconBGColor(cetak_laporan_all_label);
            }
        });
        signout_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                signout_labelMousePressed(evt);
            }
            public void  mouseEntered(java.awt.event.MouseEvent evt) {
                setMenuIconBGColor(signout_icon); setMenuIconBGColor(signout_label);
            }
            public void  mouseExited(java.awt.event.MouseEvent evt) {
                resetMenuIconBGColor(signout_icon); resetMenuIconBGColor(signout_label);
            }
        });

        container.add(sidebar_labels);

        panels.setLayout(new javax.swing.OverlayLayout(panels));

        home_panel.setBackground(new java.awt.Color(255, 255, 255));
        home_panel.setMinimumSize(new java.awt.Dimension(1035, 675));
        home_panel.setLayout(new java.awt.BorderLayout());

        home_header.setBackground(new java.awt.Color(1, 198, 83));
        home_header.setMinimumSize(new java.awt.Dimension(1035, 300));
        home_header.setPreferredSize(new java.awt.Dimension(1035, 300));
        home_header.setLayout(new java.awt.BorderLayout());

        bg_header_home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/sma-img-3.png"))); // NOI18N
        bg_header_home.setMaximumSize(new java.awt.Dimension(120, 45));
        bg_header_home.setMinimumSize(new java.awt.Dimension(120, 45));
        bg_header_home.setPreferredSize(new java.awt.Dimension(120, 45));
        home_header.add(bg_header_home, java.awt.BorderLayout.CENTER);

        home_panel.add(home_header, java.awt.BorderLayout.PAGE_START);

        home_section.setMinimumSize(new java.awt.Dimension(400, 375));
        home_section.setLayout(new java.awt.GridBagLayout());

        card_buku.setBackground(new java.awt.Color(204, 204, 204));
        card_buku.setMinimumSize(new java.awt.Dimension(345, 375));
        card_buku.setPreferredSize(new java.awt.Dimension(345, 375));

        card_header_buku.setBackground(new java.awt.Color(0, 150, 62));
        card_header_buku.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        card_header_buku.setForeground(new java.awt.Color(255, 255, 255));
        card_header_buku.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        card_header_buku.setText("Buku");
        card_header_buku.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        card_header_buku.setOpaque(true);

        jumlah_buku_label.setBackground(new java.awt.Color(204, 204, 204));
        jumlah_buku_label.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jumlah_buku_label.setForeground(new java.awt.Color(0, 150, 62));
        jumlah_buku_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jumlah_buku_label.setText("Jumlah buku terdaftar :");

        jumlah_buku_panel.setBorder(null);
        jumlah_buku_panel.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jumlah_buku_panel.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jumlah_buku.setEditable(false);
        jumlah_buku.setBackground(new java.awt.Color(204, 204, 204));
        jumlah_buku.setColumns(20);
        jumlah_buku.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jumlah_buku.setForeground(new java.awt.Color(0, 150, 62));
        jumlah_buku.setLineWrap(true);
        jumlah_buku.setRows(5);
        jumlah_buku.setWrapStyleWord(true);
        jumlah_buku.setBorder(null);
        jumlah_buku_panel.setViewportView(jumlah_buku);

        javax.swing.GroupLayout card_bukuLayout = new javax.swing.GroupLayout(card_buku);
        card_buku.setLayout(card_bukuLayout);
        card_bukuLayout.setHorizontalGroup(
            card_bukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(card_header_buku, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jumlah_buku_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jumlah_buku_panel, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
        );
        card_bukuLayout.setVerticalGroup(
            card_bukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(card_bukuLayout.createSequentialGroup()
                .addComponent(card_header_buku, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jumlah_buku_label, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jumlah_buku_panel, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                .addContainerGap())
        );

        card_header_buku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt){
                card_header_buku.setBackground(new java.awt.Color(0,150,62));
                card_header_anggota.setBackground(new java.awt.Color(1,198,83));
                card_header_peminjam.setBackground(new java.awt.Color(1,198,83));

                card_header_buku.setForeground(new java.awt.Color(255,255,255));
                card_header_anggota.setForeground(new java.awt.Color(204,204,204));
                card_header_peminjam.setForeground(new java.awt.Color(204,204,204));

                jumlah_buku.setBackground(new java.awt.Color(204,204,204));
                jumlah_anggota.setBackground(new java.awt.Color(240,240,240));
                jumlah_peminjam.setBackground(new java.awt.Color(240,240,240));

                jumlah_buku.setForeground(new java.awt.Color(0,150,62));
                jumlah_anggota.setForeground(new java.awt.Color(1,198,83));
                jumlah_peminjam.setForeground(new java.awt.Color(1,198,83));

                card_header_buku.setFont(new java.awt.Font("SansSerif", 1, 24));
                card_header_anggota.setFont(new java.awt.Font("SansSerif", 0, 24));
                card_header_anggota.setFont(new java.awt.Font("SansSerif", 0, 24));

                card_buku.setBackground(new java.awt.Color(204,204,204));
                card_anggota.setBackground(new java.awt.Color(240,240,240));
                card_peminjam.setBackground(new java.awt.Color(240,240,240));

                jumlah_buku_label.setForeground(new java.awt.Color(0,150,62));
                jumlah_anggota_label.setForeground(new java.awt.Color(1,198,83));
                jumlah_peminjaman_label.setForeground(new java.awt.Color(1,198,83));
            }
        });

        home_section.add(card_buku, new java.awt.GridBagConstraints());

        card_anggota.setMinimumSize(new java.awt.Dimension(345, 375));
        card_anggota.setPreferredSize(new java.awt.Dimension(345, 375));

        card_header_anggota.setBackground(new java.awt.Color(1, 198, 83));
        card_header_anggota.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        card_header_anggota.setForeground(new java.awt.Color(204, 204, 204));
        card_header_anggota.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        card_header_anggota.setText("Anggota");
        card_header_anggota.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        card_header_anggota.setOpaque(true);

        jumlah_anggota_label.setBackground(new java.awt.Color(204, 204, 204));
        jumlah_anggota_label.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jumlah_anggota_label.setForeground(new java.awt.Color(1, 198, 83));
        jumlah_anggota_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jumlah_anggota_label.setText("Jumlah anggota terdaftar :");

        jumlah_anggota_panel.setBorder(null);
        jumlah_anggota_panel.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jumlah_anggota_panel.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jumlah_anggota.setEditable(false);
        jumlah_anggota.setBackground(new java.awt.Color(240, 240, 240));
        jumlah_anggota.setColumns(20);
        jumlah_anggota.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jumlah_anggota.setForeground(new java.awt.Color(1, 198, 83));
        jumlah_anggota.setLineWrap(true);
        jumlah_anggota.setRows(5);
        jumlah_anggota.setWrapStyleWord(true);
        jumlah_anggota.setBorder(null);
        jumlah_anggota_panel.setViewportView(jumlah_anggota);

        javax.swing.GroupLayout card_anggotaLayout = new javax.swing.GroupLayout(card_anggota);
        card_anggota.setLayout(card_anggotaLayout);
        card_anggotaLayout.setHorizontalGroup(
            card_anggotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(card_header_anggota, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
            .addComponent(jumlah_anggota_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, card_anggotaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jumlah_anggota_panel)
                .addContainerGap())
        );
        card_anggotaLayout.setVerticalGroup(
            card_anggotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(card_anggotaLayout.createSequentialGroup()
                .addComponent(card_header_anggota, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jumlah_anggota_label, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jumlah_anggota_panel, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                .addGap(6, 6, 6))
        );

        card_header_anggota.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt){
                card_header_buku.setBackground(new java.awt.Color(1,198,83));
                card_header_anggota.setBackground(new java.awt.Color(0,150,62));
                card_header_peminjam.setBackground(new java.awt.Color(1,198,83));

                card_header_buku.setForeground(new java.awt.Color(204,204,204));
                card_header_anggota.setForeground(new java.awt.Color(255,255,255));
                card_header_peminjam.setForeground(new java.awt.Color(204,204,204));

                jumlah_buku.setBackground(new java.awt.Color(240,240,240));
                jumlah_anggota.setBackground(new java.awt.Color(204,204,204));
                jumlah_peminjam.setBackground(new java.awt.Color(240,240,240));

                jumlah_buku.setForeground(new java.awt.Color(1,198,83));
                jumlah_anggota.setForeground(new java.awt.Color(0,150,62));
                jumlah_peminjam.setForeground(new java.awt.Color(1,198,83));

                card_header_buku.setFont(new java.awt.Font("SansSerif", 0, 24));
                card_header_anggota.setFont(new java.awt.Font("SansSerif", 1, 24));
                card_header_peminjam.setFont(new java.awt.Font("SansSerif", 0, 24));

                card_buku.setBackground(new java.awt.Color(240,240,240));
                card_anggota.setBackground(new java.awt.Color(204,204,204));
                card_peminjam.setBackground(new java.awt.Color(240,240,240));

                jumlah_buku_label.setForeground(new java.awt.Color(1,198,83));
                jumlah_anggota_label.setForeground(new java.awt.Color(0,150,62));
                jumlah_peminjaman_label.setForeground(new java.awt.Color(1,198,83));
            }
        });

        home_section.add(card_anggota, new java.awt.GridBagConstraints());

        card_peminjam.setMinimumSize(new java.awt.Dimension(345, 375));
        card_peminjam.setPreferredSize(new java.awt.Dimension(345, 375));

        card_header_peminjam.setBackground(new java.awt.Color(1, 198, 83));
        card_header_peminjam.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        card_header_peminjam.setForeground(new java.awt.Color(204, 204, 204));
        card_header_peminjam.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        card_header_peminjam.setText("Peminjaman");
        card_header_peminjam.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        card_header_peminjam.setOpaque(true);

        jumlah_peminjaman_label.setBackground(new java.awt.Color(204, 204, 204));
        jumlah_peminjaman_label.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jumlah_peminjaman_label.setForeground(new java.awt.Color(1, 198, 83));
        jumlah_peminjaman_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jumlah_peminjaman_label.setText("Jumlah peminjaman buku :");

        jumlah_peminjam_panel.setBorder(null);
        jumlah_peminjam_panel.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jumlah_peminjam_panel.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jumlah_peminjam.setEditable(false);
        jumlah_peminjam.setBackground(new java.awt.Color(240, 240, 240));
        jumlah_peminjam.setColumns(20);
        jumlah_peminjam.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jumlah_peminjam.setForeground(new java.awt.Color(1, 198, 83));
        jumlah_peminjam.setLineWrap(true);
        jumlah_peminjam.setRows(5);
        jumlah_peminjam.setWrapStyleWord(true);
        jumlah_peminjam.setBorder(null);
        jumlah_peminjam_panel.setViewportView(jumlah_peminjam);

        javax.swing.GroupLayout card_peminjamLayout = new javax.swing.GroupLayout(card_peminjam);
        card_peminjam.setLayout(card_peminjamLayout);
        card_peminjamLayout.setHorizontalGroup(
            card_peminjamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(card_header_peminjam, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
            .addComponent(jumlah_peminjaman_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(card_peminjamLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jumlah_peminjam_panel)
                .addContainerGap())
        );
        card_peminjamLayout.setVerticalGroup(
            card_peminjamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(card_peminjamLayout.createSequentialGroup()
                .addComponent(card_header_peminjam, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jumlah_peminjaman_label, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jumlah_peminjam_panel, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                .addGap(6, 6, 6))
        );

        card_header_peminjam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt){
                card_header_buku.setBackground(new java.awt.Color(1,198,83));
                card_header_anggota.setBackground(new java.awt.Color(1,198,83));
                card_header_peminjam.setBackground(new java.awt.Color(0,150,62));

                card_header_buku.setForeground(new java.awt.Color(204,204,204));
                card_header_anggota.setForeground(new java.awt.Color(204,204,204));
                card_header_peminjam.setForeground(new java.awt.Color(255,255,255));

                jumlah_buku.setBackground(new java.awt.Color(240,240,240));
                jumlah_anggota.setBackground(new java.awt.Color(240,240,240));
                jumlah_peminjam.setBackground(new java.awt.Color(204,204,204));

                jumlah_buku.setForeground(new java.awt.Color(1,198,83));
                jumlah_anggota.setForeground(new java.awt.Color(1,198,83));
                jumlah_peminjam.setForeground(new java.awt.Color(0,150,62));

                card_header_buku.setFont(new java.awt.Font("SansSerif", 0, 24));
                card_header_anggota.setFont(new java.awt.Font("SansSerif", 0, 24));
                card_header_peminjam.setFont(new java.awt.Font("SansSerif", 1, 24));

                card_buku.setBackground(new java.awt.Color(240,240,240));
                card_anggota.setBackground(new java.awt.Color(240,240,240));
                card_peminjam.setBackground(new java.awt.Color(204,204,204));

                jumlah_buku_label.setForeground(new java.awt.Color(1,198,83));
                jumlah_anggota_label.setForeground(new java.awt.Color(1,198,83));
                jumlah_peminjaman_label.setForeground(new java.awt.Color(0,150,62));
            }
        });

        home_section.add(card_peminjam, new java.awt.GridBagConstraints());

        home_panel.add(home_section, java.awt.BorderLayout.CENTER);

        panels.add(home_panel);

        buku_panel.setMinimumSize(new java.awt.Dimension(1035, 675));
        buku_panel.setPreferredSize(new java.awt.Dimension(1035, 675));
        buku_panel.setRequestFocusEnabled(false);
        buku_panel.setLayout(new java.awt.BorderLayout());

        buku_panel_left.setBackground(new java.awt.Color(1, 198, 83));
        buku_panel_left.setMaximumSize(new java.awt.Dimension(450, 675));
        buku_panel_left.setMinimumSize(new java.awt.Dimension(450, 675));
        buku_panel_left.setPreferredSize(new java.awt.Dimension(450, 675));
        buku_panel_left.setLayout(new java.awt.BorderLayout());

        buku_panel_title.setMaximumSize(new java.awt.Dimension(450, 45));
        buku_panel_title.setMinimumSize(new java.awt.Dimension(450, 45));
        buku_panel_title.setPreferredSize(new java.awt.Dimension(450, 45));

        buku_panel_title_label.setBackground(new java.awt.Color(1, 198, 83));
        buku_panel_title_label.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        buku_panel_title_label.setForeground(new java.awt.Color(255, 255, 255));
        buku_panel_title_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        buku_panel_title_label.setText("INVENTARIS BUKU");
        buku_panel_title_label.setMaximumSize(new java.awt.Dimension(450, 45));
        buku_panel_title_label.setMinimumSize(new java.awt.Dimension(450, 45));
        buku_panel_title_label.setOpaque(true);
        buku_panel_title_label.setPreferredSize(new java.awt.Dimension(450, 45));

        javax.swing.GroupLayout buku_panel_titleLayout = new javax.swing.GroupLayout(buku_panel_title);
        buku_panel_title.setLayout(buku_panel_titleLayout);
        buku_panel_titleLayout.setHorizontalGroup(
            buku_panel_titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buku_panel_title_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        buku_panel_titleLayout.setVerticalGroup(
            buku_panel_titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buku_panel_titleLayout.createSequentialGroup()
                .addComponent(buku_panel_title_label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        buku_panel_left.add(buku_panel_title, java.awt.BorderLayout.PAGE_START);

        buku_btn_navigator.setMaximumSize(new java.awt.Dimension(450, 45));
        buku_btn_navigator.setMinimumSize(new java.awt.Dimension(450, 45));
        buku_btn_navigator.setPreferredSize(new java.awt.Dimension(450, 45));
        buku_btn_navigator.setLayout(new java.awt.BorderLayout());

        buku_baru.setBackground(new java.awt.Color(0, 150, 62));
        buku_baru.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        buku_baru.setForeground(new java.awt.Color(255, 255, 255));
        buku_baru.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        buku_baru.setText("Buku Baru");
        buku_baru.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        buku_baru.setMaximumSize(new java.awt.Dimension(225, 45));
        buku_baru.setMinimumSize(new java.awt.Dimension(225, 45));
        buku_baru.setOpaque(true);
        buku_baru.setPreferredSize(new java.awt.Dimension(225, 45));
        buku_btn_navigator.add(buku_baru, java.awt.BorderLayout.LINE_START);
        buku_baru.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt){
                buku_baru.setBackground(new java.awt.Color(0,150,62));
                edit_buku.setBackground(new java.awt.Color(1,198,83));

                buku_baru.setForeground(new java.awt.Color(255,255,255));
                edit_buku.setForeground(new java.awt.Color(204,204,204));

                buku_baru.setFont(new java.awt.Font("SansSerif", 1, 14));
                edit_buku.setFont(new java.awt.Font("SansSerif", 0, 14));

                form_buku_baru.setVisible(true);
                form_edit_buku.setVisible(false);
            }
        });

        edit_buku.setBackground(new java.awt.Color(1, 198, 83));
        edit_buku.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        edit_buku.setForeground(new java.awt.Color(204, 204, 204));
        edit_buku.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        edit_buku.setText("Edit Buku");
        edit_buku.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        edit_buku.setMaximumSize(new java.awt.Dimension(225, 45));
        edit_buku.setMinimumSize(new java.awt.Dimension(225, 45));
        edit_buku.setOpaque(true);
        edit_buku.setPreferredSize(new java.awt.Dimension(225, 45));
        buku_btn_navigator.add(edit_buku, java.awt.BorderLayout.LINE_END);
        edit_buku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt){
                buku_baru.setBackground(new java.awt.Color(1,198,83));
                edit_buku.setBackground(new java.awt.Color(0,150,62));

                buku_baru.setForeground(new java.awt.Color(204,204,204));
                edit_buku.setForeground(new java.awt.Color(255,255,255));

                buku_baru.setFont(new java.awt.Font("SansSerif", 0, 14));
                edit_buku.setFont(new java.awt.Font("SansSerif", 1, 14));

                form_buku_baru.setVisible(false);
                form_edit_buku.setVisible(true);
            }
        });

        buku_panel_left.add(buku_btn_navigator, java.awt.BorderLayout.CENTER);

        buku_panel_container_crud.setMaximumSize(new java.awt.Dimension(450, 585));
        buku_panel_container_crud.setMinimumSize(new java.awt.Dimension(450, 585));
        buku_panel_container_crud.setPreferredSize(new java.awt.Dimension(450, 585));
        buku_panel_container_crud.setLayout(new javax.swing.OverlayLayout(buku_panel_container_crud));

        form_buku_baru.setBackground(new java.awt.Color(204, 204, 204));
        form_buku_baru.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "FORM BUKU BARU", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 1, 18), new java.awt.Color(51, 51, 51))); // NOI18N
        form_buku_baru.setMaximumSize(new java.awt.Dimension(450, 585));
        form_buku_baru.setMinimumSize(new java.awt.Dimension(450, 585));
        form_buku_baru.setPreferredSize(new java.awt.Dimension(450, 585));

        label_no_invent_baru.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        label_no_invent_baru.setForeground(new java.awt.Color(51, 51, 51));
        label_no_invent_baru.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        label_no_invent_baru.setText("NO BUKU");
        label_no_invent_baru.setMaximumSize(new java.awt.Dimension(222, 30));
        label_no_invent_baru.setMinimumSize(new java.awt.Dimension(222, 30));
        label_no_invent_baru.setPreferredSize(new java.awt.Dimension(222, 30));

        label_judul_buku_baru.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        label_judul_buku_baru.setForeground(new java.awt.Color(51, 51, 51));
        label_judul_buku_baru.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        label_judul_buku_baru.setText("JUDUL BUKU");
        label_judul_buku_baru.setMaximumSize(new java.awt.Dimension(222, 30));
        label_judul_buku_baru.setMinimumSize(new java.awt.Dimension(222, 30));
        label_judul_buku_baru.setPreferredSize(new java.awt.Dimension(222, 30));

        label_no_isbn_baru.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        label_no_isbn_baru.setForeground(new java.awt.Color(51, 51, 51));
        label_no_isbn_baru.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        label_no_isbn_baru.setText("NO ISBN");
        label_no_isbn_baru.setMaximumSize(new java.awt.Dimension(222, 30));
        label_no_isbn_baru.setMinimumSize(new java.awt.Dimension(222, 30));
        label_no_isbn_baru.setPreferredSize(new java.awt.Dimension(222, 30));

        label_pengarang_buku_baru.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        label_pengarang_buku_baru.setForeground(new java.awt.Color(51, 51, 51));
        label_pengarang_buku_baru.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        label_pengarang_buku_baru.setText("PENGARANG");
        label_pengarang_buku_baru.setMaximumSize(new java.awt.Dimension(222, 30));
        label_pengarang_buku_baru.setMinimumSize(new java.awt.Dimension(222, 30));
        label_pengarang_buku_baru.setPreferredSize(new java.awt.Dimension(222, 30));

        label_penerbit_buku_baru.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        label_penerbit_buku_baru.setForeground(new java.awt.Color(51, 51, 51));
        label_penerbit_buku_baru.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        label_penerbit_buku_baru.setText("PENERBIT");
        label_penerbit_buku_baru.setMaximumSize(new java.awt.Dimension(222, 30));
        label_penerbit_buku_baru.setMinimumSize(new java.awt.Dimension(222, 30));
        label_penerbit_buku_baru.setPreferredSize(new java.awt.Dimension(222, 30));

        no_invent_baru.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        no_invent_baru.setBorder(null);
        no_invent_baru.setMinimumSize(new java.awt.Dimension(190, 30));
        no_invent_baru.setPreferredSize(new java.awt.Dimension(190, 30));

        judul_buku_baru.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        judul_buku_baru.setBorder(null);
        judul_buku_baru.setMinimumSize(new java.awt.Dimension(190, 30));
        judul_buku_baru.setPreferredSize(new java.awt.Dimension(190, 30));

        no_isbn_baru.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        no_isbn_baru.setBorder(null);
        no_isbn_baru.setMinimumSize(new java.awt.Dimension(190, 30));
        no_isbn_baru.setPreferredSize(new java.awt.Dimension(190, 30));

        pengarang_buku_baru.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        pengarang_buku_baru.setBorder(null);
        pengarang_buku_baru.setMinimumSize(new java.awt.Dimension(190, 30));
        pengarang_buku_baru.setPreferredSize(new java.awt.Dimension(190, 30));

        penerbit_buku_baru.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        penerbit_buku_baru.setBorder(null);
        penerbit_buku_baru.setMinimumSize(new java.awt.Dimension(190, 30));
        penerbit_buku_baru.setPreferredSize(new java.awt.Dimension(190, 30));

        insert_buku_baru.setBackground(new java.awt.Color(0, 0, 255));
        insert_buku_baru.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        insert_buku_baru.setText("SUBMIT");
        insert_buku_baru.setBorder(null);
        insert_buku_baru.setMargin(new java.awt.Insets(2, 10, 2, 10));
        insert_buku_baru.setMaximumSize(new java.awt.Dimension(73, 30));
        insert_buku_baru.setMinimumSize(new java.awt.Dimension(73, 30));
        insert_buku_baru.setPreferredSize(new java.awt.Dimension(73, 30));

        reset_buku_baru.setBackground(new java.awt.Color(255, 0, 0));
        reset_buku_baru.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        reset_buku_baru.setText("RESET");
        reset_buku_baru.setBorder(null);
        reset_buku_baru.setMargin(new java.awt.Insets(2, 10, 2, 10));
        reset_buku_baru.setMaximumSize(new java.awt.Dimension(73, 30));
        reset_buku_baru.setMinimumSize(new java.awt.Dimension(73, 30));
        reset_buku_baru.setPreferredSize(new java.awt.Dimension(73, 30));

        buku_baru_alert_message.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        buku_baru_alert_message.setMaximumSize(new java.awt.Dimension(222, 30));
        buku_baru_alert_message.setMinimumSize(new java.awt.Dimension(222, 30));
        buku_baru_alert_message.setPreferredSize(new java.awt.Dimension(222, 30));

        preview_buku_baru.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        preview_buku_baru.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        preview_buku_baru.setMaximumSize(new java.awt.Dimension(100, 100));
        preview_buku_baru.setMinimumSize(new java.awt.Dimension(100, 100));
        preview_buku_baru.setName(""); // NOI18N
        preview_buku_baru.setPreferredSize(new java.awt.Dimension(100, 100));

        buku_filechooser.setText("Pilih Gambar");
        buku_filechooser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                buku_filechooserMousePressed(evt);
            }
        });

        javax.swing.GroupLayout form_buku_baruLayout = new javax.swing.GroupLayout(form_buku_baru);
        form_buku_baru.setLayout(form_buku_baruLayout);
        form_buku_baruLayout.setHorizontalGroup(
            form_buku_baruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(form_buku_baruLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(label_no_invent_baru, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(no_invent_baru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(form_buku_baruLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(label_judul_buku_baru, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(judul_buku_baru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(form_buku_baruLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(label_no_isbn_baru, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(no_isbn_baru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(form_buku_baruLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(label_pengarang_buku_baru, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(pengarang_buku_baru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(form_buku_baruLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(label_penerbit_buku_baru, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(penerbit_buku_baru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(form_buku_baruLayout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(preview_buku_baru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(buku_filechooser, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(form_buku_baruLayout.createSequentialGroup()
                .addGap(244, 244, 244)
                .addComponent(insert_buku_baru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(reset_buku_baru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(form_buku_baruLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(buku_baru_alert_message, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        form_buku_baruLayout.setVerticalGroup(
            form_buku_baruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(form_buku_baruLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(form_buku_baruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_no_invent_baru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(no_invent_baru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(form_buku_baruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_judul_buku_baru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(judul_buku_baru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(form_buku_baruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_no_isbn_baru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(no_isbn_baru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(form_buku_baruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_pengarang_buku_baru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pengarang_buku_baru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(form_buku_baruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_penerbit_buku_baru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(penerbit_buku_baru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(form_buku_baruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(preview_buku_baru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(form_buku_baruLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(buku_filechooser, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addGroup(form_buku_baruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(insert_buku_baru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reset_buku_baru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(buku_baru_alert_message, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        insert_buku_baru.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt){
                insert_buku_baruMousePressed(evt);
            }
        });
        reset_buku_baru.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt){
                reset_buku_baruMousePressed(evt);
            }
        });

        buku_panel_container_crud.add(form_buku_baru);

        form_edit_buku.setBackground(new java.awt.Color(204, 204, 204));
        form_edit_buku.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "FORM EDIT BUKU", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 1, 18), new java.awt.Color(51, 51, 51))); // NOI18N
        form_edit_buku.setMaximumSize(new java.awt.Dimension(450, 585));
        form_edit_buku.setMinimumSize(new java.awt.Dimension(450, 585));
        form_edit_buku.setPreferredSize(new java.awt.Dimension(450, 585));

        label_no_invent_edit.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        label_no_invent_edit.setForeground(new java.awt.Color(51, 51, 51));
        label_no_invent_edit.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        label_no_invent_edit.setText("NO BUKU");
        label_no_invent_edit.setMaximumSize(new java.awt.Dimension(150, 30));
        label_no_invent_edit.setMinimumSize(new java.awt.Dimension(150, 30));
        label_no_invent_edit.setPreferredSize(new java.awt.Dimension(150, 30));

        label_judul_buku_edit.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        label_judul_buku_edit.setForeground(new java.awt.Color(51, 51, 51));
        label_judul_buku_edit.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        label_judul_buku_edit.setText("JUDUL BUKU");
        label_judul_buku_edit.setMaximumSize(new java.awt.Dimension(150, 30));
        label_judul_buku_edit.setMinimumSize(new java.awt.Dimension(150, 30));
        label_judul_buku_edit.setPreferredSize(new java.awt.Dimension(150, 30));

        label_no_isbn_edit.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        label_no_isbn_edit.setForeground(new java.awt.Color(51, 51, 51));
        label_no_isbn_edit.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        label_no_isbn_edit.setText("NO ISBN");
        label_no_isbn_edit.setMaximumSize(new java.awt.Dimension(150, 30));
        label_no_isbn_edit.setMinimumSize(new java.awt.Dimension(150, 30));
        label_no_isbn_edit.setPreferredSize(new java.awt.Dimension(150, 30));

        label_pengarang_edit.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        label_pengarang_edit.setForeground(new java.awt.Color(51, 51, 51));
        label_pengarang_edit.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        label_pengarang_edit.setText("PENGARANG");
        label_pengarang_edit.setMaximumSize(new java.awt.Dimension(150, 30));
        label_pengarang_edit.setMinimumSize(new java.awt.Dimension(150, 30));
        label_pengarang_edit.setPreferredSize(new java.awt.Dimension(150, 30));

        label_penerbit_edit.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        label_penerbit_edit.setForeground(new java.awt.Color(51, 51, 51));
        label_penerbit_edit.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        label_penerbit_edit.setText("PENERBIT");
        label_penerbit_edit.setMaximumSize(new java.awt.Dimension(150, 30));
        label_penerbit_edit.setMinimumSize(new java.awt.Dimension(150, 30));
        label_penerbit_edit.setPreferredSize(new java.awt.Dimension(150, 30));

        no_invent_edit.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        no_invent_edit.setBorder(null);
        no_invent_edit.setMinimumSize(new java.awt.Dimension(190, 30));
        no_invent_edit.setPreferredSize(new java.awt.Dimension(190, 30));

        judul_buku_edit.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        judul_buku_edit.setBorder(null);
        judul_buku_edit.setMinimumSize(new java.awt.Dimension(190, 30));
        judul_buku_edit.setPreferredSize(new java.awt.Dimension(190, 30));

        no_isbn_edit.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        no_isbn_edit.setBorder(null);
        no_isbn_edit.setMinimumSize(new java.awt.Dimension(190, 30));
        no_isbn_edit.setPreferredSize(new java.awt.Dimension(190, 30));

        pengarang_buku_edit.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        pengarang_buku_edit.setBorder(null);
        pengarang_buku_edit.setMinimumSize(new java.awt.Dimension(190, 30));
        pengarang_buku_edit.setPreferredSize(new java.awt.Dimension(190, 30));

        penerbit_buku_edit.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        penerbit_buku_edit.setBorder(null);
        penerbit_buku_edit.setMinimumSize(new java.awt.Dimension(190, 30));
        penerbit_buku_edit.setPreferredSize(new java.awt.Dimension(190, 30));

        update_buku.setBackground(new java.awt.Color(0, 0, 255));
        update_buku.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        update_buku.setText("SUBMIT");
        update_buku.setBorder(null);
        update_buku.setMaximumSize(new java.awt.Dimension(73, 30));
        update_buku.setMinimumSize(new java.awt.Dimension(73, 30));
        update_buku.setPreferredSize(new java.awt.Dimension(73, 30));

        reset_buku_edit.setBackground(new java.awt.Color(255, 0, 0));
        reset_buku_edit.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        reset_buku_edit.setText("RESET");
        reset_buku_edit.setBorder(null);
        reset_buku_edit.setMargin(new java.awt.Insets(2, 10, 2, 10));
        reset_buku_edit.setMaximumSize(new java.awt.Dimension(73, 30));
        reset_buku_edit.setMinimumSize(new java.awt.Dimension(73, 30));
        reset_buku_edit.setPreferredSize(new java.awt.Dimension(73, 30));

        buku_edit_alert_message.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        buku_edit_alert_message.setMaximumSize(new java.awt.Dimension(222, 30));
        buku_edit_alert_message.setMinimumSize(new java.awt.Dimension(222, 30));
        buku_edit_alert_message.setPreferredSize(new java.awt.Dimension(222, 30));

        preview_buku_edit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        preview_buku_edit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        preview_buku_edit.setMaximumSize(new java.awt.Dimension(100, 100));
        preview_buku_edit.setMinimumSize(new java.awt.Dimension(100, 100));
        preview_buku_edit.setName(""); // NOI18N
        preview_buku_edit.setPreferredSize(new java.awt.Dimension(100, 100));

        buku_edit_filechooser.setText("Pilih Gambar");
        buku_edit_filechooser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                buku_edit_filechooserMousePressed(evt);
            }
        });

        javax.swing.GroupLayout form_edit_bukuLayout = new javax.swing.GroupLayout(form_edit_buku);
        form_edit_buku.setLayout(form_edit_bukuLayout);
        form_edit_bukuLayout.setHorizontalGroup(
            form_edit_bukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(form_edit_bukuLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(label_no_invent_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(no_invent_edit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(form_edit_bukuLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(label_judul_buku_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(judul_buku_edit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(form_edit_bukuLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(label_no_isbn_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(no_isbn_edit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(form_edit_bukuLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(label_pengarang_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pengarang_buku_edit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(form_edit_bukuLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(label_penerbit_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(penerbit_buku_edit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(form_edit_bukuLayout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(preview_buku_edit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(buku_edit_filechooser, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(form_edit_bukuLayout.createSequentialGroup()
                .addGap(244, 244, 244)
                .addComponent(update_buku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(reset_buku_edit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(form_edit_bukuLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(buku_edit_alert_message, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        form_edit_bukuLayout.setVerticalGroup(
            form_edit_bukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(form_edit_bukuLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(form_edit_bukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_no_invent_edit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(no_invent_edit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(form_edit_bukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_judul_buku_edit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(judul_buku_edit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(form_edit_bukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_no_isbn_edit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(no_isbn_edit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(form_edit_bukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_pengarang_edit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pengarang_buku_edit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(form_edit_bukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_penerbit_edit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(penerbit_buku_edit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(form_edit_bukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(preview_buku_edit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(form_edit_bukuLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(buku_edit_filechooser, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addGroup(form_edit_bukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(update_buku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reset_buku_edit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(buku_edit_alert_message, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        update_buku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                update_bukuMousePressed(evt);
            }
        });
        reset_buku_edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt){
                reset_buku_editMousePressed(evt);
            }
        });

        buku_panel_container_crud.add(form_edit_buku);
        form_edit_buku.setVisible(false);

        buku_panel_left.add(buku_panel_container_crud, java.awt.BorderLayout.PAGE_END);

        buku_panel.add(buku_panel_left, java.awt.BorderLayout.LINE_START);

        buku_panel_right.setMinimumSize(new java.awt.Dimension(585, 675));
        buku_panel_right.setPreferredSize(new java.awt.Dimension(585, 675));
        buku_panel_right.setLayout(new java.awt.BorderLayout());

        buku_tabel_panel.setMinimumSize(new java.awt.Dimension(585, 600));

        buku_tabel.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        buku_tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NO BUKU", "JUDUL BUKU", "NO ISBN", "PENGARANG", "PENERBIT", "GAMBAR"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        buku_tabel.setGridColor(new java.awt.Color(255, 255, 255));
        buku_tabel.setRowHeight(100);
        buku_tabel.setRowMargin(3);
        buku_tabel.setSelectionBackground(new java.awt.Color(0, 0, 0));
        buku_tabel.getTableHeader().setReorderingAllowed(false);
        buku_tabel_panel.setViewportView(buku_tabel);
        buku_tabel.getTableHeader().setFont(new java.awt.Font("SansSerif", 1, 14));
        javax.swing.table.TableRowSorter tabelBukuSorter = new javax.swing.table.TableRowSorter<>((javax.swing.table.DefaultTableModel)buku_tabel.getModel());
        ((javax.swing.JLabel)buku_tabel.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(javax.swing.JLabel.CENTER);

        buku_tabel.setRowSorter(tabelBukuSorter);

        buku_panel_right.add(buku_tabel_panel, java.awt.BorderLayout.CENTER);

        buku_tabel_action_panel.setBackground(new java.awt.Color(1, 198, 83));
        buku_tabel_action_panel.setPreferredSize(new java.awt.Dimension(585, 75));
        buku_tabel_action_panel.setLayout(new java.awt.GridBagLayout());

        cetak_laporan_buku_btn.setBackground(new java.awt.Color(0, 0, 0));
        cetak_laporan_buku_btn.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        cetak_laporan_buku_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_print_16.png"))); // NOI18N
        cetak_laporan_buku_btn.setText("CETAK");
        cetak_laporan_buku_btn.setBorder(null);
        cetak_laporan_buku_btn.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        cetak_laporan_buku_btn.setMargin(new java.awt.Insets(2, 4, 2, 4));
        cetak_laporan_buku_btn.setMaximumSize(new java.awt.Dimension(30, 30));
        cetak_laporan_buku_btn.setMinimumSize(new java.awt.Dimension(30, 30));
        cetak_laporan_buku_btn.setPreferredSize(new java.awt.Dimension(30, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 60;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(30, 159, 5, 0);
        buku_tabel_action_panel.add(cetak_laporan_buku_btn, gridBagConstraints);
        cetak_laporan_buku_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt){
                cetak_laporan_buku_btnMousePressed(evt);
            }
        });

        edit_buku_btn.setBackground(new java.awt.Color(0, 0, 0));
        edit_buku_btn.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        edit_buku_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_edit_16.png"))); // NOI18N
        edit_buku_btn.setText("EDIT");
        edit_buku_btn.setBorder(null);
        edit_buku_btn.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        edit_buku_btn.setMargin(new java.awt.Insets(2, 4, 2, 4));
        edit_buku_btn.setMaximumSize(new java.awt.Dimension(30, 30));
        edit_buku_btn.setMinimumSize(new java.awt.Dimension(30, 30));
        edit_buku_btn.setPreferredSize(new java.awt.Dimension(30, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 60;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(30, 0, 15, 0);
        buku_tabel_action_panel.add(edit_buku_btn, gridBagConstraints);
        edit_buku_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                buku_baru.setBackground(new java.awt.Color(1,198,83));
                edit_buku.setBackground(new java.awt.Color(0,150,62));

                buku_baru.setForeground(new java.awt.Color(204,204,204));
                edit_buku.setForeground(new java.awt.Color(255,255,255));

                buku_baru.setFont(new java.awt.Font("SansSerif", 0, 14));
                edit_buku.setFont(new java.awt.Font("SansSerif", 1, 14));

                form_buku_baru.setVisible(false);
                form_edit_buku.setVisible(true);

                edit_buku_btnMousePressed(evt);
            }
        });

        hapus_buku_btn.setBackground(new java.awt.Color(255, 0, 0));
        hapus_buku_btn.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        hapus_buku_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_trash_16.png"))); // NOI18N
        hapus_buku_btn.setText("HAPUS");
        hapus_buku_btn.setBorder(null);
        hapus_buku_btn.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        hapus_buku_btn.setMargin(new java.awt.Insets(2, 4, 2, 4));
        hapus_buku_btn.setMaximumSize(new java.awt.Dimension(30, 30));
        hapus_buku_btn.setMinimumSize(new java.awt.Dimension(30, 30));
        hapus_buku_btn.setPreferredSize(new java.awt.Dimension(30, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 60;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(30, 0, 5, 156);
        buku_tabel_action_panel.add(hapus_buku_btn, gridBagConstraints);
        hapus_buku_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt){
                hapus_buku_btnMousePressed(evt);
            }
        });

        buku_panel_right.add(buku_tabel_action_panel, java.awt.BorderLayout.PAGE_START);

        search_buku_panel.setBackground(new java.awt.Color(204, 204, 204));
        search_buku_panel.setMinimumSize(new java.awt.Dimension(585, 165));
        search_buku_panel.setPreferredSize(new java.awt.Dimension(585, 165));
        search_buku_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        filter_buku_title.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        filter_buku_title.setText("FILTER PENCARIAN BUKU");
        filter_buku_title.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        filter_buku_title.setMaximumSize(new java.awt.Dimension(50, 30));
        filter_buku_title.setMinimumSize(new java.awt.Dimension(50, 30));
        filter_buku_title.setPreferredSize(new java.awt.Dimension(50, 30));
        search_buku_panel.add(filter_buku_title, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, -1));

        petunjuk_filter_buku.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        petunjuk_filter_buku.setText("Catatan : Untuk menggunakan filter pencarian buku, ketikkan kata kunci dibawah.");
        search_buku_panel.add(petunjuk_filter_buku, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 800, 30));

        no_inventaris_filter.setBackground(new java.awt.Color(240, 240, 240));
        no_inventaris_filter.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        no_inventaris_filter.setForeground(new java.awt.Color(102, 102, 102));
        no_inventaris_filter.setText("Semua");
        no_inventaris_filter.setBorder(null);
        no_inventaris_filter.setMinimumSize(new java.awt.Dimension(110, 20));
        no_inventaris_filter.setPreferredSize(new java.awt.Dimension(110, 20));
        search_buku_panel.add(no_inventaris_filter, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 150, 30));
        no_inventaris_filter.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt){
                if(no_inventaris_filter.getText().trim().equals("Semua")){
                    no_inventaris_filter.setText(null);
                }
                no_inventaris_filter.setForeground(new java.awt.Color(0,0,0));
            }
            public void focusLost(java.awt.event.FocusEvent evt){
                no_inventaris_filter.setForeground(new java.awt.Color(102,102,102));
                if(no_inventaris_filter.getText().trim().equals("")){
                    no_inventaris_filter.setText("Semua");
                }
            }
        });
        no_inventaris_filter.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
            @Override public void insertUpdate(javax.swing.event.DocumentEvent e) {
                String[] keywords = new String[] {
                    no_inventaris_filter.getText().trim().equals("Semua")?"":no_inventaris_filter.getText(),
                    judul_buku_filter.getText().trim().equals("Semua")?"":judul_buku_filter.getText(),
                    no_isbn_filter.getText().trim().equals("Semua")?"":no_isbn_filter.getText(),
                    pengarang_buku_filter.getText().trim().equals("Semua")?"":pengarang_buku_filter.getText(),
                    penerbit_buku_filter.getText().trim().equals("Semua")?"":penerbit_buku_filter.getText(),
                };
                java.util.List<javax.swing.RowFilter<Object, Object>> filters = new java.util.ArrayList<>();
                filters.add(javax.swing.RowFilter.regexFilter("^(?i)" + keywords[0], 0));
                filters.add(javax.swing.RowFilter.regexFilter("(?i)" + keywords[1], 1));
                filters.add(javax.swing.RowFilter.regexFilter("^(?i)" + keywords[2], 2));
                filters.add(javax.swing.RowFilter.regexFilter("(?i)" + keywords[3], 3));
                filters.add(javax.swing.RowFilter.regexFilter("(?i)" + keywords[4], 4));
                tabelBukuSorter.setRowFilter(javax.swing.RowFilter.andFilter(filters));
            }
            @Override public void removeUpdate(javax.swing.event.DocumentEvent e) {
                String[] keywords = new String[] {
                    no_inventaris_filter.getText().trim().equals("Semua")?"":no_inventaris_filter.getText(),
                    judul_buku_filter.getText().trim().equals("Semua")?"":judul_buku_filter.getText(),
                    no_isbn_filter.getText().trim().equals("Semua")?"":no_isbn_filter.getText(),
                    pengarang_buku_filter.getText().trim().equals("Semua")?"":pengarang_buku_filter.getText(),
                    penerbit_buku_filter.getText().trim().equals("Semua")?"":penerbit_buku_filter.getText(),
                };
                java.util.List<javax.swing.RowFilter<Object, Object>> filters = new java.util.ArrayList<>();
                filters.add(javax.swing.RowFilter.regexFilter("^(?i)" + keywords[0], 0));
                filters.add(javax.swing.RowFilter.regexFilter("(?i)" + keywords[1], 1));
                filters.add(javax.swing.RowFilter.regexFilter("^(?i)" + keywords[2], 2));
                filters.add(javax.swing.RowFilter.regexFilter("(?i)" + keywords[3], 3));
                filters.add(javax.swing.RowFilter.regexFilter("(?i)" + keywords[4], 4));
                tabelBukuSorter.setRowFilter(javax.swing.RowFilter.andFilter(filters));
            }
            @Override public void changedUpdate(javax.swing.event.DocumentEvent e) {
            }
        });

        judul_buku_filter.setBackground(new java.awt.Color(240, 240, 240));
        judul_buku_filter.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        judul_buku_filter.setForeground(new java.awt.Color(102, 102, 102));
        judul_buku_filter.setText("Semua");
        judul_buku_filter.setBorder(null);
        judul_buku_filter.setMinimumSize(new java.awt.Dimension(110, 20));
        judul_buku_filter.setPreferredSize(new java.awt.Dimension(110, 20));
        search_buku_panel.add(judul_buku_filter, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 150, 30));
        judul_buku_filter.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt){
                if(judul_buku_filter.getText().trim().equals("Semua")){
                    judul_buku_filter.setText(null);
                }
                judul_buku_filter.setForeground(new java.awt.Color(0,0,0));
            }
            public void focusLost(java.awt.event.FocusEvent evt){
                judul_buku_filter.setForeground(new java.awt.Color(102,102,102));
                if(judul_buku_filter.getText().trim().equals("")){
                    judul_buku_filter.setText("Semua");
                }
            }
        });
        judul_buku_filter.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
            @Override public void insertUpdate(javax.swing.event.DocumentEvent e) {
                String[] keywords = new String[] {
                    no_inventaris_filter.getText().trim().equals("Semua")?"":no_inventaris_filter.getText(),
                    judul_buku_filter.getText().trim().equals("Semua")?"":judul_buku_filter.getText(),
                    no_isbn_filter.getText().trim().equals("Semua")?"":no_isbn_filter.getText(),
                    pengarang_buku_filter.getText().trim().equals("Semua")?"":pengarang_buku_filter.getText(),
                    penerbit_buku_filter.getText().trim().equals("Semua")?"":penerbit_buku_filter.getText(),
                };
                java.util.List<javax.swing.RowFilter<Object, Object>> filters = new java.util.ArrayList<>();
                filters.add(javax.swing.RowFilter.regexFilter("^(?i)" + keywords[0], 0));
                filters.add(javax.swing.RowFilter.regexFilter("(?i)" + keywords[1], 1));
                filters.add(javax.swing.RowFilter.regexFilter("^(?i)" + keywords[2], 2));
                filters.add(javax.swing.RowFilter.regexFilter("(?i)" + keywords[3], 3));
                filters.add(javax.swing.RowFilter.regexFilter("(?i)" + keywords[4], 4));
                tabelBukuSorter.setRowFilter(javax.swing.RowFilter.andFilter(filters));
            }
            @Override public void removeUpdate(javax.swing.event.DocumentEvent e) {
                String[] keywords = new String[] {
                    no_inventaris_filter.getText().trim().equals("Semua")?"":no_inventaris_filter.getText(),
                    judul_buku_filter.getText().trim().equals("Semua")?"":judul_buku_filter.getText(),
                    no_isbn_filter.getText().trim().equals("Semua")?"":no_isbn_filter.getText(),
                    pengarang_buku_filter.getText().trim().equals("Semua")?"":pengarang_buku_filter.getText(),
                    penerbit_buku_filter.getText().trim().equals("Semua")?"":penerbit_buku_filter.getText(),
                };
                java.util.List<javax.swing.RowFilter<Object, Object>> filters = new java.util.ArrayList<>();
                filters.add(javax.swing.RowFilter.regexFilter("^(?i)" + keywords[0], 0));
                filters.add(javax.swing.RowFilter.regexFilter("(?i)" + keywords[1], 1));
                filters.add(javax.swing.RowFilter.regexFilter("^(?i)" + keywords[2], 2));
                filters.add(javax.swing.RowFilter.regexFilter("(?i)" + keywords[3], 3));
                filters.add(javax.swing.RowFilter.regexFilter("(?i)" + keywords[4], 4));
                tabelBukuSorter.setRowFilter(javax.swing.RowFilter.andFilter(filters));
            }
            @Override public void changedUpdate(javax.swing.event.DocumentEvent e) {
            }
        });

        no_isbn_filter.setBackground(new java.awt.Color(240, 240, 240));
        no_isbn_filter.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        no_isbn_filter.setForeground(new java.awt.Color(102, 102, 102));
        no_isbn_filter.setText("Semua");
        no_isbn_filter.setBorder(null);
        no_isbn_filter.setMinimumSize(new java.awt.Dimension(110, 20));
        no_isbn_filter.setPreferredSize(new java.awt.Dimension(110, 20));
        search_buku_panel.add(no_isbn_filter, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, 150, 30));
        no_isbn_filter.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt){
                if(no_isbn_filter.getText().trim().equals("Semua")){
                    no_isbn_filter.setText(null);
                }
                no_isbn_filter.setForeground(new java.awt.Color(0,0,0));
            }
            public void focusLost(java.awt.event.FocusEvent evt){
                no_isbn_filter.setForeground(new java.awt.Color(102,102,102));
                if(no_isbn_filter.getText().trim().equals("")){
                    no_isbn_filter.setText("Semua");
                }
            }
        });
        no_isbn_filter.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
            @Override public void insertUpdate(javax.swing.event.DocumentEvent e) {
                String[] keywords = new String[] {
                    no_inventaris_filter.getText().trim().equals("Semua")?"":no_inventaris_filter.getText(),
                    judul_buku_filter.getText().trim().equals("Semua")?"":judul_buku_filter.getText(),
                    no_isbn_filter.getText().trim().equals("Semua")?"":no_isbn_filter.getText(),
                    pengarang_buku_filter.getText().trim().equals("Semua")?"":pengarang_buku_filter.getText(),
                    penerbit_buku_filter.getText().trim().equals("Semua")?"":penerbit_buku_filter.getText(),
                };
                java.util.List<javax.swing.RowFilter<Object, Object>> filters = new java.util.ArrayList<>();
                filters.add(javax.swing.RowFilter.regexFilter("^(?i)" + keywords[0], 0));
                filters.add(javax.swing.RowFilter.regexFilter("(?i)" + keywords[1], 1));
                filters.add(javax.swing.RowFilter.regexFilter("^(?i)" + keywords[2], 2));
                filters.add(javax.swing.RowFilter.regexFilter("(?i)" + keywords[3], 3));
                filters.add(javax.swing.RowFilter.regexFilter("(?i)" + keywords[4], 4));
                tabelBukuSorter.setRowFilter(javax.swing.RowFilter.andFilter(filters));
            }
            @Override public void removeUpdate(javax.swing.event.DocumentEvent e) {
                String[] keywords = new String[] {
                    no_inventaris_filter.getText().trim().equals("Semua")?"":no_inventaris_filter.getText(),
                    judul_buku_filter.getText().trim().equals("Semua")?"":judul_buku_filter.getText(),
                    no_isbn_filter.getText().trim().equals("Semua")?"":no_isbn_filter.getText(),
                    pengarang_buku_filter.getText().trim().equals("Semua")?"":pengarang_buku_filter.getText(),
                    penerbit_buku_filter.getText().trim().equals("Semua")?"":penerbit_buku_filter.getText(),
                };
                java.util.List<javax.swing.RowFilter<Object, Object>> filters = new java.util.ArrayList<>();
                filters.add(javax.swing.RowFilter.regexFilter("^(?i)" + keywords[0], 0));
                filters.add(javax.swing.RowFilter.regexFilter("(?i)" + keywords[1], 1));
                filters.add(javax.swing.RowFilter.regexFilter("^(?i)" + keywords[2], 2));
                filters.add(javax.swing.RowFilter.regexFilter("(?i)" + keywords[3], 3));
                filters.add(javax.swing.RowFilter.regexFilter("(?i)" + keywords[4], 4));
                tabelBukuSorter.setRowFilter(javax.swing.RowFilter.andFilter(filters));
            }
            @Override public void changedUpdate(javax.swing.event.DocumentEvent e) {

            }
        });

        pengarang_buku_filter.setBackground(new java.awt.Color(240, 240, 240));
        pengarang_buku_filter.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        pengarang_buku_filter.setForeground(new java.awt.Color(102, 102, 102));
        pengarang_buku_filter.setText("Semua");
        pengarang_buku_filter.setBorder(null);
        pengarang_buku_filter.setMinimumSize(new java.awt.Dimension(110, 20));
        pengarang_buku_filter.setPreferredSize(new java.awt.Dimension(110, 20));
        search_buku_panel.add(pengarang_buku_filter, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, 150, 30));
        pengarang_buku_filter.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt){
                if(pengarang_buku_filter.getText().trim().equals("Semua")){
                    pengarang_buku_filter.setText(null);
                }
                pengarang_buku_filter.setForeground(new java.awt.Color(0,0,0));
            }
            public void focusLost(java.awt.event.FocusEvent evt){
                pengarang_buku_filter.setForeground(new java.awt.Color(102,102,102));
                if(pengarang_buku_filter.getText().trim().equals("")){
                    pengarang_buku_filter.setText("Semua");
                }
            }
        });
        pengarang_buku_filter.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
            @Override public void insertUpdate(javax.swing.event.DocumentEvent e) {
                String[] keywords = new String[] {
                    no_inventaris_filter.getText().trim().equals("Semua")?"":no_inventaris_filter.getText(),
                    judul_buku_filter.getText().trim().equals("Semua")?"":judul_buku_filter.getText(),
                    no_isbn_filter.getText().trim().equals("Semua")?"":no_isbn_filter.getText(),
                    pengarang_buku_filter.getText().trim().equals("Semua")?"":pengarang_buku_filter.getText(),
                    penerbit_buku_filter.getText().trim().equals("Semua")?"":penerbit_buku_filter.getText(),
                };
                java.util.List<javax.swing.RowFilter<Object, Object>> filters = new java.util.ArrayList<>();
                filters.add(javax.swing.RowFilter.regexFilter("^(?i)" + keywords[0], 0));
                filters.add(javax.swing.RowFilter.regexFilter("(?i)" + keywords[1], 1));
                filters.add(javax.swing.RowFilter.regexFilter("^(?i)" + keywords[2], 2));
                filters.add(javax.swing.RowFilter.regexFilter("(?i)" + keywords[3], 3));
                filters.add(javax.swing.RowFilter.regexFilter("(?i)" + keywords[4], 4));
                tabelBukuSorter.setRowFilter(javax.swing.RowFilter.andFilter(filters));
            }
            @Override public void removeUpdate(javax.swing.event.DocumentEvent e) {
                String[] keywords = new String[] {
                    no_inventaris_filter.getText().trim().equals("Semua")?"":no_inventaris_filter.getText(),
                    judul_buku_filter.getText().trim().equals("Semua")?"":judul_buku_filter.getText(),
                    no_isbn_filter.getText().trim().equals("Semua")?"":no_isbn_filter.getText(),
                    pengarang_buku_filter.getText().trim().equals("Semua")?"":pengarang_buku_filter.getText(),
                    penerbit_buku_filter.getText().trim().equals("Semua")?"":penerbit_buku_filter.getText(),
                };
                java.util.List<javax.swing.RowFilter<Object, Object>> filters = new java.util.ArrayList<>();
                filters.add(javax.swing.RowFilter.regexFilter("^(?i)" + keywords[0], 0));
                filters.add(javax.swing.RowFilter.regexFilter("(?i)" + keywords[1], 1));
                filters.add(javax.swing.RowFilter.regexFilter("^(?i)" + keywords[2], 2));
                filters.add(javax.swing.RowFilter.regexFilter("(?i)" + keywords[3], 3));
                filters.add(javax.swing.RowFilter.regexFilter("(?i)" + keywords[4], 4));
                tabelBukuSorter.setRowFilter(javax.swing.RowFilter.andFilter(filters));
            }
            @Override public void changedUpdate(javax.swing.event.DocumentEvent e) {

            }
        });

        penerbit_buku_filter.setBackground(new java.awt.Color(240, 240, 240));
        penerbit_buku_filter.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        penerbit_buku_filter.setForeground(new java.awt.Color(102, 102, 102));
        penerbit_buku_filter.setText("Semua");
        penerbit_buku_filter.setBorder(null);
        penerbit_buku_filter.setMinimumSize(new java.awt.Dimension(110, 20));
        penerbit_buku_filter.setPreferredSize(new java.awt.Dimension(110, 20));
        search_buku_panel.add(penerbit_buku_filter, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 90, 150, 30));
        penerbit_buku_filter.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt){
                if(penerbit_buku_filter.getText().trim().equals("Semua")){
                    penerbit_buku_filter.setText(null);
                }
                penerbit_buku_filter.setForeground(new java.awt.Color(0,0,0));
            }
            public void focusLost(java.awt.event.FocusEvent evt){
                penerbit_buku_filter.setForeground(new java.awt.Color(102,102,102));
                if(penerbit_buku_filter.getText().trim().equals("")){
                    penerbit_buku_filter.setText("Semua");
                }
            }
        });
        penerbit_buku_filter.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
            @Override public void insertUpdate(javax.swing.event.DocumentEvent e) {
                String[] keywords = new String[] {
                    no_inventaris_filter.getText().trim().equals("Semua")?"":no_inventaris_filter.getText(),
                    judul_buku_filter.getText().trim().equals("Semua")?"":judul_buku_filter.getText(),
                    no_isbn_filter.getText().trim().equals("Semua")?"":no_isbn_filter.getText(),
                    pengarang_buku_filter.getText().trim().equals("Semua")?"":pengarang_buku_filter.getText(),
                    penerbit_buku_filter.getText().trim().equals("Semua")?"":penerbit_buku_filter.getText(),
                };
                java.util.List<javax.swing.RowFilter<Object, Object>> filters = new java.util.ArrayList<>();
                filters.add(javax.swing.RowFilter.regexFilter("^(?i)" + keywords[0], 0));
                filters.add(javax.swing.RowFilter.regexFilter("(?i)" + keywords[1], 1));
                filters.add(javax.swing.RowFilter.regexFilter("^(?i)" + keywords[2], 2));
                filters.add(javax.swing.RowFilter.regexFilter("(?i)" + keywords[3], 3));
                filters.add(javax.swing.RowFilter.regexFilter("(?i)" + keywords[4], 4));
                tabelBukuSorter.setRowFilter(javax.swing.RowFilter.andFilter(filters));
            }
            @Override public void removeUpdate(javax.swing.event.DocumentEvent e) {
                String[] keywords = new String[] {
                    no_inventaris_filter.getText().trim().equals("Semua")?"":no_inventaris_filter.getText(),
                    judul_buku_filter.getText().trim().equals("Semua")?"":judul_buku_filter.getText(),
                    no_isbn_filter.getText().trim().equals("Semua")?"":no_isbn_filter.getText(),
                    pengarang_buku_filter.getText().trim().equals("Semua")?"":pengarang_buku_filter.getText(),
                    penerbit_buku_filter.getText().trim().equals("Semua")?"":penerbit_buku_filter.getText(),
                };
                java.util.List<javax.swing.RowFilter<Object, Object>> filters = new java.util.ArrayList<>();
                filters.add(javax.swing.RowFilter.regexFilter("^(?i)" + keywords[0], 0));
                filters.add(javax.swing.RowFilter.regexFilter("(?i)" + keywords[1], 1));
                filters.add(javax.swing.RowFilter.regexFilter("^(?i)" + keywords[2], 2));
                filters.add(javax.swing.RowFilter.regexFilter("(?i)" + keywords[3], 3));
                filters.add(javax.swing.RowFilter.regexFilter("(?i)" + keywords[4], 4));
                tabelBukuSorter.setRowFilter(javax.swing.RowFilter.andFilter(filters));
            }
            @Override public void changedUpdate(javax.swing.event.DocumentEvent e) {

            }
        });

        penerbit_filter_label.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        penerbit_filter_label.setText("Penerbit");
        search_buku_panel.add(penerbit_filter_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 70, 150, -1));

        no_inventaris_label.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        no_inventaris_label.setText("NO BUKU");
        search_buku_panel.add(no_inventaris_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 150, -1));

        judul_buku_label.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        judul_buku_label.setText("JUDUL BUKU");
        search_buku_panel.add(judul_buku_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 150, -1));

        no_isbn_filter_label.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        no_isbn_filter_label.setText("NO ISBN");
        search_buku_panel.add(no_isbn_filter_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 150, -1));

        pengarang_filter_label.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        pengarang_filter_label.setText("Pengarang");
        search_buku_panel.add(pengarang_filter_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 70, 150, -1));

        buku_panel_right.add(search_buku_panel, java.awt.BorderLayout.PAGE_END);

        buku_panel.add(buku_panel_right, java.awt.BorderLayout.CENTER);

        panels.add(buku_panel);
        buku_panel.setVisible(false);

        anggota_panel.setMinimumSize(new java.awt.Dimension(1035, 675));
        anggota_panel.setLayout(new java.awt.BorderLayout());

        anggota_panel_left.setBackground(new java.awt.Color(1, 198, 83));
        anggota_panel_left.setMinimumSize(new java.awt.Dimension(450, 675));
        anggota_panel_left.setLayout(new java.awt.BorderLayout());

        anggota_panel_title.setPreferredSize(new java.awt.Dimension(450, 45));

        anggota_panel_title_label.setBackground(new java.awt.Color(1, 198, 83));
        anggota_panel_title_label.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        anggota_panel_title_label.setForeground(new java.awt.Color(255, 255, 255));
        anggota_panel_title_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        anggota_panel_title_label.setText("ANGGOTA PERPUSTAKAAN");
        anggota_panel_title_label.setMaximumSize(new java.awt.Dimension(450, 45));
        anggota_panel_title_label.setMinimumSize(new java.awt.Dimension(450, 45));
        anggota_panel_title_label.setOpaque(true);
        anggota_panel_title_label.setPreferredSize(new java.awt.Dimension(450, 45));

        javax.swing.GroupLayout anggota_panel_titleLayout = new javax.swing.GroupLayout(anggota_panel_title);
        anggota_panel_title.setLayout(anggota_panel_titleLayout);
        anggota_panel_titleLayout.setHorizontalGroup(
            anggota_panel_titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(anggota_panel_title_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        anggota_panel_titleLayout.setVerticalGroup(
            anggota_panel_titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(anggota_panel_titleLayout.createSequentialGroup()
                .addComponent(anggota_panel_title_label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        anggota_panel_left.add(anggota_panel_title, java.awt.BorderLayout.NORTH);

        anggota_btn_navigator.setMinimumSize(new java.awt.Dimension(450, 45));
        anggota_btn_navigator.setPreferredSize(new java.awt.Dimension(450, 45));
        anggota_btn_navigator.setLayout(new java.awt.BorderLayout());

        anggota_baru.setBackground(new java.awt.Color(0, 150, 62));
        anggota_baru.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        anggota_baru.setForeground(new java.awt.Color(255, 255, 255));
        anggota_baru.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        anggota_baru.setText("Anggota Baru");
        anggota_baru.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        anggota_baru.setMaximumSize(new java.awt.Dimension(225, 45));
        anggota_baru.setMinimumSize(new java.awt.Dimension(225, 45));
        anggota_baru.setOpaque(true);
        anggota_baru.setPreferredSize(new java.awt.Dimension(225, 45));
        anggota_btn_navigator.add(anggota_baru, java.awt.BorderLayout.LINE_START);
        anggota_baru.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt){
                anggota_baru.setBackground(new java.awt.Color(0,150,62));
                edit_anggota.setBackground(new java.awt.Color(1,198,83));

                anggota_baru.setForeground(new java.awt.Color(255,255,255));
                edit_anggota.setForeground(new java.awt.Color(204,204,204));

                anggota_baru.setFont(new java.awt.Font("SansSerif", 1, 14));
                edit_anggota.setFont(new java.awt.Font("SansSerif", 0, 14));

                form_anggota_baru.setVisible(true);
                form_edit_anggota.setVisible(false);
            }
        });

        edit_anggota.setBackground(new java.awt.Color(1, 198, 83));
        edit_anggota.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        edit_anggota.setForeground(new java.awt.Color(204, 204, 204));
        edit_anggota.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        edit_anggota.setText("Edit Anggota");
        edit_anggota.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        edit_anggota.setMaximumSize(new java.awt.Dimension(225, 45));
        edit_anggota.setMinimumSize(new java.awt.Dimension(225, 45));
        edit_anggota.setOpaque(true);
        edit_anggota.setPreferredSize(new java.awt.Dimension(225, 45));
        anggota_btn_navigator.add(edit_anggota, java.awt.BorderLayout.LINE_END);
        edit_anggota.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt){
                anggota_baru.setBackground(new java.awt.Color(1,198,83));
                edit_anggota.setBackground(new java.awt.Color(0,150,62));

                anggota_baru.setForeground(new java.awt.Color(204,204,204));
                edit_anggota.setForeground(new java.awt.Color(255,255,255));

                anggota_baru.setFont(new java.awt.Font("SansSerif", 0, 14));
                edit_anggota.setFont(new java.awt.Font("SansSerif", 1, 14));

                form_anggota_baru.setVisible(false);
                form_edit_anggota.setVisible(true);
            }
        });

        anggota_panel_left.add(anggota_btn_navigator, java.awt.BorderLayout.CENTER);

        anggota_panel_container_crud.setPreferredSize(new java.awt.Dimension(450, 585));
        anggota_panel_container_crud.setLayout(new javax.swing.OverlayLayout(anggota_panel_container_crud));

        form_anggota_baru.setBackground(new java.awt.Color(204, 204, 204));
        form_anggota_baru.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "FORM INPUT ANGGOTA BARU", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 1, 18), new java.awt.Color(51, 51, 51))); // NOI18N
        form_anggota_baru.setMinimumSize(new java.awt.Dimension(450, 585));

        label_nama_siswa_baru.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        label_nama_siswa_baru.setForeground(new java.awt.Color(51, 51, 51));
        label_nama_siswa_baru.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        label_nama_siswa_baru.setText("NAMA SISWA");
        label_nama_siswa_baru.setMaximumSize(new java.awt.Dimension(150, 30));
        label_nama_siswa_baru.setMinimumSize(new java.awt.Dimension(150, 30));
        label_nama_siswa_baru.setPreferredSize(new java.awt.Dimension(150, 30));

        label_nis_baru.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        label_nis_baru.setForeground(new java.awt.Color(51, 51, 51));
        label_nis_baru.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        label_nis_baru.setText("NIS");
        label_nis_baru.setMaximumSize(new java.awt.Dimension(150, 30));
        label_nis_baru.setMinimumSize(new java.awt.Dimension(150, 30));
        label_nis_baru.setPreferredSize(new java.awt.Dimension(150, 30));

        label_tanggal_lahir_baru.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        label_tanggal_lahir_baru.setForeground(new java.awt.Color(51, 51, 51));
        label_tanggal_lahir_baru.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        label_tanggal_lahir_baru.setText("TANGGAL LAHIR");
        label_tanggal_lahir_baru.setMaximumSize(new java.awt.Dimension(150, 30));
        label_tanggal_lahir_baru.setMinimumSize(new java.awt.Dimension(150, 30));
        label_tanggal_lahir_baru.setPreferredSize(new java.awt.Dimension(150, 30));

        label_jenis_kelamin_baru.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        label_jenis_kelamin_baru.setForeground(new java.awt.Color(51, 51, 51));
        label_jenis_kelamin_baru.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        label_jenis_kelamin_baru.setText("JENIS KELAMIN");
        label_jenis_kelamin_baru.setMaximumSize(new java.awt.Dimension(150, 30));
        label_jenis_kelamin_baru.setMinimumSize(new java.awt.Dimension(150, 30));
        label_jenis_kelamin_baru.setPreferredSize(new java.awt.Dimension(150, 30));

        label_alamat_baru.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        label_alamat_baru.setForeground(new java.awt.Color(51, 51, 51));
        label_alamat_baru.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        label_alamat_baru.setText("ALAMAT");
        label_alamat_baru.setMaximumSize(new java.awt.Dimension(150, 30));
        label_alamat_baru.setMinimumSize(new java.awt.Dimension(150, 30));
        label_alamat_baru.setPreferredSize(new java.awt.Dimension(150, 30));

        label_kode_pos_baru.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        label_kode_pos_baru.setForeground(new java.awt.Color(51, 51, 51));
        label_kode_pos_baru.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        label_kode_pos_baru.setText("KODE POS");
        label_kode_pos_baru.setMaximumSize(new java.awt.Dimension(150, 30));
        label_kode_pos_baru.setMinimumSize(new java.awt.Dimension(150, 30));
        label_kode_pos_baru.setPreferredSize(new java.awt.Dimension(150, 30));

        label_no_telp_baru.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        label_no_telp_baru.setForeground(new java.awt.Color(51, 51, 51));
        label_no_telp_baru.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        label_no_telp_baru.setText("NO TELEPON");
        label_no_telp_baru.setMaximumSize(new java.awt.Dimension(150, 30));
        label_no_telp_baru.setMinimumSize(new java.awt.Dimension(150, 30));
        label_no_telp_baru.setPreferredSize(new java.awt.Dimension(150, 30));

        nama_siswa_baru.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        nama_siswa_baru.setMinimumSize(new java.awt.Dimension(186, 30));
        nama_siswa_baru.setPreferredSize(new java.awt.Dimension(186, 30));

        nis_baru.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        nis_baru.setMinimumSize(new java.awt.Dimension(186, 30));
        nis_baru.setPreferredSize(new java.awt.Dimension(186, 30));

        tanggal_lahir_baru.setDateFormatString("yyyy-MM-dd");
        tanggal_lahir_baru.setFont(new java.awt.Font("SansSerif", 0, 10)); // NOI18N
        tanggal_lahir_baru.setMinimumSize(new java.awt.Dimension(186, 30));
        tanggal_lahir_baru.setPreferredSize(new java.awt.Dimension(186, 30));

        jenis_kelamin_baru.setBackground(new java.awt.Color(0, 150, 62));
        jenis_kelamin_baru.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jenis_kelamin_baru.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "L (Laki-laki)", "P (Perempuan)" }));
        jenis_kelamin_baru.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jenis_kelamin_baru.setMinimumSize(new java.awt.Dimension(186, 30));
        jenis_kelamin_baru.setOpaque(false);
        jenis_kelamin_baru.setPreferredSize(new java.awt.Dimension(186, 30));
        jenis_kelamin_baru.setRequestFocusEnabled(false);
        jenis_kelamin_baru.setVerifyInputWhenFocusTarget(false);

        alamat_baru.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        alamat_baru.setMinimumSize(new java.awt.Dimension(186, 30));
        alamat_baru.setPreferredSize(new java.awt.Dimension(186, 30));

        kode_pos_baru.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        kode_pos_baru.setMinimumSize(new java.awt.Dimension(186, 30));
        kode_pos_baru.setPreferredSize(new java.awt.Dimension(186, 30));

        no_telp_baru.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        no_telp_baru.setMinimumSize(new java.awt.Dimension(186, 30));
        no_telp_baru.setPreferredSize(new java.awt.Dimension(186, 30));

        preview_anggota_baru.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        preview_anggota_baru.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        preview_anggota_baru.setMaximumSize(new java.awt.Dimension(100, 100));
        preview_anggota_baru.setMinimumSize(new java.awt.Dimension(100, 100));
        preview_anggota_baru.setName(""); // NOI18N
        preview_anggota_baru.setPreferredSize(new java.awt.Dimension(100, 100));

        anggota_filechooser.setText("Pilih Gambar");
        anggota_filechooser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                anggota_filechooserMousePressed(evt);
            }
        });

        insert_anggota_baru.setBackground(new java.awt.Color(0, 0, 255));
        insert_anggota_baru.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        insert_anggota_baru.setText("SUBMIT");
        insert_anggota_baru.setBorder(null);
        insert_anggota_baru.setMaximumSize(new java.awt.Dimension(73, 30));
        insert_anggota_baru.setMinimumSize(new java.awt.Dimension(73, 30));
        insert_anggota_baru.setPreferredSize(new java.awt.Dimension(73, 30));

        reset_baru_anggota.setBackground(new java.awt.Color(255, 0, 0));
        reset_baru_anggota.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        reset_baru_anggota.setText("RESET");
        reset_baru_anggota.setBorder(null);
        reset_baru_anggota.setMaximumSize(new java.awt.Dimension(73, 30));
        reset_baru_anggota.setMinimumSize(new java.awt.Dimension(73, 30));
        reset_baru_anggota.setPreferredSize(new java.awt.Dimension(73, 30));

        anggota_baru_alert_message.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        anggota_baru_alert_message.setMaximumSize(new java.awt.Dimension(222, 30));
        anggota_baru_alert_message.setMinimumSize(new java.awt.Dimension(222, 30));
        anggota_baru_alert_message.setPreferredSize(new java.awt.Dimension(222, 30));

        javax.swing.GroupLayout form_anggota_baruLayout = new javax.swing.GroupLayout(form_anggota_baru);
        form_anggota_baru.setLayout(form_anggota_baruLayout);
        form_anggota_baruLayout.setHorizontalGroup(
            form_anggota_baruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(form_anggota_baruLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(label_nama_siswa_baru, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(nama_siswa_baru, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(form_anggota_baruLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(label_nis_baru, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(nis_baru, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(form_anggota_baruLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(label_tanggal_lahir_baru, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(tanggal_lahir_baru, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(form_anggota_baruLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(label_jenis_kelamin_baru, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jenis_kelamin_baru, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(form_anggota_baruLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(label_alamat_baru, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(alamat_baru, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(form_anggota_baruLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(label_kode_pos_baru, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(kode_pos_baru, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(form_anggota_baruLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(label_no_telp_baru, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(no_telp_baru, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(form_anggota_baruLayout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(preview_anggota_baru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(anggota_filechooser, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(form_anggota_baruLayout.createSequentialGroup()
                .addGap(254, 254, 254)
                .addComponent(insert_anggota_baru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(reset_baru_anggota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(form_anggota_baruLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(anggota_baru_alert_message, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        form_anggota_baruLayout.setVerticalGroup(
            form_anggota_baruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(form_anggota_baruLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(form_anggota_baruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_nama_siswa_baru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nama_siswa_baru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(form_anggota_baruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_nis_baru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nis_baru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(form_anggota_baruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_tanggal_lahir_baru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tanggal_lahir_baru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(form_anggota_baruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_jenis_kelamin_baru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jenis_kelamin_baru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(form_anggota_baruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_alamat_baru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(alamat_baru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(form_anggota_baruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_kode_pos_baru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kode_pos_baru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(form_anggota_baruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_no_telp_baru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(no_telp_baru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(form_anggota_baruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(preview_anggota_baru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(form_anggota_baruLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(anggota_filechooser, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addGroup(form_anggota_baruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(insert_anggota_baru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reset_baru_anggota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(anggota_baru_alert_message, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        tanggal_lahir_baru.setLocale(new java.util.Locale("id","ID"));

        tanggal_lahir_baru.setDateFormatString("yyyy-MM-dd");
        insert_anggota_baru.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt){
                insert_anggota_baruMousePressed(evt);
            }
        });
        reset_baru_anggota.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt){
                reset_anggota_baruMousePressed(evt);
            }
        });

        anggota_panel_container_crud.add(form_anggota_baru);

        form_edit_anggota.setBackground(new java.awt.Color(204, 204, 204));
        form_edit_anggota.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "FORM EDIT ANGGOTA", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 1, 18), new java.awt.Color(51, 51, 51))); // NOI18N
        form_edit_anggota.setMinimumSize(new java.awt.Dimension(450, 585));

        label_id_siswa_edit.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        label_id_siswa_edit.setForeground(new java.awt.Color(51, 51, 51));
        label_id_siswa_edit.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        label_id_siswa_edit.setText("ID ANGGOTA");
        label_id_siswa_edit.setMaximumSize(new java.awt.Dimension(150, 30));
        label_id_siswa_edit.setMinimumSize(new java.awt.Dimension(150, 30));
        label_id_siswa_edit.setPreferredSize(new java.awt.Dimension(150, 30));

        label_nama_siswa_edit.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        label_nama_siswa_edit.setForeground(new java.awt.Color(51, 51, 51));
        label_nama_siswa_edit.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        label_nama_siswa_edit.setText("NAMA SISWA");
        label_nama_siswa_edit.setMaximumSize(new java.awt.Dimension(150, 30));
        label_nama_siswa_edit.setMinimumSize(new java.awt.Dimension(150, 30));
        label_nama_siswa_edit.setPreferredSize(new java.awt.Dimension(150, 30));

        label_nis_edit.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        label_nis_edit.setForeground(new java.awt.Color(51, 51, 51));
        label_nis_edit.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        label_nis_edit.setText("NIS");
        label_nis_edit.setMaximumSize(new java.awt.Dimension(150, 30));
        label_nis_edit.setMinimumSize(new java.awt.Dimension(150, 30));
        label_nis_edit.setPreferredSize(new java.awt.Dimension(150, 30));

        label_tanggal_lahir_edit.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        label_tanggal_lahir_edit.setForeground(new java.awt.Color(51, 51, 51));
        label_tanggal_lahir_edit.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        label_tanggal_lahir_edit.setText("TANGGAL LAHIR");
        label_tanggal_lahir_edit.setMaximumSize(new java.awt.Dimension(150, 30));
        label_tanggal_lahir_edit.setMinimumSize(new java.awt.Dimension(150, 30));
        label_tanggal_lahir_edit.setPreferredSize(new java.awt.Dimension(150, 30));

        labe_jenis_kelaminl_edit.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        labe_jenis_kelaminl_edit.setForeground(new java.awt.Color(51, 51, 51));
        labe_jenis_kelaminl_edit.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labe_jenis_kelaminl_edit.setText("JENIS KELAMIN");
        labe_jenis_kelaminl_edit.setMaximumSize(new java.awt.Dimension(150, 30));
        labe_jenis_kelaminl_edit.setMinimumSize(new java.awt.Dimension(150, 30));
        labe_jenis_kelaminl_edit.setPreferredSize(new java.awt.Dimension(150, 30));

        label_alamat_edit.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        label_alamat_edit.setForeground(new java.awt.Color(51, 51, 51));
        label_alamat_edit.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        label_alamat_edit.setText("ALAMAT");
        label_alamat_edit.setMaximumSize(new java.awt.Dimension(150, 30));
        label_alamat_edit.setMinimumSize(new java.awt.Dimension(150, 30));
        label_alamat_edit.setPreferredSize(new java.awt.Dimension(150, 30));

        label_kode_pos_edit.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        label_kode_pos_edit.setForeground(new java.awt.Color(51, 51, 51));
        label_kode_pos_edit.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        label_kode_pos_edit.setText("KODE POS");
        label_kode_pos_edit.setMaximumSize(new java.awt.Dimension(150, 30));
        label_kode_pos_edit.setMinimumSize(new java.awt.Dimension(150, 30));
        label_kode_pos_edit.setPreferredSize(new java.awt.Dimension(150, 30));

        label_no_telp_edit.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        label_no_telp_edit.setForeground(new java.awt.Color(51, 51, 51));
        label_no_telp_edit.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        label_no_telp_edit.setText("NO TELEPON");
        label_no_telp_edit.setMaximumSize(new java.awt.Dimension(150, 30));
        label_no_telp_edit.setMinimumSize(new java.awt.Dimension(150, 30));
        label_no_telp_edit.setPreferredSize(new java.awt.Dimension(150, 30));

        id_siswa_edit.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        id_siswa_edit.setMinimumSize(new java.awt.Dimension(186, 30));
        id_siswa_edit.setPreferredSize(new java.awt.Dimension(186, 30));

        nama_siswa_edit.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        nama_siswa_edit.setMinimumSize(new java.awt.Dimension(186, 30));
        nama_siswa_edit.setPreferredSize(new java.awt.Dimension(186, 30));

        nis_edit.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        nis_edit.setMinimumSize(new java.awt.Dimension(186, 30));
        nis_edit.setPreferredSize(new java.awt.Dimension(186, 30));

        tanggal_lahir_edit.setDateFormatString("yyyy-MM-dd");
        tanggal_lahir_edit.setFont(new java.awt.Font("SansSerif", 0, 10)); // NOI18N
        tanggal_lahir_edit.setMinimumSize(new java.awt.Dimension(186, 30));
        tanggal_lahir_edit.setPreferredSize(new java.awt.Dimension(186, 30));

        jenis_kelamin_edit.setBackground(new java.awt.Color(0, 150, 62));
        jenis_kelamin_edit.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jenis_kelamin_edit.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "L (Laki-laki)", "P (Perempuan)" }));
        jenis_kelamin_edit.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jenis_kelamin_edit.setMinimumSize(new java.awt.Dimension(186, 30));
        jenis_kelamin_edit.setOpaque(false);
        jenis_kelamin_edit.setPreferredSize(new java.awt.Dimension(186, 30));
        jenis_kelamin_edit.setRequestFocusEnabled(false);
        jenis_kelamin_edit.setVerifyInputWhenFocusTarget(false);

        alamat_edit.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        alamat_edit.setMinimumSize(new java.awt.Dimension(186, 30));
        alamat_edit.setPreferredSize(new java.awt.Dimension(186, 30));

        kode_pos_edit.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        kode_pos_edit.setMinimumSize(new java.awt.Dimension(186, 30));
        kode_pos_edit.setPreferredSize(new java.awt.Dimension(186, 30));

        no_telp_edit.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        no_telp_edit.setMinimumSize(new java.awt.Dimension(186, 30));
        no_telp_edit.setPreferredSize(new java.awt.Dimension(186, 30));

        preview_anggota_edit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        preview_anggota_edit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        preview_anggota_edit.setMaximumSize(new java.awt.Dimension(100, 100));
        preview_anggota_edit.setMinimumSize(new java.awt.Dimension(100, 100));
        preview_anggota_edit.setName(""); // NOI18N
        preview_anggota_edit.setPreferredSize(new java.awt.Dimension(100, 100));

        anggota_edit_filechooser.setText("Pilih Gambar");
        anggota_edit_filechooser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                anggota_edit_filechooserMousePressed(evt);
            }
        });

        update_anggota.setBackground(new java.awt.Color(0, 0, 255));
        update_anggota.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        update_anggota.setText("SUBMIT");
        update_anggota.setBorder(null);
        update_anggota.setMaximumSize(new java.awt.Dimension(73, 30));
        update_anggota.setMinimumSize(new java.awt.Dimension(73, 30));
        update_anggota.setPreferredSize(new java.awt.Dimension(73, 30));

        reset_edit_anggota.setBackground(new java.awt.Color(255, 0, 0));
        reset_edit_anggota.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        reset_edit_anggota.setText("RESET");
        reset_edit_anggota.setBorder(null);
        reset_edit_anggota.setMaximumSize(new java.awt.Dimension(73, 30));
        reset_edit_anggota.setMinimumSize(new java.awt.Dimension(73, 30));
        reset_edit_anggota.setPreferredSize(new java.awt.Dimension(73, 30));

        anggota_edit_alert_message.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        anggota_edit_alert_message.setMaximumSize(new java.awt.Dimension(222, 30));
        anggota_edit_alert_message.setMinimumSize(new java.awt.Dimension(222, 30));
        anggota_edit_alert_message.setPreferredSize(new java.awt.Dimension(222, 30));

        javax.swing.GroupLayout form_edit_anggotaLayout = new javax.swing.GroupLayout(form_edit_anggota);
        form_edit_anggota.setLayout(form_edit_anggotaLayout);
        form_edit_anggotaLayout.setHorizontalGroup(
            form_edit_anggotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(form_edit_anggotaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(label_id_siswa_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(id_siswa_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(form_edit_anggotaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(label_nama_siswa_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(nama_siswa_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(form_edit_anggotaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(label_nis_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(nis_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(form_edit_anggotaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(label_tanggal_lahir_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(tanggal_lahir_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(form_edit_anggotaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(labe_jenis_kelaminl_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jenis_kelamin_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(form_edit_anggotaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(label_alamat_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(alamat_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(form_edit_anggotaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(label_kode_pos_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(kode_pos_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(form_edit_anggotaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(label_no_telp_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(no_telp_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(form_edit_anggotaLayout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(preview_anggota_edit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(anggota_edit_filechooser, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(form_edit_anggotaLayout.createSequentialGroup()
                .addGap(254, 254, 254)
                .addComponent(update_anggota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(reset_edit_anggota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(form_edit_anggotaLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(anggota_edit_alert_message, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        form_edit_anggotaLayout.setVerticalGroup(
            form_edit_anggotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(form_edit_anggotaLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(form_edit_anggotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_id_siswa_edit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(id_siswa_edit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(form_edit_anggotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_nama_siswa_edit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nama_siswa_edit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(form_edit_anggotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_nis_edit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nis_edit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(form_edit_anggotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_tanggal_lahir_edit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tanggal_lahir_edit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(form_edit_anggotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labe_jenis_kelaminl_edit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jenis_kelamin_edit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(form_edit_anggotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_alamat_edit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(alamat_edit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(form_edit_anggotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_kode_pos_edit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kode_pos_edit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(form_edit_anggotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_no_telp_edit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(no_telp_edit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(form_edit_anggotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(preview_anggota_edit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(form_edit_anggotaLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(anggota_edit_filechooser, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(form_edit_anggotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(update_anggota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reset_edit_anggota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(anggota_edit_alert_message, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        tanggal_lahir_edit.setLocale(new java.util.Locale("id","ID"));

        tanggal_lahir_edit.setDateFormatString("yyyy-MM-dd");
        update_anggota.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt){
                update_anggotaMousePressed(evt);
            }
        });
        reset_edit_anggota.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt){
                reset_anggota_editMousePressed(evt);
            }
        });

        anggota_panel_container_crud.add(form_edit_anggota);
        form_edit_anggota.setVisible(false);

        anggota_panel_left.add(anggota_panel_container_crud, java.awt.BorderLayout.SOUTH);

        anggota_panel.add(anggota_panel_left, java.awt.BorderLayout.LINE_START);

        anggota_panel_right.setLayout(new java.awt.BorderLayout());

        anggota_tabel_panel.setMinimumSize(new java.awt.Dimension(585, 600));

        anggota_tabel.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        anggota_tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NAMA", "NIS", "TANGGAL LAHIR", "JENIS KELAMIN", "ALAMAT", "KODE POS", "NO TELP", "GAMBAR"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        anggota_tabel.setGridColor(new java.awt.Color(255, 255, 255));
        anggota_tabel.setRowHeight(100);
        anggota_tabel.setRowMargin(3);
        anggota_tabel.setSelectionBackground(new java.awt.Color(0, 0, 0));
        anggota_tabel.getTableHeader().setReorderingAllowed(false);
        anggota_tabel_panel.setViewportView(anggota_tabel);
        anggota_tabel.getTableHeader().setFont(new java.awt.Font("SansSerif", 1, 14));

        ((javax.swing.table.DefaultTableCellRenderer)anggota_tabel.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(javax.swing.JLabel.CENTER);

        ((javax.swing.table.DefaultTableCellRenderer)anggota_tabel.getTableHeader().getDefaultRenderer()).setVerticalAlignment(javax.swing.JLabel.CENTER);

        javax.swing.table.TableRowSorter tabelAnggotaSorter = new javax.swing.table.TableRowSorter<>((javax.swing.table.DefaultTableModel)anggota_tabel.getModel());

        anggota_tabel.setRowSorter(tabelAnggotaSorter);

        anggota_panel_right.add(anggota_tabel_panel, java.awt.BorderLayout.CENTER);

        anggota_tabel_action_panel.setBackground(new java.awt.Color(1, 198, 83));
        anggota_tabel_action_panel.setMinimumSize(new java.awt.Dimension(585, 75));
        anggota_tabel_action_panel.setPreferredSize(new java.awt.Dimension(585, 75));
        anggota_tabel_action_panel.setLayout(new java.awt.GridBagLayout());

        hapus_anggota_btn.setBackground(new java.awt.Color(255, 0, 0));
        hapus_anggota_btn.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        hapus_anggota_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_trash_16.png"))); // NOI18N
        hapus_anggota_btn.setText("HAPUS");
        hapus_anggota_btn.setBorder(null);
        hapus_anggota_btn.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        hapus_anggota_btn.setMargin(new java.awt.Insets(2, 4, 2, 4));
        hapus_anggota_btn.setMaximumSize(new java.awt.Dimension(30, 30));
        hapus_anggota_btn.setMinimumSize(new java.awt.Dimension(30, 30));
        hapus_anggota_btn.setPreferredSize(new java.awt.Dimension(30, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 70;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(30, 0, 0, 125);
        anggota_tabel_action_panel.add(hapus_anggota_btn, gridBagConstraints);
        hapus_anggota_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt){
                hapus_anggotaMousePressed(evt);
            }
        });

        edit_anggota_btn.setBackground(new java.awt.Color(0, 0, 0));
        edit_anggota_btn.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        edit_anggota_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_edit_16.png"))); // NOI18N
        edit_anggota_btn.setText("EDIT");
        edit_anggota_btn.setBorder(null);
        edit_anggota_btn.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        edit_anggota_btn.setMargin(new java.awt.Insets(2, 4, 2, 4));
        edit_anggota_btn.setMaximumSize(new java.awt.Dimension(30, 30));
        edit_anggota_btn.setMinimumSize(new java.awt.Dimension(30, 30));
        edit_anggota_btn.setPreferredSize(new java.awt.Dimension(30, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 70;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(30, 0, 0, 0);
        anggota_tabel_action_panel.add(edit_anggota_btn, gridBagConstraints);
        edit_anggota_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt){
                anggota_baru.setBackground(new java.awt.Color(1,198,83));
                edit_anggota.setBackground(new java.awt.Color(0,150,62));

                anggota_baru.setForeground(new java.awt.Color(204,204,204));
                edit_anggota.setForeground(new java.awt.Color(255,255,255));

                anggota_baru.setFont(new java.awt.Font("SansSerif", 0, 14));
                edit_anggota.setFont(new java.awt.Font("SansSerif", 1, 14));

                form_anggota_baru.setVisible(false);
                form_edit_anggota.setVisible(true);

                edit_anggotaMousePressed(evt);
            }

        });

        cetak_laporan_anggota_btn.setBackground(new java.awt.Color(0, 0, 0));
        cetak_laporan_anggota_btn.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        cetak_laporan_anggota_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_print_16.png"))); // NOI18N
        cetak_laporan_anggota_btn.setText("CETAK");
        cetak_laporan_anggota_btn.setBorder(null);
        cetak_laporan_anggota_btn.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        cetak_laporan_anggota_btn.setMargin(new java.awt.Insets(2, 4, 2, 4));
        cetak_laporan_anggota_btn.setMaximumSize(new java.awt.Dimension(30, 30));
        cetak_laporan_anggota_btn.setMinimumSize(new java.awt.Dimension(30, 30));
        cetak_laporan_anggota_btn.setPreferredSize(new java.awt.Dimension(30, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 70;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(30, 2, 0, 0);
        anggota_tabel_action_panel.add(cetak_laporan_anggota_btn, gridBagConstraints);
        cetak_laporan_anggota_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt){
                cetak_laporan_anggotaMousePressed(evt);
            }
        });

        show_kartu_anggota.setBackground(new java.awt.Color(1, 198, 83));
        show_kartu_anggota.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        show_kartu_anggota.setForeground(new java.awt.Color(32, 138, 32));
        show_kartu_anggota.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        show_kartu_anggota.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_postcard_with_barcode_dark_32.png"))); // NOI18N
        show_kartu_anggota.setText("KARTU");
        show_kartu_anggota.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        show_kartu_anggota.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        show_kartu_anggota.setOpaque(true);
        show_kartu_anggota.setPreferredSize(new java.awt.Dimension(75, 75));
        show_kartu_anggota.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 35;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 2, 0, 0);
        anggota_tabel_action_panel.add(show_kartu_anggota, gridBagConstraints);
        show_kartu_anggota.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt){
                show_kartu_anggota.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_postcard_with_barcode_light_32.png")));
                show_kartu_anggota.setBackground(new java.awt.Color(0, 150, 62));
                show_kartu_anggota.setForeground(new java.awt.Color(255, 255, 255));
            }
            public void mouseExited(java.awt.event.MouseEvent evt){
                show_kartu_anggota.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_postcard_with_barcode_dark_32.png")));
                show_kartu_anggota.setBackground(new java.awt.Color(1,198,83));
                show_kartu_anggota.setForeground(new java.awt.Color(32, 138, 32));
            }
            public void mousePressed(java.awt.event.MouseEvent evt){
                show_kartu_anggotaMousePressed(evt);
            }
        });

        show_formulir_pendaftaran.setBackground(new java.awt.Color(1, 198, 83));
        show_formulir_pendaftaran.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        show_formulir_pendaftaran.setForeground(new java.awt.Color(32, 138, 32));
        show_formulir_pendaftaran.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        show_formulir_pendaftaran.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_form_dark_32.png"))); // NOI18N
        show_formulir_pendaftaran.setText("FORMULIR");
        show_formulir_pendaftaran.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        show_formulir_pendaftaran.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        show_formulir_pendaftaran.setOpaque(true);
        show_formulir_pendaftaran.setPreferredSize(new java.awt.Dimension(75, 75));
        show_formulir_pendaftaran.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 15;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        anggota_tabel_action_panel.add(show_formulir_pendaftaran, gridBagConstraints);
        show_formulir_pendaftaran.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt){
                show_formulir_pendaftaran.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_form_light_32.png")));
                show_formulir_pendaftaran.setBackground(new java.awt.Color(0, 150, 62));
                show_formulir_pendaftaran.setForeground(new java.awt.Color(255, 255, 255));
            }
            public void mouseExited(java.awt.event.MouseEvent evt){
                show_formulir_pendaftaran.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_form_dark_32.png")));
                show_formulir_pendaftaran.setBackground(new java.awt.Color(1,198,83));
                show_formulir_pendaftaran.setForeground(new java.awt.Color(32, 138, 32));
            }
            public void mousePressed(java.awt.event.MouseEvent evt){
                show_formulir_pendaftaranMousePressed(evt);
            }
        });

        anggota_panel_right.add(anggota_tabel_action_panel, java.awt.BorderLayout.PAGE_START);

        search_anggota_panel.setBackground(new java.awt.Color(204, 204, 204));
        search_anggota_panel.setMinimumSize(new java.awt.Dimension(585, 165));
        search_anggota_panel.setPreferredSize(new java.awt.Dimension(585, 165));
        search_anggota_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        filter_anggota_title.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        filter_anggota_title.setText("FILTER PENCARIAN ANGGOTA PERPUSTAKAAN");
        filter_anggota_title.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        filter_anggota_title.setMaximumSize(new java.awt.Dimension(50, 30));
        filter_anggota_title.setMinimumSize(new java.awt.Dimension(50, 30));
        filter_anggota_title.setPreferredSize(new java.awt.Dimension(50, 30));
        search_anggota_panel.add(filter_anggota_title, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, -1));

        petunjuk_filter_anggota.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        petunjuk_filter_anggota.setText("Catatan : Untuk menggunakan filter pencarian data anggota, ketikkan kata kunci dibawah.");
        search_anggota_panel.add(petunjuk_filter_anggota, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 800, 30));

        id_anggota_filter_label.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        id_anggota_filter_label.setText("ID");
        search_anggota_panel.add(id_anggota_filter_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 130, -1));

        nama_anggota_label.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        nama_anggota_label.setText("NAMA");
        search_anggota_panel.add(nama_anggota_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 130, -1));

        nis_anggota_label.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        nis_anggota_label.setText("NIS");
        search_anggota_panel.add(nis_anggota_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 130, -1));

        tl_anggota_label.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        tl_anggota_label.setText("TANGGAL LAHIR");
        search_anggota_panel.add(tl_anggota_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 70, 130, -1));

        jk_anggota_label.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jk_anggota_label.setText("JENIS KELAMIN");
        search_anggota_panel.add(jk_anggota_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 70, 130, -1));

        alamat_anggota_label.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        alamat_anggota_label.setText("ALAMAT");
        search_anggota_panel.add(alamat_anggota_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 70, 130, -1));

        id_anggota_filter.setBackground(new java.awt.Color(240, 240, 240));
        id_anggota_filter.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        id_anggota_filter.setForeground(new java.awt.Color(102, 102, 102));
        id_anggota_filter.setText("Semua");
        id_anggota_filter.setBorder(null);
        id_anggota_filter.setMinimumSize(new java.awt.Dimension(50, 20));
        id_anggota_filter.setPreferredSize(new java.awt.Dimension(50, 20));
        search_anggota_panel.add(id_anggota_filter, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 130, 30));
        id_anggota_filter.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt){
                if(id_anggota_filter.getText().trim().equals("Semua")){
                    id_anggota_filter.setText(null);
                }
                id_anggota_filter.setForeground(new java.awt.Color(0,0,0));
            }
            public void focusLost(java.awt.event.FocusEvent evt){
                id_anggota_filter.setForeground(new java.awt.Color(102,102,102));
                if(id_anggota_filter.getText().trim().equals("")){
                    id_anggota_filter.setText("Semua");
                }
            }
        });

        id_anggota_filter.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
            @Override public void insertUpdate(javax.swing.event.DocumentEvent e) {
                String[] keywords = new String[] {
                    id_anggota_filter.getText().trim().equals("Semua")?"":id_anggota_filter.getText(),
                    nama_anggota_filter.getText().trim().equals("Semua")?"":nama_anggota_filter.getText(),
                    nis_anggota_filter.getText().trim().equals("Semua")?"":nis_anggota_filter.getText(),
                    tl_anggota_filter.getText().trim().equals("Semua")?"":tl_anggota_filter.getText(),
                    jk_anggota_filter.getText().trim().equals("Semua")?"":jk_anggota_filter.getText(),
                    alamat_anggota_filter.getText().trim().equals("Semua")?"":alamat_anggota_filter.getText()
                };
                java.util.List<javax.swing.RowFilter<Object, Object>> filters = new java.util.ArrayList<>();
                filters.add(javax.swing.RowFilter.regexFilter("^(?i)" + keywords[0], 0));
                filters.add(javax.swing.RowFilter.regexFilter("(?i)" + keywords[1], 1));
                filters.add(javax.swing.RowFilter.regexFilter("^(?i)" + keywords[2], 2));
                filters.add(javax.swing.RowFilter.regexFilter("^(?i)" + keywords[3], 3));
                filters.add(javax.swing.RowFilter.regexFilter("(?i)" + keywords[4], 4));
                filters.add(javax.swing.RowFilter.regexFilter("(?i)" + keywords[5], 5));
                tabelAnggotaSorter.setRowFilter(javax.swing.RowFilter.andFilter(filters));
            }
            @Override public void removeUpdate(javax.swing.event.DocumentEvent e) {
                String[] keywords = new String[] {
                    id_anggota_filter.getText().trim().equals("Semua")?"":id_anggota_filter.getText(),
                    nama_anggota_filter.getText().trim().equals("Semua")?"":nama_anggota_filter.getText(),
                    nis_anggota_filter.getText().trim().equals("Semua")?"":nis_anggota_filter.getText(),
                    tl_anggota_filter.getText().trim().equals("Semua")?"":tl_anggota_filter.getText(),
                    jk_anggota_filter.getText().trim().equals("Semua")?"":jk_anggota_filter.getText(),
                    alamat_anggota_filter.getText().trim().equals("Semua")?"":alamat_anggota_filter.getText()
                };
                java.util.List<javax.swing.RowFilter<Object, Object>> filters = new java.util.ArrayList<>();
                filters.add(javax.swing.RowFilter.regexFilter("^(?i)" + keywords[0], 0));
                filters.add(javax.swing.RowFilter.regexFilter("(?i)" + keywords[1], 1));
                filters.add(javax.swing.RowFilter.regexFilter("^(?i)" + keywords[2], 2));
                filters.add(javax.swing.RowFilter.regexFilter("^(?i)" + keywords[3], 3));
                filters.add(javax.swing.RowFilter.regexFilter("(?i)" + keywords[4], 4));
                filters.add(javax.swing.RowFilter.regexFilter("(?i)" + keywords[5], 5));
                tabelAnggotaSorter.setRowFilter(javax.swing.RowFilter.andFilter(filters));
            }
            @Override public void changedUpdate(javax.swing.event.DocumentEvent e) {
            }
        });

        nama_anggota_filter.setBackground(new java.awt.Color(240, 240, 240));
        nama_anggota_filter.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        nama_anggota_filter.setForeground(new java.awt.Color(102, 102, 102));
        nama_anggota_filter.setText("Semua");
        nama_anggota_filter.setBorder(null);
        nama_anggota_filter.setMinimumSize(new java.awt.Dimension(110, 20));
        nama_anggota_filter.setPreferredSize(new java.awt.Dimension(110, 20));
        search_anggota_panel.add(nama_anggota_filter, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 130, 30));
        nama_anggota_filter.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt){
                if(nama_anggota_filter.getText().trim().equals("Semua")){
                    nama_anggota_filter.setText(null);
                }
                nama_anggota_filter.setForeground(new java.awt.Color(0,0,0));
            }
            public void focusLost(java.awt.event.FocusEvent evt){
                nama_anggota_filter.setForeground(new java.awt.Color(102,102,102));
                if(nama_anggota_filter.getText().trim().equals("")){
                    nama_anggota_filter.setText("Semua");
                }
            }
        });
        nama_anggota_filter.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
            @Override public void insertUpdate(javax.swing.event.DocumentEvent e) {
                String[] keywords = new String[] {
                    id_anggota_filter.getText().trim().equals("Semua")?"":id_anggota_filter.getText(),
                    nama_anggota_filter.getText().trim().equals("Semua")?"":nama_anggota_filter.getText(),
                    nis_anggota_filter.getText().trim().equals("Semua")?"":nis_anggota_filter.getText(),
                    tl_anggota_filter.getText().trim().equals("Semua")?"":tl_anggota_filter.getText(),
                    jk_anggota_filter.getText().trim().equals("Semua")?"":jk_anggota_filter.getText(),
                    alamat_anggota_filter.getText().trim().equals("Semua")?"":alamat_anggota_filter.getText()
                };
                java.util.List<javax.swing.RowFilter<Object, Object>> filters = new java.util.ArrayList<>();
                filters.add(javax.swing.RowFilter.regexFilter("^(?i)" + keywords[0], 0));
                filters.add(javax.swing.RowFilter.regexFilter("(?i)" + keywords[1], 1));
                filters.add(javax.swing.RowFilter.regexFilter("^(?i)" + keywords[2], 2));
                filters.add(javax.swing.RowFilter.regexFilter("^(?i)" + keywords[3], 3));
                filters.add(javax.swing.RowFilter.regexFilter("(?i)" + keywords[4], 4));
                filters.add(javax.swing.RowFilter.regexFilter("(?i)" + keywords[5], 5));
                tabelAnggotaSorter.setRowFilter(javax.swing.RowFilter.andFilter(filters));
            }
            @Override public void removeUpdate(javax.swing.event.DocumentEvent e) {
                String[] keywords = new String[] {
                    id_anggota_filter.getText().trim().equals("Semua")?"":id_anggota_filter.getText(),
                    nama_anggota_filter.getText().trim().equals("Semua")?"":nama_anggota_filter.getText(),
                    nis_anggota_filter.getText().trim().equals("Semua")?"":nis_anggota_filter.getText(),
                    tl_anggota_filter.getText().trim().equals("Semua")?"":tl_anggota_filter.getText(),
                    jk_anggota_filter.getText().trim().equals("Semua")?"":jk_anggota_filter.getText(),
                    alamat_anggota_filter.getText().trim().equals("Semua")?"":alamat_anggota_filter.getText()
                };
                java.util.List<javax.swing.RowFilter<Object, Object>> filters = new java.util.ArrayList<>();
                filters.add(javax.swing.RowFilter.regexFilter("^(?i)" + keywords[0], 0));
                filters.add(javax.swing.RowFilter.regexFilter("(?i)" + keywords[1], 1));
                filters.add(javax.swing.RowFilter.regexFilter("^(?i)" + keywords[2], 2));
                filters.add(javax.swing.RowFilter.regexFilter("^(?i)" + keywords[3], 3));
                filters.add(javax.swing.RowFilter.regexFilter("(?i)" + keywords[4], 4));
                filters.add(javax.swing.RowFilter.regexFilter("(?i)" + keywords[5], 5));
                tabelAnggotaSorter.setRowFilter(javax.swing.RowFilter.andFilter(filters));
            }
            @Override public void changedUpdate(javax.swing.event.DocumentEvent e) {
            }
        });

        nis_anggota_filter.setBackground(new java.awt.Color(240, 240, 240));
        nis_anggota_filter.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        nis_anggota_filter.setForeground(new java.awt.Color(102, 102, 102));
        nis_anggota_filter.setText("Semua");
        nis_anggota_filter.setBorder(null);
        nis_anggota_filter.setMinimumSize(new java.awt.Dimension(110, 20));
        nis_anggota_filter.setPreferredSize(new java.awt.Dimension(110, 20));
        search_anggota_panel.add(nis_anggota_filter, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 130, 30));
        nis_anggota_filter.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt){
                if(nis_anggota_filter.getText().trim().equals("Semua")){
                    nis_anggota_filter.setText(null);
                }
                nis_anggota_filter.setForeground(new java.awt.Color(0,0,0));
            }
            public void focusLost(java.awt.event.FocusEvent evt){
                nis_anggota_filter.setForeground(new java.awt.Color(102,102,102));
                if(nis_anggota_filter.getText().trim().equals("")){
                    nis_anggota_filter.setText("Semua");
                }
            }
        });
        nis_anggota_filter.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
            @Override public void insertUpdate(javax.swing.event.DocumentEvent e) {
                String[] keywords = new String[] {
                    id_anggota_filter.getText().trim().equals("Semua")?"":id_anggota_filter.getText(),
                    nama_anggota_filter.getText().trim().equals("Semua")?"":nama_anggota_filter.getText(),
                    nis_anggota_filter.getText().trim().equals("Semua")?"":nis_anggota_filter.getText(),
                    tl_anggota_filter.getText().trim().equals("Semua")?"":tl_anggota_filter.getText(),
                    jk_anggota_filter.getText().trim().equals("Semua")?"":jk_anggota_filter.getText(),
                    alamat_anggota_filter.getText().trim().equals("Semua")?"":alamat_anggota_filter.getText()
                };
                java.util.List<javax.swing.RowFilter<Object, Object>> filters = new java.util.ArrayList<>();
                filters.add(javax.swing.RowFilter.regexFilter("^(?i)" + keywords[0], 0));
                filters.add(javax.swing.RowFilter.regexFilter("(?i)" + keywords[1], 1));
                filters.add(javax.swing.RowFilter.regexFilter("^(?i)" + keywords[2], 2));
                filters.add(javax.swing.RowFilter.regexFilter("^(?i)" + keywords[3], 3));
                filters.add(javax.swing.RowFilter.regexFilter("(?i)" + keywords[4], 4));
                filters.add(javax.swing.RowFilter.regexFilter("(?i)" + keywords[5], 5));
                tabelAnggotaSorter.setRowFilter(javax.swing.RowFilter.andFilter(filters));
            }
            @Override public void removeUpdate(javax.swing.event.DocumentEvent e) {
                String[] keywords = new String[] {
                    id_anggota_filter.getText().trim().equals("Semua")?"":id_anggota_filter.getText(),
                    nama_anggota_filter.getText().trim().equals("Semua")?"":nama_anggota_filter.getText(),
                    nis_anggota_filter.getText().trim().equals("Semua")?"":nis_anggota_filter.getText(),
                    tl_anggota_filter.getText().trim().equals("Semua")?"":tl_anggota_filter.getText(),
                    jk_anggota_filter.getText().trim().equals("Semua")?"":jk_anggota_filter.getText(),
                    alamat_anggota_filter.getText().trim().equals("Semua")?"":alamat_anggota_filter.getText()
                };
                java.util.List<javax.swing.RowFilter<Object, Object>> filters = new java.util.ArrayList<>();
                filters.add(javax.swing.RowFilter.regexFilter("^(?i)" + keywords[0], 0));
                filters.add(javax.swing.RowFilter.regexFilter("(?i)" + keywords[1], 1));
                filters.add(javax.swing.RowFilter.regexFilter("^(?i)" + keywords[2], 2));
                filters.add(javax.swing.RowFilter.regexFilter("^(?i)" + keywords[3], 3));
                filters.add(javax.swing.RowFilter.regexFilter("(?i)" + keywords[4], 4));
                filters.add(javax.swing.RowFilter.regexFilter("(?i)" + keywords[5], 5));
                tabelAnggotaSorter.setRowFilter(javax.swing.RowFilter.andFilter(filters));
            }
            @Override public void changedUpdate(javax.swing.event.DocumentEvent e) {
            }
        });

        tl_anggota_filter.setBackground(new java.awt.Color(240, 240, 240));
        tl_anggota_filter.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        tl_anggota_filter.setForeground(new java.awt.Color(102, 102, 102));
        tl_anggota_filter.setText("Semua");
        tl_anggota_filter.setBorder(null);
        tl_anggota_filter.setMinimumSize(new java.awt.Dimension(110, 20));
        tl_anggota_filter.setPreferredSize(new java.awt.Dimension(110, 20));
        search_anggota_panel.add(tl_anggota_filter, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 90, 130, 30));
        tl_anggota_filter.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt){
                if(tl_anggota_filter.getText().trim().equals("Semua")){
                    tl_anggota_filter.setText(null);
                }
                tl_anggota_filter.setForeground(new java.awt.Color(0,0,0));
            }
            public void focusLost(java.awt.event.FocusEvent evt){
                tl_anggota_filter.setForeground(new java.awt.Color(102,102,102));
                if(tl_anggota_filter.getText().trim().equals("")){
                    tl_anggota_filter.setText("Semua");
                }
            }
        });
        tl_anggota_filter.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
            @Override public void insertUpdate(javax.swing.event.DocumentEvent e) {
                String[] keywords = new String[] {
                    id_anggota_filter.getText().trim().equals("Semua")?"":id_anggota_filter.getText(),
                    nama_anggota_filter.getText().trim().equals("Semua")?"":nama_anggota_filter.getText(),
                    nis_anggota_filter.getText().trim().equals("Semua")?"":nis_anggota_filter.getText(),
                    tl_anggota_filter.getText().trim().equals("Semua")?"":tl_anggota_filter.getText(),
                    jk_anggota_filter.getText().trim().equals("Semua")?"":jk_anggota_filter.getText(),
                    alamat_anggota_filter.getText().trim().equals("Semua")?"":alamat_anggota_filter.getText()
                };
                java.util.List<javax.swing.RowFilter<Object, Object>> filters = new java.util.ArrayList<>();
                filters.add(javax.swing.RowFilter.regexFilter("^(?i)" + keywords[0], 0));
                filters.add(javax.swing.RowFilter.regexFilter("(?i)" + keywords[1], 1));
                filters.add(javax.swing.RowFilter.regexFilter("^(?i)" + keywords[2], 2));
                filters.add(javax.swing.RowFilter.regexFilter("^(?i)" + keywords[3], 3));
                filters.add(javax.swing.RowFilter.regexFilter("(?i)" + keywords[4], 4));
                filters.add(javax.swing.RowFilter.regexFilter("(?i)" + keywords[5], 5));
                tabelAnggotaSorter.setRowFilter(javax.swing.RowFilter.andFilter(filters));
            }
            @Override public void removeUpdate(javax.swing.event.DocumentEvent e) {
                String[] keywords = new String[] {
                    id_anggota_filter.getText().trim().equals("Semua")?"":id_anggota_filter.getText(),
                    nama_anggota_filter.getText().trim().equals("Semua")?"":nama_anggota_filter.getText(),
                    nis_anggota_filter.getText().trim().equals("Semua")?"":nis_anggota_filter.getText(),
                    tl_anggota_filter.getText().trim().equals("Semua")?"":tl_anggota_filter.getText(),
                    jk_anggota_filter.getText().trim().equals("Semua")?"":jk_anggota_filter.getText(),
                    alamat_anggota_filter.getText().trim().equals("Semua")?"":alamat_anggota_filter.getText()
                };
                java.util.List<javax.swing.RowFilter<Object, Object>> filters = new java.util.ArrayList<>();
                filters.add(javax.swing.RowFilter.regexFilter("^(?i)" + keywords[0], 0));
                filters.add(javax.swing.RowFilter.regexFilter("(?i)" + keywords[1], 1));
                filters.add(javax.swing.RowFilter.regexFilter("^(?i)" + keywords[2], 2));
                filters.add(javax.swing.RowFilter.regexFilter("^(?i)" + keywords[3], 3));
                filters.add(javax.swing.RowFilter.regexFilter("(?i)" + keywords[4], 4));
                filters.add(javax.swing.RowFilter.regexFilter("(?i)" + keywords[5], 5));
                tabelAnggotaSorter.setRowFilter(javax.swing.RowFilter.andFilter(filters));
            }
            @Override public void changedUpdate(javax.swing.event.DocumentEvent e) {
            }
        });

        jk_anggota_filter.setBackground(new java.awt.Color(240, 240, 240));
        jk_anggota_filter.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jk_anggota_filter.setForeground(new java.awt.Color(102, 102, 102));
        jk_anggota_filter.setText("Semua");
        jk_anggota_filter.setBorder(null);
        jk_anggota_filter.setMinimumSize(new java.awt.Dimension(110, 20));
        jk_anggota_filter.setPreferredSize(new java.awt.Dimension(110, 20));
        search_anggota_panel.add(jk_anggota_filter, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 90, 130, 30));
        jk_anggota_filter.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt){
                if(jk_anggota_filter.getText().trim().equals("Semua")){
                    jk_anggota_filter.setText(null);
                }
                jk_anggota_filter.setForeground(new java.awt.Color(0,0,0));
            }
            public void focusLost(java.awt.event.FocusEvent evt){
                jk_anggota_filter.setForeground(new java.awt.Color(102,102,102));
                if(jk_anggota_filter.getText().trim().equals("")){
                    jk_anggota_filter.setText("Semua");
                }
            }
        });
        jk_anggota_filter.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
            @Override public void insertUpdate(javax.swing.event.DocumentEvent e) {
                String[] keywords = new String[] {
                    id_anggota_filter.getText().trim().equals("Semua")?"":id_anggota_filter.getText(),
                    nama_anggota_filter.getText().trim().equals("Semua")?"":nama_anggota_filter.getText(),
                    nis_anggota_filter.getText().trim().equals("Semua")?"":nis_anggota_filter.getText(),
                    tl_anggota_filter.getText().trim().equals("Semua")?"":tl_anggota_filter.getText(),
                    jk_anggota_filter.getText().trim().equals("Semua")?"":jk_anggota_filter.getText(),
                    alamat_anggota_filter.getText().trim().equals("Semua")?"":alamat_anggota_filter.getText()
                };
                java.util.List<javax.swing.RowFilter<Object, Object>> filters = new java.util.ArrayList<>();
                filters.add(javax.swing.RowFilter.regexFilter("^(?i)" + keywords[0], 0));
                filters.add(javax.swing.RowFilter.regexFilter("(?i)" + keywords[1], 1));
                filters.add(javax.swing.RowFilter.regexFilter("^(?i)" + keywords[2], 2));
                filters.add(javax.swing.RowFilter.regexFilter("^(?i)" + keywords[3], 3));
                filters.add(javax.swing.RowFilter.regexFilter("(?i)" + keywords[4], 4));
                filters.add(javax.swing.RowFilter.regexFilter("(?i)" + keywords[5], 5));
                tabelAnggotaSorter.setRowFilter(javax.swing.RowFilter.andFilter(filters));
            }
            @Override public void removeUpdate(javax.swing.event.DocumentEvent e) {
                String[] keywords = new String[] {
                    id_anggota_filter.getText().trim().equals("Semua")?"":id_anggota_filter.getText(),
                    nama_anggota_filter.getText().trim().equals("Semua")?"":nama_anggota_filter.getText(),
                    nis_anggota_filter.getText().trim().equals("Semua")?"":nis_anggota_filter.getText(),
                    tl_anggota_filter.getText().trim().equals("Semua")?"":tl_anggota_filter.getText(),
                    jk_anggota_filter.getText().trim().equals("Semua")?"":jk_anggota_filter.getText(),
                    alamat_anggota_filter.getText().trim().equals("Semua")?"":alamat_anggota_filter.getText()
                };
                java.util.List<javax.swing.RowFilter<Object, Object>> filters = new java.util.ArrayList<>();
                filters.add(javax.swing.RowFilter.regexFilter("^(?i)" + keywords[0], 0));
                filters.add(javax.swing.RowFilter.regexFilter("(?i)" + keywords[1], 1));
                filters.add(javax.swing.RowFilter.regexFilter("^(?i)" + keywords[2], 2));
                filters.add(javax.swing.RowFilter.regexFilter("^(?i)" + keywords[3], 3));
                filters.add(javax.swing.RowFilter.regexFilter("(?i)" + keywords[4], 4));
                filters.add(javax.swing.RowFilter.regexFilter("(?i)" + keywords[5], 5));
                tabelAnggotaSorter.setRowFilter(javax.swing.RowFilter.andFilter(filters));
            }
            @Override public void changedUpdate(javax.swing.event.DocumentEvent e) {
            }
        });

        alamat_anggota_filter.setBackground(new java.awt.Color(240, 240, 240));
        alamat_anggota_filter.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        alamat_anggota_filter.setForeground(new java.awt.Color(102, 102, 102));
        alamat_anggota_filter.setText("Semua");
        alamat_anggota_filter.setBorder(null);
        alamat_anggota_filter.setMinimumSize(new java.awt.Dimension(110, 20));
        alamat_anggota_filter.setPreferredSize(new java.awt.Dimension(110, 20));
        search_anggota_panel.add(alamat_anggota_filter, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 90, 130, 30));
        alamat_anggota_filter.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt){
                if(alamat_anggota_filter.getText().trim().equals("Semua")){
                    alamat_anggota_filter.setText(null);
                }
                alamat_anggota_filter.setForeground(new java.awt.Color(0,0,0));
            }
            public void focusLost(java.awt.event.FocusEvent evt){
                alamat_anggota_filter.setForeground(new java.awt.Color(102,102,102));
                if(alamat_anggota_filter.getText().trim().equals("")){
                    alamat_anggota_filter.setText("Semua");
                }
            }
        });
        alamat_anggota_filter.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
            @Override public void insertUpdate(javax.swing.event.DocumentEvent e) {
                String[] keywords = new String[] {
                    id_anggota_filter.getText().trim().equals("Semua")?"":id_anggota_filter.getText(),
                    nama_anggota_filter.getText().trim().equals("Semua")?"":nama_anggota_filter.getText(),
                    nis_anggota_filter.getText().trim().equals("Semua")?"":nis_anggota_filter.getText(),
                    tl_anggota_filter.getText().trim().equals("Semua")?"":tl_anggota_filter.getText(),
                    jk_anggota_filter.getText().trim().equals("Semua")?"":jk_anggota_filter.getText(),
                    alamat_anggota_filter.getText().trim().equals("Semua")?"":alamat_anggota_filter.getText()
                };
                java.util.List<javax.swing.RowFilter<Object, Object>> filters = new java.util.ArrayList<>();
                filters.add(javax.swing.RowFilter.regexFilter("^(?i)" + keywords[0], 0));
                filters.add(javax.swing.RowFilter.regexFilter("(?i)" + keywords[1], 1));
                filters.add(javax.swing.RowFilter.regexFilter("^(?i)" + keywords[2], 2));
                filters.add(javax.swing.RowFilter.regexFilter("^(?i)" + keywords[3], 3));
                filters.add(javax.swing.RowFilter.regexFilter("(?i)" + keywords[4], 4));
                filters.add(javax.swing.RowFilter.regexFilter("(?i)" + keywords[5], 5));
                tabelAnggotaSorter.setRowFilter(javax.swing.RowFilter.andFilter(filters));
            }
            @Override public void removeUpdate(javax.swing.event.DocumentEvent e) {
                String[] keywords = new String[] {
                    id_anggota_filter.getText().trim().equals("Semua")?"":id_anggota_filter.getText(),
                    nama_anggota_filter.getText().trim().equals("Semua")?"":nama_anggota_filter.getText(),
                    nis_anggota_filter.getText().trim().equals("Semua")?"":nis_anggota_filter.getText(),
                    tl_anggota_filter.getText().trim().equals("Semua")?"":tl_anggota_filter.getText(),
                    jk_anggota_filter.getText().trim().equals("Semua")?"":jk_anggota_filter.getText(),
                    alamat_anggota_filter.getText().trim().equals("Semua")?"":alamat_anggota_filter.getText()
                };
                java.util.List<javax.swing.RowFilter<Object, Object>> filters = new java.util.ArrayList<>();
                filters.add(javax.swing.RowFilter.regexFilter("^(?i)" + keywords[0], 0));
                filters.add(javax.swing.RowFilter.regexFilter("(?i)" + keywords[1], 1));
                filters.add(javax.swing.RowFilter.regexFilter("^(?i)" + keywords[2], 2));
                filters.add(javax.swing.RowFilter.regexFilter("^(?i)" + keywords[3], 3));
                filters.add(javax.swing.RowFilter.regexFilter("(?i)" + keywords[4], 4));
                filters.add(javax.swing.RowFilter.regexFilter("(?i)" + keywords[5], 5));
                tabelAnggotaSorter.setRowFilter(javax.swing.RowFilter.andFilter(filters));
            }
            @Override public void changedUpdate(javax.swing.event.DocumentEvent e) {
            }
        });

        anggota_panel_right.add(search_anggota_panel, java.awt.BorderLayout.PAGE_END);

        anggota_panel.add(anggota_panel_right, java.awt.BorderLayout.CENTER);

        panels.add(anggota_panel);
        anggota_panel.setVisible(false);

        peminjaman_panel.setMinimumSize(new java.awt.Dimension(1035, 675));
        peminjaman_panel.setPreferredSize(new java.awt.Dimension(1035, 675));
        peminjaman_panel.setRequestFocusEnabled(false);
        peminjaman_panel.setLayout(new java.awt.BorderLayout());

        peminjaman_panel_left.setMaximumSize(new java.awt.Dimension(450, 675));
        peminjaman_panel_left.setMinimumSize(new java.awt.Dimension(450, 675));
        peminjaman_panel_left.setPreferredSize(new java.awt.Dimension(450, 675));
        peminjaman_panel_left.setLayout(new java.awt.BorderLayout());

        peminjaman_panel_title.setBackground(new java.awt.Color(1, 198, 83));
        peminjaman_panel_title.setMaximumSize(new java.awt.Dimension(450, 45));
        peminjaman_panel_title.setMinimumSize(new java.awt.Dimension(450, 45));
        peminjaman_panel_title.setPreferredSize(new java.awt.Dimension(450, 45));

        peminjaman_panel_titile_label.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        peminjaman_panel_titile_label.setForeground(new java.awt.Color(255, 255, 255));
        peminjaman_panel_titile_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        peminjaman_panel_titile_label.setText("PEMINJAMAN & PENGEMBALIAN BUKU");
        peminjaman_panel_titile_label.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        peminjaman_panel_titile_label.setMaximumSize(new java.awt.Dimension(450, 45));
        peminjaman_panel_titile_label.setMinimumSize(new java.awt.Dimension(450, 45));
        peminjaman_panel_titile_label.setPreferredSize(new java.awt.Dimension(450, 45));

        javax.swing.GroupLayout peminjaman_panel_titleLayout = new javax.swing.GroupLayout(peminjaman_panel_title);
        peminjaman_panel_title.setLayout(peminjaman_panel_titleLayout);
        peminjaman_panel_titleLayout.setHorizontalGroup(
            peminjaman_panel_titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(peminjaman_panel_titile_label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        peminjaman_panel_titleLayout.setVerticalGroup(
            peminjaman_panel_titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(peminjaman_panel_titile_label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        peminjaman_panel_left.add(peminjaman_panel_title, java.awt.BorderLayout.PAGE_START);

        peminjaman_btn_navigator.setMinimumSize(new java.awt.Dimension(450, 45));
        peminjaman_btn_navigator.setPreferredSize(new java.awt.Dimension(450, 45));
        peminjaman_btn_navigator.setLayout(new java.awt.BorderLayout());

        peminjaman_buku.setBackground(new java.awt.Color(0, 150, 62));
        peminjaman_buku.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        peminjaman_buku.setForeground(new java.awt.Color(255, 255, 255));
        peminjaman_buku.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        peminjaman_buku.setText("Peminjaman Buku");
        peminjaman_buku.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        peminjaman_buku.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        peminjaman_buku.setMaximumSize(new java.awt.Dimension(225, 45));
        peminjaman_buku.setMinimumSize(new java.awt.Dimension(225, 45));
        peminjaman_buku.setOpaque(true);
        peminjaman_buku.setPreferredSize(new java.awt.Dimension(225, 45));
        peminjaman_btn_navigator.add(peminjaman_buku, java.awt.BorderLayout.LINE_START);
        peminjaman_buku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt){
                peminjaman_buku.setBackground(new java.awt.Color(0,150,62));
                pengembalian_buku.setBackground(new java.awt.Color(1,198,83));

                peminjaman_buku.setForeground(new java.awt.Color(255,255,255));
                pengembalian_buku.setForeground(new java.awt.Color(204,204,204));

                peminjaman_buku.setFont(new java.awt.Font("SansSerif", 1, 14));
                pengembalian_buku.setFont(new java.awt.Font("SansSerif", 0, 14));

                form_peminjaman_buku.setVisible(true);
                form_pengembalian_buku.setVisible(false);
            }
        });

        pengembalian_buku.setBackground(new java.awt.Color(1, 198, 83));
        pengembalian_buku.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        pengembalian_buku.setForeground(new java.awt.Color(204, 204, 204));
        pengembalian_buku.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pengembalian_buku.setText("Pengembalian Buku");
        pengembalian_buku.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pengembalian_buku.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pengembalian_buku.setMaximumSize(new java.awt.Dimension(225, 45));
        pengembalian_buku.setMinimumSize(new java.awt.Dimension(225, 45));
        pengembalian_buku.setOpaque(true);
        pengembalian_buku.setPreferredSize(new java.awt.Dimension(225, 45));
        peminjaman_btn_navigator.add(pengembalian_buku, java.awt.BorderLayout.LINE_END);
        pengembalian_buku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt){
                peminjaman_buku.setBackground(new java.awt.Color(1,198,83));
                pengembalian_buku.setBackground(new java.awt.Color(0,150,62));

                peminjaman_buku.setForeground(new java.awt.Color(204,204,204));
                pengembalian_buku.setForeground(new java.awt.Color(255,255,255));

                peminjaman_buku.setFont(new java.awt.Font("SansSerif", 0, 14));
                pengembalian_buku.setFont(new java.awt.Font("SansSerif", 1, 14));

                form_peminjaman_buku.setVisible(false);
                form_pengembalian_buku.setVisible(true);
            }
        });

        peminjaman_panel_left.add(peminjaman_btn_navigator, java.awt.BorderLayout.CENTER);

        peminjaman_panel_container_crud.setPreferredSize(new java.awt.Dimension(450, 585));
        peminjaman_panel_container_crud.setLayout(new javax.swing.OverlayLayout(peminjaman_panel_container_crud));

        form_peminjaman_buku.setBackground(new java.awt.Color(204, 204, 204));
        form_peminjaman_buku.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "FORM PEMINJAMAN BUKU", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 1, 18))); // NOI18N
        form_peminjaman_buku.setMinimumSize(new java.awt.Dimension(450, 585));
        form_peminjaman_buku.setPreferredSize(new java.awt.Dimension(450, 585));

        label_id_anggota_pinjam.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        label_id_anggota_pinjam.setText("ID ANGGOTA");
        label_id_anggota_pinjam.setMaximumSize(new java.awt.Dimension(222, 30));
        label_id_anggota_pinjam.setMinimumSize(new java.awt.Dimension(222, 30));
        label_id_anggota_pinjam.setPreferredSize(new java.awt.Dimension(222, 30));

        label_kelas_pinjam.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        label_kelas_pinjam.setText("KELAS");
        label_kelas_pinjam.setMaximumSize(new java.awt.Dimension(222, 30));
        label_kelas_pinjam.setMinimumSize(new java.awt.Dimension(222, 30));
        label_kelas_pinjam.setPreferredSize(new java.awt.Dimension(222, 30));

        label_no_buku_pinjam.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        label_no_buku_pinjam.setText("NO BUKU");
        label_no_buku_pinjam.setMaximumSize(new java.awt.Dimension(222, 30));
        label_no_buku_pinjam.setMinimumSize(new java.awt.Dimension(222, 30));
        label_no_buku_pinjam.setPreferredSize(new java.awt.Dimension(222, 30));

        label_lama_peminjaman_buku.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        label_lama_peminjaman_buku.setText("LAMA PEMINJAMAN");
        label_lama_peminjaman_buku.setMaximumSize(new java.awt.Dimension(222, 30));
        label_lama_peminjaman_buku.setMinimumSize(new java.awt.Dimension(222, 30));
        label_lama_peminjaman_buku.setPreferredSize(new java.awt.Dimension(222, 30));

        label_tanggal_pinjam.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        label_tanggal_pinjam.setText("TANGGAL PINJAM");
        label_tanggal_pinjam.setMaximumSize(new java.awt.Dimension(222, 30));
        label_tanggal_pinjam.setMinimumSize(new java.awt.Dimension(222, 30));
        label_tanggal_pinjam.setPreferredSize(new java.awt.Dimension(222, 30));

        id_anggota_pinjam.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        id_anggota_pinjam.setBorder(null);
        id_anggota_pinjam.setMinimumSize(new java.awt.Dimension(190, 30));
        id_anggota_pinjam.setPreferredSize(new java.awt.Dimension(190, 30));

        kelas_1_pinjam.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        kelas_1_pinjam.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10", "11", "12" }));
        kelas_1_pinjam.setBorder(null);
        kelas_1_pinjam.setMinimumSize(new java.awt.Dimension(60, 30));
        kelas_1_pinjam.setPreferredSize(new java.awt.Dimension(60, 30));

        kelas_2_pinjam.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        kelas_2_pinjam.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "IPA", "IPS" }));
        kelas_2_pinjam.setBorder(null);
        kelas_2_pinjam.setPreferredSize(new java.awt.Dimension(70, 30));

        kelas_3_pinjam.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        kelas_3_pinjam.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8" }));
        kelas_3_pinjam.setBorder(null);
        kelas_3_pinjam.setMinimumSize(new java.awt.Dimension(60, 30));
        kelas_3_pinjam.setPreferredSize(new java.awt.Dimension(60, 30));

        no_buku_pinjam.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        no_buku_pinjam.setBorder(null);
        no_buku_pinjam.setMinimumSize(new java.awt.Dimension(190, 30));
        no_buku_pinjam.setPreferredSize(new java.awt.Dimension(190, 30));

        lama_peminjaman_buku.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lama_peminjaman_buku.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "7 hari", "30 hari", "6 bulan", "1 tahun" }));
        lama_peminjaman_buku.setBorder(null);
        lama_peminjaman_buku.setMinimumSize(new java.awt.Dimension(190, 30));
        lama_peminjaman_buku.setPreferredSize(new java.awt.Dimension(190, 30));

        tanggal_pinjam.setDateFormatString("yyyy-MM-dd HH:mm:ss");
        tanggal_pinjam.setFont(new java.awt.Font("SansSerif", 0, 10)); // NOI18N
        tanggal_pinjam.setMinimumSize(new java.awt.Dimension(190, 30));
        tanggal_pinjam.setPreferredSize(new java.awt.Dimension(190, 30));

        insert_peminjaman.setBackground(new java.awt.Color(0, 0, 255));
        insert_peminjaman.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        insert_peminjaman.setText("SUBMIT");
        insert_peminjaman.setBorder(null);
        insert_peminjaman.setMaximumSize(new java.awt.Dimension(80, 30));
        insert_peminjaman.setMinimumSize(new java.awt.Dimension(80, 30));
        insert_peminjaman.setPreferredSize(new java.awt.Dimension(80, 30));

        reset_peminjaman.setBackground(new java.awt.Color(255, 0, 0));
        reset_peminjaman.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        reset_peminjaman.setText("RESET");
        reset_peminjaman.setBorder(null);
        reset_peminjaman.setMaximumSize(new java.awt.Dimension(80, 30));
        reset_peminjaman.setMinimumSize(new java.awt.Dimension(80, 30));
        reset_peminjaman.setPreferredSize(new java.awt.Dimension(80, 30));

        buku_pinjam_alert_message.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        buku_pinjam_alert_message.setMaximumSize(new java.awt.Dimension(222, 30));
        buku_pinjam_alert_message.setMinimumSize(new java.awt.Dimension(222, 30));
        buku_pinjam_alert_message.setPreferredSize(new java.awt.Dimension(222, 30));

        javax.swing.GroupLayout form_peminjaman_bukuLayout = new javax.swing.GroupLayout(form_peminjaman_buku);
        form_peminjaman_buku.setLayout(form_peminjaman_bukuLayout);
        form_peminjaman_bukuLayout.setHorizontalGroup(
            form_peminjaman_bukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(form_peminjaman_bukuLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(label_id_anggota_pinjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(id_anggota_pinjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(form_peminjaman_bukuLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(label_kelas_pinjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(kelas_1_pinjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(kelas_2_pinjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(kelas_3_pinjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(form_peminjaman_bukuLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(label_no_buku_pinjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(no_buku_pinjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(form_peminjaman_bukuLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(label_lama_peminjaman_buku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(lama_peminjaman_buku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(form_peminjaman_bukuLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(label_tanggal_pinjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(tanggal_pinjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(form_peminjaman_bukuLayout.createSequentialGroup()
                .addGap(248, 248, 248)
                .addComponent(insert_peminjaman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(reset_peminjaman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(form_peminjaman_bukuLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(buku_pinjam_alert_message, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        form_peminjaman_bukuLayout.setVerticalGroup(
            form_peminjaman_bukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(form_peminjaman_bukuLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(form_peminjaman_bukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_id_anggota_pinjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(id_anggota_pinjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(form_peminjaman_bukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_kelas_pinjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kelas_1_pinjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kelas_2_pinjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kelas_3_pinjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(form_peminjaman_bukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_no_buku_pinjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(no_buku_pinjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(form_peminjaman_bukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_lama_peminjaman_buku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lama_peminjaman_buku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(form_peminjaman_bukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_tanggal_pinjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tanggal_pinjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(form_peminjaman_bukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(insert_peminjaman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reset_peminjaman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(buku_pinjam_alert_message, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(241, Short.MAX_VALUE))
        );

        tanggal_pinjam.setLocale(new java.util.Locale("id","ID"));
        insert_peminjaman.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt){
                insert_peminjamanMousePressed(evt);
            }
        });
        reset_peminjaman.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt){
                reset_peminjamanMousePressed(evt);
            }
        });
        buku_pinjam_alert_message.setVisible(false);

        peminjaman_panel_container_crud.add(form_peminjaman_buku);

        form_pengembalian_buku.setBackground(new java.awt.Color(204, 204, 204));
        form_pengembalian_buku.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "FORM PENGEMBALIAN BUKU", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 1, 18))); // NOI18N
        form_pengembalian_buku.setMinimumSize(new java.awt.Dimension(450, 585));

        status_telat_alert_message.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        status_telat_alert_message.setForeground(new java.awt.Color(255, 0, 0));
        status_telat_alert_message.setMaximumSize(new java.awt.Dimension(222, 30));
        status_telat_alert_message.setMinimumSize(new java.awt.Dimension(222, 30));
        status_telat_alert_message.setPreferredSize(new java.awt.Dimension(222, 30));

        label_id_pinjam.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        label_id_pinjam.setText("ID PEMINJAMAN");
        label_id_pinjam.setMaximumSize(new java.awt.Dimension(222, 30));
        label_id_pinjam.setMinimumSize(new java.awt.Dimension(222, 30));
        label_id_pinjam.setPreferredSize(new java.awt.Dimension(222, 30));

        label_tanggal_kembali.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        label_tanggal_kembali.setText("TANGGAL KEMBALI");
        label_tanggal_kembali.setMaximumSize(new java.awt.Dimension(222, 30));
        label_tanggal_kembali.setMinimumSize(new java.awt.Dimension(222, 30));
        label_tanggal_kembali.setPreferredSize(new java.awt.Dimension(222, 30));

        id_pinjam.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        id_pinjam.setBorder(null);
        id_pinjam.setMinimumSize(new java.awt.Dimension(190, 30));
        id_pinjam.setPreferredSize(new java.awt.Dimension(190, 30));

        tanggal_kembali.setDateFormatString("yyyy-MM-dd HH:mm:ss");
        tanggal_kembali.setFont(new java.awt.Font("SansSerif", 0, 10)); // NOI18N
        tanggal_kembali.setMinimumSize(new java.awt.Dimension(190, 30));
        tanggal_kembali.setPreferredSize(new java.awt.Dimension(190, 30));

        insert_pengembalian.setBackground(new java.awt.Color(0, 0, 255));
        insert_pengembalian.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        insert_pengembalian.setText("SUBMIT");
        insert_pengembalian.setBorder(null);
        insert_pengembalian.setMaximumSize(new java.awt.Dimension(80, 30));
        insert_pengembalian.setMinimumSize(new java.awt.Dimension(80, 30));
        insert_pengembalian.setPreferredSize(new java.awt.Dimension(80, 30));

        reset_pengembalian.setBackground(new java.awt.Color(255, 0, 0));
        reset_pengembalian.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        reset_pengembalian.setText("RESET");
        reset_pengembalian.setBorder(null);
        reset_pengembalian.setMaximumSize(new java.awt.Dimension(80, 30));
        reset_pengembalian.setMinimumSize(new java.awt.Dimension(80, 30));
        reset_pengembalian.setPreferredSize(new java.awt.Dimension(80, 30));

        buku_kembali_alert_message.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        buku_kembali_alert_message.setMaximumSize(new java.awt.Dimension(222, 30));
        buku_kembali_alert_message.setMinimumSize(new java.awt.Dimension(222, 30));
        buku_kembali_alert_message.setPreferredSize(new java.awt.Dimension(222, 30));

        javax.swing.GroupLayout form_pengembalian_bukuLayout = new javax.swing.GroupLayout(form_pengembalian_buku);
        form_pengembalian_buku.setLayout(form_pengembalian_bukuLayout);
        form_pengembalian_bukuLayout.setHorizontalGroup(
            form_pengembalian_bukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(form_pengembalian_bukuLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(status_telat_alert_message, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(form_pengembalian_bukuLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(label_id_pinjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(id_pinjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(form_pengembalian_bukuLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(label_tanggal_kembali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(tanggal_kembali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(form_pengembalian_bukuLayout.createSequentialGroup()
                .addGap(248, 248, 248)
                .addComponent(insert_pengembalian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(reset_pengembalian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(form_pengembalian_bukuLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(buku_kembali_alert_message, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        form_pengembalian_bukuLayout.setVerticalGroup(
            form_pengembalian_bukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(form_pengembalian_bukuLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(status_telat_alert_message, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(form_pengembalian_bukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_id_pinjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(id_pinjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(form_pengembalian_bukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_tanggal_kembali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tanggal_kembali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(form_pengembalian_bukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(insert_pengembalian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reset_pengembalian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(buku_kembali_alert_message, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(355, Short.MAX_VALUE))
        );

        tanggal_pinjam.setLocale(new java.util.Locale("id","ID"));

        tanggal_pinjam.setDateFormatString("yyyy-MM-dd HH:mm:ss");
        insert_pengembalian.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt){
                insert_pengembalianMousePressed(evt);
            }
        });
        reset_pengembalian.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt){
                reset_pengembalianMousePressed(evt);
            }
        });

        peminjaman_panel_container_crud.add(form_pengembalian_buku);
        form_pengembalian_buku.setVisible(false);

        peminjaman_panel_left.add(peminjaman_panel_container_crud, java.awt.BorderLayout.PAGE_END);

        peminjaman_panel.add(peminjaman_panel_left, java.awt.BorderLayout.LINE_START);

        peminjaman_panel_right.setBackground(new java.awt.Color(0, 255, 0));
        peminjaman_panel_right.setLayout(new java.awt.BorderLayout());

        peminjaman_tabel_panel.setMinimumSize(new java.awt.Dimension(1200, 525));
        peminjaman_tabel_panel.setPreferredSize(new java.awt.Dimension(585, 525));

        peminjaman_tabel.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        peminjaman_tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NAMA", "NIS", "KELAS", "NO BUKU", "JUDUL BUKU", "PENGARANG", "LAMA PEMINJAMAN", "TGL PINJAM", "TGL KEMBALI"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        peminjaman_tabel.setGridColor(new java.awt.Color(255, 255, 255));
        peminjaman_tabel.setMinimumSize(new java.awt.Dimension(585, 525));
        peminjaman_tabel.setPreferredSize(new java.awt.Dimension(585, 525));
        peminjaman_tabel.setRowHeight(24);
        peminjaman_tabel.setRowMargin(3);
        peminjaman_tabel.setSelectionBackground(new java.awt.Color(0, 0, 0));
        peminjaman_tabel_panel.setViewportView(peminjaman_tabel);
        peminjaman_tabel.getTableHeader().setFont(new java.awt.Font("SansSerif", 1, 14));

        ((javax.swing.table.DefaultTableCellRenderer)peminjaman_tabel.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(javax.swing.JLabel.CENTER);

        ((javax.swing.table.DefaultTableCellRenderer)peminjaman_tabel.getTableHeader().getDefaultRenderer()).setVerticalAlignment(javax.swing.JLabel.CENTER);

        javax.swing.table.TableRowSorter tabelPeminjamanSorter = new javax.swing.table.TableRowSorter<>((javax.swing.table.DefaultTableModel)peminjaman_tabel.getModel());

        peminjaman_tabel.setRowSorter(tabelPeminjamanSorter);

        peminjaman_panel_right.add(peminjaman_tabel_panel, java.awt.BorderLayout.CENTER);

        peminjaman_tabel_action_panel.setBackground(new java.awt.Color(1, 198, 83));
        peminjaman_tabel_action_panel.setMinimumSize(new java.awt.Dimension(585, 75));
        peminjaman_tabel_action_panel.setPreferredSize(new java.awt.Dimension(585, 75));
        peminjaman_tabel_action_panel.setLayout(new java.awt.GridBagLayout());

        hapus_peminjaman_btn.setBackground(new java.awt.Color(255, 0, 0));
        hapus_peminjaman_btn.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        hapus_peminjaman_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_trash_16.png"))); // NOI18N
        hapus_peminjaman_btn.setText("HAPUS");
        hapus_peminjaman_btn.setBorder(null);
        hapus_peminjaman_btn.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        hapus_peminjaman_btn.setMargin(new java.awt.Insets(2, 4, 2, 4));
        hapus_peminjaman_btn.setMaximumSize(new java.awt.Dimension(30, 30));
        hapus_peminjaman_btn.setMinimumSize(new java.awt.Dimension(30, 30));
        hapus_peminjaman_btn.setPreferredSize(new java.awt.Dimension(30, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 70;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(30, 0, 15, 112);
        peminjaman_tabel_action_panel.add(hapus_peminjaman_btn, gridBagConstraints);
        hapus_peminjaman_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt){
                hapus_peminjamanMousePressed(evt);
            }
        });

        edit_peminjaman_btn.setBackground(new java.awt.Color(0, 0, 0));
        edit_peminjaman_btn.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        edit_peminjaman_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_edit_16.png"))); // NOI18N
        edit_peminjaman_btn.setText("BUKU KEMBALI");
        edit_peminjaman_btn.setBorder(null);
        edit_peminjaman_btn.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        edit_peminjaman_btn.setMargin(new java.awt.Insets(2, 4, 2, 4));
        edit_peminjaman_btn.setMaximumSize(new java.awt.Dimension(30, 30));
        edit_peminjaman_btn.setMinimumSize(new java.awt.Dimension(30, 30));
        edit_peminjaman_btn.setPreferredSize(new java.awt.Dimension(30, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 140;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(30, 0, 15, 0);
        peminjaman_tabel_action_panel.add(edit_peminjaman_btn, gridBagConstraints);
        edit_peminjaman_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt){
                peminjaman_buku.setBackground(new java.awt.Color(1,198,83));
                pengembalian_buku.setBackground(new java.awt.Color(0,150,62));

                peminjaman_buku.setForeground(new java.awt.Color(204,204,204));
                pengembalian_buku.setForeground(new java.awt.Color(255,255,255));

                peminjaman_buku.setFont(new java.awt.Font("SansSerif", 0, 14));
                pengembalian_buku.setFont(new java.awt.Font("SansSerif", 1, 14));

                form_peminjaman_buku.setVisible(false);
                form_pengembalian_buku.setVisible(true);

                edit_peminjamanMousePressed(evt);
            }

        });

        cetak_laporan_peminjaman_btn.setBackground(new java.awt.Color(0, 0, 0));
        cetak_laporan_peminjaman_btn.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        cetak_laporan_peminjaman_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_print_16.png"))); // NOI18N
        cetak_laporan_peminjaman_btn.setText("CETAK");
        cetak_laporan_peminjaman_btn.setBorder(null);
        cetak_laporan_peminjaman_btn.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        cetak_laporan_peminjaman_btn.setMargin(new java.awt.Insets(2, 4, 2, 4));
        cetak_laporan_peminjaman_btn.setMaximumSize(new java.awt.Dimension(30, 30));
        cetak_laporan_peminjaman_btn.setMinimumSize(new java.awt.Dimension(30, 30));
        cetak_laporan_peminjaman_btn.setPreferredSize(new java.awt.Dimension(30, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 70;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(30, 110, 15, 0);
        peminjaman_tabel_action_panel.add(cetak_laporan_peminjaman_btn, gridBagConstraints);
        cetak_laporan_peminjaman_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt){
                cetak_peminjamanMousePressed(evt);
            }
        });

        peminjaman_panel_right.add(peminjaman_tabel_action_panel, java.awt.BorderLayout.PAGE_START);

        search_peminjaman_panel.setBackground(new java.awt.Color(204, 204, 204));
        search_peminjaman_panel.setMinimumSize(new java.awt.Dimension(585, 165));
        search_peminjaman_panel.setPreferredSize(new java.awt.Dimension(585, 165));
        search_peminjaman_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        filter_peminjaman_buku_title.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        filter_peminjaman_buku_title.setText("FILTER PENCARIAN PEMINJAMAN DAN PENGEMBALIAN BUKU");
        filter_peminjaman_buku_title.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        filter_peminjaman_buku_title.setMaximumSize(new java.awt.Dimension(50, 30));
        filter_peminjaman_buku_title.setMinimumSize(new java.awt.Dimension(50, 30));
        filter_peminjaman_buku_title.setPreferredSize(new java.awt.Dimension(50, 30));
        search_peminjaman_panel.add(filter_peminjaman_buku_title, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, -1));

        petunjuk_filter_peminjaman_buku.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        petunjuk_filter_peminjaman_buku.setText("Catatan : Untuk menggunakan filter pencarian data peminjaman, ketikkan kata kunci dibawah.");
        search_peminjaman_panel.add(petunjuk_filter_peminjaman_buku, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 800, 30));

        nama_siswa_filter_label.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        nama_siswa_filter_label.setText("NAMA SISWA");
        search_peminjaman_panel.add(nama_siswa_filter_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 150, -1));

        no_induk_label.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        no_induk_label.setText("NO INDUK");
        search_peminjaman_panel.add(no_induk_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 150, -1));

        kelas_label.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        kelas_label.setText("KELAS");
        search_peminjaman_panel.add(kelas_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 150, -1));

        tanggal_pinjam_filter_label.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        tanggal_pinjam_filter_label.setText("TANGGAL PINJAM");
        search_peminjaman_panel.add(tanggal_pinjam_filter_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 70, 150, -1));

        tanggal_kembali_filter_label.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        tanggal_kembali_filter_label.setText("TANGGAL KEMBALI");
        search_peminjaman_panel.add(tanggal_kembali_filter_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 70, 150, -1));

        nama_siswa_filter.setBackground(new java.awt.Color(240, 240, 240));
        nama_siswa_filter.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        nama_siswa_filter.setForeground(new java.awt.Color(102, 102, 102));
        nama_siswa_filter.setText("Semua");
        nama_siswa_filter.setBorder(null);
        nama_siswa_filter.setMinimumSize(new java.awt.Dimension(50, 20));
        nama_siswa_filter.setPreferredSize(new java.awt.Dimension(50, 20));
        search_peminjaman_panel.add(nama_siswa_filter, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 150, 30));
        nama_siswa_filter.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt){
                if(nama_siswa_filter.getText().trim().equals("Semua")){
                    nama_siswa_filter.setText(null);
                }
                nama_siswa_filter.setForeground(new java.awt.Color(0,0,0));
            }
            public void focusLost(java.awt.event.FocusEvent evt){
                nama_siswa_filter.setForeground(new java.awt.Color(102,102,102));
                if(nama_siswa_filter.getText().trim().equals("")){
                    nama_siswa_filter.setText("Semua");
                }
            }
        });

        nama_siswa_filter.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
            @Override public void insertUpdate(javax.swing.event.DocumentEvent e) {
                String[] keywords = new String[] {
                    nama_siswa_filter.getText().trim().equals("Semua")?"":nama_siswa_filter.getText(),
                    no_induk_filter.getText().trim().equals("Semua")?"":no_induk_filter.getText(),
                    kelas_filter.getText().trim().equals("Semua")?"":kelas_filter.getText(),
                    tanggal_pinjam_filter.getText().trim().equals("Semua")?"":tanggal_pinjam_filter.getText(),
                    tanggal_kembali_filter.getText().trim().equals("Semua")?"":tanggal_kembali_filter.getText(),
                };
                java.util.List<javax.swing.RowFilter<Object, Object>> filters = new java.util.ArrayList<>();
                filters.add(javax.swing.RowFilter.regexFilter("(?i)" + keywords[0], 1));
                filters.add(javax.swing.RowFilter.regexFilter("^(?i)" + keywords[1], 2));
                filters.add(javax.swing.RowFilter.regexFilter("^(?i)" + keywords[2], 3));
                filters.add(javax.swing.RowFilter.regexFilter("^(?i)" + keywords[3], 8));
                filters.add(javax.swing.RowFilter.regexFilter("^(?i)" + keywords[4], 9));
                tabelPeminjamanSorter.setRowFilter(javax.swing.RowFilter.andFilter(filters));
            }
            @Override public void removeUpdate(javax.swing.event.DocumentEvent e) {
                String[] keywords = new String[] {
                    nama_siswa_filter.getText().trim().equals("Semua")?"":nama_siswa_filter.getText(),
                    no_induk_filter.getText().trim().equals("Semua")?"":no_induk_filter.getText(),
                    kelas_filter.getText().trim().equals("Semua")?"":kelas_filter.getText(),
                    tanggal_pinjam_filter.getText().trim().equals("Semua")?"":tanggal_pinjam_filter.getText(),
                    tanggal_kembali_filter.getText().trim().equals("Semua")?"":tanggal_kembali_filter.getText(),
                };
                java.util.List<javax.swing.RowFilter<Object, Object>> filters = new java.util.ArrayList<>();
                filters.add(javax.swing.RowFilter.regexFilter("(?i)" + keywords[0], 1));
                filters.add(javax.swing.RowFilter.regexFilter("^(?i)" + keywords[1], 2));
                filters.add(javax.swing.RowFilter.regexFilter("^(?i)" + keywords[2], 3));
                filters.add(javax.swing.RowFilter.regexFilter("^(?i)" + keywords[3], 8));
                filters.add(javax.swing.RowFilter.regexFilter("^(?i)" + keywords[4], 9));
                tabelPeminjamanSorter.setRowFilter(javax.swing.RowFilter.andFilter(filters));
            }
            @Override public void changedUpdate(javax.swing.event.DocumentEvent e) {
            }
        });

        no_induk_filter.setBackground(new java.awt.Color(240, 240, 240));
        no_induk_filter.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        no_induk_filter.setForeground(new java.awt.Color(102, 102, 102));
        no_induk_filter.setText("Semua");
        no_induk_filter.setBorder(null);
        no_induk_filter.setMinimumSize(new java.awt.Dimension(110, 20));
        no_induk_filter.setPreferredSize(new java.awt.Dimension(110, 20));
        search_peminjaman_panel.add(no_induk_filter, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 150, 30));
        no_induk_filter.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt){
                if(no_induk_filter.getText().trim().equals("Semua")){
                    no_induk_filter.setText(null);
                }
                no_induk_filter.setForeground(new java.awt.Color(0,0,0));
            }
            public void focusLost(java.awt.event.FocusEvent evt){
                no_induk_filter.setForeground(new java.awt.Color(102,102,102));
                if(no_induk_filter.getText().trim().equals("")){
                    no_induk_filter.setText("Semua");
                }
            }
        });
        no_induk_filter.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
            @Override public void insertUpdate(javax.swing.event.DocumentEvent e) {
                String[] keywords = new String[] {
                    nama_siswa_filter.getText().trim().equals("Semua")?"":nama_siswa_filter.getText(),
                    no_induk_filter.getText().trim().equals("Semua")?"":no_induk_filter.getText(),
                    kelas_filter.getText().trim().equals("Semua")?"":kelas_filter.getText(),
                    tanggal_pinjam_filter.getText().trim().equals("Semua")?"":tanggal_pinjam_filter.getText(),
                    tanggal_kembali_filter.getText().trim().equals("Semua")?"":tanggal_kembali_filter.getText(),
                };
                java.util.List<javax.swing.RowFilter<Object, Object>> filters = new java.util.ArrayList<>();
                filters.add(javax.swing.RowFilter.regexFilter("(?i)" + keywords[0], 1));
                filters.add(javax.swing.RowFilter.regexFilter("^(?i)" + keywords[1], 2));
                filters.add(javax.swing.RowFilter.regexFilter("^(?i)" + keywords[2], 3));
                filters.add(javax.swing.RowFilter.regexFilter("^(?i)" + keywords[3], 8));
                filters.add(javax.swing.RowFilter.regexFilter("^(?i)" + keywords[4], 9));
                tabelPeminjamanSorter.setRowFilter(javax.swing.RowFilter.andFilter(filters));
            }
            @Override public void removeUpdate(javax.swing.event.DocumentEvent e) {
                String[] keywords = new String[] {
                    nama_siswa_filter.getText().trim().equals("Semua")?"":nama_siswa_filter.getText(),
                    no_induk_filter.getText().trim().equals("Semua")?"":no_induk_filter.getText(),
                    kelas_filter.getText().trim().equals("Semua")?"":kelas_filter.getText(),
                    tanggal_pinjam_filter.getText().trim().equals("Semua")?"":tanggal_pinjam_filter.getText(),
                    tanggal_kembali_filter.getText().trim().equals("Semua")?"":tanggal_kembali_filter.getText(),
                };
                java.util.List<javax.swing.RowFilter<Object, Object>> filters = new java.util.ArrayList<>();
                filters.add(javax.swing.RowFilter.regexFilter("(?i)" + keywords[0], 1));
                filters.add(javax.swing.RowFilter.regexFilter("^(?i)" + keywords[1], 2));
                filters.add(javax.swing.RowFilter.regexFilter("^(?i)" + keywords[2], 3));
                filters.add(javax.swing.RowFilter.regexFilter("^(?i)" + keywords[3], 8));
                filters.add(javax.swing.RowFilter.regexFilter("^(?i)" + keywords[4], 9));
                tabelPeminjamanSorter.setRowFilter(javax.swing.RowFilter.andFilter(filters));
            }
            @Override public void changedUpdate(javax.swing.event.DocumentEvent e) {
            }
        });

        kelas_filter.setBackground(new java.awt.Color(240, 240, 240));
        kelas_filter.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        kelas_filter.setForeground(new java.awt.Color(102, 102, 102));
        kelas_filter.setText("Semua");
        kelas_filter.setBorder(null);
        kelas_filter.setMinimumSize(new java.awt.Dimension(110, 20));
        kelas_filter.setPreferredSize(new java.awt.Dimension(110, 20));
        search_peminjaman_panel.add(kelas_filter, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, 150, 30));
        kelas_filter.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt){
                if(kelas_filter.getText().trim().equals("Semua")){
                    kelas_filter.setText(null);
                }
                kelas_filter.setForeground(new java.awt.Color(0,0,0));
            }
            public void focusLost(java.awt.event.FocusEvent evt){
                kelas_filter.setForeground(new java.awt.Color(102,102,102));
                if(kelas_filter.getText().trim().equals("")){
                    kelas_filter.setText("Semua");
                }
            }
        });
        kelas_filter.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
            @Override public void insertUpdate(javax.swing.event.DocumentEvent e) {
                String[] keywords = new String[] {
                    nama_siswa_filter.getText().trim().equals("Semua")?"":nama_siswa_filter.getText(),
                    no_induk_filter.getText().trim().equals("Semua")?"":no_induk_filter.getText(),
                    kelas_filter.getText().trim().equals("Semua")?"":kelas_filter.getText(),
                    tanggal_pinjam_filter.getText().trim().equals("Semua")?"":tanggal_pinjam_filter.getText(),
                    tanggal_kembali_filter.getText().trim().equals("Semua")?"":tanggal_kembali_filter.getText(),
                };
                java.util.List<javax.swing.RowFilter<Object, Object>> filters = new java.util.ArrayList<>();
                filters.add(javax.swing.RowFilter.regexFilter("(?i)" + keywords[0], 1));
                filters.add(javax.swing.RowFilter.regexFilter("^(?i)" + keywords[1], 2));
                filters.add(javax.swing.RowFilter.regexFilter("^(?i)" + keywords[2], 3));
                filters.add(javax.swing.RowFilter.regexFilter("^(?i)" + keywords[3], 8));
                filters.add(javax.swing.RowFilter.regexFilter("^(?i)" + keywords[4], 9));
                tabelPeminjamanSorter.setRowFilter(javax.swing.RowFilter.andFilter(filters));
            }
            @Override public void removeUpdate(javax.swing.event.DocumentEvent e) {
                String[] keywords = new String[] {
                    nama_siswa_filter.getText().trim().equals("Semua")?"":nama_siswa_filter.getText(),
                    no_induk_filter.getText().trim().equals("Semua")?"":no_induk_filter.getText(),
                    kelas_filter.getText().trim().equals("Semua")?"":kelas_filter.getText(),
                    tanggal_pinjam_filter.getText().trim().equals("Semua")?"":tanggal_pinjam_filter.getText(),
                    tanggal_kembali_filter.getText().trim().equals("Semua")?"":tanggal_kembali_filter.getText(),
                };
                java.util.List<javax.swing.RowFilter<Object, Object>> filters = new java.util.ArrayList<>();
                filters.add(javax.swing.RowFilter.regexFilter("(?i)" + keywords[0], 1));
                filters.add(javax.swing.RowFilter.regexFilter("^(?i)" + keywords[1], 2));
                filters.add(javax.swing.RowFilter.regexFilter("^(?i)" + keywords[2], 3));
                filters.add(javax.swing.RowFilter.regexFilter("^(?i)" + keywords[3], 8));
                filters.add(javax.swing.RowFilter.regexFilter("^(?i)" + keywords[4], 9));
                tabelPeminjamanSorter.setRowFilter(javax.swing.RowFilter.andFilter(filters));
            }
            @Override public void changedUpdate(javax.swing.event.DocumentEvent e) {
            }
        });

        tanggal_pinjam_filter.setBackground(new java.awt.Color(240, 240, 240));
        tanggal_pinjam_filter.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        tanggal_pinjam_filter.setForeground(new java.awt.Color(102, 102, 102));
        tanggal_pinjam_filter.setText("Semua");
        tanggal_pinjam_filter.setBorder(null);
        tanggal_pinjam_filter.setMinimumSize(new java.awt.Dimension(110, 20));
        tanggal_pinjam_filter.setPreferredSize(new java.awt.Dimension(110, 20));
        search_peminjaman_panel.add(tanggal_pinjam_filter, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, 150, 30));
        tanggal_pinjam_filter.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt){
                if(tanggal_pinjam_filter.getText().trim().equals("Semua")){
                    tanggal_pinjam_filter.setText(null);
                }
                tanggal_pinjam_filter.setForeground(new java.awt.Color(0,0,0));
            }
            public void focusLost(java.awt.event.FocusEvent evt){
                tanggal_pinjam_filter.setForeground(new java.awt.Color(102,102,102));
                if(tanggal_pinjam_filter.getText().trim().equals("")){
                    tanggal_pinjam_filter.setText("Semua");
                }
            }
        });
        tanggal_pinjam_filter.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
            @Override public void insertUpdate(javax.swing.event.DocumentEvent e) {
                String[] keywords = new String[] {
                    nama_siswa_filter.getText().trim().equals("Semua")?"":nama_siswa_filter.getText(),
                    no_induk_filter.getText().trim().equals("Semua")?"":no_induk_filter.getText(),
                    kelas_filter.getText().trim().equals("Semua")?"":kelas_filter.getText(),
                    tanggal_pinjam_filter.getText().trim().equals("Semua")?"":tanggal_pinjam_filter.getText(),
                    tanggal_kembali_filter.getText().trim().equals("Semua")?"":tanggal_kembali_filter.getText(),
                };
                java.util.List<javax.swing.RowFilter<Object, Object>> filters = new java.util.ArrayList<>();
                filters.add(javax.swing.RowFilter.regexFilter("(?i)" + keywords[0], 1));
                filters.add(javax.swing.RowFilter.regexFilter("^(?i)" + keywords[1], 2));
                filters.add(javax.swing.RowFilter.regexFilter("^(?i)" + keywords[2], 3));
                filters.add(javax.swing.RowFilter.regexFilter("^(?i)" + keywords[3], 8));
                filters.add(javax.swing.RowFilter.regexFilter("^(?i)" + keywords[4], 9));
                tabelPeminjamanSorter.setRowFilter(javax.swing.RowFilter.andFilter(filters));
            }
            @Override public void removeUpdate(javax.swing.event.DocumentEvent e) {
                String[] keywords = new String[] {
                    nama_siswa_filter.getText().trim().equals("Semua")?"":nama_siswa_filter.getText(),
                    no_induk_filter.getText().trim().equals("Semua")?"":no_induk_filter.getText(),
                    kelas_filter.getText().trim().equals("Semua")?"":kelas_filter.getText(),
                    tanggal_pinjam_filter.getText().trim().equals("Semua")?"":tanggal_pinjam_filter.getText(),
                    tanggal_kembali_filter.getText().trim().equals("Semua")?"":tanggal_kembali_filter.getText(),
                };
                java.util.List<javax.swing.RowFilter<Object, Object>> filters = new java.util.ArrayList<>();
                filters.add(javax.swing.RowFilter.regexFilter("(?i)" + keywords[0], 1));
                filters.add(javax.swing.RowFilter.regexFilter("^(?i)" + keywords[1], 2));
                filters.add(javax.swing.RowFilter.regexFilter("^(?i)" + keywords[2], 3));
                filters.add(javax.swing.RowFilter.regexFilter("^(?i)" + keywords[3], 8));
                filters.add(javax.swing.RowFilter.regexFilter("^(?i)" + keywords[4], 9));
                tabelPeminjamanSorter.setRowFilter(javax.swing.RowFilter.andFilter(filters));
            }
            @Override public void changedUpdate(javax.swing.event.DocumentEvent e) {
            }
        });

        tanggal_kembali_filter.setBackground(new java.awt.Color(240, 240, 240));
        tanggal_kembali_filter.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        tanggal_kembali_filter.setForeground(new java.awt.Color(102, 102, 102));
        tanggal_kembali_filter.setText("Semua");
        tanggal_kembali_filter.setBorder(null);
        tanggal_kembali_filter.setMinimumSize(new java.awt.Dimension(110, 20));
        tanggal_kembali_filter.setPreferredSize(new java.awt.Dimension(110, 20));
        search_peminjaman_panel.add(tanggal_kembali_filter, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 90, 150, 30));
        tanggal_kembali_filter.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt){
                if(tanggal_kembali_filter.getText().trim().equals("Semua")){
                    tanggal_kembali_filter.setText(null);
                }
                tanggal_kembali_filter.setForeground(new java.awt.Color(0,0,0));
            }
            public void focusLost(java.awt.event.FocusEvent evt){
                tanggal_kembali_filter.setForeground(new java.awt.Color(102,102,102));
                if(tanggal_kembali_filter.getText().trim().equals("")){
                    tanggal_kembali_filter.setText("Semua");
                }
            }
        });
        tanggal_kembali_filter.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
            @Override public void insertUpdate(javax.swing.event.DocumentEvent e) {
                String[] keywords = new String[] {
                    nama_siswa_filter.getText().trim().equals("Semua")?"":nama_siswa_filter.getText(),
                    no_induk_filter.getText().trim().equals("Semua")?"":no_induk_filter.getText(),
                    kelas_filter.getText().trim().equals("Semua")?"":kelas_filter.getText(),
                    tanggal_pinjam_filter.getText().trim().equals("Semua")?"":tanggal_pinjam_filter.getText(),
                    tanggal_kembali_filter.getText().trim().equals("Semua")?"":tanggal_kembali_filter.getText(),
                };
                java.util.List<javax.swing.RowFilter<Object, Object>> filters = new java.util.ArrayList<>();
                filters.add(javax.swing.RowFilter.regexFilter("(?i)" + keywords[0], 1));
                filters.add(javax.swing.RowFilter.regexFilter("^(?i)" + keywords[1], 2));
                filters.add(javax.swing.RowFilter.regexFilter("^(?i)" + keywords[2], 3));
                filters.add(javax.swing.RowFilter.regexFilter("^(?i)" + keywords[3], 8));
                filters.add(javax.swing.RowFilter.regexFilter("^(?i)" + keywords[4], 9));
                tabelPeminjamanSorter.setRowFilter(javax.swing.RowFilter.andFilter(filters));
            }
            @Override public void removeUpdate(javax.swing.event.DocumentEvent e) {
                String[] keywords = new String[] {
                    nama_siswa_filter.getText().trim().equals("Semua")?"":nama_siswa_filter.getText(),
                    no_induk_filter.getText().trim().equals("Semua")?"":no_induk_filter.getText(),
                    kelas_filter.getText().trim().equals("Semua")?"":kelas_filter.getText(),
                    tanggal_pinjam_filter.getText().trim().equals("Semua")?"":tanggal_pinjam_filter.getText(),
                    tanggal_kembali_filter.getText().trim().equals("Semua")?"":tanggal_kembali_filter.getText(),
                };
                java.util.List<javax.swing.RowFilter<Object, Object>> filters = new java.util.ArrayList<>();
                filters.add(javax.swing.RowFilter.regexFilter("(?i)" + keywords[0], 1));
                filters.add(javax.swing.RowFilter.regexFilter("^(?i)" + keywords[1], 2));
                filters.add(javax.swing.RowFilter.regexFilter("^(?i)" + keywords[2], 3));
                filters.add(javax.swing.RowFilter.regexFilter("^(?i)" + keywords[3], 8));
                filters.add(javax.swing.RowFilter.regexFilter("^(?i)" + keywords[4], 9));
                tabelPeminjamanSorter.setRowFilter(javax.swing.RowFilter.andFilter(filters));
            }
            @Override public void changedUpdate(javax.swing.event.DocumentEvent e) {
            }
        });

        peminjaman_panel_right.add(search_peminjaman_panel, java.awt.BorderLayout.PAGE_END);

        peminjaman_panel.add(peminjaman_panel_right, java.awt.BorderLayout.CENTER);

        panels.add(peminjaman_panel);
        peminjaman_panel.setVisible(false);

        cetak_laporan_all_panel.setBackground(new java.awt.Color(1, 198, 83));
        cetak_laporan_all_panel.setMinimumSize(new java.awt.Dimension(1035, 675));
        cetak_laporan_all_panel.setPreferredSize(new java.awt.Dimension(1035, 675));
        cetak_laporan_all_panel.setLayout(new java.awt.GridBagLayout());

        cetak_laporan_buku_panel.setBackground(new java.awt.Color(62, 80, 80));
        cetak_laporan_buku_panel.setMinimumSize(new java.awt.Dimension(300, 330));
        cetak_laporan_buku_panel.setPreferredSize(new java.awt.Dimension(330, 420));
        cetak_laporan_buku_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        laporan_buku_label.setBackground(new java.awt.Color(0, 150, 62));
        laporan_buku_label.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        laporan_buku_label.setForeground(new java.awt.Color(222, 245, 227));
        laporan_buku_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        laporan_buku_label.setText("LAPORAN BUKU");
        laporan_buku_label.setToolTipText("");
        laporan_buku_label.setMaximumSize(new java.awt.Dimension(330, 30));
        laporan_buku_label.setMinimumSize(new java.awt.Dimension(330, 30));
        laporan_buku_label.setOpaque(true);
        laporan_buku_label.setPreferredSize(new java.awt.Dimension(330, 30));
        cetak_laporan_buku_panel.add(laporan_buku_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 41));

        cetak_no_buku_label.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        cetak_no_buku_label.setForeground(new java.awt.Color(40, 188, 100));
        cetak_no_buku_label.setText("NO BUKU");
        cetak_laporan_buku_panel.add(cetak_no_buku_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 70, 20));

        buku_semua.setBackground(new java.awt.Color(62, 80, 80));
        buku_semua.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        buku_semua.setForeground(new java.awt.Color(222, 245, 227));
        buku_semua.setSelected(true);
        buku_semua.setText("Semua");
        cetak_laporan_buku_panel.add(buku_semua, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 80, 20));
        buku_semua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt){
                buku_semua.setSelected(true);
                buku_pilih.setSelected(false);
                buku_pilih_field.setEnabled(false);
            }
        });

        buku_pilih.setBackground(new java.awt.Color(62, 80, 80));
        buku_pilih.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        buku_pilih.setForeground(new java.awt.Color(222, 245, 227));
        buku_pilih.setText("Pilih");
        cetak_laporan_buku_panel.add(buku_pilih, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 80, 20));
        buku_pilih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt){
                buku_semua.setSelected(false);
                buku_pilih.setSelected(true);
                buku_pilih_field.setEnabled(true);
            }
        });

        buku_pilih_field.setBackground(new java.awt.Color(240, 240, 240));
        buku_pilih_field.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        buku_pilih_field.setForeground(new java.awt.Color(109, 109, 109));
        buku_pilih_field.setText("Contoh 1, 1-6 dst");
        buku_pilih_field.setEnabled(false);
        cetak_laporan_buku_panel.add(buku_pilih_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 130, 30));
        buku_pilih_field.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt){
                buku_pilih_field.setForeground(new java.awt.Color(0, 0, 0));
                if(buku_pilih_field.getText().trim().equals("Contoh 1, 1-6 dst")){
                    buku_pilih_field.setText(null);
                }
            }
            public void focusLost(java.awt.event.FocusEvent evt){
                buku_pilih_field.setForeground(new java.awt.Color(109, 109, 109));
                if(buku_pilih_field.getText().trim().equals("")){
                    buku_pilih_field.setText("Contoh 1, 1-6 dst");
                }
            }
        });

        cetak_buku_laporan.setBackground(new java.awt.Color(62, 80, 80));
        cetak_buku_laporan.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        cetak_buku_laporan.setForeground(new java.awt.Color(240, 240, 240));
        cetak_buku_laporan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cetak_buku_laporan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_print_light_32.png"))); // NOI18N
        cetak_buku_laporan.setText("CETAK");
        cetak_buku_laporan.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        cetak_buku_laporan.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cetak_buku_laporan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cetak_buku_laporan.setOpaque(true);
        cetak_buku_laporan.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        cetak_laporan_buku_panel.add(cetak_buku_laporan, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, 70, 60));
        cetak_buku_laporan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt){
                cetak_all_bukuMousePressed(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt){
                cetak_buku_laporan.setBackground(new java.awt.Color(62,135,114));
                cetak_buku_laporan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_print_32.png")));
                cetak_buku_laporan.setForeground(new java.awt.Color(0,0,0));
            }
            public void mouseExited(java.awt.event.MouseEvent evt){
                cetak_buku_laporan.setBackground(new java.awt.Color(62,80,80));
                cetak_buku_laporan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_print_light_32.png")));
                cetak_buku_laporan.setForeground(new java.awt.Color(240,240,240));
            }
        });

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(62, 80, 80));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(240, 240, 240));
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("ketik 1 untuk print dari 1, ketik 1-6 untuk print dari 1 sampai 6.");
        jTextArea1.setWrapStyleWord(true);
        jScrollPane1.setViewportView(jTextArea1);

        cetak_laporan_buku_panel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 130, 60));

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 25;
        gridBagConstraints.ipady = 90;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(47, 0, 98, 0);
        cetak_laporan_all_panel.add(cetak_laporan_buku_panel, gridBagConstraints);

        cetak_laporan_anggota_panel.setBackground(new java.awt.Color(62, 80, 80));
        cetak_laporan_anggota_panel.setMinimumSize(new java.awt.Dimension(300, 300));
        cetak_laporan_anggota_panel.setPreferredSize(new java.awt.Dimension(330, 420));
        cetak_laporan_anggota_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        laporan_anggota_label.setBackground(new java.awt.Color(5, 113, 108));
        laporan_anggota_label.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        laporan_anggota_label.setForeground(new java.awt.Color(222, 245, 227));
        laporan_anggota_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        laporan_anggota_label.setText("LAPORAN ANGGOTA");
        laporan_anggota_label.setToolTipText("");
        laporan_anggota_label.setMaximumSize(new java.awt.Dimension(330, 30));
        laporan_anggota_label.setMinimumSize(new java.awt.Dimension(330, 30));
        laporan_anggota_label.setOpaque(true);
        laporan_anggota_label.setPreferredSize(new java.awt.Dimension(330, 30));
        cetak_laporan_anggota_panel.add(laporan_anggota_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 41));

        cetak_nis_label.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        cetak_nis_label.setForeground(new java.awt.Color(40, 188, 100));
        cetak_nis_label.setText("NIS/NO INDUK");
        cetak_laporan_anggota_panel.add(cetak_nis_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 100, 20));

        nis_semua.setBackground(new java.awt.Color(62, 80, 80));
        nis_semua.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        nis_semua.setForeground(new java.awt.Color(222, 245, 227));
        nis_semua.setSelected(true);
        nis_semua.setText("Semua");
        cetak_laporan_anggota_panel.add(nis_semua, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 80, 20));
        nis_semua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt){
                nis_semua.setSelected(true);
                nis_pilih.setSelected(false);
                nis_pilih_field.setEnabled(false);
            }
        });

        nis_pilih.setBackground(new java.awt.Color(62, 80, 80));
        nis_pilih.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        nis_pilih.setForeground(new java.awt.Color(222, 245, 227));
        nis_pilih.setText("Pilih");
        cetak_laporan_anggota_panel.add(nis_pilih, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 80, 20));
        nis_pilih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt){
                nis_semua.setSelected(false);
                nis_pilih.setSelected(true);
                nis_pilih_field.setEnabled(true);
            }
        });

        nis_pilih_field.setBackground(new java.awt.Color(240, 240, 240));
        nis_pilih_field.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        nis_pilih_field.setForeground(new java.awt.Color(109, 109, 109));
        nis_pilih_field.setText("Contoh 1, 1-6 dst");
        nis_pilih_field.setEnabled(false);
        cetak_laporan_anggota_panel.add(nis_pilih_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 130, 30));
        nis_pilih_field.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt){
                nis_pilih_field.setForeground(new java.awt.Color(0, 0, 0));
                if(nis_pilih_field.getText().trim().equals("Contoh 1, 1-6 dst")){
                    nis_pilih_field.setText(null);
                }
            }
            public void focusLost(java.awt.event.FocusEvent evt){
                nis_pilih_field.setForeground(new java.awt.Color(109, 109, 109));
                if(nis_pilih_field.getText().trim().equals("")){
                    nis_pilih_field.setText("Contoh 1, 1-6 dst");
                }
            }
        });

        cetak_anggota_laporan.setBackground(new java.awt.Color(62, 80, 80));
        cetak_anggota_laporan.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        cetak_anggota_laporan.setForeground(new java.awt.Color(240, 240, 240));
        cetak_anggota_laporan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cetak_anggota_laporan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_print_light_32.png"))); // NOI18N
        cetak_anggota_laporan.setText("CETAK");
        cetak_anggota_laporan.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        cetak_anggota_laporan.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cetak_anggota_laporan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cetak_anggota_laporan.setOpaque(true);
        cetak_anggota_laporan.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        cetak_laporan_anggota_panel.add(cetak_anggota_laporan, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, 70, 60));
        cetak_anggota_laporan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt){
                cetak_all_anggotaMousePressed(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt){
                cetak_anggota_laporan.setBackground(new java.awt.Color(62,135,114));
                cetak_anggota_laporan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_print_32.png")));
                cetak_anggota_laporan.setForeground(new java.awt.Color(0,0,0));
            }
            public void mouseExited(java.awt.event.MouseEvent evt){
                cetak_anggota_laporan.setBackground(new java.awt.Color(62,80,80));
                cetak_anggota_laporan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_print_light_32.png")));
                cetak_anggota_laporan.setForeground(new java.awt.Color(240,240,240));
            }
        });

        jScrollPane2.setBorder(null);
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea2.setEditable(false);
        jTextArea2.setBackground(new java.awt.Color(62, 80, 80));
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jTextArea2.setForeground(new java.awt.Color(240, 240, 240));
        jTextArea2.setLineWrap(true);
        jTextArea2.setRows(5);
        jTextArea2.setText("ketik 1 untuk print dari 1, ketik 1-6 untuk print dari 1 sampai 6.");
        jTextArea2.setWrapStyleWord(true);
        jScrollPane2.setViewportView(jTextArea2);

        cetak_laporan_anggota_panel.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 130, 60));

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 30;
        gridBagConstraints.ipady = 120;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(47, 10, 98, 0);
        cetak_laporan_all_panel.add(cetak_laporan_anggota_panel, gridBagConstraints);

        cetak_laporan_peminjaman_panel.setBackground(new java.awt.Color(62, 80, 80));
        cetak_laporan_peminjaman_panel.setMinimumSize(new java.awt.Dimension(300, 300));
        cetak_laporan_peminjaman_panel.setPreferredSize(new java.awt.Dimension(330, 420));
        cetak_laporan_peminjaman_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        laporan_peminjaman_label.setBackground(new java.awt.Color(25, 120, 165));
        laporan_peminjaman_label.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        laporan_peminjaman_label.setForeground(new java.awt.Color(222, 245, 227));
        laporan_peminjaman_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        laporan_peminjaman_label.setText("LAPORAN PEMINJAMAN & PENGEMBALIAN");
        laporan_peminjaman_label.setToolTipText("");
        laporan_peminjaman_label.setMaximumSize(new java.awt.Dimension(330, 30));
        laporan_peminjaman_label.setMinimumSize(new java.awt.Dimension(330, 30));
        laporan_peminjaman_label.setOpaque(true);
        laporan_peminjaman_label.setPreferredSize(new java.awt.Dimension(330, 30));
        cetak_laporan_peminjaman_panel.add(laporan_peminjaman_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 41));

        cetak_nis_peminjam_label.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        cetak_nis_peminjam_label.setForeground(new java.awt.Color(40, 188, 100));
        cetak_nis_peminjam_label.setText("NIS/NO INDUK");
        cetak_laporan_peminjaman_panel.add(cetak_nis_peminjam_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 100, 20));

        nis_semua_peminjaman.setBackground(new java.awt.Color(62, 80, 80));
        nis_semua_peminjaman.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        nis_semua_peminjaman.setForeground(new java.awt.Color(222, 245, 227));
        nis_semua_peminjaman.setSelected(true);
        nis_semua_peminjaman.setText("Semua");
        cetak_laporan_peminjaman_panel.add(nis_semua_peminjaman, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 80, 20));
        nis_semua_peminjaman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt){
                nis_semua_peminjaman.setSelected(true);
                nis_pilih_peminjaman.setSelected(false);
                nis_pilih_peminjaman_field.setEnabled(false);
            }
        });

        nis_pilih_peminjaman.setBackground(new java.awt.Color(62, 80, 80));
        nis_pilih_peminjaman.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        nis_pilih_peminjaman.setForeground(new java.awt.Color(222, 245, 227));
        nis_pilih_peminjaman.setText("Pilih");
        cetak_laporan_peminjaman_panel.add(nis_pilih_peminjaman, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 80, 20));
        nis_pilih_peminjaman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt){
                nis_semua_peminjaman.setSelected(false);
                nis_pilih_peminjaman.setSelected(true);
                nis_pilih_peminjaman_field.setEnabled(true);
            }
        });

        nis_pilih_peminjaman_field.setBackground(new java.awt.Color(240, 240, 240));
        nis_pilih_peminjaman_field.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        nis_pilih_peminjaman_field.setForeground(new java.awt.Color(109, 109, 109));
        nis_pilih_peminjaman_field.setText("Contoh 1, 1-6 dst");
        nis_pilih_peminjaman_field.setEnabled(false);
        cetak_laporan_peminjaman_panel.add(nis_pilih_peminjaman_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 130, 30));
        nis_pilih_peminjaman_field.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt){
                nis_pilih_peminjaman_field.setForeground(new java.awt.Color(0, 0, 0));
                if(nis_pilih_peminjaman_field.getText().trim().equals("Contoh 1, 1-6 dst")){
                    nis_pilih_peminjaman_field.setText(null);
                }
            }
            public void focusLost(java.awt.event.FocusEvent evt){
                nis_pilih_peminjaman_field.setForeground(new java.awt.Color(109, 109, 109));
                if(nis_pilih_peminjaman_field.getText().trim().equals("")){
                    nis_pilih_peminjaman_field.setText("Contoh 1, 1-6 dst");
                }
            }
        });

        cetak_bulan_peminjam_label.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        cetak_bulan_peminjam_label.setForeground(new java.awt.Color(40, 188, 100));
        cetak_bulan_peminjam_label.setText("BULAN");
        cetak_laporan_peminjaman_panel.add(cetak_bulan_peminjam_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 50, 20));

        cetak_tahun_peminjam_label.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        cetak_tahun_peminjam_label.setForeground(new java.awt.Color(40, 188, 100));
        cetak_tahun_peminjam_label.setText("TAHUN");
        cetak_laporan_peminjaman_panel.add(cetak_tahun_peminjam_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 50, 20));

        bulan_peminjaman.setBackground(new java.awt.Color(240, 240, 240));
        bulan_peminjaman.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        bulan_peminjaman.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Semua", "Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember" }));
        cetak_laporan_peminjaman_panel.add(bulan_peminjaman, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 120, 30));

        tahun_peminjaman.setBackground(new java.awt.Color(240, 240, 240));
        cetak_laporan_peminjaman_panel.add(tahun_peminjaman, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 120, 30));

        cetak_peminjaman_laporan.setBackground(new java.awt.Color(62, 80, 80));
        cetak_peminjaman_laporan.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        cetak_peminjaman_laporan.setForeground(new java.awt.Color(240, 240, 240));
        cetak_peminjaman_laporan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cetak_peminjaman_laporan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_print_light_32.png"))); // NOI18N
        cetak_peminjaman_laporan.setText("CETAK");
        cetak_peminjaman_laporan.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        cetak_peminjaman_laporan.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cetak_peminjaman_laporan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cetak_peminjaman_laporan.setOpaque(true);
        cetak_peminjaman_laporan.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        cetak_laporan_peminjaman_panel.add(cetak_peminjaman_laporan, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, 70, 60));
        cetak_peminjaman_laporan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt){
                cetak_all_peminjamanMousePressed(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt){
                cetak_peminjaman_laporan.setBackground(new java.awt.Color(62,135,114));
                cetak_peminjaman_laporan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_print_32.png")));
                cetak_peminjaman_laporan.setForeground(new java.awt.Color(0,0,0));
            }
            public void mouseExited(java.awt.event.MouseEvent evt){
                cetak_peminjaman_laporan.setBackground(new java.awt.Color(62,80,80));
                cetak_peminjaman_laporan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_print_light_32.png")));
                cetak_peminjaman_laporan.setForeground(new java.awt.Color(240,240,240));
            }
        });

        jScrollPane3.setBorder(null);
        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea3.setEditable(false);
        jTextArea3.setBackground(new java.awt.Color(62, 80, 80));
        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jTextArea3.setForeground(new java.awt.Color(240, 240, 240));
        jTextArea3.setLineWrap(true);
        jTextArea3.setRows(5);
        jTextArea3.setText("ketik 1 untuk print dari 1, ketik 1-6 untuk print dari 1 sampai 6.");
        jTextArea3.setWrapStyleWord(true);
        jScrollPane3.setViewportView(jTextArea3);

        cetak_laporan_peminjaman_panel.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 130, 60));

        jScrollPane4.setBorder(null);
        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane4.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea4.setEditable(false);
        jTextArea4.setBackground(new java.awt.Color(62, 80, 80));
        jTextArea4.setColumns(20);
        jTextArea4.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jTextArea4.setForeground(new java.awt.Color(240, 240, 240));
        jTextArea4.setLineWrap(true);
        jTextArea4.setRows(5);
        jTextArea4.setText("ketik 2021 untuk print dari 2021-sekarang, ketik 2020-2021 untuk print dari 2020 sampai 2021.");
        jTextArea4.setWrapStyleWord(true);
        jScrollPane4.setViewportView(jTextArea4);

        cetak_laporan_peminjaman_panel.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 130, 90));

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 30;
        gridBagConstraints.ipady = 120;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(47, 10, 98, 30);
        cetak_laporan_all_panel.add(cetak_laporan_peminjaman_panel, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CETAK LAPORAN");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 124;
        gridBagConstraints.ipady = 18;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(60, 10, 0, 0);
        cetak_laporan_all_panel.add(jLabel1, gridBagConstraints);

        panels.add(cetak_laporan_all_panel);
        cetak_laporan_all_panel.setVisible(false);

        container.add(panels);

        main_app_panel.add(container, java.awt.BorderLayout.CENTER);

        main_layered_container.add(main_app_panel);

        login_panel.setBackground(new java.awt.Color(12, 120, 182));
        login_panel.setMinimumSize(new java.awt.Dimension(1080, 720));
        login_panel.setLayout(new java.awt.GridBagLayout());

        form_login.setBackground(new java.awt.Color(12, 120, 182));
        form_login.setMaximumSize(new java.awt.Dimension(840, 360));
        form_login.setMinimumSize(new java.awt.Dimension(840, 360));
        form_login.setPreferredSize(new java.awt.Dimension(840, 360));
        form_login.setRequestFocusEnabled(false);
        form_login.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        show_toggle_password_login.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        show_toggle_password_login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_invisible_16.png"))); // NOI18N
        show_toggle_password_login.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        show_toggle_password_login.setMaximumSize(new java.awt.Dimension(20, 20));
        show_toggle_password_login.setMinimumSize(new java.awt.Dimension(20, 20));
        show_toggle_password_login.setPreferredSize(new java.awt.Dimension(20, 20));
        form_login.add(show_toggle_password_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 150, -1, -1));
        show_toggle_password_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt){
                show_toggle_password_login.setVisible(false);
                password_field_log.setEchoChar((char)0);
                hide_toggle_password_login.setVisible(true);
            }
        });

        hide_toggle_password_login.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hide_toggle_password_login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_eye_16.png"))); // NOI18N
        hide_toggle_password_login.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        hide_toggle_password_login.setMaximumSize(new java.awt.Dimension(20, 20));
        hide_toggle_password_login.setMinimumSize(new java.awt.Dimension(20, 20));
        hide_toggle_password_login.setPreferredSize(new java.awt.Dimension(20, 20));
        form_login.add(hide_toggle_password_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 150, -1, -1));
        hide_toggle_password_login.setVisible(false);

        hide_toggle_password_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt){
                show_toggle_password_login.setVisible(true);
                password_field_log.setEchoChar((char)9679);
                hide_toggle_password_login.setVisible(false);
            }
        });

        login_alert_message.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        login_alert_message.setForeground(new java.awt.Color(255, 0, 0));
        login_alert_message.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_box_important-danger_16.png"))); // NOI18N
        form_login.add(login_alert_message, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 220, 350, 20));
        login_alert_message.setVisible(false);

        password_field_log.setBackground(new java.awt.Color(0, 38, 74));
        password_field_log.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        password_field_log.setForeground(new java.awt.Color(193, 193, 193));
        password_field_log.setBorder(null);
        password_field_log.setMaximumSize(new java.awt.Dimension(340, 20));
        password_field_log.setMinimumSize(new java.awt.Dimension(340, 20));
        password_field_log.setPreferredSize(new java.awt.Dimension(340, 20));
        form_login.add(password_field_log, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 150, 320, -1));
        password_field_log.setCaretColor(new java.awt.Color(193,193,193));

        submit_login_btn.setBackground(new java.awt.Color(0, 38, 74));
        submit_login_btn.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        submit_login_btn.setForeground(new java.awt.Color(255, 255, 255));
        submit_login_btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        submit_login_btn.setText("Login");
        submit_login_btn.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        submit_login_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        submit_login_btn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        submit_login_btn.setOpaque(true);
        form_login.add(submit_login_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 240, 80, -1));
        submit_login_btn.addMouseListener(new java.awt.event.MouseAdapter(){
            public void mousePressed(java.awt.event.MouseEvent evt){
                submit_login_btnMousePressed(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt){
                setMenuIconBGColor(submit_login_btn);
            }
            public void mouseExited(java.awt.event.MouseEvent evt){
                resetMenuIconBGColor(submit_login_btn);
            }
        });
        form_login.add(log_sep_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 170, 340, 10));
        form_login.add(log_sep_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 120, 340, 10));

        username_field_log.setBackground(new java.awt.Color(0, 38, 74));
        username_field_log.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        username_field_log.setForeground(new java.awt.Color(193, 193, 193));
        username_field_log.setText("Username...");
        username_field_log.setBorder(null);
        username_field_log.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        username_field_log.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        username_field_log.setFocusable(false);
        username_field_log.setMaximumSize(new java.awt.Dimension(340, 20));
        username_field_log.setMinimumSize(new java.awt.Dimension(340, 20));
        username_field_log.setOpaque(false);
        username_field_log.setPreferredSize(new java.awt.Dimension(340, 20));
        form_login.add(username_field_log, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 100, -1, -1));
        username_field_log.setCaretColor(new java.awt.Color(193,193,193));

        username_field_log.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt){
                if(username_field_log.getText().trim().equals("Username...")){
                    username_field_log.setText("");
                }
            }
            public void focusLost(java.awt.event.FocusEvent evt){
                if(username_field_log.getText().trim().equals("")){
                    username_field_log.setText("Username...");
                }
            }
        });

        register_link_label.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        register_link_label.setForeground(new java.awt.Color(255, 255, 255));
        register_link_label.setText("Belum punya akun?");
        form_login.add(register_link_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 290, -1, -1));

        register_link_btn.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        register_link_btn.setForeground(new java.awt.Color(51, 204, 255));
        register_link_btn.setText("registrasi");
        register_link_btn.setMaximumSize(new java.awt.Dimension(44, 15));
        register_link_btn.setMinimumSize(new java.awt.Dimension(44, 15));
        register_link_btn.setPreferredSize(new java.awt.Dimension(44, 15));
        form_login.add(register_link_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 290, 60, -1));
        register_link_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt){
                register_link_btnMousePressed(evt);
            }
        });

        remember_me.setBackground(new java.awt.Color(0, 39, 71));
        remember_me.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        remember_me.setForeground(new java.awt.Color(255, 255, 255));
        remember_me.setText("Ingat saya");
        remember_me.setBorder(null);
        remember_me.setFocusable(false);
        form_login.add(remember_me, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 190, 90, 20));

        label_password.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        label_password.setForeground(new java.awt.Color(255, 255, 255));
        label_password.setText("Password");
        form_login.add(label_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 130, 90, 20));

        label_username.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        label_username.setForeground(new java.awt.Color(255, 255, 255));
        label_username.setText("Username");
        form_login.add(label_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 80, 90, 20));

        label_login.setBackground(new java.awt.Color(0, 39, 71));
        label_login.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        label_login.setForeground(new java.awt.Color(255, 255, 255));
        label_login.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_login.setText("LOGIN ADMIN");
        label_login.setOpaque(true);
        form_login.add(label_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, 280, 20));

        sma_img_log.setBackground(new java.awt.Color(12, 120, 182));
        sma_img_log.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sma_img_log.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/sma-img-1-round.png"))); // NOI18N
        form_login.add(sma_img_log, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 490, 360));

        bg_input_login.setBackground(new java.awt.Color(12, 120, 182));
        bg_input_login.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bg_input_login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/auth-bg-1-round.png"))); // NOI18N
        form_login.add(bg_input_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 510, 360));

        login_panel.add(form_login, new java.awt.GridBagConstraints());

        main_layered_container.add(login_panel);

        register_panel.setBackground(new java.awt.Color(12, 120, 182));
        register_panel.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        register_panel.setMinimumSize(new java.awt.Dimension(1080, 720));
        register_panel.setLayout(new java.awt.GridBagLayout());

        form_registrasi.setBackground(new java.awt.Color(12, 120, 182));
        form_registrasi.setMaximumSize(new java.awt.Dimension(840, 360));
        form_registrasi.setMinimumSize(new java.awt.Dimension(840, 360));
        form_registrasi.setRequestFocusEnabled(false);
        form_registrasi.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        show_toggle_confirm_pass_reg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        show_toggle_confirm_pass_reg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_invisible_16.png"))); // NOI18N
        show_toggle_confirm_pass_reg.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        show_toggle_confirm_pass_reg.setMaximumSize(new java.awt.Dimension(20, 20));
        show_toggle_confirm_pass_reg.setMinimumSize(new java.awt.Dimension(20, 20));
        show_toggle_confirm_pass_reg.setPreferredSize(new java.awt.Dimension(20, 20));
        form_registrasi.add(show_toggle_confirm_pass_reg, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 190, -1, -1));
        show_toggle_confirm_pass_reg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt){
                show_toggle_confirm_pass_reg.setVisible(false);
                confirm_password_field_reg.setEchoChar((char)0);
                hide_toggle_confirm_pass_reg.setVisible(true);
            }
        });

        hide_toggle_confirm_pass_reg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hide_toggle_confirm_pass_reg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_eye_16.png"))); // NOI18N
        hide_toggle_confirm_pass_reg.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        hide_toggle_confirm_pass_reg.setMaximumSize(new java.awt.Dimension(20, 20));
        hide_toggle_confirm_pass_reg.setMinimumSize(new java.awt.Dimension(20, 20));
        hide_toggle_confirm_pass_reg.setPreferredSize(new java.awt.Dimension(20, 20));
        form_registrasi.add(hide_toggle_confirm_pass_reg, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 190, -1, -1));
        hide_toggle_confirm_pass_reg.setVisible(false);
        hide_toggle_confirm_pass_reg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt){
                show_toggle_confirm_pass_reg.setVisible(true);
                confirm_password_field_reg.setEchoChar((char)9679);
                hide_toggle_confirm_pass_reg.setVisible(false);
            }
        });

        show_toggle_password_reg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        show_toggle_password_reg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_invisible_16.png"))); // NOI18N
        show_toggle_password_reg.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        show_toggle_password_reg.setMaximumSize(new java.awt.Dimension(20, 20));
        show_toggle_password_reg.setMinimumSize(new java.awt.Dimension(20, 20));
        show_toggle_password_reg.setPreferredSize(new java.awt.Dimension(20, 20));
        form_registrasi.add(show_toggle_password_reg, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 190, -1, -1));
        show_toggle_password_reg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt){
                show_toggle_password_reg.setVisible(false);
                password_field_reg.setEchoChar((char)0);
                hide_toggle_password_reg.setVisible(true);
            }
        });

        hide_toggle_password_reg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hide_toggle_password_reg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_eye_16.png"))); // NOI18N
        hide_toggle_password_reg.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        hide_toggle_password_reg.setMaximumSize(new java.awt.Dimension(20, 20));
        hide_toggle_password_reg.setMinimumSize(new java.awt.Dimension(20, 20));
        hide_toggle_password_reg.setPreferredSize(new java.awt.Dimension(20, 20));
        form_registrasi.add(hide_toggle_password_reg, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 190, -1, -1));
        hide_toggle_password_reg.setVisible(false);

        hide_toggle_password_reg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt){
                show_toggle_password_reg.setVisible(true);
                password_field_reg.setEchoChar((char)9679);
                hide_toggle_password_reg.setVisible(false);
            }
        });

        register_alert_message.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        register_alert_message.setForeground(new java.awt.Color(255, 0, 0));
        register_alert_message.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_box_important-danger_16.png"))); // NOI18N
        form_registrasi.add(register_alert_message, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 220, 350, 20));
        register_alert_message.setVisible(false);

        confirm_password_field_reg.setBackground(new java.awt.Color(0, 38, 74));
        confirm_password_field_reg.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        confirm_password_field_reg.setForeground(new java.awt.Color(193, 193, 193));
        confirm_password_field_reg.setBorder(null);
        confirm_password_field_reg.setMaximumSize(new java.awt.Dimension(170, 20));
        confirm_password_field_reg.setMinimumSize(new java.awt.Dimension(170, 20));
        confirm_password_field_reg.setPreferredSize(new java.awt.Dimension(170, 20));
        form_registrasi.add(confirm_password_field_reg, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 190, 150, -1));
        confirm_password_field_reg.setCaretColor(new java.awt.Color(193,193,193));

        password_field_reg.setBackground(new java.awt.Color(0, 38, 74));
        password_field_reg.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        password_field_reg.setForeground(new java.awt.Color(193, 193, 193));
        password_field_reg.setBorder(null);
        password_field_reg.setMaximumSize(new java.awt.Dimension(170, 20));
        password_field_reg.setMinimumSize(new java.awt.Dimension(170, 20));
        password_field_reg.setPreferredSize(new java.awt.Dimension(170, 20));
        form_registrasi.add(password_field_reg, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 190, 150, -1));
        password_field_reg.setCaretColor(new java.awt.Color(193,193,193));

        name_field_reg.setBackground(new java.awt.Color(0, 38, 74));
        name_field_reg.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        name_field_reg.setForeground(new java.awt.Color(193, 193, 193));
        name_field_reg.setText("Nama...");
        name_field_reg.setBorder(null);
        name_field_reg.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        name_field_reg.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        name_field_reg.setFocusable(false);
        name_field_reg.setMaximumSize(new java.awt.Dimension(350, 20));
        name_field_reg.setMinimumSize(new java.awt.Dimension(350, 20));
        name_field_reg.setOpaque(false);
        name_field_reg.setPreferredSize(new java.awt.Dimension(350, 20));
        form_registrasi.add(name_field_reg, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, 350, -1));
        name_field_reg.setCaretColor(new java.awt.Color(193,193,193));

        name_field_reg.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt){
                if(name_field_reg.getText().trim().equals("Nama...")){
                    name_field_reg.setText("");
                }
            }
            public void focusLost(java.awt.event.FocusEvent evt){
                if(name_field_reg.getText().trim().equals("")){
                    name_field_reg.setText("Nama...");
                }
            }
        });

        username_field_reg.setBackground(new java.awt.Color(0, 38, 74));
        username_field_reg.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        username_field_reg.setForeground(new java.awt.Color(193, 193, 193));
        username_field_reg.setText("Username...");
        username_field_reg.setBorder(null);
        username_field_reg.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        username_field_reg.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        username_field_reg.setFocusable(false);
        username_field_reg.setMaximumSize(new java.awt.Dimension(350, 20));
        username_field_reg.setMinimumSize(new java.awt.Dimension(350, 20));
        username_field_reg.setOpaque(false);
        username_field_reg.setPreferredSize(new java.awt.Dimension(350, 20));
        form_registrasi.add(username_field_reg, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, -1, -1));
        username_field_reg.setCaretColor(new java.awt.Color(193,193,193));

        username_field_reg.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt){
                if(username_field_reg.getText().trim().equals("Username...")){
                    username_field_reg.setText("");
                }
            }
            public void focusLost(java.awt.event.FocusEvent evt){
                if(username_field_reg.getText().trim().equals("")){
                    username_field_reg.setText("Username...");
                }
            }
        });
        form_registrasi.add(reg_sep_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, 350, 10));
        form_registrasi.add(reg_sep_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 160, 350, 10));
        form_registrasi.add(reg_sep_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 210, 170, 10));
        form_registrasi.add(reg_sep_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 210, 170, 10));

        label_name_reg.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        label_name_reg.setForeground(new java.awt.Color(255, 255, 255));
        label_name_reg.setText("Nama");
        label_name_reg.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        form_registrasi.add(label_name_reg, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 70, 90, 20));

        label_confirm_password_reg.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        label_confirm_password_reg.setForeground(new java.awt.Color(255, 255, 255));
        label_confirm_password_reg.setText("Konfirmasi Password");
        label_confirm_password_reg.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        form_registrasi.add(label_confirm_password_reg, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 170, 150, 20));

        login_link_label.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        login_link_label.setForeground(new java.awt.Color(255, 255, 255));
        login_link_label.setText("Sudah punya akun?");
        form_registrasi.add(login_link_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 290, -1, -1));

        login_link_btn.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        login_link_btn.setForeground(new java.awt.Color(51, 204, 255));
        login_link_btn.setText("login");
        login_link_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        login_link_btn.setMaximumSize(new java.awt.Dimension(22, 15));
        login_link_btn.setMinimumSize(new java.awt.Dimension(22, 15));
        login_link_btn.setPreferredSize(new java.awt.Dimension(22, 15));
        form_registrasi.add(login_link_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 290, 30, -1));
        login_link_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt){
                login_link_btnMousePressed(evt);
            }
        });

        submit_register_btn.setBackground(new java.awt.Color(0, 38, 74));
        submit_register_btn.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        submit_register_btn.setForeground(new java.awt.Color(255, 255, 255));
        submit_register_btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        submit_register_btn.setText("Register");
        submit_register_btn.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        submit_register_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        submit_register_btn.setOpaque(true);
        form_registrasi.add(submit_register_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 240, 80, -1));
        submit_register_btn.addMouseListener(new java.awt.event.MouseAdapter(){
            public void mousePressed(java.awt.event.MouseEvent evt){
                submit_register_btnMousePressed(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt){
                setMenuIconBGColor(submit_register_btn);
            }
            public void mouseExited(java.awt.event.MouseEvent evt){
                resetMenuIconBGColor(submit_register_btn);
            }
        });

        label_password_reg.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        label_password_reg.setForeground(new java.awt.Color(255, 255, 255));
        label_password_reg.setText("Password");
        label_password_reg.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        form_registrasi.add(label_password_reg, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 170, 90, 20));

        label_username_reg.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        label_username_reg.setForeground(new java.awt.Color(255, 255, 255));
        label_username_reg.setText("Username");
        label_username_reg.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        form_registrasi.add(label_username_reg, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 120, 90, 20));

        label_register.setBackground(new java.awt.Color(0, 39, 71));
        label_register.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        label_register.setForeground(new java.awt.Color(255, 255, 255));
        label_register.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_register.setText("REGISTRASI ADMIN");
        label_register.setOpaque(true);
        form_registrasi.add(label_register, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, 280, 20));

        sma_img_reg.setBackground(new java.awt.Color(12, 120, 182));
        sma_img_reg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sma_img_reg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/sma-img-1-round.png"))); // NOI18N
        form_registrasi.add(sma_img_reg, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 490, 360));

        bg_input_register.setBackground(new java.awt.Color(12, 120, 182));
        bg_input_register.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bg_input_register.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/auth-bg-1-round.png"))); // NOI18N
        form_registrasi.add(bg_input_register, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 510, 360));

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        register_panel.add(form_registrasi, gridBagConstraints);

        main_layered_container.add(register_panel);

        getContentPane().add(main_layered_container);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buku_filechooserMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buku_filechooserMousePressed
        int action = openFile.showOpenDialog(this);
        if(action == JFileChooser.APPROVE_OPTION){
            String path_to_file = openFile.getSelectedFile().toString();
            preview_buku_baru.setIcon(new ImageIcon(
                    new ImageIcon(path_to_file)
                    .getImage()
                    .getScaledInstance(preview_buku_baru.getWidth(), preview_buku_baru.getHeight(), Image.SCALE_SMOOTH)
                    ));  
            path_image_buku = path_to_file;
        }
    }//GEN-LAST:event_buku_filechooserMousePressed

    private void anggota_filechooserMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_anggota_filechooserMousePressed
        int action = openFile.showOpenDialog(this);
        if(action == JFileChooser.APPROVE_OPTION){
            String path_to_file = openFile.getSelectedFile().toString();
            preview_anggota_baru.setIcon(new ImageIcon(
                    new ImageIcon(path_to_file)
                    .getImage()
                    .getScaledInstance(preview_anggota_baru.getWidth(), preview_anggota_baru.getHeight(), Image.SCALE_SMOOTH)
                    ));   
            path_image_anggota = path_to_file;
        }
    }//GEN-LAST:event_anggota_filechooserMousePressed

    private void buku_edit_filechooserMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buku_edit_filechooserMousePressed
        int action = openFile.showOpenDialog(this);
        if(action == JFileChooser.APPROVE_OPTION){
            String path_to_file = openFile.getSelectedFile().toString();
            preview_buku_edit.setIcon(new ImageIcon(
                    new ImageIcon(path_to_file)
                    .getImage()
                    .getScaledInstance(preview_buku_edit.getWidth(), preview_buku_edit.getHeight(), Image.SCALE_SMOOTH)
                    ));  
            path_image_buku_edit = path_to_file;
        }
    }//GEN-LAST:event_buku_edit_filechooserMousePressed

    private void anggota_edit_filechooserMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_anggota_edit_filechooserMousePressed
        int action = openFile.showOpenDialog(this);
        if(action == JFileChooser.APPROVE_OPTION){
            String path_to_file = openFile.getSelectedFile().toString();
            preview_anggota_edit.setIcon(new ImageIcon(
                    new ImageIcon(path_to_file)
                    .getImage()
                    .getScaledInstance(preview_anggota_edit.getWidth(), preview_anggota_edit.getHeight(), Image.SCALE_SMOOTH)
                    ));  
            path_image_anggota_edit = path_to_file;
        }
    }//GEN-LAST:event_anggota_edit_filechooserMousePressed
    
//    Buttons
    protected void login_link_btnMousePressed(java.awt.event.MouseEvent evt){showLoginForm();}
    protected void register_link_btnMousePressed(java.awt.event.MouseEvent evt){showRegistrationForm();}
    protected void submit_login_btnMousePressed(java.awt.event.MouseEvent evt){}
    protected void submit_register_btnMousePressed(java.awt.event.MouseEvent evt){}
    protected void export_btnMousePressed(java.awt.event.MouseEvent evt){}
//    Buttons buku
    protected void insert_buku_baruMousePressed(java.awt.event.MouseEvent evt){}
    protected void reset_buku_baruMousePressed(java.awt.event.MouseEvent evt){}
    protected void edit_buku_btnMousePressed(java.awt.event.MouseEvent evt){}
    protected void update_bukuMousePressed(java.awt.event.MouseEvent evt){}
    protected void reset_buku_editMousePressed(java.awt.event.MouseEvent evt){}
    protected void hapus_buku_btnMousePressed(java.awt.event.MouseEvent evt){}
    protected void cetak_laporan_buku_btnMousePressed(java.awt.event.MouseEvent evt){}
//    Buttons peminjaman & pengembalian
    protected void insert_peminjamanMousePressed(java.awt.event.MouseEvent evt){}
    protected void reset_peminjamanMousePressed(java.awt.event.MouseEvent evt){}
    protected void edit_peminjamanMousePressed(java.awt.event.MouseEvent evt){}
    protected void hapus_peminjamanMousePressed(java.awt.event.MouseEvent evt){}
    protected void cetak_peminjamanMousePressed(java.awt.event.MouseEvent evt){}
    protected void reset_pengembalianMousePressed(java.awt.event.MouseEvent evt){}
    protected void insert_pengembalianMousePressed(java.awt.event.MouseEvent evt){}
//    Buttons anggota
    protected void insert_anggota_baruMousePressed(java.awt.event.MouseEvent evt){}
    protected void reset_anggota_baruMousePressed(java.awt.event.MouseEvent evt){}
    protected void edit_anggotaMousePressed(java.awt.event.MouseEvent evt){}
    protected void update_anggotaMousePressed(java.awt.event.MouseEvent evt){}
    protected void reset_anggota_editMousePressed(java.awt.event.MouseEvent evt){}
    protected void hapus_anggotaMousePressed(java.awt.event.MouseEvent evt){}
    protected void cetak_laporan_anggotaMousePressed(java.awt.event.MouseEvent evt){}
    protected void show_kartu_anggotaMousePressed(java.awt.event.MouseEvent evt){}
    protected void show_formulir_pendaftaranMousePressed(java.awt.event.MouseEvent evt){}
    
//    Cetak laporan
    protected void cetak_all_bukuMousePressed(java.awt.event.MouseEvent evt){}
    protected void cetak_all_anggotaMousePressed(java.awt.event.MouseEvent evt){}
    protected void cetak_all_peminjamanMousePressed(java.awt.event.MouseEvent evt){}
//    Buttons's Icon Menu
    protected final void menu_iconMousePressed(java.awt.event.MouseEvent evt){sideBarToggle();}
    protected final void signout_iconMousePressed(java.awt.event.MouseEvent evt){logout();}
    protected final void home_iconMousePressed(java.awt.event.MouseEvent evt){showHomePanel();} 
    protected final void buku_iconMousePressed(java.awt.event.MouseEvent evt){showBukuPanel();}
    protected final void anggota_iconMousePressed(java.awt.event.MouseEvent evt){showAnggotaPanel();}
    protected final void peminjaman_iconMousePressed(java.awt.event.MouseEvent evt){showPeminjamanPengembalianPanel();}
    protected final void cetak_laporan_all_iconMousePressed(java.awt.event.MouseEvent evt){showCetakLaporanAllPanel();}
//    Buttons's Label Menu
    protected final void signout_labelMousePressed(java.awt.event.MouseEvent evt){logout();}
    protected final void home_labelMousePressed(java.awt.event.MouseEvent evt){showHomePanel();}
    protected final void buku_labelMousePressed(java.awt.event.MouseEvent evt){showBukuPanel();}
    protected final void anggota_labelMousePressed(java.awt.event.MouseEvent evt){showAnggotaPanel();}
    protected final void peminjaman_labelMousePressed(java.awt.event.MouseEvent evt){showPeminjamanPengembalianPanel();}
    protected final void cetak_laporan_all_labelMousePressed(java.awt.event.MouseEvent evt){showCetakLaporanAllPanel();}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JPanel FormPendaftaranAnggota;
    protected javax.swing.JPanel IDCard;
    protected javax.swing.JLabel administrator_name;
    protected javax.swing.JTextField alamat_anggota_filter;
    private javax.swing.JLabel alamat_anggota_label;
    protected javax.swing.JTextField alamat_baru;
    protected javax.swing.JTextField alamat_edit;
    protected javax.swing.JLabel anggota_baru;
    protected javax.swing.JLabel anggota_baru_alert_message;
    protected javax.swing.JPanel anggota_btn_navigator;
    protected javax.swing.JLabel anggota_edit_alert_message;
    protected javax.swing.JButton anggota_edit_filechooser;
    protected javax.swing.JButton anggota_filechooser;
    protected javax.swing.JLabel anggota_icon;
    protected javax.swing.JLabel anggota_label;
    protected javax.swing.JPanel anggota_panel;
    protected javax.swing.JPanel anggota_panel_container_crud;
    protected javax.swing.JPanel anggota_panel_left;
    protected javax.swing.JPanel anggota_panel_right;
    protected javax.swing.JPanel anggota_panel_title;
    protected javax.swing.JLabel anggota_panel_title_label;
    protected javax.swing.JTable anggota_tabel;
    protected javax.swing.JPanel anggota_tabel_action_panel;
    protected javax.swing.JScrollPane anggota_tabel_panel;
    protected javax.swing.JRadioButton back;
    protected javax.swing.JLabel bg_header_home;
    protected javax.swing.JLabel bg_input_login;
    protected javax.swing.JLabel bg_input_register;
    protected javax.swing.JLabel buku_baru;
    protected javax.swing.JLabel buku_baru_alert_message;
    protected javax.swing.JPanel buku_btn_navigator;
    protected javax.swing.JLabel buku_edit_alert_message;
    protected javax.swing.JButton buku_edit_filechooser;
    protected javax.swing.JButton buku_filechooser;
    protected javax.swing.JLabel buku_icon;
    protected javax.swing.JLabel buku_kembali_alert_message;
    protected javax.swing.JLabel buku_label;
    protected javax.swing.JPanel buku_panel;
    protected javax.swing.JPanel buku_panel_container_crud;
    protected javax.swing.JPanel buku_panel_left;
    protected javax.swing.JPanel buku_panel_right;
    protected javax.swing.JPanel buku_panel_title;
    protected javax.swing.JLabel buku_panel_title_label;
    protected javax.swing.JRadioButton buku_pilih;
    protected javax.swing.JTextField buku_pilih_field;
    protected javax.swing.JLabel buku_pinjam_alert_message;
    protected javax.swing.JRadioButton buku_semua;
    protected javax.swing.JTable buku_tabel;
    protected javax.swing.JPanel buku_tabel_action_panel;
    protected javax.swing.JScrollPane buku_tabel_panel;
    protected javax.swing.JComboBox<String> bulan_peminjaman;
    protected javax.swing.JPanel card_anggota;
    protected javax.swing.JPanel card_buku;
    protected javax.swing.JLabel card_header_anggota;
    protected javax.swing.JLabel card_header_buku;
    protected javax.swing.JLabel card_header_peminjam;
    protected javax.swing.JPanel card_peminjam;
    protected javax.swing.JLabel cetak_anggota_laporan;
    protected javax.swing.JLabel cetak_buku_laporan;
    private javax.swing.JLabel cetak_bulan_peminjam_label;
    protected javax.swing.JLabel cetak_laporan_all_icon;
    protected javax.swing.JLabel cetak_laporan_all_label;
    protected javax.swing.JPanel cetak_laporan_all_panel;
    protected javax.swing.JButton cetak_laporan_anggota_btn;
    protected javax.swing.JPanel cetak_laporan_anggota_panel;
    protected javax.swing.JButton cetak_laporan_buku_btn;
    protected javax.swing.JPanel cetak_laporan_buku_panel;
    protected javax.swing.JButton cetak_laporan_peminjaman_btn;
    protected javax.swing.JPanel cetak_laporan_peminjaman_panel;
    private javax.swing.JLabel cetak_nis_label;
    private javax.swing.JLabel cetak_nis_peminjam_label;
    private javax.swing.JLabel cetak_no_buku_label;
    protected javax.swing.JLabel cetak_peminjaman_laporan;
    private javax.swing.JLabel cetak_tahun_peminjam_label;
    protected javax.swing.JPasswordField confirm_password_field_reg;
    protected javax.swing.JPanel container;
    protected javax.swing.JLabel edit_anggota;
    protected javax.swing.JButton edit_anggota_btn;
    protected javax.swing.JLabel edit_buku;
    protected javax.swing.JButton edit_buku_btn;
    protected javax.swing.JButton edit_peminjaman_btn;
    private javax.swing.JLabel filter_anggota_title;
    private javax.swing.JLabel filter_buku_title;
    private javax.swing.JLabel filter_peminjaman_buku_title;
    private javax.swing.JPanel form_anggota_baru;
    protected javax.swing.JPanel form_buku_baru;
    private javax.swing.JPanel form_edit_anggota;
    private javax.swing.JPanel form_edit_buku;
    protected javax.swing.JPanel form_login;
    protected javax.swing.JPanel form_peminjaman_buku;
    protected javax.swing.JPanel form_pengembalian_buku;
    protected javax.swing.JPanel form_registrasi;
    protected javax.swing.JRadioButton front;
    protected javax.swing.JButton hapus_anggota_btn;
    protected javax.swing.JButton hapus_buku_btn;
    protected javax.swing.JButton hapus_peminjaman_btn;
    private javax.swing.JLabel hide_toggle_confirm_pass_reg;
    private javax.swing.JLabel hide_toggle_password_login;
    private javax.swing.JLabel hide_toggle_password_reg;
    protected javax.swing.JPanel home_header;
    protected javax.swing.JLabel home_icon;
    protected javax.swing.JLabel home_label;
    protected javax.swing.JPanel home_panel;
    protected javax.swing.JPanel home_section;
    protected javax.swing.JTextField id_anggota_filter;
    private javax.swing.JLabel id_anggota_filter_label;
    protected javax.swing.JTextField id_anggota_pinjam;
    protected javax.swing.JTextField id_pinjam;
    protected javax.swing.JTextField id_siswa_edit;
    protected javax.swing.JButton insert_anggota_baru;
    protected javax.swing.JButton insert_buku_baru;
    protected javax.swing.JButton insert_peminjaman;
    protected javax.swing.JButton insert_pengembalian;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    protected javax.swing.JComboBox<String> jenis_kelamin_baru;
    protected javax.swing.JComboBox<String> jenis_kelamin_edit;
    protected javax.swing.JTextField jk_anggota_filter;
    private javax.swing.JLabel jk_anggota_label;
    protected javax.swing.JTextField judul_buku_baru;
    protected javax.swing.JTextField judul_buku_edit;
    protected javax.swing.JTextField judul_buku_filter;
    private javax.swing.JLabel judul_buku_label;
    protected javax.swing.JTextArea jumlah_anggota;
    protected javax.swing.JLabel jumlah_anggota_label;
    protected javax.swing.JScrollPane jumlah_anggota_panel;
    protected javax.swing.JTextArea jumlah_buku;
    protected javax.swing.JLabel jumlah_buku_label;
    protected javax.swing.JScrollPane jumlah_buku_panel;
    protected javax.swing.JTextArea jumlah_peminjam;
    protected javax.swing.JScrollPane jumlah_peminjam_panel;
    private javax.swing.JLabel jumlah_peminjaman_label;
    protected javax.swing.JComboBox<String> kelas_1_pinjam;
    protected javax.swing.JComboBox<String> kelas_2_pinjam;
    protected javax.swing.JComboBox<String> kelas_3_pinjam;
    protected javax.swing.JTextField kelas_filter;
    private javax.swing.JLabel kelas_label;
    protected javax.swing.JTextField kep;
    private javax.swing.JLabel kep_form_pendaftaran_label;
    protected javax.swing.JTextField kep_fp;
    private javax.swing.JLabel kep_label;
    protected javax.swing.JTextField kode_pos_baru;
    protected javax.swing.JTextField kode_pos_edit;
    private javax.swing.JLabel labe_jenis_kelaminl_edit;
    private javax.swing.JLabel label_alamat_baru;
    private javax.swing.JLabel label_alamat_edit;
    protected javax.swing.JLabel label_confirm_password_reg;
    private javax.swing.JLabel label_id_anggota_pinjam;
    private javax.swing.JLabel label_id_pinjam;
    private javax.swing.JLabel label_id_siswa_edit;
    private javax.swing.JLabel label_jenis_kelamin_baru;
    private javax.swing.JLabel label_judul_buku_baru;
    private javax.swing.JLabel label_judul_buku_edit;
    private javax.swing.JLabel label_kelas_pinjam;
    private javax.swing.JLabel label_kode_pos_baru;
    private javax.swing.JLabel label_kode_pos_edit;
    private javax.swing.JLabel label_lama_peminjaman_buku;
    protected javax.swing.JLabel label_login;
    private javax.swing.JLabel label_nama_siswa_baru;
    private javax.swing.JLabel label_nama_siswa_edit;
    protected javax.swing.JLabel label_name_reg;
    private javax.swing.JLabel label_nis_baru;
    private javax.swing.JLabel label_nis_edit;
    private javax.swing.JLabel label_no_buku_pinjam;
    private javax.swing.JLabel label_no_invent_baru;
    private javax.swing.JLabel label_no_invent_edit;
    private javax.swing.JLabel label_no_isbn_baru;
    private javax.swing.JLabel label_no_isbn_edit;
    private javax.swing.JLabel label_no_telp_baru;
    private javax.swing.JLabel label_no_telp_edit;
    protected javax.swing.JLabel label_password;
    protected javax.swing.JLabel label_password_reg;
    protected javax.swing.JLabel label_penerbit_buku_baru;
    private javax.swing.JLabel label_penerbit_edit;
    private javax.swing.JLabel label_pengarang_buku_baru;
    private javax.swing.JLabel label_pengarang_edit;
    protected javax.swing.JLabel label_register;
    private javax.swing.JLabel label_tanggal_kembali;
    private javax.swing.JLabel label_tanggal_lahir_baru;
    private javax.swing.JLabel label_tanggal_lahir_edit;
    private javax.swing.JLabel label_tanggal_pinjam;
    protected javax.swing.JLabel label_username;
    protected javax.swing.JLabel label_username_reg;
    protected javax.swing.JComboBox<String> lama_peminjaman_buku;
    private javax.swing.JLabel laporan_anggota_label;
    private javax.swing.JLabel laporan_buku_label;
    private javax.swing.JLabel laporan_peminjaman_label;
    protected javax.swing.JSeparator log_sep_1;
    protected javax.swing.JSeparator log_sep_2;
    protected javax.swing.JLabel login_alert_message;
    protected javax.swing.JLabel login_link_btn;
    protected javax.swing.JLabel login_link_label;
    protected javax.swing.JPanel login_panel;
    protected javax.swing.JLabel logo_label;
    protected javax.swing.JPanel main_app_panel;
    protected javax.swing.JLayeredPane main_layered_container;
    protected javax.swing.JLabel menu_icon;
    protected javax.swing.JTextField nama_anggota_filter;
    private javax.swing.JLabel nama_anggota_label;
    protected javax.swing.JTextField nama_siswa_baru;
    protected javax.swing.JTextField nama_siswa_edit;
    protected javax.swing.JTextField nama_siswa_filter;
    private javax.swing.JLabel nama_siswa_filter_label;
    protected javax.swing.JTextField name_field_reg;
    protected javax.swing.JPanel navbar;
    protected javax.swing.JTextField nip;
    private javax.swing.JLabel nip_form_pendaftaran_label;
    protected javax.swing.JTextField nip_fp;
    private javax.swing.JLabel nip_label;
    protected javax.swing.JTextField nis_anggota_filter;
    private javax.swing.JLabel nis_anggota_label;
    protected javax.swing.JTextField nis_baru;
    protected javax.swing.JTextField nis_edit;
    protected javax.swing.JRadioButton nis_pilih;
    protected javax.swing.JTextField nis_pilih_field;
    protected javax.swing.JRadioButton nis_pilih_peminjaman;
    protected javax.swing.JTextField nis_pilih_peminjaman_field;
    protected javax.swing.JRadioButton nis_semua;
    protected javax.swing.JRadioButton nis_semua_peminjaman;
    protected javax.swing.JTextField no_buku_pinjam;
    protected javax.swing.JTextField no_induk_filter;
    private javax.swing.JLabel no_induk_label;
    protected javax.swing.JTextField no_invent_baru;
    protected javax.swing.JTextField no_invent_edit;
    protected javax.swing.JTextField no_inventaris_filter;
    private javax.swing.JLabel no_inventaris_label;
    protected javax.swing.JTextField no_isbn_baru;
    protected javax.swing.JTextField no_isbn_edit;
    protected javax.swing.JTextField no_isbn_filter;
    private javax.swing.JLabel no_isbn_filter_label;
    protected javax.swing.JTextField no_telp_baru;
    protected javax.swing.JTextField no_telp_edit;
    private javax.swing.JFileChooser openFile;
    protected javax.swing.JLayeredPane panels;
    protected javax.swing.JPasswordField password_field_log;
    protected javax.swing.JPasswordField password_field_reg;
    private javax.swing.JPanel peminjaman_btn_navigator;
    protected javax.swing.JLabel peminjaman_buku;
    protected javax.swing.JLabel peminjaman_icon;
    protected javax.swing.JLabel peminjaman_label;
    protected javax.swing.JPanel peminjaman_panel;
    private javax.swing.JPanel peminjaman_panel_container_crud;
    protected javax.swing.JPanel peminjaman_panel_left;
    private javax.swing.JPanel peminjaman_panel_right;
    private javax.swing.JLabel peminjaman_panel_titile_label;
    private javax.swing.JPanel peminjaman_panel_title;
    protected javax.swing.JTable peminjaman_tabel;
    protected javax.swing.JPanel peminjaman_tabel_action_panel;
    protected javax.swing.JScrollPane peminjaman_tabel_panel;
    protected javax.swing.JTextField penerbit_buku_baru;
    protected javax.swing.JTextField penerbit_buku_edit;
    protected javax.swing.JTextField penerbit_buku_filter;
    private javax.swing.JLabel penerbit_filter_label;
    protected javax.swing.JTextField pengarang_buku_baru;
    protected javax.swing.JTextField pengarang_buku_edit;
    protected javax.swing.JTextField pengarang_buku_filter;
    private javax.swing.JLabel pengarang_filter_label;
    protected javax.swing.JLabel pengembalian_buku;
    private javax.swing.JLabel petunjuk_filter_anggota;
    private javax.swing.JLabel petunjuk_filter_buku;
    private javax.swing.JLabel petunjuk_filter_peminjaman_buku;
    protected javax.swing.JLabel preview_anggota_baru;
    protected javax.swing.JLabel preview_anggota_edit;
    protected javax.swing.JLabel preview_buku_baru;
    protected javax.swing.JLabel preview_buku_edit;
    protected javax.swing.JSeparator reg_sep_1;
    protected javax.swing.JSeparator reg_sep_2;
    protected javax.swing.JSeparator reg_sep_3;
    protected javax.swing.JSeparator reg_sep_4;
    protected javax.swing.JLabel register_alert_message;
    protected javax.swing.JLabel register_link_btn;
    protected javax.swing.JLabel register_link_label;
    protected javax.swing.JPanel register_panel;
    protected javax.swing.JCheckBox remember_me;
    protected javax.swing.JButton reset_baru_anggota;
    protected javax.swing.JButton reset_buku_baru;
    protected javax.swing.JButton reset_buku_edit;
    protected javax.swing.JButton reset_edit_anggota;
    protected javax.swing.JButton reset_peminjaman;
    protected javax.swing.JButton reset_pengembalian;
    protected javax.swing.JPanel search_anggota_panel;
    protected javax.swing.JPanel search_buku_panel;
    protected javax.swing.JPanel search_peminjaman_panel;
    protected javax.swing.JLabel show_formulir_pendaftaran;
    protected javax.swing.JLabel show_kartu_anggota;
    private javax.swing.JLabel show_toggle_confirm_pass_reg;
    private javax.swing.JLabel show_toggle_password_login;
    private javax.swing.JLabel show_toggle_password_reg;
    protected javax.swing.JPanel sidebar_icons;
    protected javax.swing.JPanel sidebar_labels;
    protected javax.swing.JLabel signout_icon;
    protected javax.swing.JLabel signout_label;
    protected javax.swing.JLabel sma_img_log;
    protected javax.swing.JLabel sma_img_reg;
    protected javax.swing.JLabel sma_label;
    protected javax.swing.JLabel sma_logo;
    protected javax.swing.JLabel status_telat_alert_message;
    protected javax.swing.JLabel submit_login_btn;
    protected javax.swing.JLabel submit_register_btn;
    protected javax.swing.JTextField tahun_peminjaman;
    protected com.toedter.calendar.JDateChooser tanggal_kembali;
    protected javax.swing.JTextField tanggal_kembali_filter;
    private javax.swing.JLabel tanggal_kembali_filter_label;
    protected com.toedter.calendar.JDateChooser tanggal_lahir_baru;
    protected com.toedter.calendar.JDateChooser tanggal_lahir_edit;
    protected com.toedter.calendar.JDateChooser tanggal_pinjam;
    protected javax.swing.JTextField tanggal_pinjam_filter;
    private javax.swing.JLabel tanggal_pinjam_filter_label;
    protected javax.swing.JTextField tl_anggota_filter;
    private javax.swing.JLabel tl_anggota_label;
    private javax.swing.JLabel tp_form_pendaftaran_label;
    protected javax.swing.JTextField tp_fp;
    protected javax.swing.JButton update_anggota;
    protected javax.swing.JButton update_buku;
    protected javax.swing.JTextField username_field_log;
    protected javax.swing.JTextField username_field_reg;
    // End of variables declaration//GEN-END:variables
}
