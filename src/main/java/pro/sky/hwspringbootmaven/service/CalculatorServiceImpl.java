package pro.sky.hwspringbootmaven.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public String sayHello() {
        return "Добро пожаловать в калькулятор";
    }

    @Override
    public String doPlus(int a, int b) {
        return String.format("%d + %d = %d", a, b, a + b);
    }

    @Override
    public String doMinus(int a, int b) {
        return String.format("%d - %d = %d", a, b, a - b);
    }

    @Override
    public String doMultiply(int a, int b) {
        return String.format("%d * %d = %d", a, b, a * b);
    }

    @Override
    public String doDivide(int a, int b) {
        return String.format("%d / %d = %.2f", a, b, (double)a / b);
    }
}
