package com.github.tb25;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class mergeTest {
    Main m = new Main();

    //Junits that only do simple cases such as repeated
    @Test
    void testMerge1() {
        int [] a = {1, 2, 3};
        int [] b = {4, 5, 6};

        int[] result = {1, 2, 3 , 4, 5, 6};
        int[] merge = m.mergeArray(a,b);
    }

    @Test
    void testMerge2() {
        int [] a = {1, 2, 3, 7};
        int [] b = {4, 4, 4, 4};

        int[] result = {1, 2, 3, 4, 4, 4, 4, 7};
        int[] merge = m.mergeArray(a,b);
    }

    @Test
    void testMerge3() {
        int [] a = {2, 3, 6, 7};
        int [] b = {5, 6, 7, 8};

        int[] result = {2, 3, 5, 6, 7, 8};
        int[] merge = m.mergeArray(a,b);
    }

}
