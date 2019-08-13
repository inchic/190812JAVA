public class forNumber{
    public static void main(String[] args) {
        int row,col;
        for(row=0;row<5;row++){
            for(col=0;col<5;col++){
                System.out.printf((row+1)+(col*5)+" ");
            }
            System.out.println();
        }
    }
}