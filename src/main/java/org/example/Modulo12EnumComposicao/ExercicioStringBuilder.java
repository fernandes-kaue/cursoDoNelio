package org.example.Modulo12EnumComposicao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ExercicioStringBuilder {
    public static void main(String[] args) {

    }

    class Post {
        private Date moment;
        private String title;
        private String content;
        private Integer likes;
    }

    class Comment {
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
