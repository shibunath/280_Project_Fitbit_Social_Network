package com.shikher.fitnetwork.repositories;

import com.shikher.fitnetwork.model.Newsfeed.Like;
import org.springframework.stereotype.Repository;

/**
 * Created by sid on 26-Nov-2016.
 */


@Repository
public interface LikeRepository {

    Like setLikeStatus (int id , long userid);
    Like setUnlikeStatus (int id , long userid);

}