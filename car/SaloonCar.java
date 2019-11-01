package xiao.car;

public class SaloonCar extends Car{
	private String model;
	
	public void setCar(int brandNum,int detailNum){
		if(brandNum==1){
			this.setBrand("����");
			if(detailNum==1){
				this.model = "X6";
				this.setLisence("��NY28558");
				this.setDayPrice(800);
			}else{
				this.model = "550i";
				this.setLisence("��CNY3284");
				this.setDayPrice(600);
			}
		}else{
			this.setBrand("���");
			if(detailNum==1){
				this.model = "������";
				this.setLisence("��NT37465");
				this.setDayPrice(300);
			}else{
				this.model = "GL8";
				this.setLisence("��NT96968");
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
