package net.ow.move.tmdb.constant;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import net.ow.movie.tmdb.dto.constant.MediaType;
import org.apache.logging.log4j.util.Strings;
import org.junit.jupiter.api.Test;

class MediaTypeTest {
    @Test
    void isMovieTest_OK() {
        assertTrue(MediaType.isMovie("movie"));
    }

    @Test
    void isMovieTest_whenUpperCase_OK() {
        assertTrue(MediaType.isMovie("MOVIE"));
    }

    @Test
    void isMovieTest_whenNull_thenReturnFalse() {
        assertFalse(MediaType.isMovie(null));
    }

    @Test
    void isMovieTest_whenEmptyString_thenReturnFalse() {
        assertFalse(MediaType.isMovie(Strings.EMPTY));
    }

    @Test
    void isMovieTest_whenRandomString_thenReturnFalse() {
        assertFalse(MediaType.isMovie("asdf"));
    }

    @Test
    void isTVShowTest_OK() {
        assertTrue(MediaType.isTVShow("tv"));
    }

    @Test
    void isTVShowTest_whenUpperCase_OK() {
        assertTrue(MediaType.isTVShow("TV"));
    }

    @Test
    void isTVShowTest_whenNull_thenReturnFalse() {
        assertFalse(MediaType.isTVShow(null));
    }

    @Test
    void isTVShowTest_whenEmptyString_thenReturnFalse() {
        assertFalse(MediaType.isTVShow(Strings.EMPTY));
    }

    @Test
    void isTVShowTest_whenRandomString_thenReturnFalse() {
        assertFalse(MediaType.isTVShow("asdf"));
    }

    @Test
    void isPersonTest_OK() {
        assertTrue(MediaType.isPerson("person"));
    }

    @Test
    void isPersonTest_whenUpperCase_OK() {
        assertTrue(MediaType.isPerson("PERSON"));
    }

    @Test
    void isPersonTest_whenNull_thenReturnFalse() {
        assertFalse(MediaType.isPerson(null));
    }

    @Test
    void isPersonTest_whenEmptyString_thenReturnFalse() {
        assertFalse(MediaType.isPerson(Strings.EMPTY));
    }

    @Test
    void isPersonTest_whenRandomString_thenReturnFalse() {
        assertFalse(MediaType.isPerson("asdf"));
    }
}
