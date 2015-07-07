package ifuse;

import java.util.Scanner;

public class cyr1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scanner=new Scanner(System.in);
	int score=scanner.nextInt();
    if(score>100||score<0)
    {
    	System.out.println("输入有误");
    }
    else if(score>=60)
        {
        	System.out.println("考试及格");
        }	
        else
        {
        	System.out.println("考试不及格");
        }
	}

}
