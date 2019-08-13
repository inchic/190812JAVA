public class JWEOverloadingWithParameters_05{
    public static void main(String[] args) {
        DisplayOverloading_05 displayOverloading = new DisplayOverloading_05();
        displayOverloading.display("Overloading");
        displayOverloading.display("Overloading",10);
        displayOverloading.display(10);
        
    }
}