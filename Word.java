// Word -- creates class "Word" to specify words used in string
// CSIS 312-D01

import java.util.Random;

public class Word
{
    String[] articles, nouns, verbs, prepositions;

    public Word() {
        articles = new String[]{"the", "a", "one", "some", "any"};
        nouns = new String[]{"boy", "girl", "dog", "town", "car"};
        verbs = new String[]{"drove", "jumped", "ran", "walked", "skipped"};
        prepositions = new String[]{"to", "from", "over", "under", "on"};
    }

    public Random random = new Random();

    public String getArticle() {return articles[random.nextInt(5)];}
    public String getNouns() {return nouns[random.nextInt(5)];}
    public String getVerbs() {return verbs[random.nextInt(5)];}
    public String getPrepositions() {return prepositions[random.nextInt(5)];}

}
