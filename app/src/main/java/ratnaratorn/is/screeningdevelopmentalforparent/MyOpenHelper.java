package ratnaratorn.is.screeningdevelopmentalforparent;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by iFirst on 10/30/2015 AD.
 */
public class MyOpenHelper extends SQLiteOpenHelper {

    //Explicit.
    private static final String DATABASE_NAME = "ScreeningDevelopmentalForParent.db";
    private static final Integer DATABASE_VERSION = 1;
    private static final String CREATE_TABLE_PARENT = "create table ParentTABLE(_parentID Integer primary key, " +
            "FatherName text, FatherLastname text, FatherIdentification text, FatherTelephoneNo text" +
            "MotherName text, MotherLastname text, MotherIdentification text, MotherTelephoneNo text);";
    private static final String CREATE_TABLE_CHILD = "create table ChildTABLE(_childID Integer primary key, " +
            "ChildName text, ChildLastname text, ChildGender text, CongenitalDisease text);";

    public MyOpenHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }//Constructor.

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(CREATE_TABLE_CHILD);
        sqLiteDatabase.execSQL(CREATE_TABLE_PARENT);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}//Main class.