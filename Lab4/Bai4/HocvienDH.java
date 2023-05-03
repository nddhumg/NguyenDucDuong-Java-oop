package Bai4;
 class HocvienDH extends Hocvien{
	
	public HocvienDH(int donGiaDH){
		chuongTrinh = "Do Hoa";
		this.donGia = donGiaDH;
	}

	@Override
	 int HocPhi() {
		if(getUuTien() == 1) 
			return (getSoBuoi() * donGia - 1000000) > 0 ? (getSoBuoi() * donGia - 1000000):0;
		else if(getUuTien() == 2)
			return (getSoBuoi() * donGia - 500000) > 0 ? (getSoBuoi() * donGia - 500000):0;
		else
			return getSoBuoi() * donGia ;
		
	}

	
}
