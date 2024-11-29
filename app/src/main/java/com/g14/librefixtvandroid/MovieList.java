package com.g14.librefixtvandroid;

import java.util.ArrayList;
import java.util.List;

public final class MovieList {
    public static final String MOVIE_CATEGORY[] = {
            Movie.MovieCategory.SOCIAL.getText(),
            Movie.MovieCategory.TECH.getText(),
            Movie.MovieCategory.MUSICA.getText(),
            Movie.MovieCategory.FICÇÃO.getText(),
            Movie.MovieCategory.DOCS.getText(),
            Movie.MovieCategory.NACIONAIS.getText(),
            Movie.MovieCategory.FEMINISMO.getText(),
            Movie.MovieCategory.EDUCAÇÃO.getText(),
            Movie.MovieCategory.ANIMAÇÂO.getText(),
            Movie.MovieCategory.COMÈDIA.getText(),
            Movie.MovieCategory.RELIGIÃO.getText(),
            Movie.MovieCategory.NATUREZA.getText(),
            Movie.MovieCategory.GUERRA.getText()
    };

    private static List<Movie> list;
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
                "A Educação Proibida",
                "Comandante Arian",
                "Casa 12",
                "LAMA: O Crime Vale no Brasil",
                "Gaza",
                "Baderna",
                "XPLOIT",
                "Primavera Secundarista",
                "Casa 05: O Sol que nos habita"
        };

        String description = "Documentário que se propõe a questionar as lógicas da escolarização moderna e a forma de entender a educação, mostrando diferentes experiências educativas, não convencionais, que propõem a necessidade de um novo modelo educativo."
                + "Na linha de frente da guerra na Síria, uma comandante de 30 anos leva seu batalhão feminino a retomar uma cidade controlada pelo ISIS e emerge gravemente ferida, forçando-a a se redefinir nesse conto de libertação e liberdade."
                + "Após o diagnóstico de um tumor na cabeça, uma mulher se isola em seu ateliê a fim de refletir sobre os mistérios da vida e da morte enquanto fala sozinha com a sua própria alma."
                + "Vozes amplificadas dos atingidos e atingidas direta e indiretamente a partir do rompimento da barragem da Vale em Brumadinho em Minas Gerais no início de 2019."
                + "Investigação da Al Jazeera revela crimes de guerra de Israel na Faixa de Gaza, expostos por soldados e apoiados pela vigilância ocidental."
                + "Baderna é uma cidade no interior do Brasil. Fundada em 1871, formou-se a partir da cultura dos negros escravizados e se emancipou do Estado. Entre conflitos mundanos, uma relação intensa com a natureza e resistência popular, o povo badernista vive os dias de hoje em meio a diversos movimentos."
                + "A série introduz o espectador nas disputas políticas e econômicas que trazemconsequências diretas em nossos direitos essenciais dentro e fora do mundo digital."
                + "O documentário Primavera Secundarista apresenta o movimento de ocupação de escolas e universidades ocorrido em 2016 em cerca de 1100 escolas no Brasil, das quais 850 no Estado do Paraná, como resistência dos estudantes contra a Medida Provisória 746 de Reforma do Ensino Médio e outras."
                + "Um documentário sobre arte, na voz de artistas consagrados que contam detalhes de suas histórias de vida e sobre ser artista, vivendo de arte no Brasil.";
        String studio[] = {
                "German Doin", "Alba Sotorra", "Ekatala Keller", "Carlos Pronzato", "Al Jazeera", " ", "Internet Sob Ataque ", "O Filme", "Um olhar sobre a arte e a vida de artista ",
        };
        String videoUrl[] = {
                "https://commondatastorage.googleapis.com/android-tv/Sample%20videos/Zeitgeist/Zeitgeist%202010_%20Year%20in%20Review.mp4",
                "https://commondatastorage.googleapis.com/android-tv/Sample%20videos/Demo%20Slam/Google%20Demo%20Slam_%2020ft%20Search.mp4",
                "https://commondatastorage.googleapis.com/android-tv/Sample%20videos/April%20Fool's%202013/Introducing%20Gmail%20Blue.mp4",
                "https://commondatastorage.googleapis.com/android-tv/Sample%20videos/April%20Fool's%202013/Introducing%20Google%20Fiber%20to%20the%20Pole.mp4",
                "https://commondatastorage.googleapis.com/android-tv/Sample%20videos/April%20Fool's%202013/Introducing%20Google%20Nose.mp4"
        };
        String bgImageUrl[] = {
                "https://vdn.libreflix.org/covers/media/81f8fab0-a190-11e7-b002-23d76a2b08f9educacao_proibida_tb.jpg?resize=480,270&crop=entropy",
                "https://vdn.libreflix.org/covers/media/1483abd0-8831-11ea-9e06-3945481c20bdcomandante-arian.jpg?resize=480,270&crop=entropy",
                "https://vdn.libreflix.org/covers/media/54d6db80-b58c-11ee-9d83-2d2c00f5b41cphoto_5168350906142534329_y.jpg?resize=480,270&crop=entropy",
                "https://vdn.libreflix.org/covers/media/aa007b10-ae6c-11e9-bbfe-25ffae2ef466Untitled.jpg?resize=480,270&crop=entropy",
                "https://vdn.libreflix.org/covers/media/65ddd370-8b47-11ef-af97-535c5f84f3aa-libreflix.jpg?resize=480,270&crop=entropy",
                "https://vdn.libreflix.org/covers/media/c7199300-d723-11e9-a993-6f7c7a69b937baderna_capa.jpg?resize=480,270&crop=entropy",
                "https://vdn.libreflix.org/covers/media/2eaf3030-cfdb-11e7-bfa5-fb9becee4e3fXPLOIT.png?resize=480,270&crop=entropy",
                "https://vdn.libreflix.org/covers/media/fd923fa0-82d3-11e7-928d-f178174756d1primavera.jpg?resize=480,270&crop=entropy",
                "https://vdn.libreflix.org/covers/media/d56f76f0-040d-11eb-8377-4b301fe411b01aa0dc2a-2f76-438b-9576-320361d77129.jpg?resize=480,270&crop=entropy"
        };
        String cardImageUrl[] = {
                "https://vdn.libreflix.org/covers/media/81f8fab0-a190-11e7-b002-23d76a2b08f9educacao_proibida_tb.jpg?resize=480,270&crop=entropy",
                "https://vdn.libreflix.org/covers/media/1483abd0-8831-11ea-9e06-3945481c20bdcomandante-arian.jpg?resize=480,270&crop=entropy",
                "https://vdn.libreflix.org/covers/media/54d6db80-b58c-11ee-9d83-2d2c00f5b41cphoto_5168350906142534329_y.jpg?resize=480,270&crop=entropy",
                "https://vdn.libreflix.org/covers/media/aa007b10-ae6c-11e9-bbfe-25ffae2ef466Untitled.jpg?resize=480,270&crop=entropy",
                "https://vdn.libreflix.org/covers/media/65ddd370-8b47-11ef-af97-535c5f84f3aa-libreflix.jpg?resize=480,270&crop=entropy",
                "https://vdn.libreflix.org/covers/media/c7199300-d723-11e9-a993-6f7c7a69b937baderna_capa.jpg?resize=480,270&crop=entropy",
                "https://vdn.libreflix.org/covers/media/2eaf3030-cfdb-11e7-bfa5-fb9becee4e3fXPLOIT.png?resize=480,270&crop=entropy",
                "https://vdn.libreflix.org/covers/media/fd923fa0-82d3-11e7-928d-f178174756d1primavera.jpg?resize=480,270&crop=entropy",
                "https://vdn.libreflix.org/covers/media/d56f76f0-040d-11eb-8377-4b301fe411b01aa0dc2a-2f76-438b-9576-320361d77129.jpg?resize=480,270&crop=entropy"
        };

        String subtitles[][] = { {"english", "portuguese"}, {"english", "portuguese"},
                {"english", "portuguese"}, {"english", "portuguese"}, {"english", "portuguese"}
        };

        String languages[][] = { {"english", "portuguese"}, {"english", "portuguese"},
                {"english", "portuguese"}, {"english", "portuguese"}, {"english", "portuguese"}
        };

        Movie.MovieCategory categories[][] = {
                {Movie.MovieCategory.DOCS.SOCIAL.EDUCAÇÃO},
                {Movie.MovieCategory.DOCS.GUERRA},
                {Movie.MovieCategory.FICÇÃO},
                {Movie.MovieCategory.DOCS.NACIONAIS},
                {Movie.MovieCategory.DOCS.GUERRA},
                {Movie.MovieCategory.SOCIAL},
                {Movie.MovieCategory.TECH},
                {Movie.MovieCategory.DOCS},
                {Movie.MovieCategory.MUSICA},
        };
        int duration[] = {
                143, 85, 15, 80, 81, 90, 23, 66
        };

        Movie.MovieRating rating[] = {
                Movie.MovieRating.PG,
                Movie.MovieRating.PG,
                Movie.MovieRating.PG,
                Movie.MovieRating.PG,
                Movie.MovieRating.PG
        };
        int release_year[] = {
                2012, 2018, 2022, 2019, 2024, 2018, 2017, 2016, 2020
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
                "Viral",
                "Em “Viral”, o coletivo Porta dos Fundos faz rir ao falar sério sobre a AIDS. Gregório Duvivier vive o personagem principal, que descobre ser portador do vírus HIV e decide, ao lado de um amigo – interpretado por Fábio Porchat –, procurar as últimas oito mulheres com quem fez sexo.",
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
                2014
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

    // Implementação dos métodos para obter filmes assistidos e favoritos
    public static List<Movie> getWatchedMovies() {
        List<Movie> watchedMovies = new ArrayList<>();
        for (Movie movie : getList()) {
            if (movie.isWatched()) {
                watchedMovies.add(movie);
            }
        }
        return watchedMovies;
    }

    public static List<Movie> getFavoriteMovies() {
        List<Movie> favoriteMovies = new ArrayList<>();
        for (Movie movie : getList()) {
            if (movie.isFavorite()) {
                favoriteMovies.add(movie);
            }
        }
        return favoriteMovies;
    }
}
