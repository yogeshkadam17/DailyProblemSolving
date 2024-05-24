package day2;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Armyto {
	
	//ArrayList<TreeMap<String,ArrayList<Node>>> finalStrategy =new ArrayList<>();
	ArrayList<TreeMap<String,ArrayList<Node>>> treat =new ArrayList<>();
	ArrayList<TreeMap<String,ArrayList<Node>>> Loyal =new ArrayList<>();
	
	static int [] genrateRandomSequence()
	{
		 int [] arr = {1,2,3,4};
		 
		 int []arr1= {};
		 int flag=0;
		 boolean c=true;
		 int a1=-1;
		 int a2=-1;
		 int a3=-1;
		 int a4=-1;
		 for(int i=0;i<4;i++)
		 {
			 
			  int n1=(int) Math.random()*4;
			  if(flag==0)
			  {
				arr1[n1]=i+1;
				a1=n1;
				flag=1;
			  }
			  
			  
			  while(c)
				{
					  int n=(int) Math.random()*4;
					if(a1!=n&&a1!=-1)
					{
						arr1[n]=i+1;
						a2=i+1;
						c=false; 
					}
					else if(a2!=n&&a1!=-1&&a2!=-1)
					{
						arr1[n]=i+1;
						a3=i+1;
						c=false; 
					}
					else if(a3!=n&&a1!=-1&&a2!=-1&&a3!=-1)
					{
						arr1[n]=i+1;
						a4=i+1;
						c=false;
					}
					
					
				}
			 
		 }
		 return arr1;
	}
	static void Threat(Node n)
	{
		 
		 
	}
	
	static void LoyalHire(Node n)
	{
		
	}
	static void Loyal(Node n)
	{
	//	System.out.println("Enter The Number Of Loyal You want to Hire");
		//Scanner s6= new Scanner(System.in);
		
		Scanner s= new Scanner(System.in);

		//int d=s6.nextInt();
		
		System.out.println("Enter do Your like   India/Bharat yes or no");
		
		boolean b= true;
		b=s.nextBoolean();
		boolean c=true;
	int  j=(int )Math.random();
	int  k=(int) Math.random()*4+1;
	int l = 0;
	int m = 0;
	int n1=0;
	while(c)
	{
		  l=(int) Math.random()*4+1;
		if(k!=l)
		{
			c=false; 
		}
	}
	c=true;
	while(c)
	{
		  m=(int) Math.random()*4+1;
		if(l!=m)
		{
			c=false; 
		}
	}
	c=true;
	while(c)
	{
		  n1=(int) Math.random()*4+1;
		if(n1!=m)
		{
			c=false; 
		}
	}
	
	
		int arr3[]=genrateRandomSequence();
		
		System.out.println("Enter the given 8 inputs according to text ");
		
		
		System.out.println("Enter input for "+k+" th value");
		boolean first=s.nextBoolean();
		System.out.println("Enter input for "+l+" th value");
		boolean second =s.nextBoolean();
		System.out.println("Enter input for "+m+" th value");
		boolean third =s.nextBoolean();
		System.out.println("Enter input for "+n+" th value");
		boolean  fourt=s.nextBoolean();
		System.out.println("Enter input for "+arr3[0]+" th value");
		boolean fifth=s.nextBoolean();
		System.out.println("Enter input for "+arr3[1]+" th value");
		boolean sixth=s.nextBoolean();
		System.out.println("Enter input for "+arr3[2]+" th value");
		boolean seventh =s.nextBoolean();
		System.out.println("Enter input for "+arr3[3]+" th value");
		boolean eigth= s.nextBoolean();
		
		
		for(int i=1;i<=4;i++)
		{
			System.out.println("Answer of the query is if Assumtion is True"); 
			System.out.println("1st is F");
			System.out.println("2nd is F");
			System.out.println("3rd is T");
			System.out.println("4rd is T");
			
			System.out.println("Answer of the query is if Assumtion is False"); 
			System.out.println("1st is T");
			System.out.println("2nd is T");
			System.out.println("3rd is F");
			System.out.println("4rd is F");
		}
	
	
	
		
	}
	
	static void finalStrategy(Node n)
	{
		
	}
	class Node{
		 String id;
		 String Position;
		 String task;
		 
		  Node(String id)
		  {
			   this.id=id;
		  }
		  Node(String id,String Position)
		  {
			   this.id=id;
			   this.Position=Position;
		  }
		  
		  Node(String id,String Position,String task)
		  {
			   this.id=id;
			   this.Position=Position;
			   this.task=task;
			   
		  }
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 Node n= new Armyto().new Node("1","King","Hiring");
		 Loyal(n);
		// Threat(n);
		// finalStrategy(n);
		
		
	}

}
