class One {
	public void callme(One O1) {
		System.out.println("this class is:"+ O1);
	}
}

class Two extends One{
	public void callme(Two T1) {
		System.out.println("this class is:"+ T1);
	}
}

public class RunTimeInheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		One obj1 = new One();
		obj1.callme(obj1);
		
		One obj2 = new Two();
		obj1.callme(obj2);
		
		//Two obj3 = new One(); // This wont compile
		//obj1.callme(obj3);

	}

}
