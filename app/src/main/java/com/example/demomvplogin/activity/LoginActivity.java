package com.example.demomvplogin.activity;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.example.demomvplogin.ILoginContract;
import com.example.demomvplogin.LoginPresenter;
import com.example.demomvplogin.R;
import com.example.demomvplogin.databinding.ActivityLoginBinding;

public class LoginActivity extends AppCompatActivity implements ILoginContract.InterfaceLoginView {
    ActivityLoginBinding actLoginBinding;
    ILoginContract.InterfaceLoginPresenter loginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        actLoginBinding = DataBindingUtil.setContentView(this, R.layout.activity_login);

        loginPresenter = new LoginPresenter(this);
        loginPresenter.onBtnText();

        actLoginBinding.btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginPresenter.changeButtonText();
            }
        });
    }

    @Override
    public void onTextChanged(String text) {
        actLoginBinding.btnLogin.setText(text);

    }

    @Override
    public void onSetBtnText(String text) {
        actLoginBinding.btnLogin.setText(text);
    }
}
