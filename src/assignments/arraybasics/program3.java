package assignments.arraybasics;
/*
 * find largest element in array
 * N = 6
 * A[] ={1,8,7,56,90}
 */
public class program3 {
    public static void main(String[] args) {
        int arr[] = new int[]{1,8,7,56,90};
        int maxvalue=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>maxvalue){
                maxvalue=arr[i];
            }
        }
        System.out.println(maxvalue);
    }
    
}
