package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:

    Button mButtonTop;
    Button mButtonBottom;
    TextView mStoryTextView;
    int mStoryIndex = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:

        mButtonTop = (Button) findViewById(R.id.buttonTop);
        mButtonBottom = (Button) findViewById(R.id.buttonBottom);
        mStoryTextView = (TextView) findViewById(R.id.storyTextView);




        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:

        mButtonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    mStoryTextView.setText(R.string.T3_Story);
                    mStoryTextView.setText(R.string.T3_Ans1);
                    mStoryTextView.setText(R.string.T3_Ans2);
                    mStoryIndex = 3;



                if (mStoryIndex == 3) {
                    mStoryTextView.setText(R.string.T6_End);
                }

                else if (mStoryIndex == 2) {
                    mStoryTextView.setText (R.string.T3_Story);
                    mStoryTextView.setText(R.string.T3_Ans1);
                    mStoryTextView.setText(R.string.T3_Ans2);
                    mStoryIndex =3;
                }

            }
        });





        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:

        mButtonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    mStoryTextView.setText(R.string.T2_Story);
                    mStoryTextView.setText(R.string.T2_Ans1);
                    mStoryTextView.setText(R.string.T2_Ans2);
                    mStoryIndex = 2;


                 if (mStoryIndex ==2) {
                    mStoryTextView.setText(R.string.T4_End);
                }

                else if (mStoryIndex == 3) {
                    mStoryTextView.setText(R.string.T5_End);
                }

            }
        });


    }
}
