package Seminars.Seminar3.Ex003;

public class Answer {
    private String userInput;
    private Integer bull;
    private Integer cow;

    public Answer(String userInout, Integer bull, Integer cow) {
        this.userInput = userInout;
        this.bull = bull;
        this.cow = cow;
    }
    public Answer(String userInout) {
        this.userInput = userInout;
    }
    public Answer() {
    }
    @Override
    public String toString() {
        return "{" + "bull= " + bull +
                ", cow= " + cow +
                '}';
    }
}
