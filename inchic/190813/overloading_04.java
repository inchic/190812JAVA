import java.util.HashMap;
import java.util.Scanner;
import java.util.*;

public class overloading_04{
    public static void main(String[] args) {


        overloading_04 overload = new overloading_04(); 
        //초기화
        //자바는초기화해야사용
        overload.cal(6,4);
      
    }

    public int sum (int a, int b){
        return a+b;
        
    }
    public int sub (int a, int b){
        return a-b;
        
    }
    public int div (int a, int b){
        return a/b;
        
    }
    public int mul (int a, int b){
        return a*b;
        
    }

    public void cal (int a, int b) {
        System.out.println("num: "+a + " "+b);
        System.out.println("sum: "+ sum(a,b)); //얘는 왜 바로 접근 되는데?
    }
}