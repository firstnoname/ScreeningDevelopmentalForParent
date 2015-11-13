package ratnaratorn.is.screeningdevelopmentalforparent;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by iFirst on 11/8/2015 AD.
 */
public class ParentTABLE {
    //Explicit.
    private MyOpenHelper objMyOpenHelper;
    private SQLiteDatabase writeSqLiteDatabase, readSqLiteDatabase;

    public static final String PARENT_TABLE = "ParentTABLE";
    public static final String COLUMN_FATHER_NAME = "FatherName";
    public static final String COLUMN_FATHER_LASTNAME = "FatherLastname";
    public static final String COLUMN_FATHER_IDENTIFICATION = "FatherIdentificatoin";
    public static final String COLUMN_FATHER_TELEPHONE = "FatherTelephoneNo";

    public static final String COLUMN_MOTHER_NAME = "MotherName";
    public static final String COLUMN_MOTHER_LASTNAME = "MotherLastname";
    public static final String COLUMN_MOTHER_IDENTIFICATION = "MotherIdentification";
    public static final String COLUMN_MOTHER_TELEPHONE = "MotherTelephoneNo";

    public ParentTABLE(Context context) {
        objMyOpenHelper = new MyOpenHelper(context);
        writeSqLiteDatabase = objMyOpenHelper.getWritableDatabase();
        readSqLiteDatabase = objMyOpenHelper.getReadableDatabase();
    }//Constructor.

}//Main class.
