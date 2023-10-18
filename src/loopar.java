public class loopar {
    public static void main(String[] args) {
        // vi beräknar lilla multiplikationstabellen för en bas

        int bas = 4;
        int resultat = bas;
        for (int i = 0; i < 9; i++) {
            resultat += bas;
            System.out.print(resultat+"\n");
        }
    }
}
