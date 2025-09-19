package Class;

import java.util.Scanner;

public class CanBo {
    //thuoc tinh
    private String hoTen;
    private String ngaySinh;
    private String gioiTinh;
    private String diaChi;

    //phuong thuc

    //ham khoi tao khong doi so
    public CanBo() {}

    //ham khoi tao co doi so
    public CanBo(String hoTen, String ngaySinh, String gioiTinh, String diaChi) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
    }

    //ham nhap
    public void nhapThongTin(Scanner sc) {
        System.out.print("\t Nhap vao ho ten: ");
        hoTen = sc.nextLine();
        System.out.print("\t Nhap vao ngay sinh (dd/MM/yyyy): ");
        ngaySinh = sc.nextLine();
        System.out.print("\t Nhap vao gioi tinh: ");
        gioiTinh = sc.nextLine();
        System.out.print("\t Nhap vao dia chi: ");
        diaChi = sc.nextLine();
    }

    public void hienThiThongTin() {
        System.out.println("\nHo ten: "+hoTen);
        System.out.println("\nngay sinh: "+ngaySinh);
        System.out.println("\ngioi tinh: "+gioiTinh);
        System.out.println("\ndia chi: "+diaChi);
    }

    //ham lay thong tin ho ten

    public String getHoTen() {
        return this.hoTen;
    }
}
