package pl.put.poznan.sorting.logic;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class MockQuickSortTest {

    @Test
    public void testSortDataWithMock() {
        QuickSort mockQuickSort = Mockito.mock(QuickSort.class);
        int[] data_in = new int[]{5, 2, 9, 1, 5};
        int[] expected = new int[]{1, 2, 5, 5, 9};

        Mockito.doReturn(expected).when(mockQuickSort).sortData(data_in, 0);

        int[] result = mockQuickSort.sortData(data_in, 0);

        assertArrayEquals(expected, result);
    }

    @Test
    public void testSortDataWithMockString() {
        QuickSort mockQuickSort = Mockito.mock(QuickSort.class);
        String[] data_in = new String[]{"apple", "orange", "banana", "mango"};
        String[] expected = new String[]{"apple", "banana", "mango", "orange"};


        Mockito.doReturn(expected).when(mockQuickSort).sortData(data_in, 0);

        String[] result = mockQuickSort.sortData(data_in, 0);

        assertArrayEquals(expected, result);
    }

}