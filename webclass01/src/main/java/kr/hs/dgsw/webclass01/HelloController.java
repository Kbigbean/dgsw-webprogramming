package kr.hs.dgsw.webclass01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController{
    @GetMapping
    public int Result(@RequestParam int num1,@RequestParam int num2)
    {
        return num1+num2; 
    }
}