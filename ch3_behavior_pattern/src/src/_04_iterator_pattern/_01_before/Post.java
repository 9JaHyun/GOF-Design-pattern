package src._04_iterator_pattern._01_before;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Post {
    private String content;
    private LocalDateTime createdDateTime;

    public Post(String content) {
        this.content = content;
        this.createdDateTime = LocalDateTime.now();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getCreatedDateTime() {
        return createdDateTime;
    }

    public void setCreatedDateTime(LocalDateTime createdDateTime) {
        this.createdDateTime = createdDateTime;
    }
}
