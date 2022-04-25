public class LAB23 {
    public static void main(String[] args) {
        String s1 = " Computer Engineering " ;
        String prefix= "Computer" ;
        String suffix = "ing" ;
        System.out.print( "\"" + s1 + "\" has \"" + prefix + "\" as a prefix :\t" ) ;
        System.out.println( s1.startsWith(prefix) + "." ) ;
        System.out.print( "\"" + s1 + "\" has \"" + suffix + "\" as a suffix :\t\t" ) ;
        System.out.println( s1.endsWith(suffix) + "." ) ;
        String s2 = s1.trim() ;
        System.out.print( "\"" + s2 + "\" has \"" + prefix + "\" as a prefix :\t" ) ;
        System.out.println( s2.startsWith(prefix) + "." ) ;
        System.out.print( "\"" + s2 + "\" has \"" + suffix + "\" as a suffix :\t" ) ;
        System.out.println( s2.endsWith(suffix) + "." ) ;
    }
}
