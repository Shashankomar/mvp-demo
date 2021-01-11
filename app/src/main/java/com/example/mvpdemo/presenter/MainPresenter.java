package com.example.mvpdemo.presenter;

import com.example.mvpdemo.R;
import com.example.mvpdemo.contract.IMainContract;

public class MainPresenter implements IMainContract.IMainPresenter {
    private IMainContract.IMainView mMainView;

    public MainPresenter(IMainContract.IMainView mainView) {
        mMainView = mainView;
    }

    @Override
    public void onButtonTextChange(int textResId) {
        mMainView.setButtonText(textResId);
    }
}