import java.util.Objects;

public abstract class HTMLTag implements Comparable<HTMLTag> {
    private String id;
    private String text;

    //publick HTML(){}
    public HTMLTag(String id, String text){
        this.id = id;
        this.text = text;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    abstract String toHTMLString();

    abstract void print();

    public abstract void setColor(String s);

    @Override
    public int compareTo(HTMLTag htmlTag) {
        int thisid2 = Integer.parseInt(this.id.substring(1));
        int htmlTagid2 = Integer.parseInt(htmlTag.getId().substring(1));

        if (this == htmlTag) {
            return 0;
        }else if (thisid2 > htmlTagid2) {
            return 1;
        }
        return -1;
    }

    @Override
    public String toString() {
        return "HTMLTag{" +
                "id='" + id + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}


