package abst;

abstract class member {
private	String name;
abstract void welcomeMessage();
}
class student extends member{
	void welcomeMessage() {
		System.out.println("hello student..");
	}
}
class teacher extends member{
	void welcomeMessage() {
		System.out.println("hello teacher..");
	}}
public class Abss {

	public static void main(String[] args) {
	student s=new student();
	teacher t=new teacher();
	//s.welcomeMessage();
   // t.welcomeMessage();
	//member m=new teacher();
	member[] m=new member[4];
	m[0]=new student();
	m[1]=new student();
	m[2]=new teacher();
	m[3]=new teacher();
	
	for(member m1:m) {
		m1.welcomeMessage();
	}
	}

}
