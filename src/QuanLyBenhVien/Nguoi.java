package QuanLyBenhVien;
import java.util.Scanner;
import java.io.Serializable;
public class Nguoi implements Serializable{
	private String hoTen;
	private String diaChi;
	private int gioiTinh; 
	private String ngaySinh;
	public Nguoi() {}
	public Nguoi(String hoTen, String diaChi, int gioiTinh, String ngaySinh) {
		super();
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.gioiTinh = gioiTinh;
		this.ngaySinh = ngaySinh;
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
	public int getGioitinh() {
		return gioiTinh;
	}
	public void setGioitinh(int gioitinh) {
		if (gioitinh ==0 || gioitinh ==1)
		this.gioiTinh = gioiTinh;
	}
	public String getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public void gioitinh () {
		switch (this.gioiTinh) {
		case 0: System.out.println("Nam");break;
		case 1: System.out.println("Nu");break;
		default: System.out.println("Loi, xin nhap lai: ");break;
		}
	}
	public void nhap()
	{
	Scanner sc= new Scanner(System.in);
	System.out.print("Họ tên: ");
	hoTen= sc.nextLine();
	System.out.print("Địa chỉ: ");
	diaChi = sc.nextLine();
	System.out.print("Ngày sinh: ");
	ngaySinh= sc.next();
	do
	{
	System.out.print("Giới tính(nam: 1/ nữ: 0) ");
	gioiTinh= sc.nextInt();
	}
	while(gioiTinh!=1 && gioiTinh!=0);
	}
	public void hien()
	{
	System.out.print("{hoTen: "+ this.hoTen + ", gioiTinh: "+this.gioiTinh +", namSinh: "+ this.ngaySinh+ ", diaChi: "+this.diaChi + "}");
	}
	}
