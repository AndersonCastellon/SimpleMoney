package com.devappan.simplemoney.db.database;

import com.devappan.simplemoney.constants.Constants;
import com.devappan.simplemoney.db.dao.TransactionsDAO;
import com.devappan.simplemoney.db.entity.Transaction;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import android.content.Context;


@Database(entities = {Transaction.class}, version = 1)
public abstract class DatabaseApp extends RoomDatabase {

    private static DatabaseApp INSTANCE = null;
    public abstract TransactionsDAO transactionsDAO();

    public static DatabaseApp getINSTANCE(Context context){
        if (INSTANCE == null){
            INSTANCE = Room.databaseBuilder(context.getApplicationContext(), DatabaseApp.class,
                    Constants.NAME_DATABASE).build();
        }

        return INSTANCE;
    }

    public static void destroyINSTANCE(){
        INSTANCE = null;
    }
}
