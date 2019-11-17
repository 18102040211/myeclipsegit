package mytest;

public class Heavyload1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*在Heavyload中,这个程序需要针对每一种求和的情况都定义
		 * 一个方法，如果每个方法的名称都不相同，在调用的过程中
		 * 就很难区分哪种情况该调用哪一种方法。为了解决这个问题
		 * java程序允许在一个程序中定义多个名称相同的方法，但是
		 * 参数的类型和个数必须不同，这个就是方法的重载。如下：*/
		int sum1=add(1,2);
		int sum2=add(1,2,3);
		double sum3=add(1.2,1.3);
		//下面的方法实现了打印求和的结果
		System.out.println("sum1="+sum1);
		System.out.println("sum2="+sum2);
		System.out.println("sum3="+sum3);
	}
	//下面的方法实现了两个整数相加
	public static int add(int x,int y){
		return x+y;
	}
	public static int add(int x,int y, int z) {
		return x+y+z;
	}
	public static double add(double x,double y) {
		return x+y;
	}
}
