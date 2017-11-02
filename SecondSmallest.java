
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;
import java.util.Arrays;

public class SecondSmallest {
    private static final ForkJoinPool POOL = new ForkJoinPool();
    private static final int CUTOFF = 1;

    private static class TwoSmallest {
        int smallest, secondSmallest;
        public TwoSmallest() {
            smallest = secondSmallest = Integer.MAX_VALUE;
        }
    }

    public static TwoSmallest combine(TwoSmallest a, TwoSmallest b) {

    	
    	
    	
    	
    	
    	
        return new TwoSmallest(); 
    }

    public static TwoSmallest sequential(int[] arr, int lo, int hi) {

    	
    	
    	
    	
    	
    	return new TwoSmallest();
    }

    public static int parallel(int[] arr) {
        TwoSmallest result = POOL.invoke(new SecondSmallestTask(arr, 0, arr.length));
        return result.secondSmallest;
    }

    private static class SecondSmallestTask extends RecursiveTask<TwoSmallest> {
        int[] arr;
        int lo, hi;
        
        public SecondSmallestTask(int[] arr, int lo, int hi) {
            this.arr = arr;
            this.lo = lo;
            this.hi = hi;
        }
        
        @Override
        protected TwoSmallest compute() {

        	
        	
        	
        	
        	

            return new TwoSmallest();
        }
    }
    
    public static void main(String[] args) {
        System.out.println(parallel(new int[]{1, 7, 4, 3, 6}) + " should be 3.");
        System.out.println(parallel(new int[]{6, 1, 4, 3, 5, 2, 1}) + " should be 2.");
    }
}
