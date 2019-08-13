public class method_04{
    public static void main(String[] args) {
        method_04 cal =new method_04();
        cal.result(2, 2);
    }
    public void result(int num1, int num2){
        int add = num1+num2;
        int subt = num1-num2;
        int mult = num1*num2;
        int div = num1/num2;
        System.out.println("Enter: "+ num1 + " "+ num2);
        System.out.println("Addition: "+ add);
        System.out.println("Subtraction: "+ subt);
        System.out.println("Multiplication: "+ mult);
        System.out.println("Division: "+ div);
    }
}