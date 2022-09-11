
public class TowerOfHanoi {

	public static void main(String[] args) {

		int disks = 3;
		TowerOfHanoi.move(disks, 'A', 'B', 'C');

	}

	public static void move(int top, char from, char using, char to) {

		if (top == 1) {

			System.out.println(" Disk from " + from + " to " + to);

		}

		else {

			move(top - 1, from, to, using);
			System.out.println(" Disk from " + top + " from " + from + " to " + to);

			move(top - 1, using, from, to);
			System.out.println(" Disk from " + top + " from " + from + " to " + to);
		}
	}

}
