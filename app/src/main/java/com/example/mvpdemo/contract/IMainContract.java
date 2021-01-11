package com.example.mvpdemo.contract;

public interface IMainContract {

    interface IMainView {

        void setButtonText(int textResId);

    }

    interface IMainPresenter {

        void onButtonTextChange(int hey_click_me);
    }
}
