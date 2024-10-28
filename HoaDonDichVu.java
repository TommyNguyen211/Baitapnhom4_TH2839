package Baitapnhom3;

public class HoaDonDichVu {
    private String maPhong;
    private int dienTich;
    private int donGia;

    public HoaDonDichVu(String maPhong, int dienTich, int donGia) {
        this.maPhong = maPhong;
        this.dienTich = dienTich;
        this.donGia = donGia;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public int getDienTich() {
        return dienTich;
    }

    public int getDonGia() {
        return donGia;
    }

    public int tinhThanhTien() {
        return dienTich * donGia;
    }

    @Override
    public String toString() {
        return "Ma phong: " + maPhong + ", Dien tich: " + dienTich + " m2, Don gia: " + donGia + ", Thanh tien: " + tinhThanhTien();
    }
}
