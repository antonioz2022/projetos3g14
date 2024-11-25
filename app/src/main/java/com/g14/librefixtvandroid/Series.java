package com.g14.librefixtvandroid;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Series extends Movie implements Serializable {
    private static final long serialVersionUID = 727566175075960653L;
    private List<Season> seasons = new ArrayList<>();

    public Series() {
    }

    public Series(long id, String title, String description, String bgImageUrl, String cardImageUrl, String videoUrl, String studio, String[] languages, String[] subtitles, List<Season> seasons, MovieCategory[] categories, int duration, MovieRating rating, int release_year) {
        super(id, title, description, bgImageUrl, cardImageUrl, videoUrl, studio, languages, subtitles, categories, duration, rating, release_year);
        this.seasons = (seasons == null) ? new ArrayList<>() : seasons;
    }

    public List<Season> getSeasons() {
        return new ArrayList<>(seasons);
    }

    public void addSeason(Season season) {
        seasons.add(season);
    }

    public void setSeasons(List<Season> seasons) {
        this.seasons = (seasons == null) ? new ArrayList<>() : seasons;
    }

    @Override
    public String toString() {
        return "Series{" +
                "id=" + getId() +
                ", title='" + getTitle() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", bgImageUrl='" + getBackgroundImageUrl() + '\'' +
                ", cardImageUrl='" + getCardImageUrl() + '\'' +
                ", videoUrl='" + getVideoUrl() + '\'' +
                ", studio='" + getStudio() + '\'' +
                ", languages=" + String.join(", ", getLanguages()) +
                ", subtitles=" + String.join(", ", getSubtitles()) +
                ", seasons=" + (seasons.isEmpty() ? "None" : seasons) +
                ", categories=" + getCategories() +
                ", duration=" + getDuration() + " minutes" +
                '}';
    }
}
