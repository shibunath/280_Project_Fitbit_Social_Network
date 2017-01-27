package com.shikher.fitnetwork.repositories.newsfeedRepository;


import com.shikher.fitnetwork.model.Newsfeed.NewsfeedList;
import com.shikher.fitnetwork.model.request.FriendResponse;
import com.shikher.fitnetwork.model.suggestion.Suggestlist;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by sid on 26-Nov-2016.
 */

@Repository
public interface NewsfeedRepository {

    NewsfeedList getNewsfeed(List<Suggestlist> friends, int pagenumber);

    NewsfeedList getNewsfeedByUser(List<FriendResponse> friends);

}
