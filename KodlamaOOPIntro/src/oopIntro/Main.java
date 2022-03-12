package oopIntro;

public class Main {

	public static void main(String[] args) {
		Course courses1= new Course(0, "Java","Backend", "Engin Demirog");
		Course courses2= new Course(1, "Css","Frontend", "Murat Yücedag");
		Course courses3= new Course(2, "C#","Backend", "Engin Demirog");
		Course courses4= new Course(3, "Ruby","Backend,", "Engin Demirog");
		Course courses5= new Course(4, "Html","Frontend", "Mustafa Kızılok");
		Course courses6= new Course(5, "Python","Backend", "Engin Demirog");
		Course courses7= new Course(6, "Go", "Backend", "Murat Yücedag");

		Course[] courses= {courses1,courses2,courses3,courses4,courses5,courses6,courses7};
		for (Course course : courses) {
			System.out.println(course.id);
			System.out.println(course.coursename);
			System.out.println(course.category);
			System.out.println(course.instructor);
			System.out.println("--- --- --- --- ---");
	
		}

		CourseManager courseManager= new CourseManager();
		courseManager.addCourse(courses1);
		courseManager.deleteCourse(courses5);
		
		
		
		
		
		
		
	}

}
