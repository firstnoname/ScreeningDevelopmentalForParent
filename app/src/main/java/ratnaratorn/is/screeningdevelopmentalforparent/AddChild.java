package ratnaratorn.is.screeningdevelopmentalforparent;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.Toast;

public class AddChild extends AppCompatActivity {

    //Exlicit.
    private EditText edtChildBirthdate, edtChildID, edtChildName, edtChildLastname, edtCongenitalDisease;
    private RadioGroup rdgGender;
    private RadioButton rbtMale, rbtFemale;
    private EditText edtMotherName, edtMotherLastname, edtMotherID;
    private EditText edtFatherName, edtFatherLastname, edtFatherID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_child);
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

        //Controller event.
        eventController();
    }

    private void eventController() {

    }

    private void bindWidgets() {
        //Child info.
        edtChildBirthdate = (EditText) findViewById(R.id.edtChildBirthdate);
        edtChildID = (EditText) findViewById(R.id.edtChildID);
        edtChildName = (EditText) findViewById(R.id.edtChildName);
        edtChildLastname = (EditText) findViewById(R.id.edtChildLastname);
        rbtMale = (RadioButton) findViewById(R.id.rbtMale);
        rbtFemale = (RadioButton) findViewById(R.id.rbtFemale);
        edtCongenitalDisease = (EditText) findViewById(R.id.edtCongenitalDisease);
    }//Bind widgets.

}
