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
		return "ˮ��";
	}
}

class Apple extends Fruit{
	public String toString(){
		return "��֦";
	}
}

class Mango extends Fruit{
	public String toString(){
		return "â��";
	}
}

class  Juicer{
	public void juice(Fruit fruit){
		System.out.println("ե"+fruit+"֭");
		}
}