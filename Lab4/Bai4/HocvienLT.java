package Bai4;

 class HocvienLT extends Hocvien{
	public HocvienLT(int donGiaLT){
		chuongTrinh = "Lap Trinh";
		this.donGia = donGiaLT;
		
	}

	@Override
	int HocPhi() {
		
		if(getUuTien() == 1) 
			return (getSoBuoi() * donGia - 1000000) > 0 ? (getSoBuoi() * donGia - 1000000):0;
		else if(getUuTien() == 2)
			return (getSoBuoi() * donGia - 800000) > 0 ? (getSoBuoi() * donGia - 800000):0;
		else
			return getSoBuoi() * donGia ;
		
	}
}
