import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        // write your code here
        PTag ptag1 = new PTag("P5", "Mit Ptag");
        PTag ptag2 = new PTag("P7", "Mit Ptag2");
        PTag ptag3 = new PTag("P3", "Mit Ptag3");
        PTag ptag4 = new PTag("P1", "Mit Ptag3");
        PTag ptag5 = new PTag("P2", "Mit Ptag3");
        PTag ptag6 = new PTag("P4", "Mit Ptag3");
        PTag ptag7 = new PTag("P6", "Mit Ptag3");

        TreeSet<PTag> tagSet = new TreeSet<>();
        tagSet.add(ptag1);
        tagSet.add(ptag2);
        tagSet.add(ptag3);
        tagSet.add(ptag4);
        tagSet.add(ptag5);
        tagSet.add(ptag6);
        tagSet.add(ptag7);
        tagSet.add(ptag7);


        System.out.println(tagSet);
    }

    public void opgave1Og3(){
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


