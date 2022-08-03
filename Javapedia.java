import java.util.Scanner;

public class Javapedia {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n**********Javapedia**********");
        System.out.println("How many historical figures will you register?");

        int registerNum = scan.nextInt();
        scan.nextLine();

        String[][] database = new String[registerNum][3];

         for (int i = 0; i < registerNum; i++) {
             int figureNum = i + 1;
             System.out.println("\tFigure " + figureNum);
             System.out.print("\t* Name: ");
             database[i][0] = scan.nextLine();
             System.out.print("\t* Birthdate: ");
             database[i][1] = scan.nextLine();
             System.out.print("\t* Occupation: ");
             database[i][2] = scan.nextLine();
         }

        System.out.println("These are the values you stored:");
        printDatabase(database);

        System.out.print("\nWho do you want information on? ");
        String search = scan.nextLine();
        System.out.println();
        System.out.println(returnSearchResults(database, search));
        scan.close();
    }

    public static void printDatabase(String[][] database) {
        for (int i = 0; i < database.length; i++) {
            for (int j = 0; j < database[i].length; j++) {
                System.out.print("\t" + database[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static String returnSearchResults(String[][] database, String search) {
        String result = "\tCouldn't find an entry for that person...";
        for (int i = 0; i < database.length; i++) {
            if (database[i][0].equals(search)) {
                result = "\tName: " + database[i][0] + "\n" +
                         "\tDate of Birth: " + database[i][1] + "\n" +
                         "\tOccupation : " + database[i][2];
            }
        }
        return result;
    }

}
