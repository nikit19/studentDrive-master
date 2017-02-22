package com.example.harshjha.studentdrive;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by nikit on 22/2/17.
 */

public class TeacherAdapter extends ArrayAdapter<String> {

    TeacherAdapter(Context context, String[] foods) {
        super(context, R.layout.teacher_row, foods);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater teacherInflater = LayoutInflater.from(getContext());
        View customView = teacherInflater.inflate(R.layout.teacher_row, parent, false);
        String singleItem = getItem(position);
        TextView t = (TextView) customView.findViewById(R.id.teacher);
        CheckBox checkBox = (CheckBox) customView.findViewById(R.id.teacher_checkbox);
        t.setText(singleItem);


        return customView;
    }
}
