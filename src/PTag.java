public class PTag extends HTMLTag{

    public PTag(String id, String text) {
        super(id, text);
    }
    @Override
    String toHTMLString() {
        return "<p>" + this.getId() + this.getText() + "</p>";
    }
    @Override
    void print() {
        System.out.println(this.toHTMLString());
    }

    @Override
    public void setColor(String s) {

    }


}
