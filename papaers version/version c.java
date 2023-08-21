package oop_lab_exam;
import java.util.Random;

public class RandNum {
	
	int [][] arr  = new int[5][5];
	int max;
	int min;
	int avg=0;
	
	Random r1=new Random();
	
	public RandNum() {
		for(int x=0;x < 5 ; x++) {
			for(int i=0;i < 5 ; i++) {
				arr[x][i]=r1.nextInt(101);
			}
		}
	}
	
	public void calculate() {
		min=arr[0][0];
		max=arr[0][0];
		
		int tot=0;
		
		for(int x=0;x < 5 ; x++) {
			for(int i=0;i < 5 ; i++) {
				if(max < arr[x][i]) {
					max = arr[x][i];
				}
				
				if(min > arr[x][i]) {
					min = arr[x][i];
				}
				
				tot += arr[x][i];
			}
		}
		
		avg=tot / 25;
		
	}
	
	public void display() {
		
		System.out.println("max number : " + max  );
		System.out.println("min number : " + min  );
		System.out.println("avgerage  : " + avg  );
		
	}
	
	
	public static void main(String args[]) {
		RandNum r1=new RandNum();
		r1.calculate();
		r1.display();
	}
	
	
	
	
}
