import java.util.Scanner;
public class LunchPro{
	public static void main(String[] args){
		//������������
		//���ڲ��ܸ���������,����ֻ�����Ƶ���һ��,���۵���һ�飬����һ��һ��,���������Ƽ۸������һ��
		//��Ʒ:����,����,������
		String[] dishmenu = {"���","����","����","������"};
		String[] dishNames = {"���մ���","��������","ʱ���߲�"};
		double[] prices = {56,24,18};
		int[] praiseNums = new int[3];
		
		//����:������,��Ʒ��Ϣ,�Ͳ�ʱ��,�Ͳ͵�ַ,�ܽ��,����״̬
		String[] orderForm = {"���","������","��Ʒ��Ϣ","�Ͳ�ʱ��","�Ͳ͵�ַ","�ܽ��","����״̬"};
		String[] names = new String[5];
		String[] dishMsg = new String[5];
		int[] times = new int[5];
		String[] addresses = new String[5];
		double[] sumPrices = new double[5];
		int[] states = new int[5];//0:��Ԥ��,1:�����
		
		//ϵͳ��
		String[] manu = {"��Ҫ����","�鿴�ʹ�","ǩ�ն���","ɾ������","��Ҫ����","�˳�ϵͳ"};
		Scanner input = new Scanner(System.in);
		int menuNum,chooseNum;
		boolean flag=true;
		String name,address;
		int dishSeq,dishNum,time,state,signNum,delNum,praiseSeq;
		int orderSeq = 0;
		double sumPrice;
		
		
		//�ȴ������,������Ҫ������������
		System.out.println("��ӭʹ�ö���ϵͳ");
		while(flag){
			//��ʾ���ͽ���
			for(int i=0;i<=47;i++){
				System.out.print("*");
			}
			System.out.println("");
			for(int i=1;i<=6;i++){
				System.out.println(i+"."+manu[i-1]);
			}
			for(int i=0;i<=47;i++){
				System.out.print("*");
			}
			System.out.println("");
			
			//�������1��6����,���ظ�ѡ��
			while(true){
				System.out.print("ѡ������(1-6):");
				menuNum = input.nextInt();
				if(menuNum>=1 && menuNum<=6){
					break;
				}else{
					System.out.println("������Ч");
					continue;
				}
			}
			

			//����ѡ������ֽ��벻ͬ���
			switch(menuNum){
				case 1:
					//��ʾ����
					for(int i=0;i<=39;i++){
						System.out.print("*");
						if(i==19){
							System.out.print(manu[menuNum-1]);
						}
						if(i==39){
							System.out.println("");
						}
					}
					
					System.out.print("��������:");
					name = input.next();
					orderSeq++;
					//��ʾ�˵�
					for(int i=0;i<=3;i++){
						System.out.print(dishmenu[i]+"\t\t");
						
						if(i==3){
							System.out.println("");
						}
					}
					for(int i=0;i<=2;i++){
						System.out.print((i+1)+"\t\t");
						System.out.print(dishNames[i]+"\t\t");
						System.out.print(prices[i]+"\t\t");
						System.out.print(praiseNums[i]+"\t\t");
						System.out.println("");
					}
					
					//����Ϣ��������
					System.out.print("ѡ���Ʒ���:");
					dishSeq = input.nextInt();
					System.out.print("ѡ�����:");
					dishNum = input.nextInt();
					System.out.print("����ʱ��:");
					time = input.nextInt();
					System.out.print("�����ַ:");
					address = input.next();
					sumPrice = prices[dishSeq-1]*dishNum;
					state = 0;
					
					names[orderSeq-1] = name;
					dishMsg[orderSeq-1] = dishNames[dishSeq-1]+" "+dishNum+"��";
					times[orderSeq-1] = time;
					addresses[orderSeq-1] = address;
					sumPrices[orderSeq-1] = sumPrice;
					states[orderSeq-1] = state;
					
					//��ʾ������Ϣ
					System.out.println("�����ɹ�!");
					System.out.println("��������:"+dishMsg[orderSeq-1]);
					System.out.println("�Ͳ�ʱ��:"+times[orderSeq-1]+"��");
					System.out.println("�ͷ�:"+sumPrices[orderSeq-1]+"Ԫ");
					
					//����0����,����������
					while(true){
						System.out.print("����0����:");
						chooseNum = input.nextInt();
						if(chooseNum==0){
							break;
						}else{
							System.out.println("������Ч");
							continue;
						}
					}
					continue;
					
					
				case 2:
					for(int i=0;i<=39;i++){
						System.out.print("*");
						if(i==19){
							System.out.print(manu[menuNum-1]);
						}
						if(i==39){
							System.out.println("");
						}
					}
					
					//��ʾ�ʹ�
					for(int i=0;i<=6;i++){
						System.out.print(orderForm[i]+"\t\t");
						
						if(i==6){
							System.out.println("");
						}
					}
					for(int i=0;i<=orderSeq-1;i++){
						System.out.print((i+1)+"\t\t");
						System.out.print(names[i]+"\t\t");
						System.out.print(dishMsg[i]+"\t");
						System.out.print(times[i]+"\t\t");
						System.out.print(addresses[i]+"\t\t");
						System.out.print(sumPrices[i]+"\t\t");
						if(states[i]==0){
							System.out.println("��Ԥ��"+"\t\t");
						}else if(states[i]==1){
							System.out.println("�����"+"\t\t");
						}
					}
					
					while(true){
						System.out.print("����0����:");
						chooseNum = input.nextInt();
						if(chooseNum==0){
							break;
						}else{
							System.out.println("������Ч");
							continue;
						}
					}
					continue;
					
					
				case 3:
					for(int i=0;i<=39;i++){
						System.out.print("*");
						if(i==19){
							System.out.print(manu[menuNum-1]);
						}
						if(i==39){
							System.out.println("");
						}
					}
					
					//�ʹ�ָ��������Ϊ�����
					System.out.print("����ǩ�յĶ������:");
					signNum = input.nextInt();
					states[signNum-1] = 1;
					System.out.println("ǩ�����");
					
					while(true){
						System.out.print("����0����:");
						chooseNum = input.nextInt();
						if(chooseNum==0){
							break;
						}else{
							System.out.println("������Ч");
							continue;
						}
					}
					continue;
					
					
				case 4:
					for(int i=0;i<=39;i++){
						System.out.print("*");
						if(i==19){
							System.out.print(manu[menuNum-1]);
						}
						if(i==39){
							System.out.println("");
						}
					}
					
					//ɾ��ָ������,���涩��ǰ��,���һ����ֵΪnull��0
					System.out.print("����ɾ���Ķ�����:");
					delNum = input.nextInt();
					
					for(int i=delNum-1;i<=orderSeq-2;i++){
						names[i] = names[i+1];
						dishMsg[i] = dishMsg[i+1];
						times[i] = times[i+1];
						addresses[i] = addresses[i+1];
						sumPrices[i] = sumPrices[i+1];
						states[i] = states[i+1];
					}
					names[orderSeq-1] = null;
					dishMsg[orderSeq-1] = null;
					times[orderSeq-1] = 0;
					addresses[orderSeq-1] = null;
					sumPrices[orderSeq-1] = 0;
					states[orderSeq-1] = 0;
					orderSeq--;//��������-1,���Ļ�Ӱ��1,2����
					
					while(true){
						System.out.print("����0����:");
						chooseNum = input.nextInt();
						if(chooseNum==0){
							break;
						}else{
							System.out.println("������Ч");
							continue;
						}
					}
					continue;
					
					
				case 5:
					for(int i=0;i<=39;i++){
						System.out.print("*");
						if(i==19){
							System.out.print(manu[menuNum-1]);
						}
						if(i==39){
							System.out.println("");
						}
					}
					
					//ָ���˵�����+1
					System.out.print("������޲˵����:");
					praiseSeq = input.nextInt();
					praiseNums[praiseSeq-1]++;
					System.out.println("���޳ɹ�");
					
					while(true){
						System.out.print("����0����:");
						chooseNum = input.nextInt();
						if(chooseNum==0){
							break;
						}else{
							System.out.println("������Ч");
							continue;
						}
					}
					continue;
					
					
				case 6:
					flag = false;
					break;//���breakֻ������switch,continue��switch��Ч,������һ��ѭ��������һ��		
			}
		}
		System.out.print("ллʹ��");
	}
}