package Singletone;

public class Singletone {

	public static void main(String[] args) {

		Single s1 = Single.getObject();
		Single s2 = Single.getObject();
		
		System.out.println(s1);
		System.out.println(s2);
	}

}
