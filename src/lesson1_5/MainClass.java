package lesson1_5;

import java.util.LinkedList;
import java.util.List;
///sdfsf
public class MainClass {
public void g() {}
	public static int F()throws Exception
	{
		throw new Exception("sdfsf");
	}
	public static void main(String[] args) //throws Exception 
	{
		try {
			F();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		
		System.out.println("sdsdfsdf");
		List<Integer> intLst =new LinkedList<Integer>();
		intLst.add(1);
		for (Integer integer : intLst) {
			
		}
		Student s1 = new Student();
		Student s2 = new Student();
		if(s1.equals(s2))
		{
			System.out.println("Equals");
		}
		
		s1.setName("asdf");
		
	}

}
