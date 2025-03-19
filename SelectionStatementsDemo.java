public class SelectionStatementsDemo {
    public static void main(String[] args) {
        int studentScore = 82; // Example score
        if (studentScore >= 60) { // Check if score is 60 or higher
            System.out.println("You passed the exam!");
        }
        if (studentScore >= 90) { 
         System.out.println("Excellent performance!");
        } else {
            System.out.println("Keep improving!");
        }
        if (studentScore >= 60) { // Check if score is 60 or higher
             if (studentScore >= 90) {
            System.out.println("Grade: A");
            } else {
             if (studentScore >= 75) {
            System.out.println("Grade: B");
            } else {
            System.out.println("Grade: C");
            }
            }
        } else {
             System.out.println("Grade: F"); // If score is below 60, print F
        }
        if (studentScore >= 90) {
            System.out.println("Multi-way Grade: A");
        } else if (studentScore >= 80) {
             System.out.println("Multi-way Grade: B");
        } else if (studentScore >= 70) {
              System.out.println("Multi-way Grade: C");
        } else if (studentScore >= 60) {
              System.out.println("Multi-way Grade: D");
        } else {
              System.out.println("Multi-way Grade: F");
        }
    }
}