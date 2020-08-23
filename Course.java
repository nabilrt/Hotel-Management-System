package Association;

public class Course {
String courseName;
String courseId;
Course(){
	
}
Course(String courseName,String courseId){
	this.courseId=courseId;
	this.courseName=courseName;
}
void setcourseName(String courseName) {
	this.courseName=courseName;
}
void setcourseId(String courseId) {
	this.courseId=courseId;
}
String getcourseName() {
	return this.courseName;
}
String getcourseId() {
	return this.courseId;
}
}
