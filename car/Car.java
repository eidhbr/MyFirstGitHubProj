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
	
	//���ó��ĸ�������
	public abstract void setCar(int brandNum,int detailNum);
	//�������ڷ����ܽ��
	public abstract double totalPrice(int rentDay);

}
