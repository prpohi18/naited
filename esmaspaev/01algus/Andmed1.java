import java.util.Arrays;
public class Andmed1{
    public static void main(String[] arg){
        Arrays.sort(arg);
        System.out.println(Arrays.toString(arg));
        for(int i=0; i<arg.length; i++){
            System.out.println(i+": "+arg[i]);
        }
        for(String a: arg){
            System.out.println(a);
        }
        Arrays.stream(arg).forEach(System.out::println);
    }
}
/*
[jaagup@greeny 01algus]$ java Andmed1 Juku Kati Mati Anu
[Anu, Juku, Kati, Mati]
0: Anu
1: Juku
2: Kati
3: Mati
Anu
Juku
Kati
Mati
Anu
Juku
Kati
Mati
*/