package carryforward;
/*//Google 
 * given an char array lowecase
 * return count of pair
 * i<j
 * arr[i]=a
 * arr[j]=g
 * arr[a,b,e,g,a,g]
 * o/p:3
 */
public class paircode {
    public static void main(String[] args) {
        char arr[] = new char[]{'a','b','e','g','a','g'};

        int count=0;
        for(int i =0;i<arr.length;i++){
            if (arr[i]=='a') {
                for(int j=i+1;j<arr.length;j++)
                    if (arr[j]=='g') {
                        count++;
                    }
            }
        }
        System.out.println(count);
    }
    
}
