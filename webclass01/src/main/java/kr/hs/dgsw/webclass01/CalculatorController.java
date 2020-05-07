package kr.hs.dgsw.webclass01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    @GetMapping("/Calculator")
    public int Result(@RequestParam int num1,@RequestParam int num2,@RequestParam String oper)
    {
        int result=0;
        System.out.println(oper);
        switch(oper)
        {
            case "+":
            result = num1+num2;
            break;
            
            case "-":
            result = num1-num2;
            break;
            case "*":
            result = num1*num2;
            break;
            case "/":
            result = num1/num2;
            break;
        }

        return result; 
    }

    @GetMapping("/Calculator/{num1}/{num2}/{oper}")
    public int Result1(@PathVariable int num1,@PathVariable int num2,@PathVariable String oper)
    {
        int result=0;
        switch(oper)
        {
            case "+":
            result = num1+num2;
            break;
            case "-":
            result = num1-num2;
            break;
            case "*":
            result = num1*num2;
            break;
            case "/":
            result = num1/num2;
            break;
            
        }

        return result; 
    }
}