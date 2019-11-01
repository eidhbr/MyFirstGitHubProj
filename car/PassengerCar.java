package xiao.car;

public class PassengerCar extends Car {
	private String seating;
	public void setCar(int brandNum,int detailNum){
		int[][] priceList = new int[2][];
		String[] brandList = new String[]{"����","��"};
		String[] seatingList = new String[]{"16��","34��"};
		
		String[][] licenseList = new String[][]{{"��8696997","��8696998"},{"��6566754","��9999999"}};

		int[] priList = new int[]{800,1500};
		
		this.setBrand(brandList[brandNum-1]);
		this.seating = seatingList[detailNum-1];
		this.setLisence(licenseList[brandNum-1][detailNum-1]);
		this.setDayPrice(priList[detailNum-1]);
		
	}
	
	public void setSeating(String seating){
		this.seating = seating;
	}
	
	public String getSeating(){
		return seating;
	}
	
	public double totalPrice(int rentDay){
		int oriPrice = rentDay*this.getDayPrice();
		if(rentDay<=3){
			return oriPrice;
		}else if(rentDay<=7){
			return oriPrice*0.9;
		}else if(rentDay<=30){
			return oriPrice*0.8;
		}else if(rentDay<=150){
			return oriPrice*0.7;
		}else{
			return oriPrice*0.6;
		}
		
	}
	
}
