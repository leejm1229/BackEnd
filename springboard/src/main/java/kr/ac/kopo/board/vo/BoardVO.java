package kr.ac.kopo.board.vo;

import javax.validation.constraints.NotEmpty;

public class BoardVO {
    private int no;
    
    @NotEmpty
    private String title;
    
    @NotEmpty
    private String writer;
    
    @NotEmpty
    private String content;
    private String regDate;
    private int count;
    
    public int getNo() {
        return no;
    }
    public void setNo(int no) {
        this.no = no;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getWriter() {
        return writer;
    }
    public void setWriter(String writer) {
        this.writer = writer;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public String getRegDate() {
        return regDate;
    }
    public void setRegDate(String regDate) {
        this.regDate = regDate;
    }
    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }
    @Override
    public String toString() {
        return "BoardVO [no=" + no + ", title=" + title + ", writer=" + writer + ", content="
                + content + ", regDate=" + regDate + ", count=" + count + "]";
    }
    
    
}

