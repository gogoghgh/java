package p06.p06_14;

import java.util.Scanner;

public class MyDateTest {

	public static void main(String[] args) {
		System.out.println("year, month, day ������� �Է�>>");
		Scanner sc = new Scanner(System.in);
		MyDate date1 = new MyDate();
		
		
		date1.setYear();
		date1.setMonth();
		date1.setDay();
		
		System.out.println();
		System.out.print(date1.getYear() + "��  " + date1.getMonth() + "��  " + date1.getDay() + "��");
		System.out.println();
		if (date1.isValid() == true) {
			System.out.println("��ȿ�� ��¥�Դϴ�");
		} else
			System.out.println("��ȿ���� ���� ��¥�Դϴ�");

//		MyDate date2 = new MyDate(2, 10, 2006);
//		System.out.println(date2.isValid());
//		if (date1.isValid() == true) {
//			System.out.println("��ȿ�� ��¥�Դϴ�");
//		} else
//			System.out.println("��ȿ���� ���� ��¥�Դϴ�");

//		date.setYear(2023);
//		date.setMonth(2);
//		date.setDay(28);
//
//		System.out.println(date.getYear() + "��");
//		System.out.println(date.getMonth() + "��");
//		System.out.println(date.getDay() + "��");

	}

}