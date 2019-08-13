public class tryFor {
    public static void main(String[] args) {
        // int i;
        // for(i=0;i<5;i++){
        //     System.out.println("i is: "+ i);
        // }
        // int j;
        // for(i=0; i<5; i++){
        //     for(j=0; j<5; j++){
        //         System.out.println("i is: " +i +",j is: "+j);
        //     }
        // }
        String [] names = {"James", "Larry", "Tom", "Lacy"};
        for(String name : names){
            System.out.printf(name + ",");
        }
    }
}