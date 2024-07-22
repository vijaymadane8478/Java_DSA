package assignments.arrayassignment1;
/*
 * 1<=N<=105
 * -109<=A[i]<=109
 * 
 * find sum of max and min element in array
 * i/p: arrr=[-2,1,-4,5,3]
 * o/p: 1
 */
public class maxminsumofarray {
    public static void main(String[] args) {
        int arr[] = new int[]{-2,1,-4,5,3};

        int maxele = Integer.MIN_VALUE;
        int minele = Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>maxele){
                maxele=arr[i];
            }
            if(arr[i]<minele){
                minele=arr[i];
            }
        }
        int sum=maxele+minele;
        System.out.println(sum);
    }
    
}
