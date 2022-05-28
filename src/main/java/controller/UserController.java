package controller;


        import org.springframework.stereotype.Controller;
        import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping(value = "/")
public class UserController {


    @GetMapping
    public String hello() {
        return "hello";
    }
}