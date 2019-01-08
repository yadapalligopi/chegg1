package chegg1;
import java.util.*;

public class Test {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal[] a=new Animal[5];
		int fightcounter=0;
		int i,x,y,speed,j,count=0;
		Animal obj=null,obj1;
		String name;
		a[0]=new Animal("gopi",0,0,2);
		a[1]=new Animal("ravi",1,0,2);
		a[2]=new Animal("mahi",0,1,3);
		a[3]=new Animal("venu",1,1,4);
		a[4]=new Animal("suma",1,2,5);
		
		/*Scanner s=new Scanner(System.in);
		for(i=0;i<5;i++)
		{
			name=s.nextLine();
			x=s.nextInt();
			y=s.nextInt();
			speed=s.nextInt();
			a[i]=new Animal(name,x,y,speed);
		}*/
		for(i=0;i<5;i++)
		{
			obj=a[i];
			System.out.println(obj.x+" " +obj.y+ " " + obj.name);
		}
		for(i=0;i<5;i++)
		{
			obj=a[i];
			obj.move();
		} 
		count++; 
		//System.out.println("after first move:);
		System.out.println(" the values are after  first move the animals :");
		for(i=0;i<5;i++)
		{
			obj=a[i];
			System.out.println(obj.getX()+" "+obj.toString());
			
			
		}
		while(fightcounter<5)
		{
				for(i=0;i<5&&fightcounter<5;i++)
				{
					obj=a[i];
					for(j=i+1;j<5;j++)
					{
						obj1=a[j];
						/*if(obj1.touching(obj))*/
						if(obj.touching(obj1)&&fightcounter<5)
						{
							System.out.println("Fight: "+"the two animals are:"+ obj.name+" "+obj1.name);
							System.out.println("\n");
							
							fightcounter++;
						}
						/*else
						{
							
							System.out.println("no animal plaed in the same place");
							System.out.println("\n");
						}*/						
					}
					
				}
				
				
				for(i=0;i<5;i++)
				{
					obj=a[i];
					System.out.println(obj.x+" " +obj.y+ " " + obj.name);
				}
				System.out.println(" +++++++++++++++++++++++++++++++\n");
				if(fightcounter<5)
				{
					for(i=0;i<5;i++)
					{
						obj=a[i];
						obj.move();
					}
					count++;
					System.out.println (" the values are: after "+count+" move the animals\n  ");
					for(i=0;i<5;i++)
					{
						obj=a[i];
						System.out.println(obj.getX()+" "+obj.toString());
						
						
					}
				}
				
		}
		
		System.out.println( "\nit's program ends up to complete five fights between animals:"+   fightcounter);
		

	}

}
