DUPLICATE ELEMENTS AND ITS COUNT IN ARRAY: IN JAVA


public class duplicateelementandcount { 
	public static void main(String args[])
	{ 
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE NO OF ELEMENTS TO ADD IN ARRAY");
		n=sc.nextInt();
		System.out.println("ENTER THE ELMENTS");
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		} 
		int b=0;
		for(int i=0;i<a.length;i++)
		{ b=1;
			if(a[i]!=-1)
			{
				for(int j=i+1;j<a.length;j++)
				{
					if(a[i]==a[j])
					{
						b++;
						a[j]=-1;
					}
				} 
				System.out.println(a[i]+"-"+b);
			} 
			
		}
		
	}

}  

INPUT:[1,2,3,1,2]

OUTPUT:
1-2
2-2
3-1
