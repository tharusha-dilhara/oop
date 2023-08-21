package oop_lab_exam;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class Lottery {
	
	int[] lotteryNumbers=new int[5];
	int[] userNumber=new int[5];
	ArrayList<Integer> matchdigit=new ArrayList<Integer>();
	public static int count;
	
	
	
	Random r1=new Random();
	
	public Lottery() {
		for(int x=0;x<5;x++) {
			lotteryNumbers[x]=r1.nextInt(10);
		}
	}
	
	public void setusernumber() {
		Scanner s1=new Scanner(System.in);
		for(int i=0 ; i <5 ; i++) {
			System.out.print("enter the Numbers:");
			userNumber[i]=s1.nextInt();
		}
	}
	
	public void Match() {
		
		for(int x=0;x<5;x++) {
			if(userNumber[x] == lotteryNumbers[x]) {
				count++;
				matchdigit.add(userNumber[x]);
			}
		}
		
		// display usetr number
				System.out.print("User's Numbers: : ");
				for(int x=0;x<5;x++) {
					System.out.print(userNumber[x] + " ");
				}
				
				System.out.print("\n");
				
				//dispal lotter number for random generate
				System.out.print("Lottery Numbers : ");
				for(int x=0;x<5;x++) {
					System.out.print(lotteryNumbers[x] + " ");
				}
				
				
				
				System.out.print("\n");
				
				//dispaly count
				System.out.println("Number of matching digits: " + count);
				
				
				System.out.print("Matching digits : ");
				
				for(Integer x :  matchdigit) {
					System.out.print(x + "  ");
				}
				
	}
	

	
	
	public static void main(String args[]) {
		
		Lottery l1=new Lottery();
		l1.setusernumber();
		l1.Match();
		
		
		
		

		
	}
	
	
	
	
	

}
