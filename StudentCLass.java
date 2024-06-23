package encapsulation;

public class StudentCLass {
	private	int rollNumber;
	private	String name;
	private	boolean isAttended;

	public StudentCLass(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public void setStudentClassAttendence(boolean flag) {
		isAttended = flag;
		System.out.println("teacher assigned attended");
	}
	public boolean getStudentClassAttendence() {
		System.out.println("teacher accessed Student Attendance");
		return isAttended;

	}
}