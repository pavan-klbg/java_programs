import java.util.Scanner;
public class Array_rev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter array length");
		int n=scan.nextInt();
		char a[] = scan.next().toCharArray();
		System.out.println("enter array elements");
		for(int i=0;i<=a.length-1;i++);
		{
			char a[]=scan.next().toCharArray();
		
		}
		char b[]=new char[a.length];
		int j=b.length-1;
		for(int i=0;i<=a.length-1;i++)
		{
			b[j]=a[i];
			j--;
			
		
		}
	System.out.println("after copying");
	for(int i=0;i<=b.length-1;i++)
		{
			System.out.println(b[j]"");

	}

}
