package com.devappan.simplemoney.db.entity;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import com.devappan.simplemoney.constants.Constants;

@Entity(tableName = Constants.NAME_TABLE_TRANSACTIONS)
public class Transactions {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = Constants.NAME_COLUMN_ID)
    private int id;
    @ColumnInfo(name = Constants.NAME_COLUMN_NAME)
    private String name;
    @ColumnInfo(name = Constants.NAME_COLUMN_DESCRIPTION)
    private String description;
    @ColumnInfo(name = Constants.NAME_COLUMN_TYPE)
    private String type;
    @ColumnInfo(name = Constants.NAME_COLUMN_DATATIME)
    private int datatime;
    @ColumnInfo(name = Constants.NAME_COLUMN_AMOUNT)
    private float amount;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTipe() {
        return type;
    }

    public void setTipe(String type) {
        this.type = type;
    }

    public int getDatatime() {
        return datatime;
    }

    public void setDatatime(int datatime) {
        this.datatime = datatime;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }
}
