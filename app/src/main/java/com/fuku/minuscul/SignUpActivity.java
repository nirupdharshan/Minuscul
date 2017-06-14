package com.fuku.minuscul;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.fuku.minuscul.R;


public class SignUpActivity extends AppCompatActivity {

    LinearLayout bg_image;
    ImageView student_img,teacher_Img;
    TextView studentv,teacherv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        bg_image=(LinearLayout)findViewById(R.id.bglayout);
        student_img=(ImageView)findViewById(R.id.studentLayout);
        teacher_Img=(ImageView)findViewById(R.id.teacherLayout);
        studentv=(TextView)findViewById(R.id.student_textview);
        teacherv=(TextView)findViewById(R.id.teacher_textview);
        student_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                student_img.setImageResource(R.drawable.invert_student);
                teacher_Img.setImageResource(R.drawable.teacher);
                studentv.setTextColor(ContextCompat.getColor(getApplicationContext(),R.color.colorPrimary));
                teacherv.setTextColor(Color.WHITE);
            }
        });
        teacher_Img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                student_img.setImageResource(R.drawable.student);
                teacher_Img.setImageResource(R.drawable.invert_teacher);
                teacherv.setTextColor(ContextCompat.getColor(getApplicationContext(),R.color.colorPrimary));
                studentv.setTextColor(Color.WHITE);
            }
        });

    }
}