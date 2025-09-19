package Class;

import java.util.ArrayList;
import java.util.Scanner;

public class KhachSan {
    // thuoc tinh
    private ArrayList<KhachTro> ds;

    // phuong thuc
    // ham khoi tao
    public KhachSan() {
        ds = new ArrayList<KhachTro>(10);
    }

    // ham them khach tro vao khach san
    public void themKhachTro(KhachTro kt) {
        ds.add(kt);
    }

    // ham nhap danh sach
    public void nhapDanhSach(Scanner sc) {
        KhachTro khach;

        System.out.print("Nhap vao so luong khach: ");
        int n_321 = sc.nextInt();
        sc.nextLine();

        System.out.println("Nhap vao thong tin khach tro:");
        for (int i = 0; i < n_321; i++) {
            System.out.println("Khach tro thu " + (i + 1) + " la:");
            khach = new KhachTro();
            khach.nhapThongTin(sc);
            themKhachTro(khach);
        }
    }

    // ham hien thi
    public void hienThiDanhSach() {
        for (KhachTro khach : ds) {
            khach.hienThiThongTin();
        }
    }

    // ham tinh tien
    public double tinhTien(int CMND) {
        double tien_321 = 0;

        for (KhachTro khach : ds) {
            if (khach.getCMND() == CMND) {
                tien_321 = khach.getSoNgayTro() * khach.getGiaPhong();
            }
        }

        return tien_321;
    }
}
