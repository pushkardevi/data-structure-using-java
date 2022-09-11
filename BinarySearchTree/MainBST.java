package BST;

import java.util.Scanner;

public class MainBST {

	public static void main(String[] args) {

		int n, val;

		Scanner sc = new Scanner(System.in);
		BST bst = new BST();
		do {

			System.out.println("1: Add New Node");
			System.out.println("2: Traverse");
			System.out.println("3: Exit");

			n = sc.nextInt();
			switch (n) {
			case 1:
				System.out.println("Enter Number to be inserted ");
				val = sc.nextInt();
				bst.insert(val);
				break;
			case 2:
				System.out.println("Traversal");
				bst.traverse();
				break;
			case 3:
				System.exit(0);
			default:
				System.out.println("Invalid choice");
			}

		} while (n != 3);

	}

}
