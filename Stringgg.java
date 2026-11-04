public class Stringgg {
    public static void main(String[] args) {
        String name = ("abdulmohsin");
        String value = new String("mohsin");
        StringBuilder s1 = new StringBuilder("test");
        StringBuffer s2 = new StringBuffer("buffer");
        // name = name.concat("shaikh");
        // value= value.concat(" shaikh"); //
        // s1.append(" java");
//        s2.append(" string");
//        System.out.println(s2);
//        System.out.println("this is reverse string");
//        System.out.println("mohsin");

        System.out.println(reversCh(" mohsin "));
    }

//    static String reversC(String s) {
//        String rev = "";
//        for (int i = s.length()-1; i >=0; i--) {
//            char c = s.charAt(i);
//            rev = rev+c;
//        }return  rev;
   // }
    /// using string builder to create an string reverse method

     static String reversCh(String s) {
         StringBuilder s1 = new StringBuilder();
         for (int i = s.length() - 1; i >= 0; i--) {
              s1.append(s.charAt(i));

         }return s1.toString();
     }
     /// string, stringbuidler and stringbuffer are three class is used to define string each
    /// seach class contains diffrent mothod and way of memory allocation type
    /// String is mutable in which we can not modify the value instead we assign value in it
    /// but while assigning it create each time different object string constant pool (SCP)
    ///  it is non synchronization
     /// as it can not be modify
     /// StringBUilder :it is non synchronization method
     /// but allow stirng modification
     ///it is fast it support non synchronous but it is not secure compare to synchronous method
     /// it have best performace among all as it is can be modify methods like append delte update can be used
     /// StringBuffer : it synchronous method that makes it slower only one thread can be changed or modify that makes it safe among all
     ///


}





