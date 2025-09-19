package Test;
import java.util.Scanner;
import Class.PhanSo;

public class TestClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PhanSo ps1_321=new PhanSo();
        PhanSo ps2_321=new PhanSo();
        PhanSo psTong_321=new PhanSo();

        //Nhap phan so
        System.out.println("Nhap vao phan so thu nhat: ");
        ps1_321.nhapPS(sc);

        System.out.println("Nhap vao phan so thu hai: ");
        ps2_321.nhapPS(sc);

        //tinh tong hai phan so
        psTong_321=ps1_321.congPS(ps2_321);

        //hien thi phan so
        System.out.println("\n Phan so thu nhat la: ");
        ps1_321.hienThiPS();
        System.out.println("\n Phan so thu hai la: ");
        ps2_321.hienThiPS();
        System.out.println("\n Phan so thu tong la: ");
        psTong_321.hienThiPS();
        sc.close();

    }
}
