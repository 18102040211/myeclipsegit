package mytest;

public class Heavyload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//下面是对求和的方法的调用，即方法
		int sum1=add01(1,2);
		int sum2=add02(1,2,3);
		double sum3=add03(1.2,1.3);
		//下面是打印求和的结果
		System.out.println("sum1="+sum1);
		System.out.println("sum2="+sum2);
		System.out.println("sum3="+sum3);
		
	}
	//下面的方法实现了两个整数的相加
	public static int add01(int x,int y) {
		return x+y;
	}
	//下面的方法实现了三个整数的相加
	public static int add02(int x,int y,int z) {
		return x+y+z;
	}
	//下面的方法实现了两个整数的相加
	public static double add03(double x,double y) {
		return x+y; 
	}
	
}
