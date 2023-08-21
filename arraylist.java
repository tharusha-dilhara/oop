package test;
import java.util.Scanner;
import java.util.ArrayList;

public class testarray {

	public static void main(String[] args) {
		
		Scanner s1=new Scanner(System.in);
		
		ArrayList<String> a1=new ArrayList<String>();
		
		a1.add("test");
		a1.add("test2");
		a1.add("test3");
		
		a1.set(1,"test10");
		
		a1.remove(2);
		
		a1.clear();
		
		for(String x : a1) {
			System.out.println(x);
		}
		
		
		
		
		
	}

}
