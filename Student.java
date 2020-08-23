package Association;

public class Student {
String studentName;
String studentId;
Course course;
Student(){
	
}
Student(String studentName,String studentId){
	this.studentName=studentName;
	this.studentId=studentId;
}
void setstudentName(String studentName) {
	this.studentName=studentName;
}
void setstudentId(String studentId) {
	this.studentId=studentId;
}
String getstudentName() {
	return this.studentName;
}
String getstudentId() {
	return this.studentId;
}
void insertCourse(Course course) {
	this.course=course;
	course.setcourseId("CSC1205");
	course.setcourseName("OOP-1");
}
void showCourseInformation() {

	System.out.println("Course Name:"+course.getcourseName());
	System.out.println("Course ID:"+course.getcourseId());
	System.out.println("Student Name:"+getstudentName());
	System.out.println("Student ID:"+getstudentId());
}
}
