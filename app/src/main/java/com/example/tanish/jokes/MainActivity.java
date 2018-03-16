package com.example.tanish.jokes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private LinearLayout rootLayout;

    List<Joke> jokeList;  //Joke is a java class which has an object named "jokeList".

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        jokeList = new ArrayList<>();
        jokeList.add(new Joke("Manmeet", "Instructor", "lame"));
        jokeList.add(new Joke("Manmeet", "Instructor", "lame"));
        jokeList.add(new Joke("Manmeet", "Instructor", "lame"));
        jokeList.add(new Joke("Manmeet", "Instructor", "lame"));

        ListView listView = findViewById(R.id.list_view);
        JokeAdapter adapter = new JokeAdapter(this, jokeList);   //Providing the above-made array list to JokeAdapter
        listView.setAdapter(adapter);          //Setting the value of Adapter to above line array list
    }

}
