import java.util.ArrayList;

public class ATag extends HTMLTag {
    //<a href="https://www.google.dk/">Link til GL</a>

    private String url;
    ArrayList<String> arr = new ArrayList<>();


    public ATag(String id, String text, String url) {
        super(id, text);
        this.url = url;
        arr.add("https://www.dr.dk/");
        arr.add("https://tv2.dk/");
        arr.add("https://www.theguardian.com/international");
        arr.add("https://politiken.dk/");
        arr.add("https://www.information.dk/");
        arr.add("https://www.berlingske.dk/");
        arr.add("https://ekstrabladet.dk/");
        arr.add("https://www.telegraph.co.uk/");
        arr.add("https://fyens.dk/");
        arr.add("https://www.nytimes.com/");

    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    String toHTMLString() {
        return "<a href = " + "id = " + getId() + " " + "Det her er vores url: " + this.getUrl() + " " + "Dette er vores tekst: " + this.getText();
    }

    @Override
    void print() {
        System.out.println(toHTMLString());

    }

    @Override
    public void setColor(String s) {

    }
}
//<a href="https://www.google.dk/">Link til GL</a>
//"<h" + this.getNumber() + " " + "id =" + this.getId() + "vores tekst: " + getText();