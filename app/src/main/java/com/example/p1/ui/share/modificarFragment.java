package com.example.p1.ui.share;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.p1.R;

public class modificarFragment extends Fragment {

    private modificarViewModel modificarViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        modificarViewModel =
                ViewModelProviders.of(this).get(modificarViewModel.class);
        View root = inflater.inflate(R.layout.fragment_modificar, container, false);
        /*final TextView textView = root.findViewById(R.id.text_share);
        modificarViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });

         */
        return root;
    }
}