package mytest;
abstract class Goods								//���������
{  String goods;
   float price;
   double total;
   int num;
   public abstract void goods(String _goods, float _price, int _num); //������󷽷�
}
class Common extends Goods						//��������(һ������)
{  public void showCommon()
   {  System.out.println("����һ����ͨ�û�");   }
   public void goods(String _goods, float _price, int _num)
   {	   goods=_goods;
	   price=_price;
	   num=_num;
	   total=_price*_num;						//���ø���ı���
	}
	public void showBuy()
	{  System.out.println("���"+goods);
	   System.out.println("�۸�"+price);
	   System.out.println("������"+num);
	   System.out.println("�ܼۣ�"+total);
	}
}
final class Associator extends Common			//�����ս�����(��������)
{	public void showAssociator()
	{   System.out.println("����һ����Ա�û�");  }
	public void showBuy()
	{	super.showBuy();
		System.out.println("��Ϊ��Ա�û�������9���Ż�");
		System.out.println("�ܼۣ�"+total*0.9);
	}
}

public class BuyGoods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Common AA=new Common();				//����һ��������󲢳�ʼ��
		AA.showCommon();						//����һ�������ڲ���Ա����
		AA.goods("���ӻ�", 3800, 2);				//ʵ��������
		AA.showBuy();							//����һ�������ڲ���Ա����
		Associator BB=new Associator();			//��������������󲢳�ʼ��
		BB.goods("ϴ�»�", 1980, 3);				//ʵ��������
		BB.showAssociator();						//���ö��������ڲ���Ա����
		BB.showBuy();	

	}

}
