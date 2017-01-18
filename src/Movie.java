
/**
 * Created by mel on 1/17/17.
 */
public class Movie {
    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    private String title;
    private String category;

    public Movie (String title, String category) {
        this.title = title;
        this.category = category;
    }
}
