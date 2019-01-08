package chegg1;
import java.util.*;
import java.util.Random;
import java.lang.Object.*;

public class  Animal {

	String name;
	int x;
	int y;
	int maxspeed;
	Animal()
	{
		this.name="unknown";
		this.x=0;
		this.y=0;
		this.maxspeed=2;
	}
	Animal(String s,int x,int y,int speed)
	{
		this.name=s;
		this.x=x;
		this.y=y;
		this.maxspeed=speed;
		
	}
	Random rand = new Random();
	 int getX()
	{
		return x;
	}
	 int getY()
	 {
		 return y;
	 }
	public  String toString()
	 {
		 return name;
	 }
	/* boolean touching(Animal obj1)
	 {
		 Animal obj3=obj1;
		 int m=obj3.getX();
		 int n=obj.getX();
		 if(obj.getX==obj3.getX)
			 return true;
	 } */
	public boolean touching(Animal person)
	{
		   return this.x==person.x;
	}
	 void move()
	 {
		 int rand_int1 = rand.nextInt(5);
		 x=rand_int1;
	 }
	 
}
