import java.util.ArrayList;
import java.util.HashMap;


public class tryCollection_01{
    public static void main(String[] args) {
        
        ArrayList<String> list = new ArrayList<String>();
        //String이 아니라 List에 뭐가들어갈지 모른다면 Object를 넣어준다
        //ArrayList<Object> list = new ArrayList<Object>();

        list.add("item1");
        list.add("item2");
        list.add("item3");
        list.add("item4");

        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.add(49);
        list2.add(900);
        list2.add(123);
        list2.add(23);

        HashMap<Object,Object> hmap = new HashMap<Object,Object>();
        //맵은 왜 <~,~> 2개로 들어가나요?
        //맵의 성격이다. key와 value값이 들어가줘야함.
        // Object로 들어가고나면 뺄때 문제가생김. 어떤형태인지 모르는게 문제.

        hmap.put("str", list); // key: str , value: list
        hmap.put("integer", list2); // key: integer, value: list2
        //2개 리스트를 해쉬로 묶어줌

        //다시 풀어줌
        ArrayList<Integer> outlist01 = new ArrayList<Integer>(); //ArrayList가 아니라 List만 넣어줘도 동작한다. 추상화때문에 그렇다. arraylist < list < obejct
        ArrayList<String> outlist02 = new ArrayList<String>();
        outlist01 = (ArrayList<Integer>) hmap.get("integer"); //키값(integer)으로 list를 가져온다
        outlist02 = (ArrayList<String>) hmap.get("str");


        for(int i=0; i< outlist01.size(); i++){
            System.out.printf(outlist01.get(i)+" ");
            System.out.println(outlist02.get(i));
        }
        System.out.println("**************");
        for(int a: outlist01){
            System.out.printf(a+" ");
        }
        System.out.printf("//");
        for(String b: outlist02){
            System.out.printf(b+" ");
        }




    }
}