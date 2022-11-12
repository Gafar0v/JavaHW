public class LetterCounter {
    static String[] vowelLetters = {"a", "e", "i", "u", "y", "o"};
    static String[] consonantLetters = {"b", "c", "d", "f", "g", "h", "j", "k", "l", "m", "n", "p", "q", "r", "s", "t", "v", "w", "x", "z"};
    static void vowelConsonantCounter(String string) {
        String[] strArr = string.toLowerCase().split("");
        int vowel = 0;
        int consonant = 0;

        for (int i = 0; i < strArr.length; i++) {

            for (int j = 0; j < 20; j++) {
                if (j < 6 && strArr[i].equals(vowelLetters[j])) {
                    vowel++;
                    break;
                }
                if (strArr[i].equals(consonantLetters[j])) {
                    consonant++;
                    break;
                }
            }

        }
        System.out.println("number of vowel letters: " + vowel);
        System.out.println("number of consonant letters: " + consonant);
    }
}
