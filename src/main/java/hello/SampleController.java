package hello;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
@EnableAutoConfiguration
public class SampleController {

    @RequestMapping("/")
    @ResponseBody
    String home() {
        //'this is a new comment.
        return "Hello World!";
    }
    @RequestMapping(value = "/blah/{name}", method = RequestMethod.GET)
    @ResponseBody
    String blah(  @PathVariable("name") String name) {
        return "Blah " + name;
    }
    public static void main(String[] args) throws Exception {
        SpringApplication.run(SampleController.class, args);
    }
}