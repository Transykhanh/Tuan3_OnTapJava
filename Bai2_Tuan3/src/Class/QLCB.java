package Class;

import java.util.ArrayList;
import java.util.Scanner;

public class QLCB {
    //thuoc tinh
    private ArrayList<CanBo> dscb;

    //phuong thuc
    //ham khoi tao
    public QLCB() {
        dscb = new ArrayList<CanBo>();
    }

    //ham them can bo
    public void themCanBo(CanBo cb) {
        dscb.add(cb);
    }

    //ham nhap danh sach
    public void nhapDanhSach(Scanner sc) {
        CanBo cb;
        System.out.print("Nhap vao so luong can bo: ");
        int n_321=sc.nextInt();

        System.out.print("Nhap thong tin chi tiet: ");
        for (int i = 0; i < n_321; i++) {
            System.out.printf("Lan nhap thu: "+(i+1)+":");
            System.out.printf("Chon can bo (1-ky su, 2-Nhan vien, 3-Cong nhan):");
            int chon_321=sc.nextInt();
            sc.nextLine();

            cb=new CanBo();
            switch (chon_321) {
                case 1:
                    cb=new KySu();
                    break;
                case 2:
                    cb=new NhanVien();
                    break;
                case 3:
                    cb=new CongNhan();
                    break;
                default:
                    cb=new KySu();
                    break;
            }
            //sau khi chon loai can bo can nhap thi nhap thong tin cho can bo do
            cb.nhapThongTin(sc);

            //them can bo vao danh sach
            themCanBo(cb);
        }
    }
    //ham tim kiem theo ten
    public void timKiemCanBo(String hoten){
        for (CanBo cb : dscb) {
            if(hoten.equals(cb.getHoTen())){
                cb.hienThiThongTin();
            }
        }
    }
}
