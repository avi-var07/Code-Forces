import java.util.*;

class Solution
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		Scanner sc = new Scanner(System.in);
		
        System.out.println("Enter number of test cases: ");
		int t = sc.nextInt();
		while(t-->0){
            System.out.println("Enter the number of elements: ");
		    int n = sc.nextInt();
		    
		    int arr[] = new int[n];
		    
            System.out.println("Enter the elements: ");
		    for(int i=0;i<n;i++)
		    arr[i]=sc.nextInt();
		    
		    Set<Integer>set = new HashSet<>();
		    
		    
		    for(int ele: arr)
		    set.add(ele);;
		    
		    System.out.println("Number of friendships that Devu can save is: "+set.size());
		    
		}

        sc.close();

	}
}
