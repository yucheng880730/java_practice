import java.util.Scanner;

public class VoteRecorder {

    private static String nameCandidatePresident1;
    private static String nameCandidatePresident2;
    private static String nameCandidateVicePresident1;
    private static String nameCandidateVicePresident2;

    private static int votesCandidatePresident1;
    private static int votesCandidatePresident2;
    private static int votesCandidateVicePresident1;
    private static int votesCandidateVicePresident2;

    int myVoteForPresident;
    int myVoteForVicePresident;

    // constructor
    public VoteRecorder() {

    }

    /**
     * method that sets the names of the two candidates for president
     *
     * @param name1
     * @param name2
     */
    public static void setCandidatesPresident(String name1, String name2) {

        nameCandidatePresident1 = name1;
        nameCandidatePresident2 = name2;

    }

    /**
     * method that sets the names of the two candidates for vice president
     *
     * @param name1
     * @param name2
     */
    public static void setCandidatesVicePresident(String name1, String name2) {

        nameCandidateVicePresident1 = name1;
        nameCandidateVicePresident2 = name2;

    }

    /**
     * method that resets the vote counts to zero
     */
    public static void resetVotes() {

        votesCandidatePresident1 = 0;
        votesCandidatePresident2 = 0;
        votesCandidateVicePresident1 = 0;
        votesCandidateVicePresident2 = 0;

    }

    /**
     * method that returns a string with the current total number of votes for
     * both presidential candidates
     *
     * @return
     */
    public static String getCurrentVotePresident() {

        return nameCandidatePresident1 + " has "
        + votesCandidatePresident1 + " votes; "
        + nameCandidatePresident2 + " has " + votesCandidatePresident2 + " votes ";

    }

    /**
     * method that returns a string with the current total number of votes for
     * both vice presidential candidates
     *
     * @return
     */
    public static String getCurrentVoteVicePresident() {

        return nameCandidateVicePresident1 + " has "
        + votesCandidateVicePresident1 + " votes; "
        + nameCandidateVicePresident2 + " has " + votesCandidateVicePresident2 + " votes ";
    }

    /**
     * method that gets an individual’s votes, confirms them, and then records
     * them
     */
    public void getAndConfirmVotes() {

        Scanner scanner = new Scanner(System.in);
        getVotes();
        if (confirmVotes() == true) {
            System.out.println("Type yes if there is another voter");
            String i = scanner.next();
            if (i.equalsIgnoreCase("Yes")) {

                getAndConfirmVotes();

            }
        } else {

            getAndConfirmVotes();

        }

    }

    /**
     * method that returns a vote choice for president and vice president from
     * an individual
     */
    private void getVotes() {

        System.out.println("YOU ARE VOTING FOR PRESIDENT");
        myVoteForPresident = getAVote(nameCandidatePresident1,
                nameCandidatePresident2);
        System.out.println("YOU ARE VOTING FOR VICE PRESIDENT");
        myVoteForVicePresident = getAVote(nameCandidateVicePresident1,
                nameCandidateVicePresident2);

    }

    /**
     * method that displays a person’s vote for president and vice president,
     * asks whether the voter is happy with these choices, and returns true or
     * false according to a yes or no response
     *
     * @return
     */
    private boolean confirmVotes() {

        Scanner scanner = new Scanner(System.in);
        if (myVoteForPresident == 0)
            System.out.println("Your vote for president is no one.");
        if (myVoteForPresident == 1)
            System.out.println("Your vote for president is " + nameCandidatePresident1);
        if (myVoteForPresident == 2)
            System.out.println("Your vote for president is " + nameCandidatePresident2);
        if (myVoteForVicePresident == 0)
            System.out.println("Your vote for Vice president is no one.");
        else if (myVoteForVicePresident == 1)
            System.out.println("Your vote for vice president is " + nameCandidateVicePresident1);
        else if (myVoteForVicePresident == 2)
            System.out.println("Your vote for vice president is " + nameCandidateVicePresident2);

        System.out.println("Type yes if you are happy with your vote");
        String choice = scanner.next();
        recordVotes();
        if (choice.equalsIgnoreCase("Yes"))
            return true;
        else if (choice.equalsIgnoreCase("No"))
            return false;
        else
            return false;
    }

    /**
     * method that returns a vote choice for a single race from an individual (0
     * for no choice, 1 for the first candidate, and 2 for the second candidate)
     *
     * @param name1
     * @param name2
     * @return
     */
    private int getAVote(String name1, String name2) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please choose a candidate:");
        System.out.println("    0 - No one");
        System.out.println("    1 - " + name1);
        System.out.println("    2 - " + name2);
        int choice = scanner.nextInt();
        return choice;

    }

    /**
     * method that will add an individual’s votes to the appropriate static
     * variables object for each voter
     */
    private void recordVotes() {

        if (myVoteForPresident == 1)
            votesCandidatePresident1++;
        //else
            //votesCandidatePresident1 = votesCandidatePresident1;

        if (myVoteForPresident == 2)
            votesCandidatePresident2++;
        //else
            //votesCandidatePresident2 = votesCandidatePresident2;

        if (myVoteForVicePresident == 1)
            votesCandidateVicePresident1++;
        //else
            //votesCandidateVicePresident1 = votesCandidateVicePresident1;

        if (myVoteForVicePresident == 2)
            votesCandidateVicePresident2++;
        //else
            //votesCandidateVicePresident2 = votesCandidateVicePresident2;

    }
}





