package Association;

public class Start {

	public static void main(String[] args) {
		try{
		Course ob1=new Course();
		Course course;
		Student s1=new Student("Jenee","19-41724-3");
		s1.insertCourse(ob1);
		s1.showCourseInformation();
		}
		catch(Exception e) {
			System.out.println(e);
			System.out.println("Exception Caught!!");
		}
		finally {
			System.out.println("ABCD");
		}
	}

}
