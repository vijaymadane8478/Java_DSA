package carryforward;
/*
 * arr [-3,6,2,4,5,2,8,-9,3,1]
 * N 10
 * o/p: lefmax[-3,6,6,6,6,6,8,8,8,8]
 * optimized approach
 */
public class leftmax {
    public static void main(String[] args) {
        int arr[] = new int[]{-3,6,2,4,5,2,8,-9,3,1};
        int leftmax[] = new int[arr.length];

        leftmax[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            if(leftmax[i-1]<arr[i]){
                leftmax[i]=arr[i];
            }else{
                leftmax[i]=leftmax[i-1];
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(leftmax[i]+" ");
        }
    }
    
}
