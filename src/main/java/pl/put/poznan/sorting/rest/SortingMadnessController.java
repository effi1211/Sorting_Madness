package pl.put.poznan.sorting.rest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import  org.springframework.http.ResponseEntity;
import pl.put.poznan.sorting.logic.SortingMadness;

import java.util.Arrays;

@RestController
@RequestMapping("/")
public class SortingMadnessController {

    private static final Logger logger = LoggerFactory.getLogger(SortingMadnessController.class);
    public static class sortInfo {
        public boolean desc;
        public int iterations;
        public int [] dataToSort;
        public String[] algorithms;
    }

    public static class sortInfoText {
        public boolean desc;
        public int iterations;
        public String[] dataToSort;
        public String[] algorithms;
    }

    @RequestMapping(value = "/sortdata", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity  postData(@RequestBody sortInfo data_in) {
        SortingMadness sorter = new SortingMadness();
        // log the parameters
        //logger.debug(text);
        //logger.debug(Arrays.toString(transforms));
        
        //TODO dodać sprawdzanie błędów (chyba tyle tych błędów, ale niech ktoś sprawdzi plis)
        if (data_in.dataToSort.length == 0) {
            logger.error("Error - numbers list is empty");
            return ResponseEntity.status(HttpStatus.FORBIDDEN).body("Error - numbers list is empty");
        }
         if (data_in.algorithms.length == 0){
            logger.error("Error - sorting types array is empty");
            return ResponseEntity.status(HttpStatus.FORBIDDEN).body("Error - sorting types array is empty");
        }
        SortingMadness.result[] sortedData = new SortingMadness.result[data_in.algorithms.length];
        for (int i = 0; i <data_in.algorithms.length ; i++) {
            logger.debug(data_in.algorithms[i]);
            sortedData[i] = sorter.sort(Arrays.copyOf(data_in.dataToSort, data_in.dataToSort.length), data_in.iterations, data_in.desc, data_in.algorithms[i]);
            if (sortedData[i] == null){
                logger.error("Error - wrong algorithm name");
                return ResponseEntity.status(HttpStatus.FORBIDDEN).body("Error - wrong algorithm name");
            }
        }

        return ResponseEntity.status(HttpStatus.OK).body(sortedData);
    }

    @RequestMapping(value = "/sorttext", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity  postText(@RequestBody sortInfoText data_in) {
        SortingMadness sorter = new SortingMadness();

        logger.debug(Arrays.toString(data_in.dataToSort));

        if (data_in.dataToSort.length == 0) {
            logger.error("Error - numbers list is empty");
            return ResponseEntity.status(HttpStatus.FORBIDDEN).body("Error - numbers list is empty");
        }
        if (data_in.algorithms.length == 0){
            logger.error("Error - sorting types array is empty");
            return ResponseEntity.status(HttpStatus.FORBIDDEN).body("Error - sorting types array is empty");
        }
        SortingMadness.resultText[] sortedData = new SortingMadness.resultText[data_in.algorithms.length];
        for (int i = 0; i <data_in.algorithms.length ; i++) {
            logger.debug(data_in.algorithms[i]);
            sortedData[i] = sorter.sort(Arrays.copyOf(data_in.dataToSort, data_in.dataToSort.length), data_in.iterations, data_in.desc, data_in.algorithms[i]);
            if (sortedData[i] == null){
                logger.error("Error - wrong algorithm name");
                return ResponseEntity.status(HttpStatus.FORBIDDEN).body("Error - wrong algorithm name");
            }
        }

        return ResponseEntity.status(HttpStatus.OK).body(sortedData);
    }


}
