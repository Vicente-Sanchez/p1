package com.example.p1.ui.share;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class modificarViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public modificarViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is share fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}