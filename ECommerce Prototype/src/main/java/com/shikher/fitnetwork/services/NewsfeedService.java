package com.shikher.fitnetwork.services;

import com.shikher.fitnetwork.model.Newsfeed.NewsfeedList;
import com.shikher.fitnetwork.model.request.FriendResponse;
import com.shikher.fitnetwork.model.suggestion.Suggestlist;
import com.shikher.fitnetwork.repositories.newsfeedRepository.NewsfeedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by sid on 26-Nov-2016.
 */

@Service
public class NewsfeedService {

    @Autowired
    NewsfeedRepository newsfeedRepository;

    public NewsfeedList getNewsfeed(List<Suggestlist> friends, int pagenumber) {
        return newsfeedRepository.getNewsfeed(friends, pagenumber);
    }

    public NewsfeedList getNewsfeedByUser(List<FriendResponse> friends) {
        return newsfeedRepository.getNewsfeedByUser(friends);
    }


}
