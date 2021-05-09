package Response.controller;

import Response.dto.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ApiController {

    //TEXT를 내려주는 경우
    @GetMapping("/text")
    public String text(@RequestParam String account) {
        return account;
    }

    //Json 을 내려준느 경우
    // request -> object mapper -> object -> method -> object -> object mapper ->json -> response
    @PostMapping("/json")
    public User json(@RequestBody User user) {
        return user; //200 ok
    }

    @PutMapping("/put")
    public ResponseEntity<User> put(@RequestBody User user) {
        //응답에 대한 커스터마이징에 사용. 헤더값이나 응답에 대한 코드값을 바꿔줌
        return ResponseEntity.status(HttpStatus.CREATED).body(user);

    }

}
