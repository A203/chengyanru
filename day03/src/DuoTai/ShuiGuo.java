package DuoTai;

public class ShuiGuo {

	public static void main(String[] args) {
		Juicer j=new Juicer();	
		Fruit fruit=new Mango();	
		j.juice(fruit); 
	}
	
}

class Fruit {
	public String toString(){
		return "Ë®¹û";
	}
}

class Apple extends Fruit{
	public String toString(){
		return "ÀóÖ¦";
	}
}

class Mango extends Fruit{
	public String toString(){
		return "Ã¢¹û";
	}
}

class  Juicer{
	public void juice(Fruit fruit){
		System.out.println("Õ¥"+fruit+"Ö­");
		}
}