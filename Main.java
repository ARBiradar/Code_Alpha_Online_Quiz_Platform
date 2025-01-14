import java.util.Scanner;

public class OnlineQuizPlatform {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array of questions and answers
        String[] questions = {
            "What is the capital of France?",
            "Which language is used for web development?",
            "What is the largest planet in our solar system?"
        };
        
        String[] options = {
            "1) Berlin  2) Madrid  3) Paris  4) Rome",
            "1) Java  2) Python  3) HTML  4) C++",
            "1) Earth  2) Mars  3) Jupiter  4) Saturn"
        };
        
        int[] correctAnswers = {3, 3, 3}; // Correct answers (index starts from 0)

        int score = 0;  // To keep track of the score

        System.out.println("Welcome to the Online Quiz!");

        // Loop through all questions
        for (int i = 0; i < questions.length; i++) {
            System.out.println("\nQuestion " + (i + 1) + ": " + questions[i]);
            System.out.println(options[i]);
            System.out.print("Enter your answer (1-4): ");
            int answer = scanner.nextInt();

            // Check if the answer is correct
            if (answer == correctAnswers[i]) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect! The correct answer is option " + correctAnswers[i]);
            }
        }

        // Display the total score
        System.out.println("\nQuiz Completed!");
        System.out.println("Your final score is: " + score + "/" + questions.length);

        // Close scanner
        scanner.close();
    }
}