package com.williamjin.celeberity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ReviewCelebrityActivity extends AppCompatActivity {
    EditText etReviewName;
    EditText etWriteReview;

    TextView tvReadReviewContent;

    Button btnSendReview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review_celebrity);
        etReviewName = findViewById(R.id.et_review_name);
        etWriteReview = findViewById(R.id.et_write_review);
        tvReadReviewContent = findViewById(R.id.tv_read_review_content);

        etWriteReview.setVisibility(EditText.INVISIBLE);
        tvReadReviewContent.setVisibility(TextView.INVISIBLE);
        btnSendReview = findViewById(R.id.btn_send_review);
        btnSendReview.setVisibility(Button.INVISIBLE);
    }


    public void handleReviewOption(View view) {

        switch (view.getId()) {
            case R.id.btn_read_review:
                etWriteReview.setVisibility(EditText.INVISIBLE);
                btnSendReview.setVisibility(Button.INVISIBLE);
                tvReadReviewContent.setVisibility(TextView.VISIBLE);

                break;
            case R.id.btn_write_review:
                tvReadReviewContent.setVisibility(TextView.INVISIBLE);
                etWriteReview.setVisibility(EditText.VISIBLE);
                btnSendReview.setVisibility(Button.VISIBLE);

                break;
            default:
                break;
        }
    }

    public void saveToLocal(){

    }
}
