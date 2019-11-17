package mytest;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		show(new Robot());
		show(new Human());
		show(new Cat());
	}
	public static void show(Action act) {
	      act.commond(Action.EAT);	
	      act.commond(Action.WORK);
	      act.commond(Action.SLEEP);

	}

}
