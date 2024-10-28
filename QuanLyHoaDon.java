package Baitapnhom3;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyHoaDon {
    private static ArrayList<HoaDonDichVu> danhSachHoaDon = new ArrayList<>();//khai bao array ma chua muon nhap cho no du lieu

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int luaChon;
        do {
            System.out.println("=== Quan ly hoa don ===");
            System.out.println("1. Nhap hoa don dich vu");
            System.out.println("2. Hien thi danh sach hoa don");
            System.out.println("3. Sap xep hoa don theo dien tich giam dan");
            System.out.println("4. Tinh tong gia tri cac hoa don");
            System.out.println("5. Hien thi hoa don co dien tich < 70m2");
            System.out.println("6. Tim kiem hoa don theo ma phong");
            System.out.println("0. Thoat chuong trinh");
            System.out.println("====Moi ban nhap lua chon====");
            System.out.print("Lua chon: ");
            luaChon = scanner.nextInt();
            scanner.nextLine();

            switch (luaChon) {
                case 1:
                    nhapHoaDon(scanner);
                    break;
                case 2:
                    HoaDonUtils.hienThiDanhSach(danhSachHoaDon);
                    break;
                case 3:
                    HoaDonUtils.sapXepTheoDienTichGiamDan(danhSachHoaDon);
                    HoaDonUtils.hienThiDanhSach(danhSachHoaDon);
                    break;
                case 4:
                    HoaDonUtils.tinhTongGiaTriHoaDon(danhSachHoaDon);
                    break;
                case 5:
                    HoaDonUtils.hienThiHoaDonDienTichNhoHon70(danhSachHoaDon);
                    break;
                    case 6:
                    timKiemHoaDon(scanner); 
                    break;
                case 0:
                    System.out.println("Thoat chương trinh.");
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
                    
            }
        } while (luaChon != 0);

        scanner.close();
    }
    private static void timKiemHoaDon(Scanner scanner) {
        System.out.print("Nhap ma phong can tim: ");
        String maPhong = scanner.nextLine();
        HoaDonDichVu hoaDon = HoaDonUtils.timKiemHoaDonTheoMaPhong(danhSachHoaDon, maPhong);
        if (hoaDon != null) {
            System.out.println("Hoa don tim thay: " + hoaDon);
        } else {
            System.out.println("Khong tim thay hoa don voi ma phong: " + maPhong);
        }
    }

    private static void nhapHoaDon(Scanner scanner) {
        String maPhong;
        do {
            System.out.print("Nhap ma phong (bat dau voi 'P'): ");
            maPhong = scanner.nextLine();
            if (!maPhong.startsWith("P")) {
                System.out.println("Ma phong khong hop le. Ma phong phai bat dau voi ky tu 'P'.");
            }
        } while (!maPhong.startsWith("P"));
        
        System.out.print("Nhap dien tich phong (60, 75, 90): ");
        int dienTich = scanner.nextInt();
        System.out.print("Nhap don gia (7500, 10000, 15000): ");
        int donGia = scanner.nextInt();
        
        HoaDonDichVu hoaDon = new HoaDonDichVu(maPhong, dienTich, donGia);
        danhSachHoaDon.add(hoaDon);
    }
}