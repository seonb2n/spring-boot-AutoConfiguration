package Response.controller;

import Response.dto.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PageController {

    @RequestMapping("/main")
    public String main() {
        return "main.html";
    }

    //Json을 내려주는 방법
    @ResponseBody //response Body 어노테이션이 있어야 json 으로 파일을 내려줄 수 있다.
    @GetMapping("/user")
    public User user() {
        //타입 추론을 할 수있는 약어인 var
        var user = new User();
        user.setName("Steve");
        user.setAddress("fast Campus");
        return user;
    }
}
