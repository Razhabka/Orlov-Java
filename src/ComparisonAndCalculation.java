

public class ComparisonAndCalculation {

    private float a = 0;
    private float b = 0;

    ComparisonAndCalculation(float numb1, float numb2){
        this.a = numb1;
        this.b = numb2;
    }
    public void comparison(){
        if (a == b){
            System.out.println(a + " = " + b);
        } else if (a>b) {
            System.out.println(a + " > " + b);
        }else System.out.println(a + " < " + b);
    }

    public void calculation(){
        float result1 = a + b;
        float result2 = a - b;
        float result3 = a * b;
        System.out.println( "Результат сложения: " + result1 +
                "\nРезультат вычитания: " + result2 +
                "\nРезультат умножения: " + result3 );
        if(b == 0){
            System.out.println("На ноль делить нельзя");
        }else {
            float result4 = a / b;
            System.out.println("Результат деления: " + result4);
        }

    }
}
