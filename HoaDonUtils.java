package Baitapnhom3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class HoaDonUtils {

    // Hiển thị danh sách hóa đơn
    public static void hienThiDanhSach(ArrayList<HoaDonDichVu> danhSachHoaDon) {
        System.out.println("=== Danh sach hoa don dich vu ===");
        for (HoaDonDichVu hoaDon : danhSachHoaDon) {
            System.out.println(hoaDon);
        }
    }

    // Sắp xếp hóa đơn theo diện tích giảm dần
    public static void sapXepTheoDienTichGiamDan(ArrayList<HoaDonDichVu> danhSachHoaDon) {
        Collections.sort(danhSachHoaDon, new Comparator<HoaDonDichVu>() {
            @Override
            public int compare(HoaDonDichVu hd1, HoaDonDichVu hd2) {
                return Integer.compare(hd2.getDienTich(), hd1.getDienTich());
            }
        });
        System.out.println("da sap xep hoa đon theo dien tich giam dan.");
    }

    // Tính tổng giá trị các hóa đơn
    public static void tinhTongGiaTriHoaDon(ArrayList<HoaDonDichVu> danhSachHoaDon) {
        int tongGiaTri = 0;
        for (HoaDonDichVu hoaDon : danhSachHoaDon) {
            tongGiaTri += hoaDon.tinhThanhTien();
        }
        System.out.println("Tong gia tri cac hoa đon: " + tongGiaTri);
    }

    // Hiển thị hóa đơn có diện tích nhỏ hơn 70m2
    public static void hienThiHoaDonDienTichNhoHon70(ArrayList<HoaDonDichVu> danhSachHoaDon) {
        System.out.println("=== Hoa don co dien tich nho hon 70m2 ===");
        boolean coHoaDonNhoHon70 = false;
        for (HoaDonDichVu hoaDon : danhSachHoaDon) {
            if (hoaDon.getDienTich() < 70) {
                System.out.println(hoaDon);
                coHoaDonNhoHon70 = true;
            }
        }
        if (!coHoaDonNhoHon70) {
            System.out.println("Khong co hoa don nao nho hon 70m2");
        }
    }
    // Phương thức tìm kiếm tuyến tính theo mã phòng
    public static HoaDonDichVu timKiemHoaDonTheoMaPhong(ArrayList<HoaDonDichVu> danhSachHoaDon, String maPhong) {
        for (HoaDonDichVu hoaDon : danhSachHoaDon) {
            if (hoaDon.getMaPhong().equals(maPhong)) {
                return hoaDon; // Trả về hóa đơn nếu tìm thấy
            }
        }
        return null; // Trả về null nếu không tìm thấy
    }
}