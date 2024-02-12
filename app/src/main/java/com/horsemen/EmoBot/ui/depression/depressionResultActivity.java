package com.horsemen.EmoBot.ui.depression;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.content.Intent;

import com.horsemen.EmoBot.R;
import com.horsemen.EmoBot.ui.ToDoList.Task;
import com.horsemen.EmoBot.ui.ToDoList.ToDoListActivity;
import com.horsemen.EmoBot.ui.home.MainActivity;

import java.text.SimpleDateFormat;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

public class depressionResultActivity extends MainActivity {

    private TextView mResult;
    private Button mRetry;
    private FirebaseFirestore db;
    private String uid;
    public final List<Task> incompletedList = new ArrayList<>();
    private ToDoListActivity.MyListAdapter mylistadapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        this.db = FirebaseFirestore.getInstance();
        this.uid = FirebaseAuth.getInstance().getCurrentUser().getUid();

        super.onCreate(savedInstanceState);
        FrameLayout contentFrameLayout = findViewById(R.id.frag_container);
        getLayoutInflater().inflate(R.layout.activity_depression_result, contentFrameLayout);
        String date = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date());
        String date1 = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date());
        String name = "String";
        mResult = (TextView) findViewById(R.id.results);
        mRetry = (Button) findViewById(R.id.redo);

        Bundle b = getIntent().getExtras();
        int points = b.getInt("points");

        if (points >= 0 && points <= 4){
            mResult.setText("The level of your depression is None to Minimal");
            name = "Talk to our Emobot";
            Task newTask = new Task(name, date.toString(), date1.toString());
            incompletedList.add(newTask);
            addTaskToDatabase(name.toString(), date.toString(), date1.toString(), newTask.getTaskId(), false);
        }
        if (points >= 5 && points <= 9){
            mResult.setText("The level of your depression is Mild");

            name = "Talk to our Emobot";
            Task newTask1 = new Task(name, date.toString(), date1.toString());
            incompletedList.add(newTask1);
            addTaskToDatabase(name.toString(), date.toString(), date1.toString(), newTask1.getTaskId(), false);
            name = "Do Exercise";
            Task newTask = new Task(name, date.toString(), date1.toString());
            incompletedList.add(newTask);
            addTaskToDatabase(name.toString(), date.toString(), date1.toString(), newTask.getTaskId(), false);
            name = "Listen to Ambient Music";
            Task newTask2 = new Task(name, date.toString(), date1.toString());
            incompletedList.add(newTask);
            addTaskToDatabase(name.toString(), date.toString(), date1.toString(), newTask2.getTaskId(), false);
        }
        if (points >= 10 && points <= 14){
            mResult.setText("The level of your depression is Moderate");

            name = "Talk to our Emobot";
            Task newTask1 = new Task(name, date.toString(), date1.toString());
            incompletedList.add(newTask1);
            addTaskToDatabase(name.toString(), date.toString(), date1.toString(), newTask1.getTaskId(), false);
            name = "Do Exercise";
            Task newTask = new Task(name, date.toString(), date1.toString());
            incompletedList.add(newTask);
            addTaskToDatabase(name.toString(), date.toString(), date1.toString(), newTask.getTaskId(), false);
            name = "Listen to Ambient Music";
            Task newTask2 = new Task(name, date.toString(), date1.toString());
            incompletedList.add(newTask);
            addTaskToDatabase(name.toString(), date.toString(), date1.toString(), newTask2.getTaskId(), false);
            name = "Do a 5 Seconds Breathing Exercise";
            Task newTask3 = new Task(name, date.toString(), date1.toString());
            incompletedList.add(newTask);
            addTaskToDatabase(name.toString(), date.toString(), date1.toString(), newTask3.getTaskId(), false);
        }
        if (points >= 15 && points <= 19){
            mResult.setText("The level of your depression is Moderately severe");

            name = "Talk to our Emobot";
            Task newTask1 = new Task(name, date.toString(), date1.toString());
            incompletedList.add(newTask1);
            addTaskToDatabase(name.toString(), date.toString(), date1.toString(), newTask1.getTaskId(), false);
            name = "Do Exercise";
            Task newTask = new Task(name, date.toString(), date1.toString());
            incompletedList.add(newTask);
            addTaskToDatabase(name.toString(), date.toString(), date1.toString(), newTask.getTaskId(), false);
            name = "Take a Walk/ ride a Bike";
            Task newTask4 = new Task(name, date.toString(), date1.toString());
            incompletedList.add(newTask);
            addTaskToDatabase(name.toString(), date.toString(), date1.toString(), newTask4.getTaskId(), false);
            name = "Listen to Ambient Music";
            Task newTask2 = new Task(name, date.toString(), date1.toString());
            incompletedList.add(newTask);
            addTaskToDatabase(name.toString(), date.toString(), date1.toString(), newTask2.getTaskId(), false);
            name = "Do a 10 Seconds Breathing Exercise";
            Task newTask3 = new Task(name, date.toString(), date1.toString());
            incompletedList.add(newTask);
            addTaskToDatabase(name.toString(), date.toString(), date1.toString(), newTask3.getTaskId(), false);
        }
        if (points >= 20 && points <= 27){
            mResult.setText("The level of your depression is Severe");
            name = "Talk to our Emobot";
            Task newTask1 = new Task(name, date.toString(), date1.toString());
            incompletedList.add(newTask1);
            addTaskToDatabase(name.toString(), date.toString(), date1.toString(), newTask1.getTaskId(), false);
            name = "Do Exercise";
            Task newTask = new Task(name, date.toString(), date1.toString());
            incompletedList.add(newTask);
            addTaskToDatabase(name.toString(), date.toString(), date1.toString(), newTask.getTaskId(), false);
            name = "Take a Walk/ ride a Bike";
            Task newTask4 = new Task(name, date.toString(), date1.toString());
            incompletedList.add(newTask);
            addTaskToDatabase(name.toString(), date.toString(), date1.toString(), newTask4.getTaskId(), false);
            name = "Listen to Ambient Music";
            Task newTask2 = new Task(name, date.toString(), date1.toString());
            incompletedList.add(newTask);
            addTaskToDatabase(name.toString(), date.toString(), date1.toString(), newTask2.getTaskId(), false);
            name = "Do a 15 Seconds Breathing Exercise";
            Task newTask3 = new Task(name, date.toString(), date1.toString());
            incompletedList.add(newTask);
            addTaskToDatabase(name.toString(), date.toString(), date1.toString(), newTask3.getTaskId(), false);
            name = "Get a Professional Help";
            Task newTask5 = new Task(name, date.toString(), date1.toString());
            incompletedList.add(newTask);
            addTaskToDatabase(name.toString(), date.toString(), date1.toString(), newTask5.getTaskId(), false);
            name = "Seek Companion";
            Task newTask6 = new Task(name, date.toString(), date1.toString());
            incompletedList.add(newTask);
            addTaskToDatabase(name.toString(), date.toString(), date1.toString(), newTask6.getTaskId(), false);
        }

        mRetry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), ToDoListActivity.class);
                startActivity(i);
            }
        });
    }


    public void addTaskToDatabase(String taskName, String startDate, String finishDate, String taskId, boolean completed) {
        Map<String, Object> newTaskForUser = new HashMap<>();

        newTaskForUser.put("taskname", taskName);
        newTaskForUser.put("startDate", startDate);
        newTaskForUser.put("finishDate", finishDate);
        newTaskForUser.put("completed", completed);

        db.collection("users").document(uid).collection("taskLog").document(taskId).set(newTaskForUser);
    }


}
