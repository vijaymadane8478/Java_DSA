package IntrotoArray;
/*
 * array size N
 * count pair of arr[i] +arr[j]=k
 * arr[2 5 2 1 -3 7 8 15 6 13]
 * N = 10
 * K = 10
 * i!=j
 * O/p: 6
 */

public class program3 {
    public static void main(String[] args) {
        int arr[] = new int[]{2,5,2,1,-3,7,8,15,6,13};
        
        int N = 10;
        int K = 10;
        int count=0;
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(i!=j){
                    if(arr[i]+arr[j]==K){
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
        
    }
    
}
