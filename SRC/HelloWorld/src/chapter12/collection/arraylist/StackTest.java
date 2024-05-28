package chapter12.collection.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

class MyStack{
	private ArrayList<String> arrayStack = new ArrayList<String>();
	
	public void push(String data) {
		arrayStack.add(data);
	}
	
	public String pop() {
		int len = arrayStack.size();
		if(len == 0) {
			System.out.println("스택이 비었습니다.");
			return null;
		}
		return(arrayStack.remove(len - 1));
	}
	
	public void deleteAll() {
		Iterator<String> ir = arrayStack.iterator();
		while(ir.hasNext()) {
			arrayStack.remove(0);
		}
	}
} // end class

public class StackTest {
	public static void main(String[] args) {
		MyStack stack = new MyStack();
		stack.push("A");
		stack.push("B");
		stack.push("C");
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		stack.push("A");
		stack.push("B");
		stack.push("C");
		
		stack.deleteAll();
		
		System.out.println(stack.pop());
		
	} // end main
} // end class
