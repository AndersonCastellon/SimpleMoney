package com.devappan.simplemoney.db.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

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
