package com.g14.librefixtvandroid;

import java.util.List;

public class Series extends Movie {
    private List<Season> seasons;

    public Series() {
    }

    public Series(long id, String title, String description, String bgImageUrl, String cardImageUrl, String videoUrl, String studio, String[] languages, String[] subtitles, List<Season> seasons) {
        super(id, title, description, bgImageUrl, cardImageUrl, videoUrl, studio, languages, subtitles);
        this.seasons = seasons;
    }

    public List<Season> getSeasons() {
        return seasons;
    }

    public void setSeasons(List<Season> seasons) {
        this.seasons = seasons;
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
                ", seasons=" + getSeasons() +
                '}';
    }
}

