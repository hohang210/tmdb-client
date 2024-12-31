package net.ow.movie.tmdb.dto.search;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.Data;

@Data
public class SearchResultDTO {
    private Integer id;

    private String title;

    private String overview;

    @JsonAlias("poster_path")
    private String posterPath;

    @JsonAlias("release_date")
    private String releaseDate;
}
