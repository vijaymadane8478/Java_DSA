package prefixsum;

import java.util.Scanner;

/*
 * array size N
 * no of query Q
 * start and end index 
 * print sum from start and end index
 */
public class prefixsum {
    public static void main(String[] args) {
        int arr[] = new int[]{-3,6,2,4,5,2,8,-9,3,1,};
        int N = 10;
        int Q= 3;

        //prefix sum
        int presum[] = new int[N];
        presum[0]=arr[0];
        for(int i=1;i<N;i++){
            presum[i]=presum[i-1]+arr[i];
        }

        Scanner sc = new Scanner(System.in);
        int sum =0;

        for(int i=0;i<Q;i++){
            System.out.println("Enter start and end index");
            int startindex = sc.nextInt();
            int endindex =sc.nextInt();

            if(startindex==0){
                sum= presum[endindex];
            }else{
                sum=presum[endindex]-presum[startindex-1];
            }

            System.out.println(sum);
            
        }
       
    }
    
}
