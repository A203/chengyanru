package Phone;

public class cyr1 {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		class Phone{
			String name;
			String brand;
			int price;
			void call(){
				System.out.println("打电话。。。");
			}
			void sendMsg(){
				System.out.println("发短信。。。");
			}
		}
	Phone p=new Phone();
    p.name="note";
    p.brand="爆米花";
    p.price=199;
    
    System.out.println(p.name);
    p.sendMsg();
    }

	}


