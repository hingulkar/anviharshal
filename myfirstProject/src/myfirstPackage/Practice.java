package myfirstPackage;

public class Practice {

	public static void main(String[] args) {
		
		
		int a[] = {20,33,25,40,55};
		int size= a.length;
		int lastIndex= (size-1);
		int b[]= new int [size];
		
		for(int i=0 ;i<size; i++)
		{
			System.out.print(a[i]+" ");
			
		}
		
		for(int i=0 ;i<size; i++)
		{
			b[i]=a[lastIndex-i];
		}
		
		a=b;
		System.out.println();
		
		for(int i=0 ;i<size; i++)
		{
			System.out.print(a[i]+" ");
		}
		
		
		
		
		
	}
		
}
