package phonebook;
import java.util.*;
public class Main {
	public static void main(String[] args)
	{
		phoneview view=new phoneview();
		phcontroller con=new phcontroller();
		while(true)
		{
			view.display();
			Scanner sc=new Scanner(System.in);
			int c=sc.nextInt();
			if(c==1)
			{
				con.addcontact();
				
			}
			else if(c==2)
			{
				  view.displaylist(con.getTasks());
				  
			}
			else if(c==3)
			{
				
			
				con.editcon(con.getTasks());
				
			}
			
		}
		
	}

}
