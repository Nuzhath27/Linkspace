package com.coll.dao;

import com.coll.models.BlogPost;
import com.coll.models.BlogPostLikes;

public interface BlogPostLikesDao {
BlogPostLikes hasUserLikedBlogPost(int blogPostId,String email);//email is loggedin user's email id

BlogPost updateLikes(int blogPostId, String email);
}
