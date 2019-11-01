package xiao.car.main;
import xiao.car.*;
import java.util.Scanner;
public class CarRental {
	public static void main(String[] args){
		int typeNum,brandNum,detailNum,rentDay;
		boolean mainFlag=true;
		Scanner input = new Scanner(System.in);
		
		//开始界面
		for(int i=0;i<=49;i++){
			System.out.print("*");
			if(i==24){
				System.out.print("欢迎使用汽车租赁系统");
			}
			if(i==49){
				System.out.println("");
			}
		}
		
		//主循环
		while(mainFlag){
			
			System.out.println("1、轿车  2、客车");
			System.out.print("请选择租车类型(输入0退出程序,输入3从头开始选择,下同):");
			
			//判断输入数字后再进入switch选择
			//输入1，2则记录下来类型
			while(true){
				typeNum = input.nextInt();
				if(typeNum>=0 && typeNum<=3){
					break;
				}else{
					System.out.print("重新输入:");
					continue;
				}
			}
			
			//输入3则进入下一轮，输入0则退出主循环
			switch(typeNum){
				case 3:
					continue;
				case 0:
					mainFlag = false;
					continue;
			}
			
			//根据类型，给出相应品牌的选择
			if(typeNum==1){
				System.out.println("1、宝马  2、别克");
			}else{
				System.out.println("1、金龙  2、金杯");
			}
			System.out.print("请选择汽车品牌:");
			while(true){
				brandNum = input.nextInt();
				if(brandNum>=0 && brandNum<=3){
					break;
				}else{
					System.out.print("重新输入:");
					continue;
				}
			}
			
			switch(brandNum){
				case 3:
					continue;
				case 0:
					mainFlag = false;
					continue;
			}
			
			
			//根据车的类型，给出车具体型号或者座位数的选择
			if(typeNum==1){
				if(brandNum==1){
					System.out.println("1、X6  2、550i");
					System.out.print("请选择汽车类型:");
				}else{
					System.out.println("1、林荫大道  2、GL8");
					System.out.print("请选择汽车类型:");
				}
				
			}else{
				System.out.println("1、16座  2、34座");
				System.out.print("请选择汽车座位数:");
			}
			while(true){
				detailNum = input.nextInt();
				if(detailNum>=0 && detailNum<=3){
					break;
				}else{
					System.out.print("重新输入:");
					continue;
				}
			}
			
			Car myCar = null;
			
			//根据车类型，品牌，型号/座位数构建对象
			switch(detailNum){
				case 1:
					if(typeNum==1){
						if(brandNum==1){
							myCar = new SaloonCar();
							myCar.setCar(1,1);
						}else{
							myCar = new SaloonCar();
							myCar.setCar(2,1);
						}	
					}else{
						if(brandNum==1){
							myCar = new PassengerCar();
							myCar.setCar(1,1);
						}else{
							myCar = new PassengerCar();
							myCar.setCar(2,1);
						}	
					}
					
					break;
				case 2:
					if(typeNum==1){
						if(brandNum==1){
							myCar = new SaloonCar();
							myCar.setCar(1,2);
						}else{
							myCar = new SaloonCar();
							myCar.setCar(2,2);
						}	
					}else{
						if(brandNum==1){
							myCar = new PassengerCar();
							myCar.setCar(1,2);
						}else{
							myCar = new PassengerCar();
							myCar.setCar(2,2);
						}
					}
					
					break;
				case 3:
					continue;
				case 0:
					mainFlag = false;
					continue;
			}
			
			System.out.print("请输入租赁天数:");
			rentDay = input.nextInt();
			
			//需调用子类特有方法(getModel(),getSeating())，因此向下转型
			System.out.println("您的租车信息:");
			if(typeNum==1){
				SaloonCar saloonCar = (SaloonCar)myCar;
				System.out.println("租车类型:轿车"+"\t车的品牌:"+saloonCar.getBrand()+"\t车的型号:"+saloonCar.getModel()
				+"\t车牌号:"+saloonCar.getLisence()+"\t\t日租金为:"+saloonCar.getDayPrice());
			}else{
				PassengerCar passengerCar = (PassengerCar)myCar;
				System.out.println("租车类型:轿车"+"\t车的品牌:"+passengerCar.getBrand()+"\t车座数:"+passengerCar.getSeating()
				+"\t车牌号:"+passengerCar.getLisence()+"\t\t日租金为:"+passengerCar.getDayPrice()+"元");
			}
			
			System.out.print("支付费用是:");
			System.out.println((int)myCar.totalPrice(rentDay)+"元");
			
			System.out.print("输入0退出,否则重新选择:");
			typeNum = input.nextInt();
			if(typeNum==0){
				break;
			}
		}
		System.out.println("谢谢使用");
	}
}
