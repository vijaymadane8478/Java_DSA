package assignments.arrayassignment1;
/*
 * arr [1,2,3,4,5]
 * B   [0,3] [1,2,]
 * O/P   10     5
 */
public class rangesumquery {
    public static void main(String[] args) {
        int arr[]= new int[]{1,2,3,4,5};

        int presum[] = new int[arr.length];
        
        presum[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            presum[i]=presum[i-1]+arr[i];
        }

        int B[][]= new int[][]{{0,3},{1,2}};

        for(int i=0;i<B.length;i++){
            //System.out.println(B[][]);
        }
    }
    
}
