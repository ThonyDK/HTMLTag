import java.util.ArrayList;
import java.util.Random;

public class HTMLStyle extends HTMLTag {
    Random random = new Random();
    int r;
    int g;
    int b;
    String backgrundscolor;


    public HTMLStyle(String id, String text) {
        super(id, text);
        setRandomColor();
        setRandomBackgroundColor();
    }
    public void setRandomColor() {

        r = random.nextInt(256);
        g = random.nextInt(256);
        b = random.nextInt(256);
    }
    public void setRandomBackgroundColor() {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("grøn");
        colors.add("blå");
        colors.add("orange");
        colors.add("lilla");
        int number = random.nextInt(colors.size());
        backgrundscolor = colors.get(number);
    }

    public String getRgb(){
        String RGB = r + "," + g +"," + b;
        return RGB;
    }

    public String getBackgrundscolor() {
        return backgrundscolor;
    }

    @Override
    String toHTMLString() {
        return "<h1 style=background-color: rgb(" + getRgb() + ") ; color: " + getBackgrundscolor() +" >Her er en overskrift med farven " + getRgb() + " </h1>";
    }

    @Override
    void print() {

    }

    @Override
    public void setColor(String s) {

    }
}
