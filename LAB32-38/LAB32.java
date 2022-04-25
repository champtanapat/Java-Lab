public class LAB32 {
    public static void main(String[] args) {
        String s = "ABCD\nEFGH" ;
        char c ;
        System.out.print("s = ") ;
        System.out.println(s) ;
        c = s.charAt(0) ;
        System.out.println("charAt(0) = " + c) ;
        c = s.charAt(1) ;
        System.out.println("charAt(1) = " + c) ;
        c = s.charAt(5) ;
        System.out.println("charAt(5) = " + c) ;
        System.out.print("The length of this string s is ");
        System.out.println( s.length() + " characters.");
        c = s.charAt(s.length() - 1) ;
        System.out.println("The last character is " + c );
    }
}
