import java.util.InputMismatchException;
import java.util.Scanner;

public class Exo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Entrez le premier nombre : ");
            double a = scanner.nextDouble();

            System.out.print("Entrez l'opérateur (+, -, *, /) : ");
            char op = scanner.next().charAt(0);

            System.out.print("Entrez le second nombre : ");
            double b = scanner.nextDouble();

            double resultat = calculer(a, b, op);
            System.out.println("Résultat : " + resultat);

        } catch (InputMismatchException e) {
            System.out.println("Erreur : Vous devez entrer un nombre !");
        } catch (ArithmeticException e) {
            System.out.println("Erreur : Division par zéro impossible !");
        } catch (Exception e) {
            System.out.println("Erreur inattendue : " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    public static double calculer(double a, double b, char op) {
        switch (op) {
            case '+': return a + b;
            case '-': return a - b;
            case '*': return a * b;
            case '/':
                if (b == 0) throw new ArithmeticException("Division par zéro");
                return a / b;
            default:
                throw new IllegalArgumentException("Opérateur invalide : " + op);
        }
    }
}
