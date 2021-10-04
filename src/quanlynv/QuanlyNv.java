package quanlynv;


import java.util.ArrayList;
import java.util.List;

public class QuanlyNv {
   private List<NhanVien> nhanViens;

    public QuanlyNv(List<NhanVien> nhanViens) {
        this.nhanViens = nhanViens;
    }

    public QuanlyNv() {
    }

    public void setNhanViens(List<NhanVien> nhanViens) {
        this.nhanViens = nhanViens;
    }

    public void displayNhanvien(){
        for (NhanVien nhanvien: nhanViens) {
            System.out.println(nhanvien);
        }
    }
    public void addNhanvien(NhanVien nhanVien ){
        nhanViens.add(nhanVien);
    }
    public void displayFullTimeNv(){
        double totalSalary = 0;
        List<NhanVienFullTime>nhanVienFullTimeList = new ArrayList<>();    //tạo list để chưa nhân viên fulltime có lương nhỏ hơn lương trung bình
        for (NhanVien nhanvien:nhanViens) {
            totalSalary+=nhanvien.TinhLuong();   // Lương trung bình của công ty
        }
        double avgSalary = totalSalary/nhanViens.size();
        for (NhanVien nhanvien:nhanViens) {
            if (nhanvien instanceof NhanVienFullTime&&nhanvien.TinhLuong()<avgSalary){
                nhanVienFullTimeList.add((NhanVienFullTime)nhanvien );
            }
        }
        System.out.println("Danh sách NV FullTime có lương thấp hơn lương trung bình là:");
        if (!nhanVienFullTimeList.isEmpty()){
            for (NhanVienFullTime nhanvienfulltime:nhanVienFullTimeList) {
                System.out.println(nhanvienfulltime);
            }
        }else {
            System.out.println("không có nhân viên phù hợp");
        }
    }
    public void sumLuongNhanVienPartTime(){
        double sumLuongNvPartTime=0;
        for (NhanVien nhanvien: nhanViens) {
            if (nhanvien instanceof NhanVienPartTime){
                sumLuongNvPartTime+=nhanvien.TinhLuong();
            }
        }
        System.out.println("tổng lương nhân viên là:"+sumLuongNvPartTime);
    }
    public void sorftNhanVienFullTime(){
        List<NhanVienFullTime>nhanVienFullTimeList = new ArrayList<>(); //tạo mảng nhanvienFullTimelist với kiểu dữ liệu là NhanVienFullTime
        for (NhanVien nhanvien: nhanVienFullTimeList) {                      //duyệt mảng nhanVienFullTimeList với kiểu dữ liệu NhanVien .
            if (nhanvien instanceof NhanVienFullTime){
                nhanVienFullTimeList.add((NhanVienFullTime) nhanvien);
            }
        }
        for (int i = 0; i < nhanVienFullTimeList.size(); i++) {
            for (int j = 0; j < nhanVienFullTimeList.size()-1; j++) {
                if (nhanVienFullTimeList.get(j).TinhLuong()>nhanVienFullTimeList.get(j+1).TinhLuong()){
                    NhanVienFullTime temp = nhanVienFullTimeList.get(j);
                    nhanVienFullTimeList.set(j,nhanVienFullTimeList.get(j+1));
                    nhanVienFullTimeList.set(j+1,temp);
                }
            }
        }
        System.out.println("Danh sách NV fulltime sau khi sắp xếp theo lương tăng dần là:");
        for (NhanVienFullTime nhanvien: nhanVienFullTimeList) {
            System.out.println(nhanvien);
        }
    }
}
