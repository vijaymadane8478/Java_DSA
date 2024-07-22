package assignments.arraybasics;

import java.util.Scanner;


/*
 *product of array elements 
 */
public class program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size");
        int arrSize = sc.nextInt();

        int arr[] = new int[arrSize];
        System.out.println("enter elements: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        long elproduct =1;
        for(int i=0;i<arr.length;i++){
            elproduct=elproduct*arr[i];
        }
        System.out.println(elproduct);
        sc.close();
    }
}
