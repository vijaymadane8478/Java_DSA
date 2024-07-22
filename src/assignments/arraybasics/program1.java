package assignments.arraybasics;

import java.util.Scanner;

/*
 * n = 4
 * arr [1,2,3,4]
 * find given element present in array or not
 */
public class program1 {
    public static void main(String[] args) {
        int arr[] = new int[]{1,2,3,4};
        int N =4;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no to search");
        int serachnum = sc.nextInt();

        for(int i=0;i<N;i++){
            if(serachnum==arr[i]){
                System.out.println(i);
            }else {
                System.out.println("not present in array");
            }
            //break;
        }
        sc.close();
    }
    
}
