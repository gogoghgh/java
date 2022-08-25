package stream.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable {
					// �� ����ȭ�ϰڴٴ� �ǵ��� ǥ��
	private static final long serialVersionUID = -1503252402544036183L; // ���� ������ ���� ����
	String name;
	String job;
	// transient String job; // transient �����

	public Person() {
	}

	public Person(String name, String job) {
		super();
		this.name = name;
		this.job = job;
	}

	public String toString() {
		return name + ", " + job;
	}
}

/////////////////////////////////////////////////////////////
public class SerializationTest {

	public static void main(String[] args) throws ClassNotFoundException {
		Person personAhn = new Person("�����", "��ǥ�̻�");
		Person personKim = new Person("��ö��", "���̻�");

		try (FileOutputStream fos = new FileOutputStream("serial.out");
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			// personAhn�� personKim�� ���� ���Ͽ� ��(����ȭ)
			oos.writeObject(personAhn);
			oos.writeObject(personKim);
		} catch (IOException e) {
			e.printStackTrace();
		}
		try (FileInputStream fis = new FileInputStream("serial.out");
				ObjectInputStream ois = new ObjectInputStream(fis)) {
			// personAhn�� personKim�� ���� ���Ͽ��� �о����(������ȭ)
			Person p1 = (Person) ois.readObject();
			Person p2 = (Person) ois.readObject();

			System.out.println("p1: " + p1);
			System.out.println("p2: " + p2);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}