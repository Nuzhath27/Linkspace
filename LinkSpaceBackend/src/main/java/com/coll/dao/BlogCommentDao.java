package com.coll.dao;

import java.util.List;


import com.coll.models.BlogComment;
import com.coll.models.BlogPost;
import com.coll.models.User;

public interface BlogCommentDao {
void addBlogComment(BlogComment blogComment);
List<BlogComment> getAllBlogComments(int blogPostId);
void updateBlogComment(BlogComment blogComment);
void deleteBlogComment(int commentId);
BlogComment getBlogCommentById(int blogCommentId);
}