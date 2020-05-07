package kr.hs.dgsw.webclass01;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/calc/{num1}/{calc}/{num2}/{val}")
    public String calc(@PathVariable int num1, @PathVariable String calc, @PathVariable int num2, @PathVariable String val) {
        return val;
    }
}