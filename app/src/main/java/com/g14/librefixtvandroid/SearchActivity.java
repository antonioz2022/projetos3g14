package com.g14.librefixtvandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.FragmentActivity;
import androidx.leanback.app.SearchSupportFragment;
import androidx.leanback.widget.ArrayObjectAdapter;
import androidx.leanback.widget.ListRow;
import androidx.leanback.widget.ListRowPresenter;
import androidx.leanback.widget.OnItemViewClickedListener;
import androidx.leanback.widget.Presenter;
import androidx.leanback.widget.Row;
import androidx.leanback.widget.RowPresenter;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import java.util.ArrayList;
import java.util.List;

public class SearchActivity extends FragmentActivity implements SearchSupportFragment.SearchResultProvider {

    private ArrayObjectAdapter mRowsAdapter;
    private List<Movie> allMovies;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        allMovies = MovieList.getList();  // Inicializa a lista de todos os filmes

        SearchSupportFragment searchFragment = (SearchSupportFragment) getSupportFragmentManager()
                .findFragmentById(R.id.search_fragment);

        if (searchFragment != null) {
            searchFragment.setSearchResultProvider(this);
            searchFragment.setOnItemViewClickedListener(new SearchItemViewClickedListener());
        } else {
            Toast.makeText(this, "Search fragment not found!", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public ArrayObjectAdapter getResultsAdapter() {
        if (mRowsAdapter == null) {
            mRowsAdapter = new ArrayObjectAdapter(new ListRowPresenter());
        }
        return mRowsAdapter;
    }

    @Override
    public boolean onQueryTextChange(String newQuery) {
        return performSearch(newQuery);
    }

    @Override
    public boolean onQueryTextSubmit(String query) {
        return performSearch(query);
    }

    private boolean performSearch(String query) {
        mRowsAdapter.clear();

        if (query == null || query.trim().isEmpty()) {
            Toast.makeText(this, "Please enter a query.", Toast.LENGTH_SHORT).show();
            return true;
        }

        List<Movie> filteredMovies = new ArrayList<>();
        for (Movie movie : allMovies) {
            if (movie.getTitle().toLowerCase().contains(query.toLowerCase())) {
                filteredMovies.add(movie);
            }
        }

        if (filteredMovies.isEmpty()) {
            Toast.makeText(this, "No results found.", Toast.LENGTH_SHORT).show();
        } else {
            ArrayObjectAdapter listRowAdapter = new ArrayObjectAdapter(new CardPresenter());
            listRowAdapter.addAll(0, filteredMovies);
            mRowsAdapter.add(new ListRow(listRowAdapter));
        }

        return true;
    }

    private static class MovieCardPresenter extends Presenter {

        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent) {
            ImageView imageView = new ImageView(parent.getContext());
            imageView.setLayoutParams(new ViewGroup.LayoutParams(200, 300));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            return new ViewHolder(imageView);
        }

        @Override
        public void onBindViewHolder(ViewHolder viewHolder, Object item) {
            Movie movie = (Movie) item;
            ImageView imageView = (ImageView) viewHolder.view;

            Glide.with(imageView.getContext())
                    .load(movie.getCardImageUrl())
                    .apply(new RequestOptions().centerCrop())
                    .into(imageView);
        }

        @Override
        public void onUnbindViewHolder(ViewHolder viewHolder) {
            // Limpeza se necessário
        }
    }

    private class SearchItemViewClickedListener implements OnItemViewClickedListener {
        @Override
        public void onItemClicked(Presenter.ViewHolder itemViewHolder, Object item,
                                  RowPresenter.ViewHolder rowViewHolder, Row row) {
            if (item instanceof Movie) {
                Movie movie = (Movie) item;
                Intent intent = new Intent(SearchActivity.this, DetailsActivity.class);
                intent.putExtra(DetailsActivity.MOVIE, movie);
                startActivity(intent);
            }
        }
    }
}