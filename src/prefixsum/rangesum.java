package prefixsum;

import java.util.Scanner;

/*
 * range sum witin array element
 * take user input
 * startindex
 * endindex
 */
public class rangesum {
    public static void main(String[] args) {
        
        int arr[] =new int[]{7,2,5,3,11,7,9,4};
        Scanner sc = new Scanner(System.in);
        System.out.println("enter values for start and end: ");
        int startindex = sc.nextInt();
        int endindex = sc.nextInt();
        int sum = 0;
        for(int i=startindex;i<endindex;i++){
                sum = sum+arr[i];
        }
        System.out.println(sum);
        sc.close();
    }
    
}
