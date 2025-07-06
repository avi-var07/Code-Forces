import java.util.*;

class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of test cases: ");

        int t = sc.nextInt();
		while(t-->0){
            System.out.println("Enter number of elements: ");
		    int  n  = sc.nextInt();
		    int arr[] = new int[n];

            System.out.println("Enter "+ n + " elements: ");
		    for(int i=0;i<n;i++)
		    arr[i]=sc.nextInt();
		    
		    Map<Integer, Integer> map = new HashMap<>();
		    
		    for(int ele: arr)map.put(ele, map.getOrDefault(ele,0)+1);
		    
		    int maxFreq = 0;
		    
		    for(int freq: map.values()){
		        if(freq>maxFreq)maxFreq=freq;
		    }
		    
		    int countMaxFreq = 0;
            for(int freq : map.values()) {
                if(freq == maxFreq) {
                    countMaxFreq++;
                }
            }
            
            if(countMaxFreq==1)System.out.println("YES");
            else System.out.println("NO");
		}

        
        sc.close();
    }
}