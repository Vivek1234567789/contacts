package phonebook;

import java.util.ArrayList;

import java.util.Scanner;

public class phcontroller {
private ArrayList<phmodel> tasks;
     public phcontroller()
     {
    	 tasks=new ArrayList<>();
     }
     public ArrayList<phmodel> getTasks()
     {
    	 return tasks;
     }


	 void addcontact()
	   {
		 phmodel m1=new phmodel("gowtham","123456789","abc@gmail");
		 phmodel m2=new phmodel("waseem","456789123","cba@gmail");
		 tasks.add(m1);
		 tasks.add(m2);
		Scanner sc=new Scanner(System.in);
		System.out.print("enter contact name:");
		String name=sc.nextLine();
		System.out.print("enter phone number:");
		String ph=sc.nextLine();
		System.out.print("enter contact mailId:");
		String mail=sc.nextLine();
		phmodel m=new phmodel(name,ph,mail);
		tasks.add(m);
	} 
	 void editcon(ArrayList<phmodel> tasks)
		{
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter edit name");
		 String name=sc.nextLine();
		 System.out.println("enter new phone number");
		 String newph=sc.nextLine();
			for(int j=0;j<tasks.size();j++)
			{
				phmodel task=tasks.get(j);
				String k=task.getName();
				if(k.equals(name))
				{
					task.setPh(newph);
				}
				
			}
			
		}
	 

}
