package QuanLyBenhVien;
import java.util.Scanner;
import java.util.ArrayList;
public class TiepTan extends NhanVien	{
	private String khoa;
	public TiepTan() {}
	public TiepTan(String hoTen, String diaChi, int gioiTinh, String ngaySinh, String maNV, String ngayVaoLam,
			String bangCap, String email, String phong, String khoa) {
		super(hoTen, diaChi, gioiTinh, ngaySinh, maNV, ngayVaoLam, bangCap, email, phong);
		this.khoa = khoa;
	}
	public String getKhoa() {
		return khoa;
	}
	public void setKhoa(String khoa) {
		this.khoa = khoa;
	}
	public void nhap()
	{
	Scanner sc= new Scanner(System.in);
	super.nhap();
	System.out.print("Khoa: ");
	khoa = sc.nextLine();
	}
	public void xuat() {
		super.xuat();
		System.out.printf(", Khoa: %s",khoa);
		System.out.println();
	}
}
