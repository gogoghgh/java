package p06.p06_17;

class BirthDay {
	int day, month, year;

	public void setYear(int year) {
		this.year = year;
	}

	public void printThis() {
		System.out.println(this);
	}
}

public class ThisExample {
	public static void main(String[] args) {
		BirthDay bDay = new BirthDay();
		bDay.setYear(2000);
		System.out.println(bDay);
		bDay.printThis();

	}
}
