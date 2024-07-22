package carryforward;
/*
 * arr [-3,6,2,4,5,2,8,-9,3,1]
 * N 10
 * o/p: lefmax[-3,6,6,6,6,6,8,8,8,8]
 * brut force approch
 */
public class leftmaxofarray {
    public static void main(String[] args) {
        int arr [] = new int[]{-3,6,2,4,5,2,8,-9,3,1};

        int lefmax[] = new int[arr.length];
        
        for(int i= 0;i<arr.length;i++){
            int maxele= Integer.MIN_VALUE;
            for(int j=0;j<=i;j++){
                if(arr[j]>maxele){
                    maxele=arr[j];
                }
                lefmax[i]=maxele;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(lefmax[i]+" ");
        }
    }
    
}
