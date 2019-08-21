package com.jem.mvvmstudy;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import com.jem.mvvmstudy.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private int counter = 0;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        binding.mainCountTv.setText("0");

        binding.mainAddFab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter++;
                binding.mainCountTv.setText(counter + "");
            }
        });

        binding.mainRemoveFab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter--;
                binding.mainCountTv.setText(counter + "");
            }
        });
    }
}
