import java.util.Scanner;

public class callByValue_03{
    
    static int globalValue=20;
    public static void main(String[] args) {
        int localValue =50;
        System.out.println(localValue);
        localValue=change(500);   //change1로 하면 에러가뜬다
        System.out.println(localValue);
        System.out.println(globalValue);

        int localValue1 = 50;
        System.out.println(localValue1);
        //method 를 사용하기위한 클래스 callByValue 를 초기화해준다. 초기화방법은 asdf로 이름 지정. ****
        callByValue asdf = new callByValue(); 
        localValue1=asdf.change1(500);
        System.out.println(localValue1);
        
    }
    public static int change(int data){
        //static = 전역변수
        //참조형도 변수로 만들수 있다
        int returnValue;
        returnValue=data+100;
        return returnValue;
    }
    // new를 안써도 되는 이유는 static 때문이다
    // static을 안쓰는순간 change1은 전역에서 빠져버리므로 찾을수가 없다.

    public int change1(int data){
        //얘는 static이 아니라서 main에서 불러올 수 없다.
        //cannot make a static reference to non-static method change1(int) from the type callByValue
        int returnValue;
        returnValue=data+100;
        return returnValue;
    }


}