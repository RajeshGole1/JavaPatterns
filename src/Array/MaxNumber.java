package Array;

public class MaxNumber {
public static void main(String[] args) {
	int  []a= {12,65,-43,0,2,-98,34};
	int max=a[0];
	
	for(int i=0;i<a.length;i++)
	{
		if(max<a[i])
		{
			max=a[i];
			
		}
	}
	System.out.println("max numnber form given array:- "+max);
}
}
