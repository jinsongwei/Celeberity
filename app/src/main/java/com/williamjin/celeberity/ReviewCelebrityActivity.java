package com.williamjin.celeberity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ReviewCelebrityActivity extends AppCompatActivity {
    EditText etReviewName;
    LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review_celebrity);
        etReviewName = findViewById(R.id.et_review_name);
    }


    public void handleReviewOption(View view) {

        switch (view.getId()) {
            case R.id.btn_read_review:
                break;
            case R.id.btn_write_review:
                TextView etReadReview = new TextView(this);
                linearLayout = new LinearLayout(this);
                linearLayout.setOrientation(LinearLayout.VERTICAL);

                break;
            default:
                break;
        }
    }
}
