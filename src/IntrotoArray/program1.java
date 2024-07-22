package IntrotoArray;
/*
 * array size N
 * arr: [5,6,2,3,1,9]
 * n:9
 * print the array
 * 
 * TC:O(N)
 * SC:O(1)
 */
public class program1 {
    public static void main(String[] args) {
        int arr[]= new int[]{5,6,2,3,1,9};
        int N = 6;

        for(int i=0;i<N;i++){
            System.out.println(arr[i]);
        }
        System.out.println(arr.length);
    }
    
}
