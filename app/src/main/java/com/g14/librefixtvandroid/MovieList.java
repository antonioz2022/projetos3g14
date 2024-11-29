package com.g14.librefixtvandroid;import java.util.ArrayList;
import java.util.List;public final class MovieList {
    public static final String MOVIE_CATEGORY[] = {
            Movie.MovieCategory.SOCIAL.getText(),
            Movie.MovieCategory.TECH.getText(),
            Movie.MovieCategory.MUSICA.getText(),
            Movie.MovieCategory.SCI_FI.getText(),
            Movie.MovieCategory.ATIVISMO.getText(),
            Movie.MovieCategory.VEGANISMO.getText(),
            Movie.MovieCategory.FEMINISMO.getText(),
            Movie.MovieCategory.EDUCAÇÃO.getText(),
            Movie.MovieCategory.ANIMAÇÂO.getText(),
            Movie.MovieCategory.COMÈDIA.getText(),
            Movie.MovieCategory.RELIGIÃO.getText(),
            Movie.MovieCategory.NATUREZA.getText(),
            Movie.MovieCategory.OCUPAÇÂO.getText()
    };private static List<Movie> list;
    private static long count = 0;

    public static List<Movie> getList() {
        if (list == null) {
            list = setupMovies();
        }
        return list;
    }

    public static List<Movie> setupMovies() {
        list = new ArrayList<>();
        String title[] = {
                "Zeitgeist 2010_ Year in Review",
                "Google Demo Slam_ 20ft Search",
                "Introducing Gmail Blue",
                "Introducing Google Fiber to the Pole",
                "Introducing Google Nose"
        };

        String description = "Fusce id nisi turpis. Praesent viverra bibendum semper. "
                + "Donec tristique, orci sed semper lacinia, quam erat rhoncus massa, non congue tellus est "
                + "quis tellus. Sed mollis orci venenatis quam scelerisque accumsan. Curabitur a massa sit "
                + "amet mi accumsan mollis sed et magna. Vivamus sed aliquam risus. Nulla eget dolor in elit "
                + "facilisis mattis. Ut aliquet luctus lacus. Phasellus nec commodo erat. Praesent tempus id "
                + "lectus ac scelerisque. Maecenas pretium cursus lectus id volutpat.";
        String studio[] = {
                "Studio Zero", "Studio One", "Studio Two", "Studio Three", "Studio Four"
        };
        String videoUrl[] = {
                "https://commondatastorage.googleapis.com/android-tv/Sample%20videos/Zeitgeist/Zeitgeist%202010_%20Year%20in%20Review.mp4",
                "https://commondatastorage.googleapis.com/android-tv/Sample%20videos/Demo%20Slam/Google%20Demo%20Slam_%2020ft%20Search.mp4",
                "https://commondatastorage.googleapis.com/android-tv/Sample%20videos/April%20Fool's%202013/Introducing%20Gmail%20Blue.mp4",
                "https://commondatastorage.googleapis.com/android-tv/Sample%20videos/April%20Fool's%202013/Introducing%20Google%20Fiber%20to%20the%20Pole.mp4",
                "https://commondatastorage.googleapis.com/android-tv/Sample%20videos/April%20Fool's%202013/Introducing%20Google%20Nose.mp4"
        };
        String bgImageUrl[] = {
                "https://commondatastorage.googleapis.com/android-tv/Sample%20videos/Zeitgeist/Zeitgeist%202010_%20Year%20in%20Review/bg.jpg",
                "https://commondatastorage.googleapis.com/android-tv/Sample%20videos/Demo%20Slam/Google%20Demo%20Slam_%2020ft%20Search/bg.jpg",
                "https://commondatastorage.googleapis.com/android-tv/Sample%20videos/April%20Fool's%202013/Introducing%20Gmail%20Blue/bg.jpg",
                "https://commondatastorage.googleapis.com/android-tv/Sample%20videos/April%20Fool's%202013/Introducing%20Google%20Fiber%20to%20the%20Pole/bg.jpg",
                "https://commondatastorage.googleapis.com/android-tv/Sample%20videos/April%20Fool's%202013/Introducing%20Google%20Nose/bg.jpg",
        };
        String cardImageUrl[] = {
                "https://commondatastorage.googleapis.com/android-tv/Sample%20videos/Zeitgeist/Zeitgeist%202010_%20Year%20in%20Review/card.jpg",
                "https://commondatastorage.googleapis.com/android-tv/Sample%20videos/Demo%20Slam/Google%20Demo%20Slam_%2020ft%20Search/card.jpg",
                "https://commondatastorage.googleapis.com/android-tv/Sample%20videos/April%20Fool's%202013/Introducing%20Gmail%20Blue/card.jpg",
                "https://commondatastorage.googleapis.com/android-tv/Sample%20videos/April%20Fool's%202013/Introducing%20Google%20Fiber%20to%20the%20Pole/card.jpg",
                "https://commondatastorage.googleapis.com/android-tv/Sample%20videos/April%20Fool's%202013/Introducing%20Google%20Nose/card.jpg"
        };

        String subtitles[][] = { {"english", "portuguese"}, {"english", "portuguese"},
                {"english", "portuguese"}, {"english", "portuguese"}, {"english", "portuguese"}

        };

        String languages[][] = { {"english", "portuguese"}, {"english", "portuguese"},
                {"english", "portuguese"}, {"english", "portuguese"}, {"english", "portuguese"}

        };

        Movie.MovieCategory categories[][] = {
                {Movie.MovieCategory.SOCIAL},
                {Movie.MovieCategory.SOCIAL},
                {Movie.MovieCategory.SOCIAL},
                {Movie.MovieCategory.SOCIAL},
                {Movie.MovieCategory.SOCIAL}
        };
        int duration[] = {
                120, 120, 120, 120, 120
        };

        Movie.MovieRating rating[] = {
                Movie.MovieRating.PG,
                Movie.MovieRating.PG,
                Movie.MovieRating.PG,
                Movie.MovieRating.PG,
                Movie.MovieRating.PG
        };
        int release_year[] = {
                2017, 2018, 2019, 2020, 2021
        };

        for (int index = 0; index < title.length; ++index) {
            list.add(
                    buildMovieInfo(
                            title[index],
                            description,
                            studio[index],
                            videoUrl[index],
                            cardImageUrl[index],
                            bgImageUrl[index],
                            languages[index],
                            subtitles[index],
                            categories[index],
                            duration[index],
                            rating[index],
                            release_year[index]));
        }

        // Adding a Series
        List<Season> seasons = new ArrayList<>();
        List<Episode> episodes = new ArrayList<>();
        Episode ep1 = new Episode("The crash", 44, "The plane crashes into the sea", "https://commondatastorage.googleapis.com/android-tv/Sample%20videos/Zeitgeist/Zeitgeist%202010_%20Year%20in%20Review.mp4");
        Episode ep2 = new Episode("The crash 2", 44, "Can they survive the crash ?", "https://commondatastorage.googleapis.com/android-tv/Sample%20videos/Zeitgeist/Zeitgeist%202010_%20Year%20in%20Review.mp4");
        episodes.add(ep1);
        episodes.add(ep2);
        seasons.add(new Season(1, episodes));
        Series series = new Series(
                count++,
                "My Awesome Series",
                "An exciting series full of twists and turns.",
                "https://commondatastorage.googleapis.com/android-tv/Sample%20videos/Zeitgeist/Zeitgeist%202010_%20Year%20in%20Review/bg.jpg",
                "https://i.pinimg.com/originals/cf/e1/31/cfe13104988d43169ce6a5b0040ad8be.jpg",
                "https://commondatastorage.googleapis.com/android-tv/Sample%20videos/Zeitgeist/Zeitgeist%202010_%20Year%20in%20Review.mp4",
                "Studio Series",
                new String[]{"english", "spanish"},
                new String[]{"english", "spanish"},
                seasons,
                new Movie.MovieCategory[]{Movie.MovieCategory.COMÈDIA},
                0, // Duration isn't typically applicable to Series
                Movie.MovieRating.PG,
                2022
        );
        list.add(series);

        return list;
    }

    private static Movie buildMovieInfo(
            String title,
            String description,
            String studio,
            String videoUrl,
            String cardImageUrl,
            String backgroundImageUrl,
            String[] languages,
            String[] subtitles,
            Movie.MovieCategory[] categories,
            int duration,
            Movie.MovieRating rating,
            int release_year) {
        Movie movie = new Movie();
        movie.setId(count++);
        movie.setTitle(title);
        movie.setDescription(description);
        movie.setStudio(studio);
        movie.setCardImageUrl(cardImageUrl);
        movie.setBackgroundImageUrl(backgroundImageUrl);
        movie.setVideoUrl(videoUrl);
        movie.setLanguages(languages);
        movie.setSubtitles(subtitles);
        movie.setCategories(categories);
        movie.setDuration(duration);
        movie.setRating(rating);
        movie.setRelease_year(release_year);
        return movie;
    }
}