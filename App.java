import java.util.Scanner;
class App {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = 1 + (int)(100 * Math.random());
        int K = 5;
        int i, guess;
        System.out.println("Escolha um número" + "entre 1 e 100." + "Adivinhe o número" + " within 5 trials.");
        for (i = 0; i < K; i++) {
            System.out.println("Adivinhe o número:");
            guess = sc.nextInt();
            if (number == guess) {
                System.out.println("Parabéns!" + "Você advinhou o número. "); break;
            }
            else if (number < guess && i ! = K - 1)






        }


    }
}