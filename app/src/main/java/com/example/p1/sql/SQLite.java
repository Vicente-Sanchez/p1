package com.example.p1.sql;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import java.util.ArrayList;

public class SQLite {
    private sql sql;
    private SQLiteDatabase db;
public SQLite(Context context) {
    sql = new sql(contex);

}
public SQLite(){

}
public void abrir(){
    Log.d("SQLite","Abrir la base "+ sql.getDatabaseName());
    db= sql.getWritableDatabase();
}
public void cerrar(){
    Log.d("SQLite","Abrir la base "+ sql.getDatabaseName());
sql.close();
}
public boolean addRegistroAnimal(int id, String clasificacion, String especie,
String nombre, String sexo, String fecha, String habitat, String alimentacion){
    ContentValues cv = new ContentValues();
    cv.put("ID_PROD", id);
    cv.put("CLASIFICACION", clasificacion);
    cv.put("ESPECIE", especie);
    cv.put("NOMBRE", nombre);
    cv.put("SEXO", sexo);
    cv.put("FECHA_ING", fecha);
    cv.put("HABITAT", habitat);
    cv.put("ALIMENTACION", alimentacion);
    return true;

}
public Cursor getRegistroAnimal() {
    return db.rawQuery(sql new )
}
public ArrayList<String> getAnimal (Cursor cursor){
    String item ="";
    if(cursor.moveToFirst){
        db(
                item+="ID: ("+cursor.getInt(0)+
        )
        }
    }
}
}
