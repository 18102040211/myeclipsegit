package mytest;

public class Heavyload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�����Ƕ���͵ķ����ĵ��ã�������
		int sum1=add01(1,2);
		int sum2=add02(1,2,3);
		double sum3=add03(1.2,1.3);
		//�����Ǵ�ӡ��͵Ľ��
		System.out.println("sum1="+sum1);
		System.out.println("sum2="+sum2);
		System.out.println("sum3="+sum3);
		
	}
	//����ķ���ʵ�����������������
	public static int add01(int x,int y) {
		return x+y;
	}
	//����ķ���ʵ�����������������
	public static int add02(int x,int y,int z) {
		return x+y+z;
	}
	//����ķ���ʵ�����������������
	public static double add03(double x,double y) {
		return x+y; 
	}
	
}
