package com.example.tanish.jokes;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Tanish on 13-03-2018.
 */

public class JokeAdapter extends ArrayAdapter<Joke> {
    public JokeAdapter(Context context, List<Joke> jokeList) {
        super(context, R.layout.item_joke, jokeList);

    }

    @NonNull

    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ViewHolder ViewHolder; //ViewHolder is a static class, that is defined after getView
        /* Position is the index of the elements in the array list
         * convertView is a view to inflate the item_joke xml file*/
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext())
                    .inflate(R.layout.item_joke, parent, false);   /*item_joke is the xml file
                                                                                 * that contains the three
                                                                                 * variables that we are
                                                                                 * storing in the */
            ViewHolder = new ViewHolder(convertView);
            convertView.setTag(ViewHolder);   //ViewHolder now has the value, which was provided to converView at inflation
        } else {
            ViewHolder = (ViewHolder) convertView.getTag(); //type casting to change object to View
                /* if the value of convertView is not null, then simply store its value in theViewHolder
                *  As convertView is a View and ViewHolder is different, we need type-casting to perform this action*/
        }


            Joke joke = getItem(position);
         /*  Here, we call the getter we make in Joke.java and set its index to position */
          ViewHolder.titleView.setText(joke.getTitle());
           ViewHolder.contentView.setText(joke.getContent());
           ViewHolder.categoryView.setText(joke.getCategory());
          /* Now, we place the ViewHolder's value into the different
          fields(titleView, contentView and categoryView) uses getters */
        return convertView; //For the next inflation to be carried out, we return existing convertView
    }

    private static class ViewHolder {
        TextView titleView;
        TextView contentView;
        TextView categoryView;

        public ViewHolder(View convertView) {       /*Constructor with view to get the inflated view*/
            titleView = convertView.findViewById(R.id.JokeTitle);
            contentView = convertView.findViewById(R.id.JokeContent);
            categoryView = convertView.findViewById(R.id.JokeCategory);
            /*Storing the values of ViewHolder to the TextViews of itemjoke*/
        }
    }
}
