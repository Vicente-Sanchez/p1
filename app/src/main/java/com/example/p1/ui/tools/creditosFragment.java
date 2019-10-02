package com.example.p1.ui.tools;

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

public class creditosFragment extends Fragment {

    private creditosViewModel creditosViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        creditosViewModel =
                ViewModelProviders.of(this).get(creditosViewModel.class);
        View root = inflater.inflate(R.layout.fragment_creditos, container, false);
        final TextView textView = root.findViewById(R.id.text_tools);
        creditosViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}