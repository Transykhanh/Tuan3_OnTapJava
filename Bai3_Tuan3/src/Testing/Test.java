package Testing;

import java.util.Scanner;
import Class.QuanLySach;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        QuanLySach qls = new QuanLySach();
        qls.nhapDanhSachTL(sc);

        System.out.print("\n\nNhap vao loai tai lieu can tim: ");
        String loai_321 = sc.nextLine();
        qls.timLoaiTL(loai_321);

        System.out.print("\n\nNhap vao ma tai lieu can tim: ");
        String maTL_321 = sc.nextLine();
        qls.timMaTL(maTL_321);

        sc.close();
    }
}
