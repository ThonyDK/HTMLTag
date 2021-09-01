import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        HeaderTag h1 = new HeaderTag("id nr. 10, ", "Her er vores h1 tag", 1);
        HeaderTag h2 = new HeaderTag("Vores id nr. ", "Her er vores h2 tag", 2);
        System.out.println(h1.toHTMLString());

        ATag tag1 = new ATag("100", "Link til Dr.", "");
        ATag tag2 = new ATag("99", "Link til TV2", "");


        tag2.getArr();

        ArrayList<String> arr2 = tag2.getArr();

        for (int i = 0; i < arr2.size(); i++) {
            System.out.println(arr2.get(i));

        }

    }

}
