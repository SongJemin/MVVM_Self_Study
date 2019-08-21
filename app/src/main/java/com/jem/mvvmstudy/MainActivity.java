package com.jem.mvvmstudy;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import com.jem.mvvmstudy.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        final CounterViewModel viewModel = ViewModelProviders.of(this).get(CounterViewModel.class);

        binding.mainCountTv.setText(viewModel.counter + "");

        binding.mainAddFab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewModel.counter++;
                binding.mainCountTv.setText(viewModel.counter + "");
            }
        });

        binding.mainRemoveFab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewModel.counter--;
                binding.mainCountTv.setText(viewModel.counter + "");
            }
        });
    }
}
