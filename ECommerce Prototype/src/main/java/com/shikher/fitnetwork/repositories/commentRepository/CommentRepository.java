package com.shikher.fitnetwork.repositories.commentRepository;

import com.shikher.fitnetwork.model.Newsfeed.BooleanResponse;
import com.shikher.fitnetwork.model.Newsfeed.Comment;
import com.shikher.fitnetwork.model.Newsfeed.CommentsList;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by sid on 26-Nov-2016.
 */

@Repository
public interface CommentRepository {

    CommentsList getComments(int userid);

    BooleanResponse setComments(int id, String text, long timestamp, Long userId);
}
