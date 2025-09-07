package prog6112_section_b;

import java.util.Scanner;

public class PROG6112_SECTION_B {

    public static void main(String[] args) {

        System.out.println("Welcome to the Heroes & Villains Quiz!");
        System.out.println("Test your knowledge of famous comic book characters.\n");
        playGame();
        playAgain();

    }

    public static void playGame() {
        Scanner enter = new Scanner(System.in);

        // heroes in a 2D array
        String[][] heroesData = {
                {"Superman", "Super Strength", "Flight"},
                {"Batman", "High Intelligence", "Martial Arts"},
                {"Iron Man", "Flight", "Genius Inventor"},
                {"Flash", "Super Speed", "Time Manipulation"},
                {"Professor X", "Telepathy", "Leadership"}
        };

        // villains in a 2D array
        String[][] villainsData = {
                {"Doctor Doom", "Genius Inventor", "Dark Science"},
                {"Loki", "Illusion Magic", "Trickery"},
                {"Scarecrow", "Fear Gas", "Psychology Master"},
                {"Thanos", "Strength & Strategy", "Infinity Gauntlet"},
                {"Hela", "Necromancy", "Death Magic"}
        };

        int score = 0;
        int totalQuestions = heroesData.length + villainsData.length; // Total number of questions , calculates the total number of
        // questions by adding the length of heroesData and villainsData arrays.

        try {
            System.out.println("\n=== HEROES & VILLAINS QUIZ ===");
            System.out.println("Answer the questions below:");

            // HERO Questions
            for (int i = 0; i < heroesData.length; i++) {
                Heroes hero = new Heroes(heroesData[i][0], heroesData[i][1], heroesData[i][2]);

                System.out.println("Who has the power: " + hero.getHeroPower() + "?"); // Displays the hero's power and prompts the user to identify the hero associated with that power.
                System.out.println(
                        "1) Superman  " +
                                "\n2) Batman  " +
                                "\n3) Iron Man  " +
                                "\n4) Flash  " +
                                "\n5) Professor X");

                System.out.print("Enter your choice from 1-5: ");
                int choice = enter.nextInt();

                if (heroesData[choice - 1][0].equals(hero.getHeroName())) { // Checks if the user's choice matches the hero's name.
                    System.out.println("Correct! The answer is " + hero.getHeroName() + "\n");
                    hero.display(); // Calls the display method of the Heroes class to show information about the hero.
                    hero.skills();
                    score++; // Increments the score for a correct answer.
                } else {
                    System.out.println("Not quite! Please try again.\n");
                    System.out.println("Hint the hero's skills include: " + hero.getHeroSkills() + "\n");
                    System.out.print("Enter your choice from 1-5 again: ");
                    int newChoice = enter.nextInt();
                    if (heroesData[newChoice - 1][0].equals(hero.getHeroName())) {
                        System.out.println("Correct! The answer is " + hero.getHeroName() + "\n");
                        hero.display();
                        hero.skills();
                        score++;
                    } else {
                        System.out.println("Wrong! The answer was " + hero.getHeroName() + ".\n");

                    }
                }
            }

            // Villain Questions
            for (int i = 0; i < villainsData.length; i++) {
                Villains villain = new Villains(villainsData[i][0], villainsData[i][1], villainsData[i][2]);

                System.out.println("Who has the evil power: " + villain.getVillainPower() + "?");

                System.out.println("1) Doctor Doom " +
                        " \n2) Loki  " +
                        "\n3) Scarecrow  " +
                        "\n4) Thanos  " +
                        "\n5) Hela");
                System.out.print("Enter your choice from 1-5: ");
                int choice = enter.nextInt();

                if (villainsData[choice - 1][0].equals(villain.getVillainName())) {
                    System.out.println("Correct! " + villain.getVillainName() + " was up to no good!\n");
                    villain.display();
                    villain.skills();
                    score++;
                } else {
                    System.out.println("Not quite! Please try again.\n");
                    System.out.println("Hint the villain's skills include: " + villain.getVillainSkills() + "\n");
                    System.out.print("Enter your choice from 1-5 again: ");
                    int newChoice = enter.nextInt();

                    if (villainsData[newChoice - 1][0].equals(villain.getVillainName())) {
                        System.out.println("Correct! " + villain.getVillainName() + " was up to no good!\n");
                        villain.display();
                        villain.skills();
                        score++;
                    } else {
                        System.out.println("Wrong! The answer was " + villain.getVillainName() + ".\n");
                    }
                }
            }

            // Final Score for the quiz of heroes and villains
            System.out.println("=== GAME OVER ===");
            System.out.println("Your score: " + score + " out of " + totalQuestions);
            if (score == totalQuestions) {
                System.out.println("Perfect! You’re the ultimate comic fan!");
            } else if (score >= totalQuestions / 2) {
                System.out.println("Good job! You know your characters!");
            } else {
                System.out.println("Better luck next time!");
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid choice. Please select a number between 1 and 5.");

            playAgain();


        }
    }

    public static void playAgain() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Do you want to play again? press (y) or any key to exit: ");
        String response = scanner.nextLine().trim().toLowerCase();
        if (response.equals("y")) {
            playGame(); // Restart the game

        } else if(!response.equals("y")) {
            System.out.println("Thank you for playing! Goodbye.");
            System.exit(0); // Exit the program
        }
    }
}