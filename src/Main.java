public class Main {

    public static void main(String[] args) {
	// write your code here
        HeaderTag h1 = new HeaderTag("id nr. 10, ", "Her er vores h1 tag", 1);
        HeaderTag h2 = new HeaderTag("Vores id nr. ", "Her er vores h2 tag", 2);
        System.out.println(h1.toHTMLString());

    }
}
