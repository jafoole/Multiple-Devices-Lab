package com.example.jafoole.multipledeviceslab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class CardListActivity extends AppCompatActivity {
    ListView mCardListView;
    ArrayList<String> mList;
    ArrayAdapter<String> mAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_list);

        ListView cardListView = (ListView)findViewById(R.id.cardListView);
        CardView cardView = (CardView)findViewById(R.id.cardView);
        TextView cardViewText = (TextView)findViewById(R.id.cardViewText);

        mCardListView = (ListView)findViewById(R.id.cardListView);


        mList = new ArrayList<>();
        mList.add("One");
        mList.add("Two");
        mList.add("Three");
        mList.add("Four");
        mList.add("Five");
        mList.add("Six");
        mList.add("Seven");

        mAdapter = new ArrayAdapter<String>(CardListActivity.this, android.R.layout.simple_list_item_1, mList);
        mCardListView.setAdapter(mAdapter);


        cardViewText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CardListActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });


    }
}
