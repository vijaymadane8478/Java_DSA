package assignments.arraybasics;
/*
 * find min and max element in array 
 * N = 6
 * A[] ={3,2,1,56,10000,167}
 * 
 */
public class program2 {
    public static void main(String[] args) {
        int arr[] = new int[]{3,2,1,5,6,1000,467};
        int N = 6;
        
        int minvalue = Integer.MAX_VALUE;
        int maxvalue = Integer.MIN_VALUE;
        
        for(int i =0;i<N;i++){
            for(int j=0;j<N;j++){
                if (arr[i]<minvalue) {
                        minvalue=arr[i];
                }
                if(arr[i]>maxvalue){
                        maxvalue=arr[i];
                }
            }
        }
        System.out.println(maxvalue);
        System.out.println(minvalue);     
    }
    
}
