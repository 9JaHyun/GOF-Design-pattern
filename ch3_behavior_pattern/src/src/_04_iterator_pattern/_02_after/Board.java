package src._04_iterator_pattern._02_after;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Board {

    List<Post> posts = new ArrayList<>();

    public List<Post> getPosts() {
        return posts;
    }

    public void addPost(String content) {
        this.posts.add(new Post(content));
    }

    public Iterator<Post> getIterator() {
        return posts.iterator();
    }


    public Iterator<Post> getRecentPostIterator() {
        return new RecentPostIterator(this.posts);
    }
}
