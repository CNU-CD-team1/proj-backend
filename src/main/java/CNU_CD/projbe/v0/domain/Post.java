package CNU_CD.projbe.v0.domain;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
@Getter
@Setter
@Table(name = "posts")
@Entity
@NoArgsConstructor
public class Post {
    @Id
    @Column(name = "post_no")
    private int postNo;

    @Column(name = "user_no")
    private int userNo;

    @Column(name = "post_name")
    private String postName;

    @Column(name = "post_expl")
    private String postExpl;

    @Column(name = "like_num")
    private int likeNum;

    @Column(name = "is_done")
    private boolean isDone;

    @Column(name = "done_time")
    private LocalDateTime doneTime;

    public Post(int postNo, int userNo, String postName, String postExpl, int likeNum, boolean isDone, LocalDateTime doneTime) {
        this.postNo = postNo;
        this.userNo = userNo;
        this.postName = postName;
        this.postExpl = postExpl;
        this.likeNum = likeNum;
        this.isDone = isDone;
        this.doneTime = doneTime;
    }
}
