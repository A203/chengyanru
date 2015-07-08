package staticuse;

public class cyr1 {

	/**
	 * @param args
	 */
	int age;
	
	void hello(){
		System.out.println("hello...");
	}
	
	static String name="уехЩ";
	static void hi(){
		System.out.println("hi...");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        cyr1 d=new cyr1();
        System.out.println(cyr1.name);
        cyr1.hi();
	}

}
