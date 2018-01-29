public class Tervitus{
    public static void main(String[] arg){
        System.out.println("Tere");
        int temperatuur=25;
        if(temperatuur<-28){
            System.out.println("Külmapüha");
        } else {
            //Kui õues on soojem kui 20 kraadi
            //siis soovita lühikesi varrukaid
            if(temperatuur>20){
                System.out.println(
                  "Ettevaatust, vahetunnis veesõda!");
            }
            System.out.println("Hommikul kooli");
        }
    }
}