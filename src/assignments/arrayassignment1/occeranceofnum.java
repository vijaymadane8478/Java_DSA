package assignments.arrayassignment1;
/*
 * find the number of occurrences
 * 
 * 1<=B Ai<=109
 * 1<=length(A)<=105
 * 
 * i/p: arr[1,2,2]
 * B = 2
 * o/p: 2 (count)
 */
public class occeranceofnum {
    public static void main(String[] args) {
        int arr[] = new int[]{1,2,2};

        int B =2;
        int count=0;
        for(int i=0;i<arr.length;i++){
                if(arr[i]==B){
                    count++;
                }
        }
        System.out.println(count);
    }
    
}
