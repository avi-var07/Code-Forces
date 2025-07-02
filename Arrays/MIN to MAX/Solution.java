/* */

import java.util.*;

class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of test cases: ");
        int t = sc.nextInt();
        
        while (t-- > 0) {
            System.out.println("Enter number of elements: ");
            int n = sc.nextInt();
            
            System.out.println("Enter " + n + " elements:");
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            // Your code goes here
            int mini = a[0];
            for(int ele: a){
                if(ele<mini)mini=ele;
            }
            
            int count =0;
            for(int ele: a){
                if(ele==mini)count++;
            }
            
            System.out.println("Operations required are: "+(n-count));
        }
        sc.close();
    }
}