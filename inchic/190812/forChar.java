public class forChar{
    public static void main(String[] args) {
        int row,col;
        for(row=0;row<7;row++){
            for(col=0;col<5;col++){
                if(row == 0 || row==6) {
                    System.out.printf("~ ");
                }
                else{
                    if(col==0 || col==4){
                        System.out.printf("! ");
                    }
                    else{
                        System.out.printf(row+((col-1)*5)+" ");
                    }
                }
            }
            System.out.println("\n");
        }
    }
}