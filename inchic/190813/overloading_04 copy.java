import java.util.HashMap;
import java.util.Scanner;
import java.util.*;

public class overloading_04{
    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 2;

        System.out.println("Enter: "+ num1 +" "+ num2 );

        overloading_04 cal = new overloading_04();
        HashMap hmap = new HashMap();
        hmap = cal.calculate(num1,num2);
       
        ArrayList<String> question = new ArrayList<String>();
        // question = (ArrayList<String>) cal.calculate(num1, num2).get("Q");

        for(String a: question){
            System.out.println(a);
        }
    }
    public int calculate (int a, int b) {
        int addi = a+b;
        int subt = a-b;
        int multi = a*b;
        int div = a/b;

        ArrayList<String> quest= new ArrayList<String>();
        qeust.add("Addition");
        qeust.add("Subtraction");
        qeust.add("Multiplication");
        qeust.add("Division");

        ArrayList<Integer> result=new ArrayList<Integer>();
        result.add(addi);
        result.add(subt);
        result.add(multi);
        result.add(div);

        HashMap<Object,Object> hmap = new HashMap<Object,Object>();
        hmap.put("Q",quest);
        hmap.put("A",result);

        return hmap;
    }
}