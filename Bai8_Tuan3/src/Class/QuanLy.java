package Class;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLy {
    // thuoc tinh
    private ArrayList<CBGV> ds;

    // phuong thuc
    // ham khoi tao
    public QuanLy() {
        ds = new ArrayList<CBGV>(10);
    }

    // ham them can bo vao danh sach
    public void themCBGV(CBGV canBo) {
        ds.add(canBo);
    }

    // ham nhap vao danh sach
    public void nhapDanhSach(Scanner sc) {
        CBGV canBo;

        System.out.print("Nhap vao so luong can bo: ");
        int n_321 = sc.nextInt();
        sc.nextLine();

        System.out.println("Nhap vao danh sach:");
        for (int i = 0; i < n_321; i++) {
            System.out.println("Can bo thu " + (i + 1) + " la:");
            canBo = new CBGV();
            canBo.nhapThongTin(sc);
            themCBGV(canBo);
        }
    }

    // ham hien thi danh sach
    public void hienThiDanhSach() {
        for (CBGV cb : ds) {
            cb.hienThiThongTin();
        }
    }

    // ham tim kiem
    public void timKiem(double luong_321) {
        for (CBGV cb : ds) {
            if (cb.getLuongThucLinh() >= luong_321) {
                cb.hienThiThongTin();
            }
        }
    }
}
