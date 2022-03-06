package src._04_iterator_pattern._01_before;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Board {

    List<Post> posts = new ArrayList<>();

    public List<Post> getPosts() {
        return posts;
    }

    public void addPost(String content) {
        this.posts.add(new Post(content));
    }
}
