public class Abc
{
	public static void main(String[] args) 
	{
	    int a[]={1,2,3,4,5};
	    for(int i=0;i<5;i++)
	    {
	        if(i%2==0)
	        {
	            a[i]=a[i]++;
	        }
	        else 
	        {
	            a[i]=++a[i];
	        }
	    }
	    for(int i=0;i<5;i++)
	    {
	        System.out.print(a[i]+" ");
	    }
	}
}