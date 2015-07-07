package xing;

import java.util.Scanner;

public class cyr2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input=new Scanner(System.in);
		    System.out.println("«Î ‰»Î––∫≈£∫");
		    int num=input.nextInt();
		    for(int i=1;i<=num;i++){
		    	//¥Ú”°ø’∏Ò
		    	for(int j=1;j<num-i;j++){
		    		System.out.println(" ");
		    	}
		    	//¥Ú”°–«∫≈
		    	for(int j=1;j<=i*2-1;j++){
		    		System.out.println("*");
		    	}
		    	System.out.println();
		    }
	}

}
