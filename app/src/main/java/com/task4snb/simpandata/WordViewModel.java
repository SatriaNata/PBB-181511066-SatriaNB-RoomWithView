package com.task4snb.simpandata;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

public class WordViewModel extends AndroidViewModel {
    private WordRepository mRepository;

    private LiveData<List<Word>> mrepository;

    private LiveData<List<Word>> mAllwords;

    public WordViewModel (Application application){
        super(application);
        mRepository = new WordRepository(application);
        mAllwords = mRepository.getAllWords();
    }

    LiveData<List<Word>> getAllWords(){
        return mAllwords;}

    public void insert(Word word) {
        mRepository.insert(word);
    }
}
