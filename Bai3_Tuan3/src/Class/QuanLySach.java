package Class;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLySach {
    //thuoc tinh
    private ArrayList<TaiLieu> dstl;


    //phuong thuc
    //ham khoi tao
    public QuanLySach() {
        dstl = new ArrayList<TaiLieu>(10);

    }

    //them moi 1 tai lieu
    public void themTaiLieu(TaiLieu t) {
        dstl.add(t);
    }

    //nhap danh sach tai lieu
    public void nhapDanhSachTL(Scanner sc) {
        int chon_321;
        String stop_321;
        TaiLieu tl_321;

        do {
            System.out.print("Chon loai tai lieu (1-Sach; 2-TapChi; 3-Bao): ");
            chon_321 = sc.nextInt();
            sc.nextLine();
            switch (chon_321) {
                case 1:
                    tl_321 = new Sach();
                    break;
                case 2:
                    tl_321 = new TapChi();
                    break;
                case 3:
                    tl_321 = new Bao();
                    break;
                default:
                    tl_321 = new Sach();
                    break;
            }
            tl_321.nhapThongTin(sc);
            themTaiLieu(tl_321);

            System.out.print("\nBan co muon nhap vao nua hay khong (c/k): ");
            stop_321 = sc.nextLine();
        }while (stop_321.equals("c"));
    }

    //ham tim kiem theo ma tai lieu
    public void timMaTL(String maTL){
        for (TaiLieu tl : dstl) {
            if(maTL.equals(tl.getMaTaiLieu()))
                tl.hienThiThongTin();
        }
    }

    //ham tim kiem theo loai tai lieu
    public void timLoaiTL(String loai){
        for (TaiLieu tl : dstl) {
            if(loai.equals("Sach")&&(tl instanceof Sach)){
                tl.hienThiThongTin();
            }else if(loai.equals("TapChi")&&(tl instanceof TapChi)){
                tl.hienThiThongTin();
            }else if(loai.equals("Bao")&&(tl instanceof Bao)){
                tl.hienThiThongTin();
            }
        }
    }
}
