package ZhiShu;

public class cyr1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    for(int num=2;num<=100;num++){
    	//判断是否为质数
    	boolean flag=true;
    	for(int i=2;i<num;i++){
    		if(num%i==0){
    			flag=false;
    			break;
    		}
    	}
    	if(flag){
    		System.out.println(num+"\t");
    	}
    }
	}

}
