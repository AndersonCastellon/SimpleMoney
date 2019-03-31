package com.devappan.simplemoney.mainModule.holder;

import android.view.View;

import com.bumptech.glide.Glide;
import com.devappan.simplemoney.R;
import com.devappan.simplemoney.constants.Constants;
import com.devappan.simplemoney.db.entity.Transaction;
import com.devappan.simplemoney.aplication.BaseViewHolder;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import butterknife.BindView;
import butterknife.ButterKnife;

public class TransactionViewHolder extends BaseViewHolder<Transaction> {

    @BindView(R.id.imageView)
    AppCompatImageView imageView;
    @BindView(R.id.tv_name_transaction)
    AppCompatTextView tvNameTransaction;
    @BindView(R.id.tv_description_transaction)
    AppCompatTextView tvDescriptionTransaction;
    @BindView(R.id.tv_datetime_transaction)
    AppCompatTextView tvDatetimeTransaction;
    @BindView(R.id.tv_amount_transaction)
    AppCompatTextView tvAmountTransaction;
    @BindView(R.id.transaction_menu)
    AppCompatImageButton transactionMenu;
    @BindView(R.id.cv_transaction)
    CardView cardView;

    private Transaction element;
    private TransactionItemClick transactionItemClick;
    private static final String PATTERN = "dd-mm-yyyy";


    public TransactionViewHolder(@NonNull View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }

    @Override
    public void bind(Transaction element) {
        this.element = element;

        renderImage();
        renderName();
        renderDescription();
        renderDate();
        renderAmount();
        setUpClickEvents();
    }

    private void setUpClickEvents() {
        transactionMenu.setOnClickListener((View v) -> transactionItemClick.menuOnClick());
        cardView.setOnClickListener((View v) -> transactionItemClick.transactionOnClick(element));
    }

    private void renderAmount() {
        tvAmountTransaction.setText((int) element.getAmount());
        if (element.getType() == Constants.VALUE_EXPENSES){
            tvAmountTransaction.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_arrow_downward_red,
                    0,0,0);
        } else {tvAmountTransaction.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_arrow_upward_green,
                0,0,0);
        }
    }

    private void renderDate() {
        String dt = new SimpleDateFormat(PATTERN, Locale.ROOT)
                .format(new Date());
        tvDatetimeTransaction.setText(dt);
    }

    private void renderDescription() {
        tvDescriptionTransaction.setText(element.getDescription());
    }

    private void renderName() {
        tvNameTransaction.setText(element.getName());
    }

    private void renderImage() {
        Glide.with(getContext())
                .load(element.getImage())
                .centerCrop()
                .into(imageView);
    }
}
