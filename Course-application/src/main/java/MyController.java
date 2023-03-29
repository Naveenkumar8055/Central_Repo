import Course.Course;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyController {
    //creating restapi
    @GetMapping("/nave")
    public String nav(){
        return "Hello Naveen Kumar";
    }
    //get the courses
    @GetMapping("/courses")
    public List<Course> getCourse(){
 return null;

    }
}
