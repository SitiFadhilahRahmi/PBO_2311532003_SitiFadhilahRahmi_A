package model;
public class Order{
	String id, id_pelanggan, tanggal, tanggal_pengembalian, status, pembayaran, status_pembayaran, total;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getId_pelanggan() {
		return id_pelanggan;
	}

	public void setId_pelanggan(String id_pelanggan) {
		this.id_pelanggan = id_pelanggan;
	}

	public String getTanggal() {
		return tanggal;
	}

	public void setTanggal(String tanggal) {
		this.tanggal = tanggal;
	}

	public String getTanggal_pengembalian() {
		return tanggal_pengembalian;
	}

	public void setTanggal_pengembalian(String tanggal_pengembalian) {
		this.tanggal_pengembalian = tanggal_pengembalian;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getPembayaran() {
		return pembayaran;
	}

	public void setPembayaran(String pembayaran) {
		this.pembayaran = pembayaran;
	}

	public String getStatus_pembayaran() {
		return status_pembayaran;
	}

	public void setStatus_pembayaran(String status_pembayaran) {
		this.status_pembayaran = status_pembayaran;
	}

	public String getTotal() {
		return total;
	}

	public void setTotal(String total) {
		this.total = total;
	}
	
}