package hello;

import org.springframework.boot.autoconfigure.*;
import org.springframework.http.MediaType;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
@EnableAutoConfiguration
public class WebController {

    @RequestMapping(value = "/toggle/pin/{pinNumber}", method = RequestMethod.GET)
    public
    @ResponseBody
    String togglePin(@PathVariable("pinNumber") int pinNumber) {
        if (pinNumber >= 0 && pinNumber < Main.pinControllers.length) {
            Main.pinControllers[pinNumber].toggle();
        }
        return "" + pinNumber;
    }

    @RequestMapping(value = "/all/{status}/", method = RequestMethod.GET)
    public
    @ResponseBody
    String changeAllPins(@PathVariable("status") String status) {
        for (int i = 0; i < Main.pinControllers.length; i++) {
            Main.pinControllers[i].setStatus(status);
        }
        return "";
    }
//

//    @RequestMapping(value = "/post/test", method = RequestMethod.POST,
//            consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE,
//            produces = {MediaType.APPLICATION_ATOM_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
//    public @ResponseBody String postTest(PostTestData postTestData) {
//        return  "{\"post_test\": \"" + postTestData.getStr() + "\"}";
//    }
}