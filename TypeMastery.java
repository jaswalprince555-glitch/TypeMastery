public class TypeMastery {
  
    public static void main(String[] args ){
        char letter = 'a';
        int letter2 = ++letter;
        System.out.println("after ++letter : b:" + letter2);
        int asciivalue = letter + 0;
        System.out.println(" ASCII memory value of 'b': " + asciivalue  );
        System.out.println("\n--- 2. The Type Promotion Hierarchy ---");
        short s1 = 10;
        short s2 = 20;
        int sum = s1 + s2 ;
        System.out.println("short + short  = Int :" + sum);
        System.out.println("\n--- 3. The Prefix/Postfix Engine ---");
        int engine = 10 ;
        System.out.println("engine++ prints:" + ( engine++));
        /* in the backgroud what is going on i tell you when in write engine++ the operatus in the end .
        so it first print the value of the engine and then in background it add the value one so engine become 11  */
        System.out.println("++engine print:" + (++engine ));
        /* In is what will happen operatus in the fornt so first the value add to the engine which become 11 + 1 = 12
         the then print the engine  */
        System.out.println("final memory state " + engine);
    }
}
