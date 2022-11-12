
public class Subset {

	public static void main(String[] args) {
		int[] a= {4,1,7,2,6};
		int[] b= {4,2,6};
		boolean flag=false;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++) 
			{
				if(b[j]==a[i])
				{
					flag=true;
				}
			}
		}
		if(flag==true)
		{
			System.out.println("Array b is subset of Array a");
		}
		else
		{
			System.out.println("Array b is not subset of Array a");
		}
	}
}


