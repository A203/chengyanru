package GouZaoFangFa;

public class cyr1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    class Person{
    	String name;
    	int age;
    	String address;
    	
    	void introduce(){
    		System.out.println("大家好，我叫"+name+",今年"+age+"岁了，我在"+address);
    	}
    }
    Person person=new Person();
    person.name="张三";
    person.age=18;
    person.address="USA";
    
    person.introduce();
	}

}
