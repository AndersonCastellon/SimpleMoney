package com.devappan.simplemoney.mainModule.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.devappan.simplemoney.R;
import com.devappan.simplemoney.db.entity.Transaction;
import com.devappan.simplemoney.mainModule.holder.TransactionViewHolder;
import com.devappan.simplemoney.aplication.BaseViewHolder;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class TransactionAdapter extends RecyclerView.Adapter<BaseViewHolder> {

    private List<Transaction> transactions;

    public TransactionAdapter() {
        transactions = new ArrayList<>();
    }

    public void set(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    public List<Transaction> get() {
        return transactions;
    }

    @NonNull
    @Override
    public BaseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.transaction_layout, parent, false);
        return new TransactionViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull BaseViewHolder holder, int position) {
        holder.bind(transactions.get(position));
    }

    @Override
    public int getItemCount() {
        return transactions.size();
    }
}
