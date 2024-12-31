package net.ow.movie.tmdb.dto.common;

import com.fasterxml.jackson.annotation.JsonAlias;
import java.util.List;
import lombok.Data;

@Data
public class PagedResultDTO<T> {
    private Integer page;

    private List<T> results;

    @JsonAlias("total_pages")
    private Integer totalPages;

    @JsonAlias("total_results")
    private Integer totalResults;
}
