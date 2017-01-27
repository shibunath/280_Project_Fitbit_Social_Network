package com.shikher.fitnetwork.services;

import com.shikher.fitnetwork.model.Newsfeed.BooleanResponse;
import com.shikher.fitnetwork.model.Newsfeed.Comment;
import com.shikher.fitnetwork.model.Newsfeed.CommentsList;
import com.shikher.fitnetwork.repositories.commentRepository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by sid on 26-Nov-2016.
 */

@Service
public class CommentService {

    @Autowired
    CommentRepository commentRepository;

    public CommentsList getComments(int id){
        return commentRepository.getComments(id);
    }

    public BooleanResponse setComments(int id, String text , long timestamp,Long userId){
        return commentRepository.setComments(id , text , timestamp, userId);
    }

}
