package xiao.car;

public abstract class Car {
	private String brand;
	private String lisence;
	private int dayPrice;
	
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getLisence() {
		return lisence;
	}
	public void setLisence(String lisence) {
		this.lisence = lisence;
	}
	public int getDayPrice() {
		return dayPrice;
	}
	public void setDayPrice(int dayPrice) {
		this.dayPrice = dayPrice;
	}
	
	//设置车的各个属性
	public abstract void setCar(int brandNum,int detailNum);
	//根据租期返回总金额
	public abstract double totalPrice(int rentDay);

}
