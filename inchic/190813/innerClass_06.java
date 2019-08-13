import java.util.ArrayList;

public class innerClass_06{
    public static void main(String[] args) {
        ArrayList<Fruits> mFruitsList=new ArrayList<Fruits>();
        mFruitsList.add(new Fruits("Good Fruits"));
        mFruitsList.add(new Fruits("Bad Fruits"));
        System.out.printf("fruit: "+mFruitsList);
    }
}