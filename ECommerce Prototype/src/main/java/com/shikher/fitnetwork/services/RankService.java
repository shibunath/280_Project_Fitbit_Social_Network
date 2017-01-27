package com.shikher.fitnetwork.services;

import com.shikher.fitnetwork.model.rank.RankList;
import com.shikher.fitnetwork.repositories.rankRepository.RankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Pulkit on 11/29/16.
 */
@Service
public class RankService {
    @Autowired
    RankRepository rankRepository;
    public List<RankList> getRankList(){ return rankRepository.getRank();}
}
