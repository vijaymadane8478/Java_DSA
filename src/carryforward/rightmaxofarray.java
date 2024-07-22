package carryforward;
/*
 * rightmax of array
 * max for i to n-1
 * arr {-3,6,2,4,5,2,8,-9,3,1}
 * rightmax {,8,8,8,8,8,8,8,3,3,1}
 */
public class rightmaxofarray {
    public static void main(String[] args) {
        int arr[]= new int[]{-3,6,2,4,5,2,8,-9,3,1};
        int rightmax[] = new int[arr.length];
        int N= arr.length;
        
        for(int i=0;i<N;i++){
            int maxele= Integer.MIN_VALUE;
            for(int j=i;j<N;j++){
                if(arr[j]>maxele){
                    maxele=arr[j];
                }
                rightmax[i]=maxele;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(rightmax[i]+" ");
        }
        
    }
    
}
