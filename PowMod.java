
import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

public class PowMod {
    private static final ForkJoinPool POOL = new ForkJoinPool();
    private static final int CUTOFF = 1;

    public static void sequential(int[] arr, int pow, int mod, int lo, int hi) {

    	
    	
    	
    	
    	
    	
    }

    public static void parallel(int[] arr, int pow, int mod) {
        
    }

    private static class PowModTask extends RecursiveAction {
        int[] arr;
        int lo, hi;
        int pow, mod;
        
        public PowModTask(int[] arr, int pow, int mod, int lo, int hi) {
            this.arr = arr;
            this.lo = lo;
            this.hi = hi;
            this.pow = pow;
            this.mod = mod;
        }
        
        @Override
        protected void compute() {

        	
        	
        	
        	
        	
        	
        	
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 7, 4, 3, 6};
        parallel(arr, 6, 5000);
        System.out.println(Arrays.toString(arr) + " should be [1, 2649, 4096, 729, 1656]");
    }
}
