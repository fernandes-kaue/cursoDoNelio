package org.example.Modulo12EnumComposicao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Exemplo de uso de StringBuilder para montar saídas textuais de uma entidade Post com comentários.
 *
 * @author Kaue
 * @since 2025-08-23
 * @version 1.0
 */
public class ExercicioStringBuilder {
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    public static void main(String[] args) throws ParseException {


        Comment c1 = new Comment("Have a nice trip!");
        Comment c2 = new Comment("Wow, thats awesome!");
        Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"), "Traveling to New Zealand", "I'm going to visit this wonderful country!", 12);
        p1.addComment(c1);
        p1.addComment(c2);

        System.out.println(p1);
    }

    static class Post {
        private Date moment;
        private String title;
        private String content;
        private Integer likes;
        private List<Comment> comments = new ArrayList<>();

        public Post(Date moment, String title, String content, Integer likes) {
            this.moment = moment;
            this.title = title;
            this.content = content;
            this.likes = likes;
        }

        public Date getMoment() {
            return moment;
        }

        public void setMoment(Date moment) {
            this.moment = moment;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public Integer getLikes() {
            return likes;
        }

        public void setLikes(Integer likes) {
            this.likes = likes;
        }

        public void addComment(Comment comment) {
            this.comments.add(comment);
        }

        public void removeComment(Comment comment) {
            this.comments.remove(comment);
        }

        // AGORA usamos a StringBuilder
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(title + "\n");
            sb.append(likes);
            sb.append(" Likes - ");
            sb.append(sdf.format(moment) + "\n");
            sb.append(content + "\n");
            sb.append("Comments:\n");
            for (Comment comment : comments) {
                sb.append(comment.getText() + "\n");
            }
            return sb.toString();
        }
    }

    static class Comment {
        private String text;

        public Comment(String text) {
            this.text = text;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }
    }

}
