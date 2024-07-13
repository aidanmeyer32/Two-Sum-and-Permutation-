import java.util.*;

public class Source {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Algorithm algorithm = new Algorithm();

        System.out.println("============================================================");
        System.out.println("Type 'Primes' or 'Permutation' for corresponding algorithms:");
        System.out.println("============================================================");

        String line = scanner.nextLine();

        while(!line.equals("Primes") && !line.equals("Permutation")){
            System.out.println("Error, typo. Please type 'Primes' or 'Permutation' as shown.");
            line = scanner.nextLine();
        }

        if(line.equals("Primes")){
            //assign integer values from input and call prime methods
            System.out.println("Enter a positive integer: " );
            int n = Integer.parseInt(scanner.nextLine());
            algorithm.sum(n);
        }else{ //permutation
            System.out.println("Enter a value n: ");
            int n = Integer.parseInt(scanner.nextLine());

            System.out.println("Enter a value k: ");
            int k = Integer.parseInt(scanner.nextLine());

            algorithm.perm(n, k);
        }
    }

}
