import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of test cases: ");
        int t = sc.nextInt();

        while (t-- > 0) {
            System.out.println("Enter number of days: ");
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            
            System.out.println("Enter "+n+" scores of Alice: ");
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            
            System.out.println("Enter "+n+" scores of Bob: ");
            for (int i = 0; i < n; i++) {
                b[i] = sc.nextInt();
            }
            // Your code goes here
            int ans = a.length;
            for(int i = 0; i<a.length;i++ ){
                if(a[i]<b[i]){
                    if((a[i]*2)<b[i])ans--;
                }
                else if(a[i]>b[i]){
                    if((b[i]*2)<a[i])ans--;
                }
                else continue;
            }
            
            System.out.println("Both were happy together for "+ans+" days!");
        
            
        }

        sc.close();
    }
}
