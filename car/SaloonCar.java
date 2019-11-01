package xiao.car;
import java.util.Arrays;
public class SaloonCar extends Car{
	private String model;
	
	public void setCar(int brandNum,int detailNum){
		String[][][] detailList = new String[2][][];
		int[][] priceList = new int[2][];
		String[] brandList = new String[]{"宝马","别克"};
		String[][] modelList = new String[][]{{"X6","550i"},{"林荫大道","GL8"}};
		
		String[][] licenseList = new String[][]{{"京NY28558","京CNY3284"},{"京NT37465","京NT96968"}};

		int[][] priList = new int[][]{{800,600},{300,600}};

		
		for(int i=0;i<=detailList.length-1;i++){
			detailList[i] = new String[2][2];
			for(int j=0;j<=detailList[i].length-1;j++){
				detailList[i][j][0] = modelList[i][j];
				detailList[i][j][1] = licenseList[i][j];

			}
		}
		
		this.setBrand(brandList[brandNum-1]);
		this.model = detailList[brandNum-1][detailNum-1][0];
		this.setLisence(detailList[brandNum-1][detailNum-1][1]);
		this.setDayPrice(priList[brandNum-1][detailNum-1]);

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
