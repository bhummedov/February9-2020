import java.util.Scanner;
public class Assignment3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your computer skills:");
        String skill = scanner.next();
        if(skill.equals("Java")) {
            System.out.println("what;s your QA score: 0-100");
            int score = scanner.nextInt();
            if (score >90 && score <=100){
                System.out.println("Perfect :");
            }
        }
          else if (skill.equals ("SQL")){
                System.out.println("what's your Hackerrank Score :? ");
        }
          else if (skill.equals ("Cloud"))
          {
            System.out.println(("Certification? "));
        }
        else
            {
            System.out.println("enter java / sql / cloud");
        }
    }
}
