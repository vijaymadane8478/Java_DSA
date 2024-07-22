package assignments.arraybasics;
/*
 * N =1005
 * replace 0 with 5
 */
public class program5 {

    public static int converttofive(int N){
        String numstr = Integer.toString(N);
        numstr = numstr.replace("0", "5");
        int result= Integer.parseInt(numstr);
        return result;
        
    }
    public static void main(String[] args) {
        int N = 1005;
        int result = converttofive(N);
        System.out.println("Input: "+N);
        System.out.println("Output: "+result);
    }
    
}
