package chapter5;

public class Person {
	
	int age;
	String name;
	int height;
	int weight;
	int p2, p3;
	Person pp1 = null; // 참조형 변수

	// 생성자
	public Person() {
		this(20, "뫄뫄마", 150, 50);
		System.out.println("나는 생성자이다.");
	}
	
	public Person(int age, String name) {
		this(age, name, 0, 0); // 효율적
	}
	
	public Person(int age, String name, int height, int weight) {
//		this();
		this.age = age; // X : age = age (네코짱 안됨~~~)
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	
	public void showInfo() {
		System.out.println("age: " + age);
		System.out.println("name: " + name);
		System.out.println("height: " + height);
		System.out.println("weight: " + weight);
	}
	
	public static void main(String[] args) {
		
		Person p1 = new Person(20, "홍길동", 185, 80);
//		p1.showInfo();
		
		p1.pp1 = new Person();
		System.out.println(p1.height);
		System.out.println(p1.pp1.name);
		
//		Person p2 = new Person();
//		p2.showInfo();
		
		p1.name = new String("홍길동");
		p1.name = "홍길동";
		p1.pp1 = new Person();
		
	}
}
