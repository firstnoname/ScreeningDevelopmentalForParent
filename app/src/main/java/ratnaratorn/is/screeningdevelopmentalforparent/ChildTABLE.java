package ratnaratorn.is.screeningdevelopmentalforparent;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by iFirst on 10/30/2015 AD.
 */
public class ChildTABLE {

    //Explicit.
    private MyOpenHelper objMyOpenHelper;
    private SQLiteDatabase writeSqLiteDatabase, readSqLiteDatabase;

    public static final String CHILD_TABLE = "ChildTABLE";
    public static final String COLUMN_CHILD_NAME = "ChildName";
    public static final String COLUMN_CHILD_LASTNAME = "ChildLastname";
    public static final String COLUMN_CONGENITAL_DISEASE = "CongenitalDisease";

    public ChildTABLE(Context context) {
        objMyOpenHelper = new MyOpenHelper(context);
        writeSqLiteDatabase = objMyOpenHelper.getWritableDatabase();
        readSqLiteDatabase = objMyOpenHelper.getReadableDatabase();
    }//Constructor.

}//Main class.
