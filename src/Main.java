//4. Scrieti un program in care cititi o propozitie de la tastatura

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // Enter data using Scanner
        Scanner reader = new Scanner(System.in);

        /* Reading data using nextLine */
        String sentence = reader.nextLine();

        // Printing the read line
        System.out.println(sentence);
    }
}