package IntrotoArray;
/*
 * Array size N
 * find ,,2nd largest elemet,
 * arr [8,4,1,3,9,2,6,7]
 * o/p: 8
 */
public class program5 {
    public static void main(String[] args) {
        int arr[] = new int[]{8,4,1,3,9,2,6,7};
        int N=8;

        int fle= Integer.MIN_VALUE;
        int sle=Integer.MAX_VALUE;
        
        for(int i=0;i<N;i++){
            if(arr[i]>fle){
                sle=fle;
                fle=arr[i];
            }else if (arr[i]>sle && arr[i]==fle) {
                sle=arr[i];
            }
        }
        System.out.println("2nd largest elemtn: "+sle);
    }
    
}
