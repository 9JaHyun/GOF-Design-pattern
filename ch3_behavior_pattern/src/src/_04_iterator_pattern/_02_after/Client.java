package src._04_iterator_pattern._02_after;

import java.util.Collections;
import java.util.Iterator;
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

        Iterator<Post> iterator = board.getPosts().iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().getContent());
        }

        board.getIterator().forEachRemaining(post -> System.out.println(post.getContent()));

        board.getRecentPostIterator().forEachRemaining(
              post -> System.out.println(post.getContent())
        );
    }
}
