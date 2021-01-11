package com.example.mvpdemo.activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.example.mvpdemo.R;
import com.example.mvpdemo.contract.IMainContract;
import com.example.mvpdemo.databinding.ActivityMainBinding;
import com.example.mvpdemo.presenter.MainPresenter;

public class MainActivity extends AppCompatActivity implements IMainContract.IMainView {
    ActivityMainBinding mBinding;
    IMainContract.IMainPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        mPresenter = new MainPresenter(this);
        mPresenter.onButtonTextChange(R.string.hey_click_me);

        mBinding.btn.setOnClickListener(v -> mPresenter.onButtonTextChange(R.string.btn_clicked));
    }

    @Override
    public void setButtonText(int textResId) {
        mBinding.btn.setText(getResources().getString(textResId));
    }
}