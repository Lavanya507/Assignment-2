
public class Duplicates {

	public static void main(String[] args) {
		int[] ar={6,2,6,3,3,8,1};
		for(int i=0;i<ar.length;i++)
		{   
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]==ar[j])
				{
					System.out.print(" "+ar[i]);
				}
			}
		}
	}
}
