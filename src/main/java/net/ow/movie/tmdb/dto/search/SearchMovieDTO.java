package net.ow.movie.tmdb.dto.search;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class SearchMovieDTO extends SearchMediaDTO {
    private String title;

    @JsonAlias("original_title")
    private String originalTitle;

    @JsonAlias("release_date")
    private String releaseDate;
}
