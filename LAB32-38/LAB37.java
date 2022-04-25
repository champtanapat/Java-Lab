public class LAB37 {
    public static void main(String[] args) {
        String s = "One:Two:Three" , s1,s2,s3 ;
        s1 = s.substring(0,s.indexOf(':') ) ;
        s2 = s.substring(s.indexOf(':')+1 , s.lastIndexOf(':') ) ;
        s3 = s.substring(s.lastIndexOf(':') + 1) ;
        System.out.println(s1) ;
        System.out.println(s2) ;
        System.out.println(s3) ;
        System.out.println(s1.toLowerCase()) ;
        System.out.println(s2.toLowerCase()) ;
        System.out.println(s3.toLowerCase()) ;
        System.out.println(s1.toUpperCase()) ;
        System.out.println(s2.toUpperCase()) ;
        System.out.println(s3.toUpperCase()) ;
    }
}
