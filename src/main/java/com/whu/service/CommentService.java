package com.whu.service;

import com.whu.po.Comment;

import java.util.List;

/**
 * Created by yuqi Li.
 */
public interface CommentService {

    List<Comment> listCommentByBlogId(Long blogId);

    Comment saveComment(Comment comment);
}
