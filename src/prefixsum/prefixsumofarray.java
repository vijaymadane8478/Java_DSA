package prefixsum;

public class prefixsumofarray {
    public static void main(String[] args) {
        int arr[] = new int[]{1,2,3,4,5};

        int prefixsumofarray[] = new int[arr.length];

        prefixsumofarray[0]=arr[0];
        //prefixsumarray
        for(int i=1;i<arr.length;i++){
            prefixsumofarray[i]=prefixsumofarray[i-1]+arr[i];
        }
        //printint array
        for(int i=0;i<arr.length;i++){
            System.out.print(prefixsumofarray[i]+" ");
        }
    }

}
