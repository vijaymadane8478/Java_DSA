package subarray;

public class countnoofsubarray {
    public static void main(String[] args) {
        int arr[] = new int[]{4,2,10,3,2,-2,15};
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                count++;
            }
        }
        System.out.println(count);
    }
    
}
