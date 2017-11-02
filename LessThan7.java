
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class LessThan7 {
    private static final ForkJoinPool POOL = new ForkJoinPool();
    private static final int CUTOFF = 1;

    public static int sequential(int[] arr, int lo, int hi) {

    	
    	
        return 0;
    }

    public static int parallel(int[] arr) {
        return POOL.invoke(new LessThan7Task(arr, 0, arr.length));
    }

    private static class LessThan7Task extends RecursiveTask<Integer> {
        int[] arr;
        int lo, hi;
        
        public LessThan7Task(int[] arr, int lo, int hi) {
            this.arr = arr;
            this.lo = lo;
            this.hi = hi;
        }
        
        @Override
        protected Integer compute() {

        	
        	
        	
        	
        	
        	

            return 0;
        }
        
    }
    
    public static void main(String[] args) {
        System.out.println(parallel(new int[]{21, 7, 6, 8, 17, 1, 7, 7, 1, 1, 7}) + " should be 4.");
    }
}
