package mytest;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount anAccount;					
		anAccount=new BankAccount("Zhangqiang", 10023, 0);
		anAccount.setBalance(anAccount.getBalance()+100);
		System.out.println("Here is the account："+ anAccount.toString());
		System.out.println("Account name："+ anAccount.getOwnerName());
		System.out.println("Account number："+anAccount.getAccountNum());
		System.out.println("Balance：$"+anAccount.getBalance());
		anAccount=new BankAccount("Wanghong", 10024, 0);
		System.out.println(anAccount.toString());
		anAccount.deposit(225.67f);
		anAccount.deposit(300.00f);
		System.out.println(anAccount.toString());
		anAccount.withdraw(400.17f);
		System.out.println(anAccount.toString());
	}
}
class BankAccount									//银行账号类定义
{	private String ownerName;
	private int accountNum;
	private float Balance;
	public BankAccount()								//无参构造方法
	{  	this("  ", 0, 0);	  }
	public BankAccount(String _Name, int _Num, float _Balance)		//有参构造方法
	{	ownerName= _Name;  	accountNum=_Num;  	Balance=_Balance;
	}
	public void setOwnerName (String newName)			//设置姓名方法
	{	ownerName=newName;   }
	public String getOwnerName()						//获取姓名方法
	{	return ownerName;   }
	public void setAccountNum (int newNum)			//设置账号方法
	{	accountNum=newNum;   }
	public int getAccountNum()							//获取账号方法
	{	return accountNum;   }
	public void setBalance (float newBalance)				//设置存款方法
	{	Balance=newBalance;   }
	public float getBalance()							//获取存款方法
	{	return Balance;   }
	public String toString()							//字符串转换输出
	{	return("Account #"+accountNum+"with balance $"+Balance);	}
	public float deposit(float anAccount)					//存款方法
	{	Balance=Balance+ anAccount;  
		return(Balance);
	}
	public float withdraw(float anAccount)				//取款方法
	{	Balance = Balance - anAccount;	
		return(Balance);
	}
}

