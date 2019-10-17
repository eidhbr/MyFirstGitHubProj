import java.util.Scanner;
public class LunchPro{
	public static void main(String[] args){
		//定义数据主体
		//由于不能改数组类型,所以只能名称单独一组,单价单独一组，这样一类一组,而不能名称价格点赞数一组
		//菜品:名称,单价,点赞数
		String[] dishmenu = {"序号","菜名","单价","点赞数"};
		String[] dishNames = {"红烧带鱼","宫保鸡丁","时令蔬菜"};
		double[] prices = {56,24,18};
		int[] praiseNums = new int[3];
		
		//订单:订单人,餐品信息,送餐时间,送餐地址,总金额,订单状态
		String[] orderForm = {"序号","订餐人","餐品信息","送餐时间","送餐地址","总金额","订单状态"};
		String[] names = new String[5];
		String[] dishMsg = new String[5];
		int[] times = new int[5];
		String[] addresses = new String[5];
		double[] sumPrices = new double[5];
		int[] states = new int[5];//0:已预定,1:已完成
		
		//系统用
		String[] manu = {"我要订餐","查看餐袋","签收订单","删除订单","我要点赞","退出系统"};
		Scanner input = new Scanner(System.in);
		int menuNum,chooseNum;
		boolean flag=true;
		String name,address;
		int dishSeq,dishNum,time,state,signNum,delNum,praiseSeq;
		int orderSeq = 0;
		double sumPrice;
		
		
		//先搭建整体框架,根据需要定义数据主题
		System.out.println("欢迎使用订餐系统");
		while(flag){
			//显示订餐界面
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
			
			//若输入非1到6数字,则重复选择
			while(true){
				System.out.print("选择数字(1-6):");
				menuNum = input.nextInt();
				if(menuNum>=1 && menuNum<=6){
					break;
				}else{
					System.out.println("数字无效");
					continue;
				}
			}
			

			//根据选择的数字进入不同情况
			switch(menuNum){
				case 1:
					//显示标题
					for(int i=0;i<=39;i++){
						System.out.print("*");
						if(i==19){
							System.out.print(manu[menuNum-1]);
						}
						if(i==39){
							System.out.println("");
						}
					}
					
					System.out.print("输入姓名:");
					name = input.next();
					orderSeq++;
					//显示菜单
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
					
					//将信息存入数组
					System.out.print("选择菜品序号:");
					dishSeq = input.nextInt();
					System.out.print("选择份数:");
					dishNum = input.nextInt();
					System.out.print("输入时间:");
					time = input.nextInt();
					System.out.print("输入地址:");
					address = input.next();
					sumPrice = prices[dishSeq-1]*dishNum;
					state = 0;
					
					names[orderSeq-1] = name;
					dishMsg[orderSeq-1] = dishNames[dishSeq-1]+" "+dishNum+"份";
					times[orderSeq-1] = time;
					addresses[orderSeq-1] = address;
					sumPrices[orderSeq-1] = sumPrice;
					states[orderSeq-1] = state;
					
					//显示订单信息
					System.out.println("订单成功!");
					System.out.println("您订的是:"+dishMsg[orderSeq-1]);
					System.out.println("送餐时间:"+times[orderSeq-1]+"点");
					System.out.println("餐费:"+sumPrices[orderSeq-1]+"元");
					
					//输入0返回,否则再输入
					while(true){
						System.out.print("输入0返回:");
						chooseNum = input.nextInt();
						if(chooseNum==0){
							break;
						}else{
							System.out.println("数字无效");
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
					
					//显示餐袋
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
							System.out.println("已预定"+"\t\t");
						}else if(states[i]==1){
							System.out.println("已完成"+"\t\t");
						}
					}
					
					while(true){
						System.out.print("输入0返回:");
						chooseNum = input.nextInt();
						if(chooseNum==0){
							break;
						}else{
							System.out.println("数字无效");
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
					
					//餐袋指定订单变为已完成
					System.out.print("输入签收的订单序号:");
					signNum = input.nextInt();
					states[signNum-1] = 1;
					System.out.println("签收完成");
					
					while(true){
						System.out.print("输入0返回:");
						chooseNum = input.nextInt();
						if(chooseNum==0){
							break;
						}else{
							System.out.println("数字无效");
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
					
					//删除指定订单,后面订单前移,最后一个赋值为null和0
					System.out.print("输入删除的订单号:");
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
					orderSeq--;//订单总数-1,不改会影响1,2功能
					
					while(true){
						System.out.print("输入0返回:");
						chooseNum = input.nextInt();
						if(chooseNum==0){
							break;
						}else{
							System.out.println("数字无效");
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
					
					//指定菜点赞数+1
					System.out.print("输入点赞菜单序号:");
					praiseSeq = input.nextInt();
					praiseNums[praiseSeq-1]++;
					System.out.println("点赞成功");
					
					while(true){
						System.out.print("输入0返回:");
						chooseNum = input.nextInt();
						if(chooseNum==0){
							break;
						}else{
							System.out.println("数字无效");
							continue;
						}
					}
					continue;
					
					
				case 6:
					flag = false;
					break;//这个break只能跳出switch,continue对switch无效,是外面一层循环跳到下一轮		
			}
		}
		System.out.print("谢谢使用");
	}
}