package pl.put.poznan.sorting.rest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import pl.put.poznan.sorting.logic.SortingMadness;

@RestController
@RequestMapping("/{text}")
public class SortingMadnessController {

    private static final Logger logger = LoggerFactory.getLogger(SortingMadnessController.class);
    public static class sortInfo {
        public boolean desc;
        public int iterations;
        public int [] dataToSort;
        public String[] algorithms;
    }
    @RequestMapping(method = RequestMethod.POST, produces = "application/json")
    public int[] post(@RequestBody sortInfo data_in) {
        SortingMadness sorter = new SortingMadness();
        // log the parameters
        //logger.debug(text);
        //logger.debug(Arrays.toString(transforms));
        //TODO dodać sprawdzanie błędów
        //TODO zwracanie wyniku i czasów
        int[] sortedData = sorter.sort(data_in.dataToSort, data_in.iterations, data_in.desc);
        for (String alg : data_in.algorithms) {
            //System.out.println(alg);
            //TODO no że się wykona ten algorytm co tu jest
        }

        return sortedData;
    }



}
