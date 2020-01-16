package quotes;

public class Quote {
    String[] tags;
    String author;
    String likes;
    String text;

    Quote(String[] tags, String author, String likes, String text){
        this.tags = tags;
        this.author = author;
        this.likes = likes;
        this.text = text;
    }
}
