package IntrotoArray;
/*
 * array size N = 8
 * reverse array witiout extra space
 * arr[8,4,1,3,9,2,6,7]
 * O/P: [7,6,2,9,3,1,4,8]
 */
public class program4 {
    public static void main(String[] args) {
        int arr[]=new int[]{8,4,1,3,9,2,6,7,};
        int N =8;
        int i =0;
        int j=N-1;
        
        while (i<j) {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            j--;
            i++;
        }
        for(int k=0;k<N;k++){
            System.out.println(arr[k]);
        }
    }
}
    

