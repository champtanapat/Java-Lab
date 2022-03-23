public class Operator {
    public static void main(String[] args) {
        // Pre Increment 
        // Post Increment 
        int count = 15; 
        int a, b, c, d; 

        int j, i = 5; 
        j = i++ ; 
        System.out.println("Post " + j); // 5 
        System.out.println("Post " + i);// 6

        i = 5;
        j = ++i;
        System.out.println("Pre " + j); //6
        System.out.println("Pre " + i);  //6

        a = count++; // a = 15 
        b = count; // b = 16 
        c = ++count; // c = 17
        d = count; // d = 17
        System.out.println(a+ ", " + b + ", " + c + ", " +d );  //6
        
        //type casting 
        int z ; 
        float g = 9 , y ; 
        z = (int)g ; 
        y = 0.0f ;
        g = y;   
    }
}
