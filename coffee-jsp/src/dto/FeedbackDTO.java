package dto;

import java.io.Serializable;

public class FeedbackDTO implements Serializable,Comparable<String> {

    private String name;
    private String email;
    private String comment;
    private String star;


    public  FeedbackDTO(){
        System.out.println("The feedback dto created");
    }
    public FeedbackDTO(String name,String email, String comment,String star){
        this.name=name;
        this.email=email;
        this.comment=comment;
        this.star=star;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getComment() {
        return comment;
    }

    public String getStar() {
        return star;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setStar(String star) {
        this.star = star;
    }

    @Override
    public int compareTo(String o) {
        return this.name.compareTo(o);
    }

    @Override
    public String toString() {
        return "FeedbackDTO{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", comment='" + comment + '\'' +
                ", star='" + star + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
