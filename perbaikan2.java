package binus.forum;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
public class perbaikan2 {
    private static final int Kesempatan = 10;
    private static final int JawabanBenar = 10;
    private static final int MinimumScore = 70;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String repeat = "";
        while (!repeat.equalsIgnoreCase("t")) {
            System.out.println("Coepoe Word Puzzle \n==================\n");
            System.out.println("Rules :");
            System.out.println("1. Create a word using given characters (minimum 3 characters, maximum 6 characters)");
            System.out.println("2. Each level, you have 10 chances to answer correctly.");
            System.out.println("3. Every correct answer will grant you 10 points.");
            System.out.println("4. In order to get to the next level, you have to score minimum 70 points on each level.");
            System.out.println("5. You can't use the same word twice.");

            //Level 1
            System.out.println("\nLevel 1 \n-------");

            System.out.println("     d     e     t     t     l     i");
            String[] level1 = {"die", "led", "lei", "let", "lid", "lie", "lit", "tie", "deli", "diet", "edit", "idle", "lied", "tide", "tied", "tile", "tilt", "tilde", "tiled", "title", "tilted", "titled"};

            System.out.print("\n\n");
            int score1 = 0;
            int percobaan = 1;
            int numUniqueAnswers = 0;
            String lastAnswerlvl1 = "";
            ArrayList<String> jawabanSebelumnyalvl1 = new ArrayList<String>();
            while (percobaan <= Kesempatan && numUniqueAnswers < level1.length ) {
                System.out.print(percobaan + ". Your Answer : ");
                String answerlvl1 = input.nextLine().toLowerCase();

                //Pemeriksaan panjang jawaban input Level 1
                if (answerlvl1.length() < 3 || answerlvl1.length() > 6) {
                    System.out.println("Your answer should be between 3 to 6 characters long..");
                    continue;
                }


                //Pemeriksaan Jawaban berulang Level 1
                if (jawabanSebelumnyalvl1.contains(answerlvl1)) {
                    System.out.println("You had already type this word before..");
                    continue;
                }



                //Jawaban Benar Level 1
                if (contains(level1, answerlvl1)) {
                    score1 += JawabanBenar;
                    System.out.println("#Right. Score :" + score1);
                    lastAnswerlvl1   = answerlvl1;
                    numUniqueAnswers ++;
                    jawabanSebelumnyalvl1.add(answerlvl1);
                }

                //Jawaban Salah Level 1
                else {
                    lastAnswerlvl1  = "";
                }
                percobaan++;
            }

            if (score1 < MinimumScore) {
                System.out.println("Sorry, you lose. Your score is below the minimum required.");
                System.out.println("You Lose!! Try Again..");
                System.out.println("Do you want to retry [y/t] ?");
                repeat = input.nextLine();
                if (repeat.equalsIgnoreCase("y")) {
                    continue;
                }   else if (repeat.equalsIgnoreCase("t")) {
                    break;
                }   else {
                    while (!repeat.equalsIgnoreCase("y") && !repeat.equalsIgnoreCase("t")) {
                        System.out.println("Please input y/t !!!");
                        System.out.print("Do you want to retry [y/t] ?");
                        repeat = input.nextLine();
                    }
                }
            }
            else {
                System.out.println("You had answered 10 times with " + score1/10 + " right answeres..\n");
                System.out.print("Correct Answers :\n" +Arrays.toString(level1));
//                System.out.println("\nOverall score : " + score1);
            }

            //Level 2
            System.out.println("\nLevel 2 \n-------");

            System.out.println("     s     e     c     a     e     n");
            String[] level2 = {"sea", "can", "see", "ace", "sac", "sec", "scene", "cane", "case", "scan", "acnes", "canes", "cease", "seneca", "sneace", "seance"};

            System.out.print("\n\n");
            int score2 = 0;
            int percobaan2 = 1;
            int numUniqueAnswers2 = 0;
            String lastAnswerlvl2 = "";
            ArrayList<String> jawabanSebelumnyalvl2 = new ArrayList<String>();
            while (percobaan2 <= Kesempatan && numUniqueAnswers2 < level2.length ) {
                System.out.print(percobaan2 + ". Your Answer : ");
                String answerlvl2 = input.nextLine().toLowerCase();

                //Pemeriksaan panjang jawaban input Level 2
                if (answerlvl2.length() < 3 || answerlvl2.length() > 6) {
                    System.out.println("Your answer should be between 3 to 6 characters long..");
                    continue;
                }

                //Pemeriksaan Jawaban berulang Level 2
                if (jawabanSebelumnyalvl2.contains(answerlvl2)) {
                    System.out.println("You had already type this word before..");
                    continue;
                }



                //Jawaban Benar
                if (contains(level2, answerlvl2)) {
                    score2 += JawabanBenar;
                    System.out.println("#Right. Score :" + score2);
                    lastAnswerlvl2   = answerlvl2;
                    numUniqueAnswers2 ++;
                    jawabanSebelumnyalvl2.add(answerlvl2);
                }

                //Jawaban Salah
                else {
                    lastAnswerlvl2  = "";
                }
                percobaan2++;
            }

            if (score2 < MinimumScore) {
                System.out.println("Sorry, you lose. Your score is below the minimum required.");
                System.out.println("You Lose!! Try Again..");
                System.out.println("Do you want to retry [y/t] ?");
                repeat = input.nextLine();
                if (repeat.equalsIgnoreCase("y")) {
                    continue;
                }   else if (repeat.equalsIgnoreCase("t")) {
                    break;
                }   else {
                    while (!repeat.equalsIgnoreCase("y") && !repeat.equalsIgnoreCase("t")) {
                        System.out.println("Please input y/t !!!");
                        System.out.print("Do you want to retry [y/t] ?");
                        repeat = input.nextLine();
                    }
                }
            }
            else {
                System.out.println("You had answered 10 times with " + score2 / 10 + " right answeres..\n");
                System.out.print("Correct Answers :\n" + Arrays.toString(level2));
//                System.out.println("\nOverall score : " + score2);
            }

            //Level 3
            System.out.println("\nLevel 3 \n-------");

            System.out.println("     h     k     r     n     e     o");
            String[] level3 = {"hen", "her", "hon", "eon", "err", "ken", "kor", "noh", "nor", "oak", "oar", "one", "ore", "roe", "heron", "hero",
            "kern","keno","knar","kora","nerk","nook","okra","rehn","rook","honk","honker"};

            System.out.print("\n\n");
            int score3 = 0;
            int percobaan3 = 1;
            int numUniqueAnswers3 = 0;
            String lastAnswerlvl3 = "";
            ArrayList<String> jawabanSebelumnyalvl3 = new ArrayList<String>();
            while (percobaan3 <= Kesempatan && numUniqueAnswers3 < level3.length ) {
                System.out.print(percobaan3 + ". Your Answer : ");
                String answerlvl3 = input.nextLine().toLowerCase();

                //Pemeriksaan panjang jawaban input Level 3
                if (answerlvl3.length() < 3 || answerlvl3.length() > 6) {
                    System.out.println("Your answer should be between 3 to 6 characters long..");
                    continue;
                }

                //Pemeriksaan Jawaban berulang Level 3
                if (jawabanSebelumnyalvl3.contains(answerlvl3)) {
                    System.out.println("You had already type this word before..");
                    continue;
                }



                //Jawaban Benar
                if (contains(level3, answerlvl3)) {
                    score3 += JawabanBenar;
                    System.out.println("#Right. Score :" + score3);
                    lastAnswerlvl3   = answerlvl3;
                    numUniqueAnswers3 ++;
                    jawabanSebelumnyalvl3.add(answerlvl3);
                }

                //Jawaban Salah
                else {
                    lastAnswerlvl3  = "";
                }
                percobaan3++;
            }

            if (score3 < MinimumScore) {
                System.out.println("Sorry, you lose. Your score is below the minimum required.");
                System.out.println("You Lose!! Try Again..");
                System.out.println("Do you want to retry [y/t] ?");
                repeat = input.nextLine();
                if (repeat.equalsIgnoreCase("y")) {
                    continue;
                }   else if (repeat.equalsIgnoreCase("t")) {
                    break;
                }   else {
                    while (!repeat.equalsIgnoreCase("y") && !repeat.equalsIgnoreCase("t")) {
                        System.out.println("Please input y/t !!!");
                        System.out.print("Do you want to retry [y/t] ?");
                        repeat = input.nextLine();
                    }
                }
            }
            else {
                System.out.println("You had answered 10 times with " + score3/10 + " right answeres..\n");
                System.out.print("Correct Answers :\n" +Arrays.toString(level3));
                System.out.println("\nOverall score : " + (score1 + score2 + score3));
                System.out.println("You win!! \nPress Enter to exit..");
                input.nextLine();
                break;
            }


        }
    }
    private static boolean contains(String[] array, String answer) {
        for (String element : array) {
            if (element.equals(answer)) {
                return true;
            }
        }
        return false;
    }
}
