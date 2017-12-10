package com.example.dande.appdict;

import android.content.Context;

import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;

/**
 * Created by dande on 12/7/2017.
 */

public class DatabaseOpenHelper extends SQLiteAssetHelper {
    private static final String DATABASE_NAME_ENGVIE = "anh_viet.db";
    private static final String DATABASE_NAME_VIEENG = "viet_anh.db";
    private static final int DATABASE_VERSION = 1;

    public DatabaseOpenHelper(Context context){
        super(context, DATABASE_NAME_ENGVIE, DATABASE_NAME_VIEENG, null, DATABASE_VERSION);
    }
}
