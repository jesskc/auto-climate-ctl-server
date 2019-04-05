package cs370Project;

/**
 * Created by jess on 4/2/19.
 */

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class ProjectController {
    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!\n";
    }
}
