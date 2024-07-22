package IntrotoArray;
/*
 * count of element having atleast 1 element greter than itself
 * arr:[2,5,1,4,8,0,8,1,3,8]
 * N:10
 * o/p:7
 * 1
 * TC:O(N)
 * TC:O()
 */
public class program2o {
    public static void main(String[] args) {
        int arr[]=new int[]{2,5,1,4,8,0,8,1,3,8};
        int count=0;
        int N=10;
        int max=Integer.MIN_VALUE;

        for(int i=0;i<N;i++){
            if(arr[i]>max){
                max=arr[i];
            }       
        }
        for(int i=0;i<N;i++){
            if(arr[i]==max){
                count++;
            }
        }
        System.out.println(N-count);
    }
}
