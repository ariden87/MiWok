package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

import static com.example.android.miwok.R.string.one;
import static com.example.android.miwok.R.string.ten;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<String> numbersArray = new ArrayList<String>();
        numbersArray.add("one");
        numbersArray.add("two");
        numbersArray.add("tree");
        numbersArray.add("four");
        numbersArray.add("five");
        numbersArray.add("six");
        numbersArray.add("seven");
        numbersArray.add("eight");
        numbersArray.add("nine");
        numbersArray.add("ten");

/*        for (int i = 0; i< numbersArray.size(); i++) {
            Log.v("NumbersActivity", " ArrayList Position " + numbersArray.get(i));
        }*/

        LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);


        for (int i = 0; i< numbersArray.size(); i++) {
            TextView wordView = new TextView(this);
            wordView.setText(numbersArray.get(i));
            rootView.addView(wordView);

        }


/*
        int i=0;
        while (i< numbersArray.size()){
            TextView wordView = new TextView(this);
            wordView.setText(numbersArray.get(i));
            rootView.addView(wordView);
            i++;
        }
*/


    }
}
