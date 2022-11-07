package gitproject;

import java.util.Scanner;

public class Git {public static void main(String[]args) {
	@SuppressWarnings("resource")
	Scanner sc =new Scanner(System.in);
	System.out.println("enter the naumber");
	int no =sc.nextInt();
	int i;
	int temp =0;
	for(i=2;i<=no-1;i++) {
		if(no%i==0) {
			temp=temp+1;
		}
	    }
	if(temp>0) {
		System.out.println("no is not prime ");
	}
	else {
		System.out.println("no is  prime");
	}
}


}
