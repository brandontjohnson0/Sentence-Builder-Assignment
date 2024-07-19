// SectenceTest -- Runs program to create sentence using words from class "Word" in the structure from class "Sentence"
// CSIS 312-D01

public class SentenceTest {

    public static void main(String[] args) {

        System.out.println("Brandon Johnson - Assignment 4");

        Sentence sentence = new Sentence();

        for (int i = 0; i < 20; i++) {
            System.out.println(sentence.getSentence());

        }
    }
}
