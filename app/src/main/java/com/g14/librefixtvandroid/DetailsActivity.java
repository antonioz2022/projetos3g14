package com.g14.librefixtvandroid;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;

import com.bumptech.glide.Glide;

/*
 * Details activity class that loads LeanbackDetailsFragment class
 */
public class DetailsActivity extends FragmentActivity {
    public static final String SHARED_ELEMENT_NAME = "hero";
    public static final String MOVIE = "Movie";
    private static final String PREFS_NAME = "MoviePrefs";
    private static final String PREF_FAVORITE_KEY = "Favorite_";

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        Movie movie = (Movie) this.getIntent().getSerializableExtra(DetailsActivity.MOVIE);
        String bgImagePath = movie.getBackgroundImageUrl(); // Assume que você tem o método getBgImage()
        setBackgroundImage(bgImagePath);
        TextView titleTextView = findViewById(R.id.details_title);
        titleTextView.setText(movie.getTitle());
        TextView descriptionTextView = findViewById(R.id.details_description);
        descriptionTextView.setText(movie.getDescription());
        findViewById(R.id.action_watch).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DetailsActivity.this
                        , PlaybackActivity.class);
                intent.putExtra(DetailsActivity.MOVIE, movie);
                startActivity(intent);
            }
        });
        findViewById(R.id.action_add_to_favorites).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (movie != null) {
                    // Toggle the favorite state
                    boolean newFavoriteState = !movie.isFavorite();
                    movie.setFavorite(newFavoriteState);

                    // Save the new favorite state (assuming saveFavoriteState is correctly implemented)
                    saveFavoriteState(movie.getId(), newFavoriteState);

                    // Update the button icon dynamically
                    Button actionButton = (Button) view;
                    if (newFavoriteState) {
                        actionButton.setText("Remover dos favoritos");
                    } else {
                        actionButton.setText("Adicionar aos favoritos");
                    }
                } else {
                    // Log an error or show a message if movie is null
                    Log.e("DetailsActivity", "Movie object is null. Cannot update favorite state.");
                }
            }

        });
        findViewById(R.id.action_watched).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });
        //if (savedInstanceState == null) {
          //  getSupportFragmentManager().beginTransaction()
            //        .replace(R.id.details_fragment, new VideoDetailsFragment())
              //      .commitNow();
        //}
    }

    private void saveFavoriteState(long movieId, boolean isFavorite) {
        SharedPreferences prefs = DetailsActivity.this.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putBoolean(PREF_FAVORITE_KEY + movieId, isFavorite);
        editor.apply();
    }

    private void setBackgroundImage(String imagePath) {
        ImageView backgroundImage = findViewById(R.id.details_image);

        // Use Glide para carregar a imagem
        Glide.with(this)
                .load(imagePath) // Caminho da imagem (URL ou local)
                .placeholder(R.drawable.default_background) // Imagem padrão enquanto carrega
                .error(R.drawable.default_background) // Imagem caso ocorra erro
                .into(backgroundImage);
    }

}