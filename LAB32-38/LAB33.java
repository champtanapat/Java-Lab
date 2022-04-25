public class LAB33 {
    public static void main(String[] args) {
        String s1 = "First" ;
        String s2 = "Second" ;
        String s3 , s4 ;
        s3 = s1.concat(s2) ;
        s4 = s2.concat(s1) ;
        System.out.println("s1 is " + s1) ;
        System.out.println("s2 is " +s2) ;
        System.out.println("s3 is " + s3) ;
        System.out.println("s4 is " + s4) ;
        String s5 = "AB".concat("CD").concat("EF") ;
        System.out.println("s5 is " + s5) ;

    }
}
