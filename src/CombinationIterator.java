import java.util.Arrays;

public class CombinationIterator {
    String chars;
    int[] sortedChars;
    int combLength;
    int counter = 0;
    int nextJ = 1;

    public CombinationIterator(String characters, int combinationLength) {
        chars = characters;
        combLength = combinationLength;
        var asciiChars = new int[chars.length()];
        for (int i = 0; i < chars.length(); i++){
            asciiChars[i] = (int) chars.charAt(i);
        }
        sortedChars = Arrays.stream(asciiChars).sorted().toArray();
    }

    public String next() {
        if (counter + combLength == sortedChars.length){
            return "";
        }
        StringBuilder next = new StringBuilder(Character.toString(sortedChars[counter]));
        if (nextJ + combLength == sortedChars.length){
            counter++;
        }
            for (int j = nextJ; j < combLength; j++){
                next.append(Character.toString(sortedChars[j]));
            }
        nextJ++;
        return next.toString();
    }

    public boolean hasNext() {
        return !next().equals("");
    }
}
