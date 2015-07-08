package DongTai;

public class cyr1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		class Animal {
			public String str="Animal";
			public void hello(){
				System.out.println("Animal...");
			}
		}
		class Tiger extends Animal{
			public void hello(){
				System.out.println("Tiger...");
			}

		}

		//Animal a=new Animal();
		//System.out.println(a.str);
		//a.hello();
		
		//Tiger b=new Tiger();
		//System.out.println(b.str);
		//b.hello();		
		Animal a=new Tiger();
		System.out.println(a.str);
		a.hello();//¶¯Ì¬°ó¶¨
	}

}
