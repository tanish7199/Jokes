package com.example.tanish.jokes;

/**
 * Created by Tanish on 13-03-2018.
 */

public class Joke {
    private int id;
    private String content;
    private String title;
    private String author;
    private int likes;
    private int dislikes;
    private String category;

    public Joke(String content, String title, String category) {   /*Constructor for 3 parameters
                                                                    * as we want three details to
                                                                    * be displayed to the user*/
        this.content = content;
        this.title = title;
        this.category = category;
    }

    public Joke(int id, String content, String title, String author, int likes, int dislikes, String category) {

        this.id = id;
        this.content = content;
        this.title = title;
        this.author = author;
        this.likes = likes;
        this.dislikes = dislikes;
        this.category = category;
    }


    /*For calling the getters and setters to store value in the variables defined above*/
    public int getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getLikes() {
        return likes;
    }

    public int getDislikes() {
        return dislikes;
    }

    public String getCategory() {
        return category;
    }

    public void setId(int id) {

        this.id = id;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public void setDislikes(int dislikes) {
        this.dislikes = dislikes;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
