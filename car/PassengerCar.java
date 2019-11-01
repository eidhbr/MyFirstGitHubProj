package xiao.car;

public class PassengerCar extends Car {
	private String seating;
	public void setCar(int brandNum,int detailNum){
		if(brandNum==1){
			this.setBrand("金龙");
			if(detailNum==1){
				this.seating = "16座";
				this.setLisence("京8696997");
				this.setDayPrice(800);
			}else{
				this.seating = "34座";
				this.setLisence("京8696998");
				this.setDayPrice(1500);
			}
		}else{
			this.setBrand("金杯");
			if(detailNum==1){
				this.seating = "16座";
				this.setLisence("京6566754");
				this.setDayPrice(800);
			}else{
				this.seating = "34座";
				this.setLisence("京9999999");
				this.setDayPrice(1500);
			}
		}
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
