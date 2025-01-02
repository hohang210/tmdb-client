package net.ow.movie.tmdb.dto.search;

import com.fasterxml.jackson.annotation.JsonAlias;
import java.util.List;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class SearchPersonDTO extends SearchResultDTO {
    private String name;

    @JsonAlias("original_name")
    private String originalName;

    private Integer gender;

    @JsonAlias("known_for_department")
    private String knownForDepartment;

    @JsonAlias("profile_path")
    private String profilePath;

    @JsonAlias("known_for")
    private List<SearchMediaDTO> knownFor;
}
