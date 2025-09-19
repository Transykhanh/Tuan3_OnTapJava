package Class;

import java.util.Scanner;

public class CongNhan extends CanBo {
    //thuoc tinh
    private String bac;

    //phuong thuc
    //ham khoi tao khong doi so
    public CongNhan() {}

    //ham khoi tao co doi so
    public CongNhan(String hoTen, String ngaySinh, String gioiTinh, String diaChi, String bac) {
        super(hoTen, ngaySinh, gioiTinh, diaChi);
        this.bac = bac;
    }

    //ham nhap
    public void nhapThongTin(Scanner sc) {
        super.nhapThongTin(sc);
        System.out.print("\tNhap bac: ");
        bac = sc.nextLine();
    }

    //ham hien thi
    public void hienThiThongTin(){
        super.hienThiThongTin();
        System.out.print("\tBac: "+bac);
    }
}
