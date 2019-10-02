package com.example.p1.sql;

import android.content.Context;
import android.content.IntentFilter;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class sql extends SQLiteOpenHelper {
private static final String database="";
private static final int VERSION=0;

private static final String tprod="CREATE TABLE ANIMAL"+
        "(ID_PROD INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, "+
        "CLASIFICACION TEXT NOT NULL, ESPECIE TEXT NOT NULL, "+
        "NOMBRE TEXT NOT NULL, SEXO TEXT NOT NULL,"+
        "FECHA_ING TEXT NOT NULL, HABITAD TEXT NOT NULL, ALIMENTACION TEXT NOT NULL)";
    public sql(@Nullable Context context) {
        super(context, database,null , VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(tprod);
    }

    @Override
    
    public void onUpgrade(SQLiteDatabase db, int OlVersion, int NewVersion) {
        if (NewVersion>OlVersion){
            db.execSQL("DROP TABLE IF EXISTS ANIMAL");
            db.execSQL(tprod);
        }
    }
}
