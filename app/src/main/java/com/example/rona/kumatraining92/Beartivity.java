package com.example.rona.kumatraining92;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Beartivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private RecyclerView.LayoutManager mLayoutManager;

    private List<Characters> charList;
    private BearHands bearAdapt;

    String[] names = {
            "Yuna",
            "Fina",
            "Hugging Bear",
            "Swaying Bear",
            "Shuri",
            "Noire Foschuroze",
            "Flora",
            "Shia"
    };

    String[] ages = {
            "15",
            "10",
            "1",
            "1",
            "9",
            "9",
            "7",
            "15"
    };

    int[] picture = {
            R.drawable.yuna,
            R.drawable.fina,
            R.drawable.kumakyuu,
            R.drawable.kumayuru,
            R.drawable.shuuri,
            R.drawable.noire,
            R.drawable.flora,
            R.drawable.shia
    };

    String[] role = {
            "The Bear",
            "Yuna's Waifu",
            "Bear",
            "Bear",
            "Cute Little Rascal",
            "Bear Lover",
            "The Princess",
            "Twin Drills"


    };
    String[] level = {
            "∞",
            "99",
            "100",
            "100",
            "70",
            "95",
            "90",
            "70"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beartivity);
        mRecyclerView = (RecyclerView) findViewById(R.id.bearview);

//setting untuk improve perfomance
//content tdk dapat mengubah size layout recyclerview
        if (mRecyclerView != null) {
            mRecyclerView.setHasFixedSize(true);
        }

//	//using a linear layout manager
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);
        charList = new ArrayList<>();
        for (int i = 0; i < names.length; i++) {
            Characters chars = new Characters(names[i],role [i], ages[i], picture[i],level[i]);
            charList.add(chars);
        }

        bearAdapt = new BearHands(charList);

        mRecyclerView.setAdapter(bearAdapt);
        bearAdapt.notifyDataSetChanged();
        mRecyclerView.addOnItemTouchListener(
                new BearRecycleClick(this,
                        new BearRecycleClick.OnItemClickListener() {
                            @Override
                            public void onItemClick(View view, int position) {
                                Toast.makeText(Beartivity.this, "Card at " + position + " is clicked", Toast.LENGTH_SHORT).show();
                            }
                        }));
    }

}
