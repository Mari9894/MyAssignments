package week1.day1;

public class Student {
	public void studentName() {
		System.out.println("NAME : Murugeshwari");
	}
	private int rollno(int r) {
		return r;
	}
	void collegeName() {
		System.out.println("COLLEGE NAME : JACSICE");
	}
	public int markScored(int mark) {
		return mark;
	}
	public float cgpa(float c) {
		return c;
	}
	public static void main(String[] args) {
		Student s=new Student();
		s.studentName();
		System.out.println("ROLLNO:"+s.rollno(35));
		s.collegeName();
		System.out.println("MARK IS :"+s.markScored(440));
		System.out.println("CGPA IS:"+s.cgpa(83.4f));
	}

}
