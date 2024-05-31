package chapter15.stream.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

class Person implements Serializable{

	private static final long serialVersionUID = -8961481776643514582L;
	
//	transient String name; // transient 직렬화에서 제외
	String name;
	String job;
	
	public Person() {}
	
	public Person(String name, String job) {
		this.name = name;
		this.job = job;
	}
	
	public String toString() {
		return name + ", " + job;
	}
}// end Person

public class SerializationTest {
	public static void main(String[] args) {
		Person personAhn = new Person("안재용", "대표이사");
		Person personKim = new Person("김철수", "상무이사");
		
		
		ArrayList<Person> pList = new ArrayList<Person>();
		pList.add(personAhn);
		pList.add(personKim);
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			fos = new FileOutputStream("serial.out");
			oos = new ObjectOutputStream(fos);
			
			// personAHn과 personKim의 값을 파일에 씀(직렬화)
			oos.writeObject(pList);
//			oos.writeObject(personAhn);
//			oos.writeObject(personKim);
			
		} catch (IOException e) {
			e.printStackTrace();
		} // end catch
		
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			fis = new FileInputStream("serial.out");
			ois = new ObjectInputStream(fis);
			
			//personAhn과 personKim의 값을 파일에서 읽어들임(역직렬화)
			ArrayList<Person> readList = (ArrayList<Person>) ois.readObject();

			for(int i = 0; i < readList.size(); i++) {
				System.out.println(readList.get(i));
			}
//			Person p1 = (Person)ois.readObject();
//			Person p2 = (Person)ois.readObject();
//			
//			System.out.println(p1);
//			System.out.println(p2);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}// end try
	} // end main
} // end class
