package com.g14.librefixtvandroid;

import android.os.Bundle;

import androidx.fragment.app.FragmentActivity;
import androidx.leanback.app.RowsSupportFragment;
import androidx.leanback.widget.ArrayObjectAdapter;
import androidx.leanback.widget.HeaderItem;
import androidx.leanback.widget.ListRow;
import androidx.leanback.widget.ListRowPresenter;
import androidx.leanback.widget.ObjectAdapter;

import java.util.List;

public class ProfileActivity extends FragmentActivity {

    private ArrayObjectAdapter rowsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        // Configurar o fragmento de linhas
        RowsSupportFragment rowsFragment = new RowsSupportFragment();
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, rowsFragment)
                .commit();

        // Inicializar as interfaces de usuário
        setupUI(rowsFragment);

        // Carregar listas de filmes
        loadWatchedMovies();
        loadFavoriteMovies();
    }

    private void setupUI(RowsSupportFragment rowsFragment) {
        // Inicializar adaptador de linhas
        rowsAdapter = new ArrayObjectAdapter(new ListRowPresenter());

        // Criar uma linha para filmes assistidos
        ArrayObjectAdapter watchedAdapter = (ArrayObjectAdapter) ((ListRow) rowsAdapter.get(0)).getAdapter();
        ListRow watchedRow = new ListRow(new HeaderItem(0, "Filmes Assistidos"), watchedAdapter);
        rowsAdapter.add(watchedRow);

        // Criar uma linha para filmes favoritos
        ArrayObjectAdapter favoriteAdapter = (ArrayObjectAdapter) ((ListRow) rowsAdapter.get(1)).getAdapter();
        ListRow favoriteRow = new ListRow(new HeaderItem(1, "Filmes Favoritos"), favoriteAdapter);
        rowsAdapter.add(favoriteRow);

        // Define o adaptador no fragmento
        rowsFragment.setAdapter(rowsAdapter);
    }

    private void loadWatchedMovies() {
        // Carregar filmes assistidos do MovieList
        List<Movie> watchedMovies = MovieList.getWatchedMovies();
        // Fazer casting explícito
        ArrayObjectAdapter watchedAdapter = (ArrayObjectAdapter) ((ListRow) rowsAdapter.get(0)).getAdapter();
        watchedAdapter.addAll(0, watchedMovies);
    }

    private void loadFavoriteMovies() {
        // Carregar filmes favoritos do MovieList
        List<Movie> favoriteMovies = MovieList.getFavoriteMovies();
        // Fazer casting explícito
        ArrayObjectAdapter favoriteAdapter = (ArrayObjectAdapter) ((ListRow) rowsAdapter.get(1)).getAdapter();
        favoriteAdapter.addAll(0, favoriteMovies);
    }
}