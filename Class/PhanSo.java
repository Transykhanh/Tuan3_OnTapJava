package Class;

import java.util.Scanner;

public class PhanSo {
    //Thuoc tinh
    private int tuSo;
    private  int mauSo;

    //Phuong thuc

    //Ham khoi tao khong doi so
    public PhanSo() {
        tuSo = 0;
        mauSo = 1;
    }

    //Ham khoi tao co doi so
    public PhanSo(int tuSo, int mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    //Ham nhap phan so
    public void nhapPS(Scanner sc) {
        int a_321;
        int b_321;

        do{
            System.out.printf("Nhap vao tu so: ");
            a_321 = sc.nextInt();
            System.out.printf("Nhap vao mau so: ");
            b_321 = sc.nextInt();

            //kiem tra
            if(b_321==0){
                System.out.printf("Mau so khong duoc bang 0. Hay nhap lai!");
            }else {
                tuSo = a_321;
                mauSo = b_321;
            }
        }
        while(b_321==0);
    }
    //ham hien thi
    public void hienThiPS(){
        if(tuSo*mauSo<0){
            System.out.println("\t-"+Math.abs(tuSo)+"/"+Math.abs(mauSo));
        }else {
            System.out.println("\t"+Math.abs(tuSo)+"/"+Math.abs(mauSo));
        }
    }
    //ham cong
    public PhanSo congPS(PhanSo ps2){
        int a_321=tuSo*ps2.mauSo+ps2.tuSo*mauSo;
        int b_321=mauSo*ps2.mauSo;

        return new PhanSo(a_321, b_321);
    }

    //ham tru
    public PhanSo truPS(PhanSo ps2){
        int a_321=tuSo*ps2.mauSo-ps2.tuSo*mauSo;
        int b_321=mauSo*ps2.mauSo;

        return new PhanSo(a_321, b_321);
    }

    //ham nhan
    public PhanSo nhanPS(PhanSo ps2){
        int a_321=tuSo*ps2.tuSo;
        int b_321=mauSo*ps2.mauSo;

        return new PhanSo(a_321, b_321);
    }

    //ham chia
    public PhanSo chiaPS(PhanSo ps2){
        int a_321=tuSo*ps2.mauSo;
        int b_321=mauSo*ps2.tuSo;

        return new PhanSo(a_321, b_321);
    }

    //ham uscln
    private int timUSCLN(int a_321, int b_321){
        int r_321=a_321%b_321;
        while(r_321!=0){
            a_321=b_321;
            b_321=r_321;
            r_321=a_321%b_321;
        }
        return b_321;
    }

    //ham kiem tra phan so toi gian hay chua
    public boolean kiemTraToiGian(){
        if(timUSCLN(tuSo,mauSo)==1){
            return true;
        }
        return false;
    }

    //ham toi gian
    public void toiGianPS(){
        int x_321=timUSCLN(tuSo,mauSo);
        tuSo/=x_321;
        mauSo/=x_321;
    }

}
