package com.example.p1.ui.tools;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class creditosViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public creditosViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is tools fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}