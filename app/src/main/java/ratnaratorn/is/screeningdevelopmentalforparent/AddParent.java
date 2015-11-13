package ratnaratorn.is.screeningdevelopmentalforparent;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddParent extends AppCompatActivity {

    //Explicit.
    private EditText edtMotherName, edtMotherLastname, edtMotherID;
    private EditText edtFatherName, edtFatherLastname, edtFatherID;
    private Button btnSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_parent);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        //Bind widgets.
        bindWidgets();
    }

    private void bindWidgets() {
        //Mother info.
        edtMotherName = (EditText) findViewById(R.id.edtMotherName);
        edtMotherLastname = (EditText) findViewById(R.id.edtMotherLastname);
        edtMotherID = (EditText) findViewById(R.id.edtMotherID);
        //Father info.
        edtFatherName = (EditText) findViewById(R.id.edtFatherName);
        edtFatherLastname = (EditText) findViewById(R.id.edtFatherLastname);
        edtFatherID = (EditText) findViewById(R.id.edtFatherID);
        //Button save.
        btnSave = (Button) findViewById(R.id.btnSave);
    }

}
