package net.ow.movie.tmdb.dto.search;

import com.fasterxml.jackson.annotation.JsonAlias;
import java.util.List;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class SearchTVShowDTO extends SearchMediaDTO {
    private String name;

    @JsonAlias("original_name")
    private String originalName;

    @JsonAlias("first_air_date")
    private String firstAirDate;

    @JsonAlias("origin_country")
    private List<String> originCountry;
}
