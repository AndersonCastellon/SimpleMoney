package com.devappan.simplemoney.db.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.devappan.simplemoney.constants.Constants;

@Entity(tableName = Constants.NAME_TABLE_TRANSACTIONS)
public class Transaction {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = Constants.NAME_COLUMN_ID)
    private int id;
    @ColumnInfo(name = Constants.NAME_COLUMN_NAME)
    private String name;
    @ColumnInfo(name = Constants.NAME_COLUMN_DESCRIPTION)
    private String description;
    @ColumnInfo(name = Constants.NAME_COLUMN_TYPE)
    private int type;
    @ColumnInfo(name = Constants.NAME_COLUMN_DATATIME)
    private int datatime;
    @ColumnInfo(name = Constants.NAME_COLUMN_AMOUNT)
    private float amount;
    @ColumnInfo(name = Constants.NAME_COLUMN_IMAGE)
    private String image;

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

    public int getType() {
        return type;
    }

    public void setType(int type) {
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
