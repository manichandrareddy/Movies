package com.example.movies;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.movies.moviesnew.Movie;
import com.example.movies.moviesnew.MovieAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private MovieAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.movies_list);
        ArrayList<Movie> moviesList = new ArrayList<>();
        moviesList.add(new Movie("After Earth" , "4.8/10" ,  "A crash landing leaves Kitai Raige and his father Cypher stranded on Earth, a millennium after events forced humanity's escape. With Cypher injured, Kitai must embark on a perilous journey to signal for help.",R.drawable.movie_after_earth));
        moviesList.add(new Movie("Extraction" , "9/10" ,  "A black-market mercenary who has nothing to lose is hired to rescue the kidnapped son of an imprisoned international crime lord. But in the murky underworld of weapons dealers and drug traffickers, an already deadly mission approaches the impossible.",R.drawable.extraction));
        moviesList.add(new Movie("Deadpool2" , "7.8/10" ,  "Foul-mouthed mutant mercenary Wade Wilson (a.k.a. Deadpool), brings together a team of fellow mutant rogues to protect a young boy with supernatural abilities from the brutal, time-traveling cyborg Cable.",R.drawable.deadpool));
        moviesList.add(new Movie( "Inside Out" , "8.1/10" ,  "After young Riley is uprooted from her Midwest life and moved to San Francisco, her emotions - Joy, Fear, Anger, Disgust and Sadness - conflict on how best to navigate a new city, house, and school.",R.drawable.inside_out));
        moviesList.add(new Movie("Akashame Haddhu Ra","9.3/10","Nedumaaran Rajangam \"Maara\" sets out to make the common man fly and in the process takes on the world's most capital intensive industry and several enemies who stand in his way.",R.drawable.aakaasam));
        mAdapter = new MovieAdapter(this,moviesList);
        listView.setAdapter(mAdapter);

    }
}

