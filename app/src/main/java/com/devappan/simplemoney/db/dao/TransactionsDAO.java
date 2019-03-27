package com.devappan.simplemoney.db.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import io.reactivex.Completable;
import io.reactivex.Flowable;
import io.reactivex.Maybe;

import com.devappan.simplemoney.db.entity.Transaction;

import java.util.List;

@Dao
public interface TransactionsDAO {

    @Insert
    Completable setTransaction(Transaction transaction); //Insertar una transaccion en la db

    @Query("SELECT * FROM transactions")
    Flowable<List<Transaction>> getAll(); //Leer todas las transacciones de la db

    @Query("SELECT * FROM transactions WHERE id LIKE :id")
    Maybe<Transaction> get(int id); //Obtener una transaccion para ver sus detalles / duplicarla

    @Update
    Completable updateTransaction(Transaction transaction); //Actualizar una transaccion

    @Query("DELETE FROM transactions")
    Completable deleteAll(); //Eliminar todas las transacciones de la db

    @Delete
    Completable deleteTransaction(Transaction transaction); //Eliminar una transaccion especifica
}
