package org.example.blog.service;

import org.example.blog.entity.Comment;

import java.util.List;

public interface CommentService {
    List<Comment> getAllComments();
    Comment getCommentById(Long id);
    Comment saveComment(Comment comment);
    Comment updateComment(Long id, Comment commentDetails);
    void deleteComment(Long id);
}
