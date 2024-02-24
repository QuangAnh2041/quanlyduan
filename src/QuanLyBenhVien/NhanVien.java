package QuanLyBenhVien;
import java.util.Scanner;
public class NhanVien {
	private String hoTen;
	private String diaChi;
	private int gioiTinh; 
	private String ngaySinh, maNV, ngayVaoLam, bangCap,email,phong;
	public NhanVien() {}
	public NhanVien(String hoTen, String diaChi, int gioiTinh, String ngaySinh, String maNV,String ngayVaoLam, String bangCap, String email, String phong) {
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.gioiTinh = gioiTinh;
		this.ngaySinh = ngaySinh;
		this.maNV = maNV;
		this.ngayVaoLam = ngayVaoLam;
		this.bangCap = bangCap;
		this.email = email;
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
	public String getMaNV() {
		return maNV;
	}
	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}
	public String getNgayVaoLam() {
		return ngayVaoLam;
	}
	public void setNgayVaoLam(String ngayVaoLam) {
		this.ngayVaoLam = ngayVaoLam;
	}
	public String getBangCap() {
		return bangCap;
	}
	public void setBangCap(String bangCap) {
		this.bangCap = bangCap;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhong() {
		return phong;
	}
	public void setPhong(String phong) {
		this.phong = phong;
	}
	public void nhap()
	{
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
	System.out.print("Mã nhân viên: ");
	maNV= sc.next();
	System.out.print("Ngày vào làm: ");
	ngayVaoLam= sc.next();
	System.out.print("Bằng cấp: ");
	bangCap= sc.next();
	System.out.print("Email: ");
	email= sc.next();
	System.out.print("Phòng phụ trách: ");
	phong= sc.next();
	}
	public void xuat()
	{
	System.out.printf("Ho ten: "+this.hoTen+", Dia chi: "+this.diaChi+" , Gioi tinh: "+getGioiTinh()+", Ngay sinh: %s, Ma nhan vien: %s, Ngay vao lam: %s, Bang cap: %s, Email: %s, Phong phu trach: %s",ngaySinh,maNV,ngayVaoLam,bangCap,email,phong);
	}
}