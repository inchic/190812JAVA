import java.util.ArrayList;

public class tryArrayListMethod{
    public static void main(String[] args) {
        java.util.ArrayList<String> list=new ArrayList<String>();
        list.add("item1");
        list.add("item2");
        list.add("item3");
        list.add("item4");

        System.out.println("The arraylist contains elements: "+ list);
        
        int pos=list.indexOf("item2");
        System.out.println("The index of item2 is: " + pos);

        System.out.println("Checking is empty: "+ list.isEmpty());

        int size=list.size();
        System.out.println("The size of the list is:"+ size);
        for(int i=0;i<size;i++){
            System.out.println("index: "+i+" -item: "+list.get(i));
        }
    }
}