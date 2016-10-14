import java.util.Random;

/**
 * Created by nb035 on 10/10/16.
 */
public class perfectRandom {

    public perfectRandom(String name, String color) {
        perfName = name;
        perfColor = color;
        randyNum();
    }

    public void randyNum()
    {
        Random rand = new Random();
        int max = (int) Math.sqrt(Integer.MAX_VALUE);
        int min = 0;
	    int randomNumber = rand.nextInt((max - min));
        perfectSquareRandom = Math.abs(randomNumber * randomNumber);
    }
    public String perfName;
    public String perfColor;
    public int perfectSquareRandom;
}
