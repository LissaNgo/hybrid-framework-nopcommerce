package javaBasic;

public class Topic_01_Variable {
	static int studentNumber;
	static boolean studentValue;

	static final String browserName = "Chrome";

	static int studentPrice;

	String studentName = "Automation FC";

	public static void main(String[] args) {

		int studentPrice = 0;
		System.out.println(studentPrice);
		System.out.println(studentNumber);
		System.out.println(studentValue);

		Topic_01_Variable topic = new Topic_01_Variable();
		System.out.println(topic.studentName);

	}

//Getter: getCurrentUrl/getTitle/egtText/getAttribute/getCssValue/getSize/getLocation/getPosition/.
	public String getStudentName() {
		return this.studentName;
	}

//Setter: click/sendkey/clear/select/back/forward/refresh/get/..
	public void setStudentName(String stdName) {
		this.studentName = stdName;
	}
}
