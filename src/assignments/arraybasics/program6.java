package assignments.arraybasics;
/*
 * arr [1,4,5,2,7,8,3]
 * A = 2
 * B = 5
 * check array element within element
 */
public class program6 {
    public static void main(String[] args) {
        int arr[] = new int[]{1,4,5,2,7,8,3};
        int A = 2;
        int B = 5;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==A){
                for(int j = 0;j<arr.length;j++)
                    if(arr[i]==B){
                        System.out.println();
                    }
            }
        }
        System.out.println("element beetwen range "+A+" "+B);
    }
}
