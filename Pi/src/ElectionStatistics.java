import java.util.Scanner;
public class ElectionStatistics {
    public static void main(String[] args) {
        //declaring scanner variable
        Scanner input = new Scanner(System.in);
        //declaring variables
        System.out.println("What is the name of the first party?");
        String partyFirst = input.next();
        System.out.println("What is the amount of votes for " + partyFirst);
        int votesFirst = input.nextInt();
        System.out.println("What is the nane of the second party?");
        String partySecond = input.next();
        System.out.println("What is the amount of votes for " + partySecond);
        int votesSecond = input.nextInt();
        System.out.println("What is the name of the third party?");
        String partyThird = input.next();
        System.out.println("What is the amount of votes for " + partyThird);
        int votesThird = input.nextInt();
        //math time
        int totalVotes = votesFirst + votesSecond + votesThird;
        System.out.println(totalVotes);
        float percentFirst = ((float) votesFirst / totalVotes) * 100;
        float percentSecond = ((float) votesSecond / totalVotes) * 100;
        float percentThird = ((float) votesThird / totalVotes) * 100;
        //printing out
        System.out.println("Votes for " + partyFirst + ": " + percentFirst + "%");
        System.out.println("Votes for " + partySecond + ": " + percentSecond + "%");
        System.out.println("Votes for " + partyThird + ": " + percentThird + "%");
    }
}
