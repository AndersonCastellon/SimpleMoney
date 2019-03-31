package com.devappan.simplemoney.mainModule;

import android.os.Bundle;

import com.andrognito.flashbar.Flashbar;
import com.devappan.simplemoney.R;
import com.devappan.simplemoney.db.entity.Transaction;
import com.devappan.simplemoney.mainModule.adapter.TransactionAdapter;
import com.devappan.simplemoney.mainModule.holder.TransactionItemClick;
import com.devappan.simplemoney.mainModule.presenter.MainPresenter;

import java.util.List;

import javax.annotation.Nullable;
import javax.inject.Inject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import easymvp.annotation.ActivityView;
import easymvp.annotation.Presenter;

@ActivityView(presenter = MainPresenter.class)
public class MainActivity extends AppCompatActivity implements MainView, TransactionItemClick {

    @Nullable
    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.rv_data)
    RecyclerView rvData;

    @Inject
    @Presenter
    MainPresenter presenter;
    private TransactionAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        setUpTollbar();
        setUpRecyclerView();
    }

    private void setUpRecyclerView() {
        adapter = new TransactionAdapter();
        LinearLayoutManager manager = new LinearLayoutManager(getApplicationContext());
        manager.setOrientation(RecyclerView.VERTICAL);
        rvData.setAdapter(adapter);
        rvData.setLayoutManager(manager);

    }

    @OnClick(R.id.fab_new)
    public void onViewClicked() {
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

    private void setUpTollbar() {
        setSupportActionBar(toolbar);
    }
}
