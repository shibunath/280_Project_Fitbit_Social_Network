package com.shikher.fitnetwork.services;

import com.shikher.fitnetwork.model.Newsfeed.Like;
import com.shikher.fitnetwork.repositories.LikeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by sid on 24-Nov-2016.
 */

@Service
public class LikeService {


    @Autowired
    LikeRepository likeRepository;

    public Like setLikeStatus(int id , long userid){

        return likeRepository.setLikeStatus(id,userid);
    }

    public Like setUnlikeStatus(int id , long userid){

        return likeRepository.setUnlikeStatus(id,userid);
    }

}
