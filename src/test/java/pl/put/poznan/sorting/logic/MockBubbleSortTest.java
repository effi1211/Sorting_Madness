package pl.put.poznan.sorting.logic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


import org.mockito.Mockito;




class MockBubbleSortTest {

    @Test
    public void testSortDataWithMock() {
        BubbleSort mockBubbleSort = Mockito.mock(BubbleSort.class);
        int[] data_in = new int[]{5, 2, 9, 1, 5};
        int[] expected = new int[]{1, 2, 5, 5, 9};

        Mockito.doReturn(expected).when(mockBubbleSort).sortData(data_in, 0);

        int[] result = mockBubbleSort.sortData(data_in, 0);

        assertArrayEquals(expected, result);
    }


    @Test
    public void testSortDataWithMockString() {
        BubbleSort mockBubbleSort = Mockito.mock(BubbleSort.class);
        String[] data_in = new String[]{"apple", "orange", "banana", "mango"};
        String[] expected = new String[]{"apple", "banana", "mango", "orange"};


        Mockito.doReturn(expected).when(mockBubbleSort).sortData(data_in, 0);

        String[] result = mockBubbleSort.sortData(data_in, 0);

        assertArrayEquals(expected, result);
    }

}