package com.shikher.fitnetwork.repositories.suggestionRepository;

import com.shikher.fitnetwork.model.suggestion.FriendSuggestion;
import org.springframework.stereotype.Repository;

/**
 * Created by Pulkit on 11/30/16.
 */
@Repository
public interface SuggestionResponseRepository {
    FriendSuggestion getFriendSug(long userid);
}
