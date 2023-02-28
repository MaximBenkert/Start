import java.util.Scanner;

public class Start {
    public static void main(String[] args)
    {
        System.out.println("Hallo Welt!");

        sumIt(4, 5);
        String Summe = (sumItString(6, 8));
        System.out.println (Summe);
        biggerHundred(55,99);







      /*  Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie einen Text ein und drücken Sie ENTER:");
        String input = scanner.nextLine();
       System.out.println("\n" + "Ihr Text: " + input);
       */


        //Scanner test = new Scanner (System.in);
        //System.out.println("Geben Sie zwei Zahlen ein und drücken Sie ENTER:");
        //int inputZahl = scanner.nextLine();

        System.out.println(longerThan20("halloservustachchen"));
        System.out.println(isItInThere("fancything"));
        System.out.println(callIt("fancywordtttttttttttttt"));

    }
    public static boolean callIt (String myString)
    {
        return (longerThan20 (myString) && isItInThere(myString));
    }
    public static boolean longerThan20 (String wordy)
    {
        return (wordy.length() > 20);
    }
    public static boolean isItInThere (String wordy)
    {
        return (wordy.contains("fancy"));
    }

    public static int sumIt(int value1, int value2)
    {
        return (value1 + value2);

    }
    public static String sumItString(int value1, int value2)
    {
        int result;
        result = value1 + value2;
        return "Summe: " + result;
    }

    public static void biggerHundred (int value1, int value2)
    {
        System.out.println(value1 > 100 || value2 > 100);
    }
    }
