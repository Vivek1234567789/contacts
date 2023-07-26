package phonebook;
import java.util.*;

public class phoneview {
	
	void display()
	{
		System.out.println("1.enter new contact");
		System.out.println("2.display all  contacts");
		System.out.println("3.edit exsting contack contact");
	}
	void message(String message)
	{
		System.out.println(message);
	}
	
	
	void displaylist(ArrayList<phmodel> tasks)
	{
		for(int i=0;i<tasks.size();i++)
		{
			phmodel task=tasks.get(i);
			System.out.println((i+1)+"."+task.getName()+" ph:"+ task.getPh()+"mail:"+ task.getMail());
			
		}
		
	}
	
	
   
}
