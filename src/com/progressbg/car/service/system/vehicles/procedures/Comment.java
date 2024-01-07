package com.progressbg.car.service.system.vehicles.procedures;

import com.progressbg.car.service.system.users.User;

import java.util.Date;

public class Comment
{
    private Date dateOfPlacingTheComment;
    private String commentText;
    private User author;

    public Comment(Date dateOfPlacingTheComment, String commentText, User author) {
        this.dateOfPlacingTheComment = dateOfPlacingTheComment;
        this.commentText = commentText;
        this.author = author;
    }

    public Date getDateOfPlacingTheComment() {
        return dateOfPlacingTheComment;
    }

    public String getCommentText() {
        return commentText;
    }

    public void setCommentText(String commentText) {
        this.commentText = commentText;
    }

    public User getAuthor() {
        return author;
    }
}
