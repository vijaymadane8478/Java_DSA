package carryforward;
/*
 * find max eelment till index 3;
 * o/p: 5
 */
public class maxelement {
    public static void main(String[] args) {
        int arr [] = new int[]{3,4,5,1,2,7,9,8};
        int i =3;
        int maxele=Integer.MIN_VALUE;
        for(int x =0;x<=i;x++){
            if(arr[x]>maxele){
                maxele=arr[x];
            }
        }
        System.out.println(maxele);
    }
    
}
