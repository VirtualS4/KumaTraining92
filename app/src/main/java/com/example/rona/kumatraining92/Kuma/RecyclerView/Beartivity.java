package com.example.rona.kumatraining92.Kuma.RecyclerView;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.example.rona.kumatraining92.R;

import java.util.ArrayList;
import java.util.List;

public class Beartivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private RecyclerView.LayoutManager mLayoutManager;

    private List<Characters> charList;
    private BearHands bearAdapt;

    String[] role = {
            "Sam",
            "Facebook",
            "Google +",
            "Twitter",
            "Pinterest Weekly",
            "Josh",
            "Test",
            "Test",
            "Test",
            "Test",
            "Test",
            "Test"
    };

    String[] name = {
            "Weekend Adventure",
            "Yuna, You have 1 Notification",
            "Top Suggested Google + Pages for you",
            "Follow T-Mobile,Samsung Mobile U",
            "Lorem Ipsum",
            "Lorem Ipsum",
            "Lorem Ipsum",
            "Lorem Ipsum",
            "Lorem Ipsum",
            "Lorem Ipsum",
            "Lorem Ipsum",
            "Lorem Ipsum"
    };
    String[] ages = {
            "Weekend Adventure",
            "Yuna, You have 1 Notification",
            "Top Suggested Google + Pages for you",
            "Follow T-Mobile,Samsung Mobile U",
            "Lorem Ipsum",
            "Lorem Ipsum",
            "Lorem Ipsum",
            "Lorem Ipsum",
            "Lorem Ipsum",
            "Lorem Ipsum",
            "Lorem Ipsum",
            "Lorem Ipsum"
    };

    int[] picture = {
            R.drawable.s,
            R.drawable.f,
            R.drawable.g,
            R.drawable.t,
            R.drawable.p,
            R.drawable.j,
            R.drawable.tb,
            R.drawable.tb,
            R.drawable.tb,
            R.drawable.tb,
            R.drawable.tb,
            R.drawable.tb,
    };

    String[] timestamp = {
            "10:42am",
            "16:04pm",
            "18:44pm",
            "20:04pm",
            "09:04am",
            "01:04am",
            "11:21am",
            "11:22am",
            "11:25am",
            "12:01am",
            "13:22am",
            "13:32am"
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
        for (int i = 0; i < role.length; i++) {
            Characters chars = new Characters(name[i],role [i], ages[i], picture[i],timestamp[i]);
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
