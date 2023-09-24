
public class ReverseArray {

	public void display(int array[])
	{
		System.out.println("Original Array");
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]+ " ");
		}
	}
	
	public void reverse(int array[])
	{
		System.out.println("Reversed Array");
		for(int i=array.length-1;i>=0;i--)
		{
			System.out.println(array[i]+ " ");
		}
	}
}
