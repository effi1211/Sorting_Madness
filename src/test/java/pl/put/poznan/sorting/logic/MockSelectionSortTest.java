package pl.put.poznan.sorting.logic;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class MockSelectionSortTest {
    @Test
    public void testSortDataWithMock() {
        SelectionSort mockSelectionSort = Mockito.mock(SelectionSort.class);
        int[] data_in = new int[]{5, 2, 9, 1, 5};
        int[] expected = new int[]{1, 2, 5, 5, 9};

        Mockito.doReturn(expected).when(mockSelectionSort).sortData(data_in, 0);

        int[] result = mockSelectionSort.sortData(data_in, 0);

        assertArrayEquals(expected, result);
    }

    @Test
    public void testSortDataWithMockString() {
        SelectionSort mockSelectionSort = Mockito.mock(SelectionSort.class);
        String[] data_in = new String[]{"apple", "orange", "banana", "mango"};
        String[] expected = new String[]{"apple", "banana", "mango", "orange"};


        Mockito.doReturn(expected).when(mockSelectionSort).sortData(data_in, 0);

        String[] result = mockSelectionSort.sortData(data_in, 0);

        assertArrayEquals(expected, result);
    }

}