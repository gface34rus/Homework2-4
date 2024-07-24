package pro.sky.calculatorspringdemo;

import org.springframework.stereotype.Service;

@Service
public class CalcServiceIml implements CalcService {
    public String hello() {
        return "Привет!\n" +
                "На связи домашнее задание урока 2.3. Введение в Maven и Spring Boot.";
    }

    public String calcHello() {
        return "Добро пожаловать в калькулятор.";
    }

    public String plus(int num1, int num2) {
        int result = num1 + num2;
        return num1 + "+" + num2 + "=" + result;
    }

    public String minus(int num1, int num2) {
        int result = num1 - num2;
        return num1 + "-" + num2 + "=" + result;
    }

    public String multiply(int num1, int num2) {
        int result = num1 * num2;
        return num1 + "*" + num2 + "=" + result;
    }

    public String divide(int num1, int num2) {
        int result = num1 / num2;
        return num1 + "/" + num2 + "=" + result;
    }
}
