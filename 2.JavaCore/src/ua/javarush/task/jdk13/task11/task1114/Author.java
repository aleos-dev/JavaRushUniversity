package ua.javarush.task.jdk13.task11.task1114;

public class Author {
    private final String name;
    private Article article;

    public Author(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public Article getArticle() {
        return article;
    }
}
