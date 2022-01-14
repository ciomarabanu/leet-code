import java.util.ArrayList;

public class MaximumNoOfballoons {
    public int maxNumberOfBalloons(String text) {

        var b = 0;
        var a = 0;
        var l = 0;
        var o = 0;
        var n = 0;

        for (var letter : text.toCharArray()){
            if (letter == 'b'){
                b++;
            }
            if (letter == 'a'){
                a++;
            }
            if (letter == 'l'){
                l++;
            }
            if (letter == 'o'){
                o++;
            }
            if (letter == 'n'){
                n++;
            }
        }
        l = l / 2;
        o = o / 2;

        var min = new ArrayList<Integer>();
        min.add(Math.min(b, a));
        min.add(Math.min(l, o));
        min.add(n);
        min.add(Math.min(min.get(0), min.get(1)));

        return (Math.min(min.get(2), min.get(3)));
    }
}
