package xiao.car.main;
import xiao.car.*;
import java.util.Scanner;
public class CarRental {
	public static void main(String[] args){
		int typeNum,brandNum,detailNum,rentDay;
		boolean mainFlag=true;
		Scanner input = new Scanner(System.in);
		
		//��ʼ����
		for(int i=0;i<=49;i++){
			System.out.print("*");
			if(i==24){
				System.out.print("��ӭʹ����������ϵͳ");
			}
			if(i==49){
				System.out.println("");
			}
		}
		
		//��ѭ��
		while(mainFlag){
			
			System.out.println("1���γ�  2���ͳ�");
			System.out.print("��ѡ���⳵����(����0�˳�����,����3��ͷ��ʼѡ��,��ͬ):");
			
			//�ж��������ֺ��ٽ���switchѡ��
			//����1��2���¼��������
			while(true){
				typeNum = input.nextInt();
				if(typeNum>=0 && typeNum<=3){
					break;
				}else{
					System.out.print("��������:");
					continue;
				}
			}
			
			//����3�������һ�֣�����0���˳���ѭ��
			switch(typeNum){
				case 3:
					continue;
				case 0:
					mainFlag = false;
					continue;
			}
			
			//�������ͣ�������ӦƷ�Ƶ�ѡ��
			if(typeNum==1){
				System.out.println("1������  2�����");
			}else{
				System.out.println("1������  2����");
			}
			System.out.print("��ѡ������Ʒ��:");
			while(true){
				brandNum = input.nextInt();
				if(brandNum>=0 && brandNum<=3){
					break;
				}else{
					System.out.print("��������:");
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
			
			
			//���ݳ������ͣ������������ͺŻ�����λ����ѡ��
			if(typeNum==1){
				if(brandNum==1){
					System.out.println("1��X6  2��550i");
					System.out.print("��ѡ����������:");
				}else{
					System.out.println("1��������  2��GL8");
					System.out.print("��ѡ����������:");
				}
				
			}else{
				System.out.println("1��16��  2��34��");
				System.out.print("��ѡ��������λ��:");
			}
			while(true){
				detailNum = input.nextInt();
				if(detailNum>=0 && detailNum<=3){
					break;
				}else{
					System.out.print("��������:");
					continue;
				}
			}
			
			Car myCar = null;
			
			//���ݳ����ͣ�Ʒ�ƣ��ͺ�/��λ����������
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
			
			System.out.print("��������������:");
			rentDay = input.nextInt();
			
			//������������з���(getModel(),getSeating())���������ת��
			System.out.println("�����⳵��Ϣ:");
			if(typeNum==1){
				SaloonCar saloonCar = (SaloonCar)myCar;
				System.out.println("�⳵����:�γ�"+"\t����Ʒ��:"+saloonCar.getBrand()+"\t�����ͺ�:"+saloonCar.getModel()
				+"\t���ƺ�:"+saloonCar.getLisence()+"\t\t�����Ϊ:"+saloonCar.getDayPrice());
			}else{
				PassengerCar passengerCar = (PassengerCar)myCar;
				System.out.println("�⳵����:�γ�"+"\t����Ʒ��:"+passengerCar.getBrand()+"\t������:"+passengerCar.getSeating()
				+"\t���ƺ�:"+passengerCar.getLisence()+"\t\t�����Ϊ:"+passengerCar.getDayPrice()+"Ԫ");
			}
			
			System.out.print("֧��������:");
			System.out.println((int)myCar.totalPrice(rentDay)+"Ԫ");
			
			System.out.print("����0�˳�,��������ѡ��:");
			typeNum = input.nextInt();
			if(typeNum==0){
				break;
			}
		}
		System.out.println("ллʹ��");
	}
}
