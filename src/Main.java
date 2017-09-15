import java.text.SimpleDateFormat;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		
		//You may test that your code works find here
		//Please check that your code works and has no 
		//compilation problems before to submit
		try{
	
		String date1="1995-07-21";
		String date2="1996-05-25";
		String date3="1990-10-21";
		String date4="2003-02-18";
		String date5="2010-04-22";
		Date d1=new SimpleDateFormat("yyyy-mm-dd").parse(date1);
		Date d2=new SimpleDateFormat("yyyy-mm-dd").parse(date2);
		Date d3=new SimpleDateFormat("yyyy-mm-dd").parse(date3);
		Date d4=new SimpleDateFormat("yyyy-mm-dd").parse(date4);
		Date d5=new SimpleDateFormat("yyyy-mm-dd").parse(date5);
		Student s1=new Student(1,"rakesh adepu",d1,70.55);
		Student s2=new Student(2,"vineeth dasary",d2,74.05);
		Student s3=new Student(3,"abhishek hazari",d3,75.90);
		Student s4=new Student(4,"shashank enugala",d4,80.55);
		Student s5=new Student(5,"praveen medboina",d5,90.55);
		
		
		StudentGroup sg=new StudentGroup(5);
		sg.setStudent(s1,0);
		sg.setStudent(s2,1);
		sg.setStudent(s3,2);
		sg.setStudent(s4,3);
		sg.setStudent(s5,4);
	
		Student obj=sg.getStudent(0);
		System.out.println(obj.getId()+"  "+obj.getFullName()+"  "+obj.getBirthDate()+"  "+obj.getAvgMark());
		Student obj1=sg.getStudent(1);
		System.out.println(obj1.getId()+"  "+obj1.getFullName()+"  "+obj1.getBirthDate()+"  "+obj1.getAvgMark());
		Student obj2=sg.getStudent(2);
		System.out.println(obj2.getId()+"  "+obj2.getFullName()+"  "+obj2.getBirthDate()+"  "+obj2.getAvgMark());
		Student obj3=sg.getStudent(3);
		System.out.println(obj3.getId()+"  "+obj3.getFullName()+"  "+obj3.getBirthDate()+"  "+obj3.getAvgMark());
		Student obj4=sg.getStudent(4);
		System.out.println(obj4.getId()+"  "+obj4.getFullName()+"  "+obj4.getBirthDate()+"  "+obj4.getAvgMark());
		
		}
		catch(Exception e){e.printStackTrace();}
	}

}
