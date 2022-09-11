package Singletone;

public class Single {

	static Single obj;

	private Single() {

	}

	public static Single getObject() {

		if (obj == null) {
			obj = new Single();
		}
		return obj;

	}

}
