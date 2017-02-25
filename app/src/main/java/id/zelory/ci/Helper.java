package id.zelory.ci;

/**
 * Created on : February 26, 2017
 * Author     : zetbaitsu
 * Name       : Zetra
 * GitHub     : https://github.com/zetbaitsu
 */
public final class Helper {

    private Helper() {

    }

    public static String whatIf(int n) {
        return n < 0 ? "Negative" : "Positive";
    }
}
