package Class;

import java.util.Scanner;

public class NhanVien extends CanBo {
    //thuoc tinh
    private String congViec;
    //phuong thuc
    //ham khoi tao khong doi so
    public NhanVien() {}

    //ham khoi tao co doi so


    public NhanVien(String hoTen, String ngaySinh, String gioiTinh, String diaChi, String congViec) {
        super(hoTen, ngaySinh, gioiTinh, diaChi);
        this.congViec = congViec;
    }

    //ham nhap thong tin
    public void nhapThongTin(Scanner sc) {
        super.nhapThongTin(sc);
        System.out.println("\tNhap cong viec: "); congViec = sc.nextLine();
    }

    //ham hien thi
    public void hienThiThongTin(){
        super.hienThiThongTin();
        System.out.print("\tCong viec: " + congViec);
    }
}
