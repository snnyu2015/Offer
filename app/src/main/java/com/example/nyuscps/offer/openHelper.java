package com.example.nyuscps.offer;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;




public class openHelper extends SQLiteOpenHelper {

    Context context;
    String filename;    //name of .db files in assets folder and /databases directory

    //The second argument of super is the name of the .db file we're going to create in the
    //directory /data/data/projectname/databases.
    //It will be a copy of the .db file with the same name in the assets folder.

    public openHelper(Context context, String filename) {
        super(context, context.getApplicationInfo().dataDir + "/databases/" + filename, null, 1);
        this.context = context;
        this.filename = filename;
    }


    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i2) {

    }
}
