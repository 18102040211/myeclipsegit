package mytest;

public class Heavyload1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*��Heavyload��,���������Ҫ���ÿһ����͵����������
		 * һ�����������ÿ�����������ƶ�����ͬ���ڵ��õĹ�����
		 * �ͺ���������������õ�����һ�ַ�����Ϊ�˽���������
		 * java����������һ�������ж�����������ͬ�ķ���������
		 * ���������ͺ͸������벻ͬ��������Ƿ��������ء����£�*/
		int sum1=add(1,2);
		int sum2=add(1,2,3);
		double sum3=add(1.2,1.3);
		//����ķ���ʵ���˴�ӡ��͵Ľ��
		System.out.println("sum1="+sum1);
		System.out.println("sum2="+sum2);
		System.out.println("sum3="+sum3);
	}
	//����ķ���ʵ���������������
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
