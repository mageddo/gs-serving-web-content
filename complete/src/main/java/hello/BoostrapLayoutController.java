package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author elvis
 * @version $Revision: $<br/>
 *          $Id: $
 * @since 12/13/16 8:35 PM
 */
@Controller
public class BoostrapLayoutController {

    @RequestMapping(value ="/boostrap-layout/{user}", method = RequestMethod.GET)
    public String bootstrapLayoutMain(
        final @PathVariable(name = "user", required = false) String userName,
        final Model model){

        model.addAttribute("name", userName);
        model.addAttribute("view", "layout/main-page");
        return "layout/boostrap-layout";

    }

    @RequestMapping(value ="/default-layout/", method = RequestMethod.GET)
    public String defaultLayout(final Model model){

        model.addAttribute("msg", "Hey, you are using the default layout");
        return "layout/default-layout-main-page";

    }

}
