package Testing;

import java.util.Scanner;

import Class.QuanLy;

public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        QuanLy ql_321 = new QuanLy();

        ql_321.nhapDanhSach(sc);

        System.out.println("Danh sach sinh vien tra sach vao cuoi thang:");
        ql_321.hienThiDanhSachTraCuoiThang();

        sc.close();
    }

}
