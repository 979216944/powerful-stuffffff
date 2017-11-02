
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class CountStrs {
    private static final ForkJoinPool POOL = new ForkJoinPool();
    private static final int CUTOFF = 1;

    public static int sequential(String[] arr, String str, int lo, int hi) {

    	
    	
    	
    	
        return 0;
    }

    public static int parallel(String[] arr, String str) {
        return 0;
    }

    
    private static class CountStrsTask extends RecursiveTask<Integer> {
        String[] arr;
        String str;
        int lo, hi;
        
        public CountStrsTask(String[] arr, int lo, int hi, String str) {
            this.arr = arr;
            this.lo = lo;
            this.hi = hi;
            this.str = str;
        }
        
        @Override
        protected Integer compute() {

        	
        	
        	
        	
        	
        	
        	

            return 0;
        }
    }
    
    public static void main(String[] args) {
        String[] arr = {"h", "ee", "llll", "llll", "oo", "llll"};
        System.out.println(parallel(arr, "llll") + " should be 3.");
        System.out.println(parallel(arr, "h") + " should be 1.");
    }
}
