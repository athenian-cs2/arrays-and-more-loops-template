import org.junit.jupiter.api.Test;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class MyTests {

    @Test
    public void testRotateLeft() {
        assertEquals("[2, 3, 4, 5, 1]", Arrays.toString(MyMain.rotateLeft(new int[] {1, 2, 3, 4, 5})), "The array [1, 2, 3, 4, 5] when rotated left should be: " + "[2, 3, 4, 5, 1]");
        assertEquals("[4, 3, 2, 1, 5]", Arrays.toString(MyMain.rotateLeft(new int[] {5, 4, 3, 2, 1})), "The array [5, 4, 3, 2, 1] when rotated left should be: " + "[4, 3, 2, 1, 5]");
        assertEquals("[1, 1, 1, 1, 1]", Arrays.toString(MyMain.rotateLeft(new int[] {1, 1 ,1, 1, 1})), "The array [1, 1 ,1, 1, 1] when rotated left should be: " + "[1, 1, 1, 1, 1]");
        assertEquals("[-1, 3, 5, 2]", Arrays.toString(MyMain.rotateLeft(new int[] {2, -1, 3, 5})), "The array [2, -1, 3, 5] when rotated left should be: " + "[-1, 3, 5, 2]");
    }

    @Test
    public void testRotateRight() {
        assertEquals("[5, 1, 2, 3, 4]", Arrays.toString(MyMain.rotateRight(new int[] {1, 2, 3, 4, 5})), "The array [1, 2, 3, 4, 5] when rotated right should be: " + "[5, 1, 2, 3, 4]");
        assertEquals("[1, 5, 4, 3, 2]", Arrays.toString(MyMain.rotateRight(new int[] {5, 4, 3, 2, 1})), "The array [5, 4, 3, 2, 1] when rotated right should be: " + "[1, 5, 4, 3, 2]");
        assertEquals("[1, 1, 1, 1, 1]", Arrays.toString(MyMain.rotateRight(new int[] {1, 1 ,1, 1, 1})), "The array [1, 1 ,1, 1, 1] when rotated right should be: " + "[1, 1, 1, 1, 1]");
        assertEquals("[5, 2, -1, 3]", Arrays.toString(MyMain.rotateRight(new int[] {2, -1, 3, 5})), "The array [2, -1, 3, 5] when rotated right should be: " + "[5, 2, -1, 3]");
    }

    @Test
    public void testIsIncreasing() {
        assertTrue(MyMain.isIncreasing(new int[] {1, 2, 3, 4, 5, 6}), "The array [1, 2, 3, 4, 5, 6] should be strictly increasing");
        assertFalse(MyMain.isIncreasing(new int[] {1, 1, 3, 6, 7}), "The array [1, 1, 3, 6, 7] should not be strictly increasing (1 is not > 1)");
        assertFalse(MyMain.isIncreasing(new int[] {1, 2, 3, 2, 4, 5, 8}), "The array [1, 2, 3, 2, 4, 5, 8] should not be strictly increasing");
        assertTrue(MyMain.isIncreasing(new int[] {-5, -2, 0, 3, 7}), "The array [-5, -2, 0, 3, 7] should be strictly increasing");
        assertTrue(MyMain.isIncreasing(new int[] {1}), "A single element array should be strictly increasing");
        assertTrue(MyMain.isIncreasing(new int[] {}), "An empty array should be strictly increasing");
        assertFalse(MyMain.isIncreasing(new int[] {5, 4, 3, 2, 1}), "The array [5, 4, 3, 2, 1] should not be strictly increasing (decreasing)");
    }

    @Test
    public void testContainsDuplicates() {
        assertTrue(MyMain.containsDuplicates(new int[] {1, 2, 3, 2, 1}), "The array [1, 2, 3, 2, 1] should contain duplicates");
        assertFalse(MyMain.containsDuplicates(new int[] {7, 2, 3, 4, 1, 5}), "The array [7, 2, 3, 4, 1, 5] should not contain duplicates");
        assertTrue(MyMain.containsDuplicates(new int[] {1, 1}), "The array [1, 1] should contain duplicates");
        assertFalse(MyMain.containsDuplicates(new int[] {1}), "A single element array should not contain duplicates");
        assertFalse(MyMain.containsDuplicates(new int[] {}), "An empty array should not contain duplicates");
        assertTrue(MyMain.containsDuplicates(new int[] {-1, 0, 1, -1}), "The array [-1, 0, 1, -1] should contain duplicates");
        assertTrue(MyMain.containsDuplicates(new int[] {5, 5, 5, 5}), "The array [5, 5, 5, 5] should contain duplicates");
    }

    @Test
    public void testBubbleSort() {
        assertEquals("[1, 2, 3, 4, 5]", Arrays.toString(MyMain.bubbleSort(new int[] {5, 2, 4, 1, 3})), "The array [5, 2, 4, 1, 3] should be sorted to [1, 2, 3, 4, 5]");
        assertEquals("[1, 2, 3, 4, 5]", Arrays.toString(MyMain.bubbleSort(new int[] {1, 2, 3, 4, 5})), "The array [1, 2, 3, 4, 5] should remain [1, 2, 3, 4, 5] when already sorted");
        assertEquals("[1, 2, 3, 4, 5]", Arrays.toString(MyMain.bubbleSort(new int[] {5, 4, 3, 2, 1})), "The array [5, 4, 3, 2, 1] should be sorted to [1, 2, 3, 4, 5]");
        assertEquals("[-5, -2, 0, 3, 7]", Arrays.toString(MyMain.bubbleSort(new int[] {7, -2, 3, -5, 0})), "The array [7, -2, 3, -5, 0] should be sorted to [-5, -2, 0, 3, 7]");
        assertEquals("[1]", Arrays.toString(MyMain.bubbleSort(new int[] {1})), "A single element array [1] should remain [1]");
        assertEquals("[]", Arrays.toString(MyMain.bubbleSort(new int[] {})), "An empty array should remain empty");
        assertEquals("[1, 1, 2, 2, 3, 3]", Arrays.toString(MyMain.bubbleSort(new int[] {3, 1, 2, 3, 1, 2})), "The array [3, 1, 2, 3, 1, 2] should be sorted to [1, 1, 2, 2, 3, 3]");
    }
}
