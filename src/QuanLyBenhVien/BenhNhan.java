package QuanLyBenhVien;
import java.util.Scanner;
import java.io.Serializable;
public class BenhNhan implements Serializable{
	private String hoTen;
	private String diaChi;
	private int gioiTinh; 
	private String ngaySinh;
	private String maBN;
	private double vienPhi;
	private String phong;
	public BenhNhan () {}
	public BenhNhan(String hoTen, String diaChi, int gioiTinh, String ngaySinh, String maBN, double vienPhi,
			String phong) {
		super();
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.gioiTinh = gioiTinh;
		this.ngaySinh = ngaySinh;
		this.maBN = maBN;
		this.vienPhi = vienPhi;
		this.phong = phong;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public String getGioiTinh() {
		if (this.gioiTinh == 1)
		return "Nữ";
		else if (this.gioiTinh == 0)
		return "Nam";
		else return null;
	}
	public void setGioiTinh(int gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public String getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public String getMaBN() {
		return maBN;
	}
	public void setMaBN(String maBN) {
		this.maBN = maBN;
	}
	public double getVienPhi() {
		return vienPhi;
	}
	public void setVienPhi(double vienPhi) {
		this.vienPhi = vienPhi;
	}
	public String getPhong() {
		return phong;
	}
	public void setPhong(String phong) {
		this.phong = phong;
	}
	public void nhapBenhNhan() {
		Scanner sc= new Scanner(System.in);
		System.out.print("Họ tên: ");
		hoTen= sc.nextLine();
		System.out.print("Địa chỉ: ");
		diaChi = sc.nextLine();
		do
		{
		System.out.print("Giới tính(nam: 0/ nữ: 1) ");
		gioiTinh= sc.nextInt();
		}
		while(gioiTinh!=1 && gioiTinh!=0);
		System.out.print("Ngày sinh: ");
		ngaySinh= sc.next();
		System.out.print("Mã bệnh nhân: ");
		maBN= sc.next();
		System.out.print("Viện phí: ");
		vienPhi= sc.nextDouble();
		System.out.print("Phòng: ");
		phong= sc.next();
	}
	public void hienBenhNhan()
	{
		System.out.print("{hoTen: "+ this.hoTen + ", gioiTinh: "+getGioiTinh()  +", diaChi: "
				+this.diaChi + ", ngaySinh: "+ this.ngaySinh+", maBenhNhan: "+this.maBN  + ", vienPhi: "+this.vienPhi + ", phong: "
				+ this.phong+"}");
	}
}