public class loopar {
    public static void main(String[] args) {
        // vi beräknar lilla multiplikationstabellen för en bas

        int bas = 4;
        int resultat = bas;
        int i = 0;
        while (i < 9)   {
            resultat += bas;
            System.out.print(resultat+"\n");
            i++;
        }
    }
}
