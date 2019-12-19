package com.test.lmsact3_01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity
{
    public final static String PAGE_TITLE = "Academic Program";
    public final static String HINT1 = "Last Name";
    public final static String HINT2 = "First Name";
    public final static String HINT3 = "Middle Name";
    public final static String GENDER_TITLE = "Gender";
    public final static String GENDER_OPTION1 = "Male";
    public final static String GENDER_OPTION2 = "Female";
    public final static String REQUIREMENTS_TITLE = "Requirements";
    public final static String REQUIRMENT1 = "Original Report Card (Form 138)";
    public final static String REQUIRMENT2 = "NSO copy of Birth Certificate";
    public final static String REQUIRMENT3 = "Certificate of Good Moral Character";
    public final static String REQUIRMENT4 = "Certification of Junior High School Completion";
    public final static String BUTTON_TEXT = "SUBMIT";
    public final static String NULL = "";


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
