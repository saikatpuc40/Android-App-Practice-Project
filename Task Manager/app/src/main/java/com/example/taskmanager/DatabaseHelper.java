package com.example.taskmanager;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DatabaseHelper extends SQLiteOpenHelper {

    public static final String DB_NAME = "DATABASE";
    public static final int DB_VERSION = 1;

    public DatabaseHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("create table Data (Id integer primary key autoincrement, FirstName text, SecondName text, StartTime text, EndTime text, Description text , Category text)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("drop table if exists Data");

    }

    public void addData(String firstName, String secondName, String startTime, String endTime, String description, String category){
        SQLiteDatabase database = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("FirstName", firstName);
        values.put("SecondName", secondName);
        values.put("StartTime", startTime);
        values.put("EndTime", endTime);
        values.put("Description", description);
        values.put("Category", category);
        database.insert("Data", null, values);
        database.close();
    }
}
