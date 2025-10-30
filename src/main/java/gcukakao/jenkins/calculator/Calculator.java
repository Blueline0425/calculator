package gcukakao.jenkins.calculator;

import org.springframework.stereotype.Service;
@Service
public class Calculator {
    public int sum(int a, int b) {
        return a + b;
    }
    public int sub(int a, int b) {
        return a - b;
    }
    public int mul(int a, int b) {
        return a * b;
    }
    public int div(int a, int b) {
        return a / b;
    }
    public String getAuthorName(){
        return "Han Woongjae";
    }
    public void printAuthorName(){
        System.out.println(getAuthorName());
    }
}