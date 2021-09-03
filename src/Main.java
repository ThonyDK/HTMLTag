import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here
        HeaderTag h1 = new HeaderTag("id nr. 10, ", "Her er vores h1 tag", 1);
        HeaderTag h2 = new HeaderTag("Vores id nr. ", "Her er vores h2 tag", 2);
        System.out.println(h1.toHTMLString());

        ATag tag1 = new ATag("100", "Link til Dr.", "");
        ATag tag2 = new ATag("99", "Link til TV2", "");

        List<ATag> tagList = new ArrayList<>();
        tagList.add(tag1);
        tagList.add(tag2);

        for (ATag tag : tagList) {
            ArrayList<String> tagArray = tag.getArr();
            for (String Url : tagArray) {
                System.out.println(Url);

            }
        }
        for (int i = 0; i < 1000; i++) {
            HTMLStyle Style = new HTMLStyle("" + (i +1), "Temptext");
            System.out.print("Id =" + Style.getId());
            System.out.println(Style.toHTMLString());
        }
    }
}


