package mytest;
abstract class Goods								//定义抽象类
{  String goods;
   float price;
   double total;
   int num;
   public abstract void goods(String _goods, float _price, int _num); //定义抽象方法
}
class Common extends Goods						//定义子类(一级子类)
{  public void showCommon()
   {  System.out.println("这是一个普通用户");   }
   public void goods(String _goods, float _price, int _num)
   {	   goods=_goods;
	   price=_price;
	   num=_num;
	   total=_price*_num;						//调用父类的变量
	}
	public void showBuy()
	{  System.out.println("货物："+goods);
	   System.out.println("价格："+price);
	   System.out.println("数量："+num);
	   System.out.println("总价："+total);
	}
}
final class Associator extends Common			//定义终结子类(二级子类)
{	public void showAssociator()
	{   System.out.println("这是一个会员用户");  }
	public void showBuy()
	{	super.showBuy();
		System.out.println("作为会员用户，享受9折优惠");
		System.out.println("总价："+total*0.9);
	}
}

public class BuyGoods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Common AA=new Common();				//声明一级子类对象并初始化
		AA.showCommon();						//调用一级子类内部成员方法
		AA.goods("电视机", 3800, 2);				//实例化对象
		AA.showBuy();							//调用一级子类内部成员方法
		Associator BB=new Associator();			//声明二级子类对象并初始化
		BB.goods("洗衣机", 1980, 3);				//实例化对象
		BB.showAssociator();						//调用二级子类内部成员方法
		BB.showBuy();	

	}

}
