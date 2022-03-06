package src._04_iterator_pattern._01_before;

import java.util.Collections;
import java.util.List;

/* Iterator
    - 내부 표현부를 노출하지 않고 어떤 집합객체에 속한 원소들을 순차적으로 접근할 수 있는 방법.
 */
public class Client {

    public static void main(String[] args) {
        Board board = new Board();
        board.addPost("포스트1");
        board.addPost("포스트2");
        board.addPost("포스트3");

        List<Post> posts = board.getPosts();
        for (int i = 0; i < posts.size(); i++) {
            Post post = posts.get(i);
            System.out.println(post.getContent());
        }

        Collections.sort(posts,
              (p1, p2) -> p2.getCreatedDateTime().compareTo(p1.getCreatedDateTime()));
        for (int i = 0; i < posts.size(); i++) {
            Post post = posts.get(i);
            System.out.println(post.getContent());
        }
    }
}
