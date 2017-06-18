package com.example.mac.myfirstapp;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class AppActivity extends AppCompatActivity {

//    private static final String TAG = AppActivity.class.getSimpleName();
    private FactBook mFactBook = new FactBook();
    private ColorWheel mColorWheel = new ColorWheel();
    //Declare our view variables
    private TextView mFactTextView;
    private Button mShowFactButton;
    private View mRelativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app);


        //Assign the view from the layout file to the corresponding variables
        mFactTextView = (TextView) findViewById(R.id.factTextView);
        mShowFactButton = (Button) findViewById(R.id.showFactbutton);
        mRelativeLayout = findViewById(R.id.relativeLayout);

        View.OnClickListener listener = new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                String fact = mFactBook.getFact();
                int color = mColorWheel.getColor();
                //update the screen with a dynamic fact
                mFactTextView.setText(fact);
                mRelativeLayout.setBackgroundColor(color);
                mShowFactButton.setTextColor(color);
            }
        };
        mShowFactButton.setOnClickListener(listener);
        Toast.makeText(AppActivity.this,"Yeah! App has succesfully launched",Toast.LENGTH_LONG).show();
//        Log.d("AppActivity","We are logging from the onCreate() method");
    }
}
