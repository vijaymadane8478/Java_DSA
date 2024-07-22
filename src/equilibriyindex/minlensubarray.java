package equilibriyindex;

public class minlensubarray {
    public static void main(String[] args) {
        int arr[]= new int[]{1,2,3,1,3,4,6,4,6,3};
        int minlen = Integer.MAX_VALUE;
        int len =0 ;
        int minvalue = Integer.MAX_VALUE;
        int maxvalue = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]<minvalue){
                maxvalue=arr[i];
            }
            if(arr[i]>maxvalue){
                maxvalue=arr[i];
            }
        }
        for(int i =0;i<arr.length;i++){
            if(arr[i]==minvalue){
                for(int j=i+1;j<arr.length;j++){
                    if(arr[i]==maxvalue){       
                        len = j-i+1;
                        if(minlen>len){
                            minlen=len;
                    }
                }
            }
        }
            else if (arr[i]==maxvalue) {
                for(int j=i+1;j<arr.length;j++){
                        if(arr[j]==minvalue){
                            len=j-i+1;
                        }
                        if(minlen>len){
                            minlen=len;
                        }
                }
                
            }
        }
        System.out.println();
    }
}

