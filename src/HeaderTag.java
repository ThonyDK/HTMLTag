public class  HeaderTag extends HTMLTag {

    private int number;

    public HeaderTag(String id, String text, int number) {
        super(id,text);
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    // man behøver ikke at skrive this foran get men man bør gør det.
    @Override
    String toHTMLString() {
        return "<h" + this.getNumber() + " " + "id =" + this.getId() + "vores tekst: " + getText();

    }

    @Override
    void print() {
        System.out.println(toHTMLString());
    }

    @Override
    public void setColor(String s) {

    }
}
