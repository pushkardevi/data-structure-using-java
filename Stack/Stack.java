package Stack;

public class Stack {

	int stack[] = new int[5];
	int top;

	public void push(int data) {

		stack[top] = data;
		top++;

	}

	public void show() {

		for (int s : stack)
			System.out.println(s);
	}

}
