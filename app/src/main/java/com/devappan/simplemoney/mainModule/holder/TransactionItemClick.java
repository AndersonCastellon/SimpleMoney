package com.devappan.simplemoney.mainModule.holder;

import com.devappan.simplemoney.db.entity.Transaction;

public interface TransactionItemClick {

    void transactionOnClick(Transaction transaction);
    void menuOnClick();
}
