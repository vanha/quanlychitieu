package com.sample.assignmentchitieu.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {

    public DatabaseHelper(Context context) {
        super(context, "dbChiTieu", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String createTableLoaiChi = "create table LoaiChi(maLC text primary key, tenLC text)";
        String createTableKhoanChi = "create table KhoanChi (maKC text primary key, " +
                "tenKC text, maLC text, soTien decimal, ngayChi text)";
        sqLiteDatabase.execSQL(createTableLoaiChi);
        sqLiteDatabase.execSQL(createTableKhoanChi);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("drop table if exists KhoanChi");
        sqLiteDatabase.execSQL("drop table if exists LoaiChi");
        onCreate(sqLiteDatabase);
    }
}
