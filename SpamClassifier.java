import java.util.*;

public class SpamClassifier {
    private Set<String> spamWords;

    public SpamClassifier() {
        spamWords = new HashSet<>(Arrays.asList(
            "win", "free", "offer", "money", "urgent", "lottery", "claim", "click", "buy now", "subscribe"
        ));
    }

    public boolean isSpam(String message) {
        message = message.toLowerCase();
        for (String word : spamWords) {
            if (message.contains(word)) {
                return true;
            }
        }
        return false;
    }

    public void addSpamKeyword(String word) {
        spamWords.add(word.toLowerCase());
    }
}
