public class TypeString {
    public static void main(String[] args) {
        String wordString = new String("Good");
        System.out.println(wordString);
        char[] wordArray = {'G','o','o','d'};
        String wordString_2 = new String(wordArray);
        System.out.println(wordString_2);
        String wordString_3 = "Good";
        System.out.println(wordString_3);
        //wordString_3[0] = "a";
    }
}
