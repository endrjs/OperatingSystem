import java.util.*;

public class AutoMark2 {
            
    public static void main(String[] args) {
        int[] initialHoleSizes = {300,1600,550,900,6120};
        
        Heap h = new Heap(initialHoleSizes);
        
        ReferenceHeap r = new ReferenceHeap(initialHoleSizes);

        int[] allocationRequests = {440,320,112,12,489,2910,851,589,83,2,82,18,38,138,28,218,328,388,3400,76,661,700,61,590,58,414,616,313,212,111};
        boolean[] answers = {true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,false,true,true,true,true,false,true,true,false,false,false,false};
        int mark = 0;
        int ex = 0;
        String feedback = "";        

        for (int i = 0; i < allocationRequests.length; ++i) {
            //System.out.println("Requesting " + request + " bytes of memory");
            boolean rightAnswer = false;
            r.requestMemoryBestFit(allocationRequests[i]);

            try {
                // right answer if the result of the allocation request, is that known to be correct
                rightAnswer = (h.requestMemoryBestFit(allocationRequests[i]) == answers[i]);
            }
            catch (Exception e) {
                ++ex;
            }

            if (rightAnswer) {
                // get a mark
                ++mark;
            } else {
                // else, restore the holes on the heap, to match those of the reference heap
                System.out.println("Wrong answer to allocation request " + i + " - copying holes from reference solution");
                ArrayList<Integer> tmp = new ArrayList<>();
                    
                
                // get all the hole sizes
                {

                    MemControlBlock curr = r.firstBlock;

                    while (curr != null) {
                        if (curr.available) {
                            tmp.add(curr.size);
                        }
                        curr = curr.next;
                    }

                }

                // transplant into an array
                int[] recoveredHoles = new int[tmp.size()];
                for (int rh = 0; rh < tmp.size(); ++rh) {
                    recoveredHoles[rh] = tmp.get(rh);
                }

                // rebuild the student's heap
                h = new Heap(recoveredHoles);
            }
        }
        
        if (ex == 0) {
            System.out.println(mark * 2 + ",\"" + feedback + "\"");
        } else if (ex == 1) {
            System.out.println(mark * 2 + ",\"" + feedback + " threw an exception for one allocation request\"");
        } else {
            System.out.println(mark * 2 + ",\"" + feedback + " threw an exception for " + ex + " allocation requests\"");
        }
    }
}
