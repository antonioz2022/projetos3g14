package com.g14.librefixtvandroid;

import java.io.Serializable;

/*
 * Classe Movie representa uma entidade de vídeo com título, descrição, imagens e URL de vídeo.
 */
public class Movie implements Serializable {
    public enum MovieCategory {
        SOCIAL("Social"),
        TECH("Tech"),
        MUSICA("Musica"),
        FICÇÃO("Ficçãp"),
        DOCS("Docs"),
        NACIONAIS("Nacionais"),
        FEMINISMO("Feminismo"),
        EDUCAÇÃO("Educação"),
        ANIMAÇÂO("Animação"),
        COMÈDIA("Comédia"),
        RELIGIÃO("Religião"),
        NATUREZA("Natureza"),
        GUERRA("Guerra");
        private  final String text;

        MovieCategory(String text) {
            this.text = text;
        }

        public String getText() {
            return text;
        }
    };

    public enum MovieRating {
        G("General Audience"),
        PG("Parental Guidance Suggested"),
        PG_13("Parents Strongly Cautioned"),
        R("Restricted"),
        NC_17("Adults Only");

        private final String description;

        MovieRating(String description) {
            this.description = description;
        }

        public String getDescription() {
            return description;
        }
    }

    static final long serialVersionUID = 727566175075960653L;
    private long id;
    private MovieCategory[] categories;
    private int release_year;
    private MovieRating rating;
    private int duration;
    private String title;
    private String description;
    private String bgImageUrl;
    private String cardImageUrl;
    private String videoUrl;
    private String studio;
    private String[] languages;
    private String[] subtitles;
    private boolean isWatched;
    private boolean isFavorite;

    public Movie() {
    }

    public Movie(long id, String title, String description, String bgImageUrl, String cardImageUrl, String videoUrl, String studio, String[] languages, String[] subtitles, MovieCategory[] categories, int duration, MovieRating rating, int release_year) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.bgImageUrl = bgImageUrl;
        this.cardImageUrl = cardImageUrl;
        this.videoUrl = videoUrl;
        this.studio = studio;
        this.languages = languages;
        this.subtitles = subtitles;
        this.categories = categories;
        this.duration = duration;
        this.rating = rating;
        this.release_year = release_year;
        this.isWatched = false;
    }

    public long getId() {
        return id;
    }

    public int getRelease_year() {
        return release_year;
    }

    public void setRelease_year(int release_year){
        this.release_year = release_year;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public MovieCategory[] getCategories() {
        return categories;
    }

    public void setCategories(MovieCategory[] categories) {
        this.categories = categories;
    }

    public MovieRating getRating() {
        return rating;
    }

    public void setRating(MovieRating rating) {
        this.rating = rating;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public String[] getSubtitles() {
        return subtitles;
    }

    public void setSubtitles(String[] subtitles) {
        this.subtitles = subtitles;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public String getBackgroundImageUrl() {
        return bgImageUrl;
    }

    public void setBackgroundImageUrl(String bgImageUrl) {
        this.bgImageUrl = bgImageUrl;
    }

    public String getCardImageUrl() {
        return cardImageUrl;
    }

    public void setCardImageUrl(String cardImageUrl) {
        this.cardImageUrl = cardImageUrl;
    }

    public boolean isWatched() {
        return isWatched;
    }

    public void setWatched(boolean watched) {
        this.isWatched = watched;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public void setFavorite(boolean favorite) {
        this.isFavorite = favorite;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", videoUrl='" + videoUrl + '\'' +
                ", backgroundImageUrl='" + bgImageUrl + '\'' +
                ", cardImageUrl='" + cardImageUrl + '\'' +
                ", languages=" + String.join(", ", languages) +
                ", subtitles=" + String.join(", ", subtitles) +
                ", categories=" + getCategories() +
                ", duration=" + getDuration() + " minutes" +
                ", rating=" + (rating != null ? rating + " (" + rating.getDescription() + ")" : "Not Rated") +
                ", release_year=" + getRelease_year() +
                ", isWatched=" + isWatched +
                ", isFavorite=" + isFavorite +
                '}';
    }
}
