package pl.put.poznan.sorting.logic;
/**
 *Sort strategy
 */
public interface SortingTemplate {
    /** Number Sorting
     *
     * @param data_in name of data input number array
     * @param iter maximum number of iterations
     * @return sorted number of array
     */
    int[] sortData(int[] data_in, int iter);

    /** String Sorting
     *
     * @param data_in name of the data input strings array
     * @param iter maximum number of iterations
     * @return sorted strings array
     */
    String[] sortData(String[] data_in,int iter);
}
