package CNU_CD.projbe.v0.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Getter
@Table(name="cuts") //jakarta 랑 hibernate 중에 뭐써야하는지..
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class CutEntity {

    @Id
    @Column(name="cut_no")
    private int cutNo;

    @JoinColumn(name="user_no")
    @Column(name="user_no")
    private int userNo;

    @JoinColumn(name="post_no")
    @Column(name="post_no")
    private int postNo;

    @Column(name="img_addr")
    private byte[] imgAddr;

    @Column(name= "vote_num")
    private int voteNum;

    @Column(name="created_time")
    private Timestamp createdTime;

    @Column(name="cut_prompt")
    private String cutPrompt;


    //Alt+insert 생성자 바로만들기
    @Builder
    public CutEntity(int userNo, int postNo, byte[] imgAddr, int voteNum, Timestamp createdTime, String cutPrompt) {
        this.userNo = userNo;
        this.postNo = postNo;
        this.imgAddr = imgAddr;
        this.voteNum = voteNum;
        this.createdTime = createdTime;
        this.cutPrompt = cutPrompt;
    }





}
