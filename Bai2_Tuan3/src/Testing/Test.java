package Testing;

import java.util.Scanner;
import Class.QLCB;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        QLCB qlcb = new QLCB();
        qlcb.nhapDanhSach(sc);

        System.out.print("Nhap vao ho ten tim kiem: ");
        String name_321 = sc.nextLine();
        qlcb.timKiemCanBo(name_321);

        sc.close();

    }
}
