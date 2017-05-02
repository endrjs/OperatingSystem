public class HeapTester {
            
    public static void main(String[] args) {
        int[] initialHoleSizes = {1000,4000,300,500,800};
        
        Heap h = new Heap(initialHoleSizes);
        
        int[] allocationRequests = {189,499,229,4199,709};
        
        for (int request : allocationRequests) {
            System.out.println("Requesting " + request + " bytes of memory");
            if (h.requestMemoryBestFit(request)) {
                System.out.println("-- Successful");
            } else {
                System.out.println("-- Unsuccessful");
            }             
        }
    }
}
