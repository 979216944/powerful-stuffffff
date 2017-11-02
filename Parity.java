
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class Parity {
    private static final ForkJoinPool POOL = new ForkJoinPool();
    private static final int CUTOFF = 1;

    private static boolean sequential(int[] arr, int lo, int hi) {

    	
    	
    	
    	
    	
        return false;
    }

    public static boolean parallel(int[] arr) {
        return false;
    }
    
    private static class ParityTask extends RecursiveTask<Boolean> {
        int[] arr;
        int lo, hi;
        
        public ParityTask(int[] arr, int lo, int hi) {
            this.arr = arr;
            this.lo = lo;
            this.hi = hi;
        }
        
        @Override
        protected Boolean compute() {

        	
        	
        	
        	
        	
        	
        	

            return false;
        }
    }   

    public static void main(String[] args) {
        System.out.println(parallel(new int[]{1, 7, 4, 3, 6}) + " should be true.");
        System.out.println(parallel(new int[]{6, 5, 4, 3, 2, 1}) + " should be false.");
    }
}
