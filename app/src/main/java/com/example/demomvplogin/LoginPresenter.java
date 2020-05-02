package com.example.demomvplogin;

public class LoginPresenter implements ILoginContract.InterfaceLoginPresenter {
    private ILoginContract.InterfaceLoginView loginView;

    public LoginPresenter(ILoginContract.InterfaceLoginView loginView) {
        this.loginView = loginView;
    }

    @Override
    public void handleLogin() {

    }

    @Override
    public void changeButtonText() {
        loginView.onTextChanged("So jao be");
    }

    @Override
    public void onBtnText() {
        loginView.onSetBtnText("Hey! Login");
    }
}
