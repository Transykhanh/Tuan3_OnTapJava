package BuildClass;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLy {
    // Thuoc tinh
    private ArrayList<BienLai> ds;

    // Phuong thuc
    // Ham khoi tao
    public QuanLy() {
        ds = new ArrayList<BienLai>(10);
    }

    // Ham them bien lai vao danh sach
    public void themBienLai(BienLai bienLai) {
        ds.add(bienLai);
    }

    // Ham nhap danh sach
    public void nhapDanhSach(Scanner sc) {
        BienLai bienLai_321;
        System.out.print("Nhap vao so luong bien lai: ");
        int n_321 = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap vao danh sach bien lai:");
        for (int i = 0; i < n_321; i++) {
            System.out.println("Bien lai thu " + (i + 1) + " la:");
            bienLai_321 = new BienLai();
            bienLai_321.nhapThongTin(sc);

            themBienLai(bienLai_321);
        }
    }

    // Ham hien thi danh sach
    public void hienThiDanhSach() {
        for (int i = 0; i < ds.size(); i++) {
            System.out.println("Bien lai thu " + (i + 1) + " la:");
            ds.get(i).hienThiThongTin();
            System.out.println();
        }
    }
}
