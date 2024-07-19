// Sentence -- creates structure for sentence and specifies which words to use from class Word
// CSIS 312-D01

import java.util.Locale;

public class Sentence {

    private Word word = new Word();

    public String getSentence() {
        StringBuilder stringbuilder = new StringBuilder();

        String firstArticle = word.getArticle();

        stringbuilder.append(firstArticle.substring(0, 1).toUpperCase()).append(firstArticle.substring(1)).append(" ");
        stringbuilder.append(word.getNouns()).append(" ");
        stringbuilder.append(word.getVerbs()).append(" ");
        stringbuilder.append(word.getPrepositions()).append(" ");
        stringbuilder.append(word.getArticle()).append(" ");
        stringbuilder.append(word.getNouns()).append(".");

        return stringbuilder.toString();
    }


}
