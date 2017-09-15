import java.text.SimpleDateFormat;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		
		//You may test that your code works find here
		//Please check that your code works and has no 
		//compilation problems before to submit
		try{
		//StudentGroup sg=new StudentGroup(5);
		String date1="1995-07-21";
		Date d1=new SimpleDateFormat("yyyy-mm-dd").parse(date1);
		Student s1=new Student(1,"rakesh adepu",d1,70.55);
		System.out.println(s1.getId());
		}
		catch(Exception e){e.printStackTrace();}
	}

}
