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
    		System.out.println("��Һã��ҽ�"+name+",����"+age+"���ˣ�����"+address);
    	}
    }
    Person person=new Person();
    person.name="����";
    person.age=18;
    person.address="USA";
    
    person.introduce();
	}

}
