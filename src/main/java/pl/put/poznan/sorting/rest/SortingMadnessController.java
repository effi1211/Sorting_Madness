package pl.put.poznan.sorting.rest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import  org.springframework.http.ResponseEntity;
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


    @RequestMapping(method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<SortingMadness.result> post(@RequestBody sortInfo data_in) {
        SortingMadness sorter = new SortingMadness();
        // log the parameters
        //logger.debug(text);
        //logger.debug(Arrays.toString(transforms));
        
        //TODO dodać sprawdzanie błędów (chyba tyle tych błędów, ale niech ktoś sprawdzi plis)
        if (data_in.dataToSort.length == 0) {
            logger.error("Error - numbers list is empty");
            //return new ResponseEntity<SortingMadness.result>("Error! Bad input, numbers list can't be empty", HttpStatus.BAD_REQUEST);
        }
         if (data_in.algorithms.length == 0){
            logger.error("Error - sorting types array is empty");
            //return new ResponseEntity<SortingMadness.result>("Error! Bad input, sorting types array can't be empty", HttpStatus.BAD_REQUEST);
        }
        //TODO zwracanie wyniku i czasów
        SortingMadness.result sortedData = sorter.sort(data_in.dataToSort, data_in.iterations, data_in.desc);
        //ResponseEntity<SortingMadness.result> test = new ResponseEntity<SortingMadness.result>(sortedData, HttpStatus.OK);
        for (String alg : data_in.algorithms) {
            //System.out.println(alg);
            //TODO no że się wykona ten algorytm co tu jest
        }

        return new ResponseEntity<>(sortedData, HttpStatus.OK);
    }



}
