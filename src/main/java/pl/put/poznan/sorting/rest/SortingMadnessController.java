package pl.put.poznan.sorting.rest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import pl.put.poznan.sorting.logic.SortingMadness;

import java.util.Arrays;


@RestController
@RequestMapping("/{text}")
public class SortingMadnessController {

    private static final Logger logger = LoggerFactory.getLogger(SortingMadnessController.class);

    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public int[] get(@PathVariable String text,
                     @RequestParam(value="zbior", defaultValue="{}") int[] zbior) {

        // log the parameters
        logger.debug(text);
        logger.debug(Arrays.toString(zbior));

        // perform the transformation, you should run your logic here, below is just a silly example
        SortingMadness transformer = new SortingMadness(zbior);
        return transformer.sort(zbior);
    }

}
