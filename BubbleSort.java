
public class BubbleSort {

	public static void main(String[] args) {
		int[] a= {7,9,5,1,3};
		for(int i=0;i<a.length;i++)
		{
			for(int j=1;j<a.length;j++)
			{
				if(a[j-1]>a[j])
				{
					int temp=a[j];
					a[j]=a[j-1];
					a[j-1]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++)
		{
		System.out.print(" "+a[i]);
		}
	}
}
