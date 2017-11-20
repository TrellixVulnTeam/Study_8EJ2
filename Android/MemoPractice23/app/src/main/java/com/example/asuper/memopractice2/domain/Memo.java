package com.example.asuper.memopractice2.domain;

/**
 * Created by super on 2017-11-14.
 */

public class Memo {

    private static final String DELIMETER = "//";

    private int no;
    private String title;
    private String author;
    private String content;
    private long datetime;

    public Memo(){

    }

    public Memo(String text){
        parse(text);
    }

    public void parse(String text){
        String lines[] = text.split("\n");
        for(String line : lines){
            String columns[] = line.split(DELIMETER);
            String key = "";
            String value = "";
            if(columns.length == 2) {
                key = columns[0];
                value = columns[1];
            }else{
                key = "";
                value = columns[0];
            }
            switch(key){
                case "no":
                    setNo(Integer.parseInt(value));
                    break;
                case "title":
                    setTitle(value);
                    break;
                case "author":
                    setAuthor(value);
                    break;
                case "datetime":
                    setDatetime(Long.parseLong(value));
                    break;
                case "content":
                    setContent(value);
                    break;
                default:
                    appendContent(value);
            }
        }
    }

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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public long getDatetime() {
        return datetime;
    }

    public void setDatetime(long datetime) {
        this.datetime = datetime;
    }

    public void appendContent(String value) {
        this.content += "\n" + value;
    }

    public String toString(){
        StringBuilder result = new StringBuilder();
        result.append("no").append(DELIMETER).append(no).append("\n");
        result.append("title").append(DELIMETER).append(title).append("\n");
        result.append("author").append(DELIMETER).append(author).append("\n");
        result.append("datetime").append(DELIMETER).append(datetime).append("\n");
        result.append("content").append(DELIMETER).append(content).append("\n");
        return result.toString();
    }

    public byte[] toBytes(){
        return toString().getBytes(); // 문자열에서 바이트배열로 변환
    }
}