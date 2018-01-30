public class Tervitus{
    public static void main(String[] arg){
        System.out.println("Tere!");
        int vanus=14;
        System.out.println("Argumente: "+arg.length);
        if(arg.length>0){
            vanus=Integer.parseInt(arg[0]);
        }
        if(vanus<7){
            System.out.println("Tasuta");
        } else if(vanus<14 || vanus>65){
            System.out.println("Sooduspilet");
        } else {
            System.out.println("Täispilet");
        }
    }
}