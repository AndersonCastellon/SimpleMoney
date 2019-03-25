package com.devappan.simplemoney.db.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.devappan.simplemoney.db.entity.Transaction;

import java.util.List;

@Dao
public interface TransactionsDAO {

    @Insert
    void setTransaction(Transaction transaction); //Insertar una transaccion en la db

    @Query("SELECT * FROM transactions")
    List<Transaction> getAll(); //Leer todas las transacciones de la db

    @Query("SELECT * FROM transactions WHERE id LIKE :id")
    Transaction get(int id); //Obtener una transaccion para ver sus detalles / duplicarla

    @Update
    void updateTransaction(Transaction transaction); //Actualizar una transaccion

    @Query("DELETE FROM transactions")
    void deleteAll(); //Eliminar todas las transacciones de la db

    @Delete
    void deleteTransaction(Transaction transaction); //Eliminar una transaccion especifica
}
