package com.shikher.fitnetwork.repositories.rankRepository;

/**
 * Created by Pulkit on 11/29/16.
 */
import com.shikher.fitnetwork.model.rank.RankList;
import com.shikher.fitnetwork.model.rank.RankResponse;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Pulkit on 11/27/16.
 */
@Repository
public interface RankRepository {

    public List<RankList> getRank();
}