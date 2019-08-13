import java.util.ArrayList ;
import java.util.HashMap;


         
    public static void main(String[] args) {
        
        //숫자가 list
        //망고가 map

        // 어레이를만들고 값에 넣어준다음에 해쉬맵에 넣어준다 x4

        // mango : 39, 20, 30, 12, 40
        // apple : 48, 20, 10, 32
        // banana : 99, 23, 123
        // melon : 49, 22, 45, 12

        ArrayList<String> key = new ArrayList<String>();
        key.add("Mango");
        key.add("Apple");
        key.add("Banana");
        key.add("Melon");

        ArrayList<Integer> mango = new ArrayList<Integer>();
        mango.add(39);
        mango.add(20);
        mango.add(30);
        mango.add(12);
        mango.add(40);

        ArrayList<Integer> apple = new ArrayList<Integer>();
        apple.add(48);
        apple.add(20);
        apple.add(10);
        apple.add(32);
        
        ArrayList<Integer> banana = new ArrayList<Integer>();
        banana.add(99);
        banana.add(23);
        banana.add(123);

        ArrayList<Integer> melon = new ArrayList<Integer>();
        melon.add(49);
        melon.add(22);
        melon.add(45);
        melon.add(12);

        HashMap<Object,Object> hmap = new HashMap<Object,Object>();
        hmap.put("Key",key);
        hmap.put("Mango",mango);
        hmap.put("Apple",apple);
        hmap.put("Banana",banana);
        hmap.put("Melon",melon);
        
        ArrayList<String> list_key = new ArrayList<String>();
        ArrayList<Integer> list_mango = new ArrayList<Integer>();
        ArrayList<Integer> list_apple = new ArrayList<Integer>();
        ArrayList<Integer> list_banana = new ArrayList<Integer>();
        ArrayList<Integer> list_melon = new ArrayList<Integer>();

        list_key = (ArrayList<String>) hmap.get("Key");
        list_mango = (ArrayList<Integer>) hmap.get("Mango");
        list_apple = (ArrayList<Integer>) hmap.get("Apple");
        list_banana = (ArrayList<Integer>) hmap.get("Banana");
        list_melon = (ArrayList<Integer>) hmap.get("Melon");

        for(string a: list_key){
            System.out.println(a);
        }

    }
}