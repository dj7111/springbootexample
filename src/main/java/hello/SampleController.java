package hello;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.http.MediaType;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
@EnableAutoConfiguration
public class SampleController {
    private static SimpleGPIO simpleGPIO = new SimpleGPIO();


    @RequestMapping(value = "/blah/{name}", method = RequestMethod.GET)
    public @ResponseBody String blah(  @PathVariable("name") String name) {
        return "Blah " + name;
    }

    @RequestMapping(value = "/post/test", method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE,
            produces = {MediaType.APPLICATION_ATOM_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public @ResponseBody String postTest(PostTestData postTestData) {
        simpleGPIO.toggle();
        return  "{\"post_test\": \"" + postTestData.getStr() + "\"}";
    }
}