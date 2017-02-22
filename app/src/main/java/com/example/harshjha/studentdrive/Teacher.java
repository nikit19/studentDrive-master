package com.example.harshjha.studentdrive;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;

public class Teacher extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher);
        String[] foods={" Teacher Name"," Teacher Name"," Teacher Name",
                " Teacher Name"," Teacher Name"," Teacher Name"," Teacher Name"," Teacher Name"," Teacher Name"
                ," Teacher Name"," Teacher Name"," Teacher Name"," Teacher Name"
        };
        ListAdapter teacherAdapter= new TeacherAdapter(this,foods);
        ListView l=(ListView)findViewById(R.id.listView);
        l.setAdapter(teacherAdapter);
        
    }
}
