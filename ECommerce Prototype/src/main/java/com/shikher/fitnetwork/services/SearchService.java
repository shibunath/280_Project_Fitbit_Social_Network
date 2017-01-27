package com.shikher.fitnetwork.services;

import com.shikher.fitnetwork.model.search.SearchResponse;
import com.shikher.fitnetwork.repositories.searchRepository.SearchResultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Pulkit on 11/29/16.
 */
@Service
public class SearchService {
    @Autowired
    SearchResultRepository searchResultRepository;

    public SearchResponse searchUserNewsFeed(Long userId, String input) {
        return searchResultRepository.searchAll(userId, input);
    }
}