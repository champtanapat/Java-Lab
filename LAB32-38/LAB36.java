public class LAB36 {
    public static void main(String[] args) {
        String s = "say ABC ABC ABC" ;
        System.out.println( s ) ;
        System.out.print("lastIndexOf('B') = ") ;
        System.out.println(s.lastIndexOf('B')) ;
        System.out.print("lastIndexOf(\"AB\") = ") ;
        System.out.println(s.lastIndexOf("AB")) ;
        System.out.print("lastIndexOf(\"ABC\") = ") ;
        System.out.println(s.lastIndexOf("ABC")) ;
        System.out.print("lastIndexOf(\"BC\") = ") ;
        System.out.println(s.lastIndexOf("BC")) ;
        
        System.out.print("lastIndexOf(\" A\") = ") ;
        System.out.println(s.lastIndexOf(" A")) ;
        
        System.out.print("lastIndexOf(\"\\nA\") = ") ;
        System.out.println(s.lastIndexOf(" A")) ;
    }
}
