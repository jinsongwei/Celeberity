package com.williamjin.celeberity.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.williamjin.celeberity.R;
import com.williamjin.celeberity.model.Celebrity;
import com.williamjin.celeberity.model.DatabaseHelper;
import com.williamjin.celeberity.model.DatabaseMeta;

public class AddCelebrityActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_celebrity);
    }

    public void handleAddCelebrity(View view) {
        EditText etName = findViewById(R.id.et_celebrity_name);
        EditText etGender = findViewById(R.id.et_celebrity_gender);
        EditText etType = findViewById(R.id.et_celebrity_type);

        DatabaseHelper dbHelper = new DatabaseHelper(this);

        switch (view.getId()) {
            case R.id.btn_add_celebrity:
                String gender = etGender.getText().toString();
                if (gender.length() == 1) {
                    Celebrity c = new Celebrity(etName.getText().toString(),
                            gender.charAt(0), etType.getText().toString(), null);
                    long resCode = dbHelper.addCelebrity(c);
                    if (resCode > 0) {
                        Toast.makeText(this, "Add Successfully", Toast.LENGTH_SHORT).show();
                        etName.setText("");
                        etGender.setText("");
                        etType.setText("");
                    } else {
                        Toast.makeText(this, "Add Failed", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(this, "enter one character in Gender ", Toast.LENGTH_SHORT).show();
                }
                break;
            default:
                break;
        }
    }
}
