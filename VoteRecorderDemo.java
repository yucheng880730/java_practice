import java.util.Scanner;

public class VoteRecorderDemo {
    /**
     * @param args
     */
    public static void main(String[] args) {

        //Scanner scanner = new Scanner(System.in);
        VoteRecorder voteRecorder = new VoteRecorder();
        voteRecorder.setCandidatesPresident("Annie", "Bob");
        voteRecorder.setCandidatesVicePresident("John", "Susan");
        voteRecorder.getAndConfirmVotes();

        /*
        System.out.println("Type yes if you are happy with your vote");
        String i = scanner.next();
        if (i.equalsIgnoreCase("Yes")) {

            voteRecorder.resetVotes();

        }

        */

        System.out.println(voteRecorder.getCurrentVotePresident());
        System.out.println(voteRecorder.getCurrentVoteVicePresident());
    }

}
