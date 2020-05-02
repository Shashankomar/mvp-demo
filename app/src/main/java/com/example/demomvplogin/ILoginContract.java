package com.example.demomvplogin;

public interface ILoginContract {

    interface InterfaceLoginView{

        void onTextChanged(String text);

        void onSetBtnText(String text);
    }

    interface InterfaceLoginPresenter{

        void handleLogin();

        void changeButtonText();

        void onBtnText();
    }
}
