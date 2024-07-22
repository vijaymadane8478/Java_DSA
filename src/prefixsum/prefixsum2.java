package prefixsum;
/*
 * array size N
 * construct prefix sum of Array
 * return array integer denoting prefix sum of given array
 */
public class prefixsum2 {
    public static void main(String[] args) {
        int arr[] = new int[]{1,2,3,4,5};
        int N = 5;

        //prefix sum

        int presum[] = new int[N];

        presum[0]=arr[0];
        for(int i=1;i<N;i++){
            presum[i]=presum[i-1]+arr[i];
        }
        for(int i=0;i<N;i++){
            System.out.println(presum[i]);
        }
    }
    
}
