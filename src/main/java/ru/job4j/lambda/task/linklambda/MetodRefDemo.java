package ru.job4j.lambda.task.linklambda;

public class MetodRefDemo {

    private int v;

    public MetodRefDemo(int v) {
        this.v = v;
    }

    int getNum() {
        return v;
    }

    static boolean numTest(IntPredicate p, int v) {
        return p.test(v);
    }

    public boolean hasInstMethod(int in) {
        for (int i = 2; i <= v / 2; i++) {
            if (v % i == 0 && in % i == 0) {
                System.out.println(i);
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        MetodRefDemo metodRefDemo = new MetodRefDemo(22);
        IntPredicate ip = metodRefDemo::hasInstMethod;
        boolean res = ip.test(12);
        boolean result = numTest(MyIntPredicate::isPrime, 17);
        if (result) {
            System.out.println("Число 17 простое число");
        }
    }
}
