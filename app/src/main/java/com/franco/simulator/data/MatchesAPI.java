package com.franco.simulator.data;

import com.franco.simulator.domain.Match;
import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;

public interface MatchesAPI {
    @GET("matches.json")
    Call<List<Match>> getMatches();
}
