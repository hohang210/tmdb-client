package net.ow.movie.tmdb.dto.search;

import com.fasterxml.jackson.annotation.JsonAlias;
import java.util.List;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public abstract class SearchMediaDTO extends SearchResultDTO {
    @JsonAlias("backdrop_path")
    protected String backdropPath;

    protected String overview;

    @JsonAlias("poster_path")
    protected String posterPath;

    @JsonAlias("original_language")
    protected String originalLanguage;

    @JsonAlias("genre_ids")
    protected List<Integer> genreIds;

    protected Boolean video;

    @JsonAlias("vote_average")
    protected String voteAverage;

    @JsonAlias("vote_count")
    protected String voteCount;
}
