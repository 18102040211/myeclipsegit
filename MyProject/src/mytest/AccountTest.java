package mytest;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount anAccount;					
		anAccount=new BankAccount("Zhangqiang", 10023, 0);
		anAccount.setBalance(anAccount.getBalance()+100);
		System.out.println("Here is the account��"+ anAccount.toString());
		System.out.println("Account name��"+ anAccount.getOwnerName());
		System.out.println("Account number��"+anAccount.getAccountNum());
		System.out.println("Balance��$"+anAccount.getBalance());
		anAccount=new BankAccount("Wanghong", 10024, 0);
		System.out.println(anAccount.toString());
		anAccount.deposit(225.67f);
		anAccount.deposit(300.00f);
		System.out.println(anAccount.toString());
		anAccount.withdraw(400.17f);
		System.out.println(anAccount.toString());
	}
}
class BankAccount									//�����˺��ඨ��
{	private String ownerName;
	private int accountNum;
	private float Balance;
	public BankAccount()								//�޲ι��췽��
	{  	this("  ", 0, 0);	  }
	public BankAccount(String _Name, int _Num, float _Balance)		//�вι��췽��
	{	ownerName= _Name;  	accountNum=_Num;  	Balance=_Balance;
	}
	public void setOwnerName (String newName)			//������������
	{	ownerName=newName;   }
	public String getOwnerName()						//��ȡ��������
	{	return ownerName;   }
	public void setAccountNum (int newNum)			//�����˺ŷ���
	{	accountNum=newNum;   }
	public int getAccountNum()							//��ȡ�˺ŷ���
	{	return accountNum;   }
	public void setBalance (float newBalance)				//���ô���
	{	Balance=newBalance;   }
	public float getBalance()							//��ȡ����
	{	return Balance;   }
	public String toString()							//�ַ���ת�����
	{	return("Account #"+accountNum+"with balance $"+Balance);	}
	public float deposit(float anAccount)					//����
	{	Balance=Balance+ anAccount;  
		return(Balance);
	}
	public float withdraw(float anAccount)				//ȡ���
	{	Balance = Balance - anAccount;	
		return(Balance);
	}
}

