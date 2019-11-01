package xiao.car;

public class SaloonCar extends Car{
	private String model;
	
	public void setCar(int brandNum,int detailNum){
		if(brandNum==1){
			this.setBrand("宝马");
			if(detailNum==1){
				this.model = "X6";
				this.setLisence("京NY28558");
				this.setDayPrice(800);
			}else{
				this.model = "550i";
				this.setLisence("京CNY3284");
				this.setDayPrice(600);
			}
		}else{
			this.setBrand("别克");
			if(detailNum==1){
				this.model = "林荫大道";
				this.setLisence("京NT37465");
				this.setDayPrice(300);
			}else{
				this.model = "GL8";
				this.setLisence("京NT96968");
				this.setDayPrice(600);
			}
		}
	}
	
	public void setModel(String model){
		this.model = model;
	}
	
	public String getModel(){
		return this.model;
	}
	
	public double totalPrice(int rentDay){
		int oriPrice = rentDay*this.getDayPrice();
		if(rentDay<=7){
			return oriPrice;
		}else if(rentDay<=30){
			return oriPrice*0.9;
		}else if(rentDay<=150){
			return oriPrice*0.8;
		}else{
			return oriPrice*0.7;
		}
		
	}
	
}
