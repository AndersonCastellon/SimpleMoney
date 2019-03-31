package com.devappan.simplemoney.mainModule;

import android.os.Bundle;

import com.devappan.simplemoney.R;
import com.devappan.simplemoney.db.entity.Transaction;
import com.devappan.simplemoney.mainModule.holder.TransactionItemClick;
import com.devappan.simplemoney.mainModule.presenter.MainPresenter;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import easymvp.annotation.ActivityView;

@ActivityView(layout = R.layout.activity_main, presenter = MainPresenter.class)
public class MainActivity extends AppCompatActivity implements MainView, TransactionItemClick {

    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.rv_data)
    RecyclerView rvData;
    @BindView(R.id.fab_new)
    FloatingActionButton fabNew;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ButterKnife.bind(this);
    }

    @Override
    public void showEmpty() {

    }

    @Override
    public void showError() {

    }

    @Override
    public void showContent(List<Transaction> transactions) {

    }

    @Override
    public void transactionOnClick(Transaction transaction) {

    }

    @Override
    public void menuOnClick() {

    }
}
