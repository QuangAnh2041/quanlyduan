package QuanLyBenhVien;

public class Bacsi extends NhanVien{
	private int luong;
	private String chuyenMon;
	public Bacsi(int luong, String chuyenMon) {
		super();
		this.luong = luong;
		this.chuyenMon = chuyenMon;
	}
	public int getLuong() {
		return luong;
	}
	public void setLuong(int luong) {
		this.luong = luong;
	}
	public String getChuyenMon() {
		return chuyenMon;
	}
	public void setChuyenMon(String chuyenMon) {
		this.chuyenMon = chuyenMon;
	}
	public void nhap() {
		
	}
}
