import static org.junit.Assert.*;

public class LC209Test {

    @org.junit.Test
    public void minSizeSubArray() {

        int actual1 = LC209.minSizeSubArray(7, new int[] {2,3,1,2,4,3});
        int actual2 = LC209.minSizeSubArray(4, new int[] {1,4,4});
        int actual3 = LC209.minSizeSubArray(11, new int[] {1,1,1,1,1,1,1,1});

        assertEquals(2, actual1);
        assertEquals(1, actual2);
        assertEquals(0, actual3);

    }
}