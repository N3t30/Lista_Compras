public class frutas {
    public static void main(String[] args) {
        String frutas1 = "morangos";
        String frutas2 = "melão";
        if (frutas1.compareTo(frutas2) > 0){
            System.out.println("morenago");
            // . 0 - primeira string > segunda string
            // * = 0 - string iguais 
            // < 0 - primeira string < segunda string
        }else {
            System.out.println("melão");
        }
        System.out.println(frutas1.compareTo(frutas2));
        System.out.println(frutas1.compareTo(frutas1));
        System.out.println(frutas2.compareTo(frutas2));

    }
}