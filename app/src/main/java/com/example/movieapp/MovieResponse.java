package com.example.movieapp;

import java.util.List;

public class MovieResponse {
    private List<Movie> results;

    public List<Movie> getResults() {
        return results;
    }

    public void setResults(List<Movie> results) {
        this.results = results;
    }

    public static class Movie {
        private String title;
        private String overview;
        private String poster_path; // Consider naming conventions and annotations if needed

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getOverview() {
            return overview;
        }

        public void setOverview(String overview) {
            this.overview = overview;
        }

        public String getPosterPath() {
            return poster_path;
        }

        public void setPosterPath(String poster_path) {
            this.poster_path = poster_path;
        }
    }
}
