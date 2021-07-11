package Application.controller;

import Application.annotation.Timer;
import Application.component.Calculator;
import Application.component.ICalculator;
import dto.User;
import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Api(tags = {"API 정보를 제공하는 Controller"})
@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class ApiController {

    private final Calculator calculator;

    @GetMapping("/swagger")
    public String swaggerTest() {
        return "swagger";
    }

    @GetMapping("/sum")
    public int sum(@RequestParam int x, @RequestParam int y) {
        return calculator.sum(x, y);
    }

    @GetMapping("/minus")
    public int minus(@RequestParam int x, @RequestParam int y) {
        return calculator.minus(x, y);
    }

    @Timer
    @GetMapping("/timerTest")
    public void timer() throws InterruptedException{
        Thread.sleep(1000*3);
    }

    @PostMapping("/user")
    public ResponseEntity user(@Valid @RequestBody User user, BindingResult bindingResult) {

        if(bindingResult.hasErrors()) {
            StringBuilder sb = new StringBuilder();
            bindingResult.getAllErrors().forEach(objectError -> {
                FieldError fieldError = (FieldError) objectError;
                String message = objectError.getDefaultMessage();

                System.out.println("field : " + fieldError.getField());
                System.out.println(message);
            });

            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(sb.toString());

        }

        return ResponseEntity.ok(user);

    }

}
