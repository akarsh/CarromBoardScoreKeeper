package com.sakarsh.carromboardscorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView =  findViewById(R.id.layoutForTheMainActivity);
        recyclerView.setAdapter(new mainAdapter());
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

    }

    class mainAdapter extends RecyclerView.Adapter<viewHolder> {
        @Override
        public int getItemViewType(int position) {
            return super.getItemViewType(position);
        }

        @Override
        public viewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            return new viewHolder(LayoutInflater.from(parent.getContext()).inflate(
                    R.layout.score_card,
                    parent,
                    false
            ));
        }

        @Override
        public void onBindViewHolder(viewHolder holder, int position) {
            if (position == 0) {

            } else if (position == 1) {
                holder.textViewOne.setText("hello");
                holder.textViewTwo.setText("hi");
            }
            // TODO: 11.01.18  to make a list to store the scores length
        }

        @Override
        public int getItemCount() {
            return 3;
        }
    }

    class viewHolder extends RecyclerView.ViewHolder {

        TextView textViewOne, textViewTwo, textViewThree, textViewFour;

        public viewHolder(View itemView) {
            super(itemView);
            textViewOne = itemView.findViewById(R.id.userNameOne);
            textViewTwo = itemView.findViewById(R.id.userNameTwo);
            textViewThree = itemView.findViewById(R.id.userNameThree);
            textViewFour = itemView.findViewById(R.id.userNameFour);
        }
    }
}
