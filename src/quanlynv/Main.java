package quanlynv;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        NhanVien nhanvien1 = new NhanVienFullTime("1", "Quang Anh", 23, "0999888666","abc", 10000,1000, 500);
        NhanVien nhanvien2 = new NhanVienFullTime("2", "BằngAladin", 23, "0999888666","abc", 15000,2000, 1000);
        NhanVien nhanvien3 = new NhanVienFullTime("2", "Quân", 23, "0999888666","abc", 1000,2000, 1000);
        NhanVien nhanvien4 = new NhanVienPartTime("3", "Trường", 23, "0999888666","abc", 5);
        NhanVien nhanvien5 = new NhanVienPartTime("4", "Tuấn", 23, "0999888666","abc", 10);
        NhanVien nhanvien6 = new NhanVienPartTime("4", "K.Anh", 23, "0999888666","abc", 105);
        List<NhanVien> nhanVienList = new ArrayList<>();
        nhanVienList.add(nhanvien1);
        nhanVienList.add(nhanvien2);
        nhanVienList.add(nhanvien3);
        nhanVienList.add(nhanvien4);
        nhanVienList.add(nhanvien5);
        nhanVienList.add(nhanvien6);
        QuanlyNv quanlyNv = new QuanlyNv();
        quanlyNv.setNhanViens(nhanVienList);
//        quanlyNv.displayNhanvien();
//        quanlyNv.addNhanvien(nhanvien1);
//        quanlyNv.displayNhanvien();
        quanlyNv.sumLuongNhanVienPartTime();   // in ra lương giá trị là: 1.2E7 ? tại sao lại như vậy
        quanlyNv.displayNhanvien();
        quanlyNv.sorftNhanVienFullTime();
    }

}
