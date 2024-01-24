package org.longvuong.sqlite;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private Button addbtn;
    private Button deletebtn;
    private EditText edtxoa;
    DatabaseHandler db = new DatabaseHandler(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        initGui();
        displayData();

    }
    private void initGui() {
        addbtn = findViewById(R.id.addbtn);
        deletebtn = findViewById(R.id.deletebtn);
        edtxoa = findViewById(R.id.edtxoa);

        addbtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                db.addStudent(new Student("4","f","d","h"));
                displayData();
            }
        });
        deletebtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String email = edtxoa.getText().toString();
                db.deleteStudent(email);
                displayData();
            }
        });
    }


    private void displayData() {
        DatabaseHandler db = new DatabaseHandler(this);
        List<Student> studentList = db.getAllStudents();
            StudentAdapter adapter = new StudentAdapter(this, studentList);
        recyclerView.setAdapter(adapter);
    }
}