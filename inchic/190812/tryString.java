public class tryString{
    public static void main(String[] args) {
        String str1 = new String("This is really not immutable!!");
        String str2 = str1;
        boolean retVal;
        int length;
        double d = 102939939.939;
        retVal = str1.equals(str2);
        System.out.println("Returned Value= "+retVal);
        System.out.println("String Length is: "+str1.length());
        System.out.println("String comparing is: "+str1.compareTo(str2));
        System.out.println("String concat is: "+str1.concat(str2));
        System.out.println("String replaceAll is: "+str1.replaceAll("is","??"));
        System.out.println("String substring is: "+str1.substring(10));
        System.out.println("Retrun Value: "+String.valueOf(d));
        
    }
}