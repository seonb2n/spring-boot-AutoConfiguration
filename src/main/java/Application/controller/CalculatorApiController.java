package Application.controller;

import Application.annotation.Timer;
import Application.component.Calculator;
import Application.component.ICalculator;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class CalculatorApiController {

    private final Calculator calculator;

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

}
