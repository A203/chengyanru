package xing;
import java.util.Scanner;
public class cyr1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner input=new Scanner(System.in);
    System.out.println("�������кţ�");
    int num=input.nextInt();
    for(int i=1;i<=num;i++){
    	for(int j=1;j<=i;j++){
    		System.out.println("*");
    	}
    	System.out.println();
    }
        
	}

}
