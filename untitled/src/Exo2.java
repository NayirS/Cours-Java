public class Exo2
{
    public static void main(String[] args) {
        int[] nb = {2, 3, 4, 17, 25, 29, 97, 100};

        for (int nombre : nb) {
            if (estPremier(nombre)) {
                System.out.println(nombre + " est premier");
            } else {
                System.out.println(nombre + " n'est pas premier");
            }
        }
    }

    public static boolean estPremier(int n) {
        if (n < 2) return false;

        for (int i = 2; i <= Math.sqrt(n); i++) { // optimisation : on va jusqu'à √n
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
