package uz.digitalgeneration.courses.ui;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Random;

import uz.digitalgeneration.courses.R;
import uz.digitalgeneration.courses.adapter.CourseAdapter;
import uz.digitalgeneration.courses.model.Course;

public class MainActivity extends AppCompatActivity {

    private static final int START_PROGRESS = 0;
    private static final int FINISH_PROGRESS = 6;

    private RecyclerView coursesRecycler;
    private CourseAdapter courseAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        coursesRecycler = findViewById(R.id.dg_camp_courses_recycler);

        coursesRecycler.setHasFixedSize(true);

        ArrayList<Course> courses = new ArrayList();

        Random random = new Random();

        courses.add(new Course(getString(R.string.course_title_mobile), R.drawable.mobile, R.drawable.mentor_mobile, random.nextInt(FINISH_PROGRESS-START_PROGRESS), getString(R.string.description_mobile)));
        courses.add(new Course(getString(R.string.course_title_desktop), R.drawable.desktop, R.drawable.mentor_desktop, random.nextInt(FINISH_PROGRESS-START_PROGRESS), getString(R.string.description_desktop)));
        courses.add(new Course(getString(R.string.course_title_arduino), R.drawable.arduino, R.drawable.mentor_arduino, random.nextInt(FINISH_PROGRESS-START_PROGRESS), getString(R.string.description_arduino)));
        courses.add(new Course(getString(R.string.course_title_design), R.drawable.design, R.drawable.mentor_design, random.nextInt(FINISH_PROGRESS-START_PROGRESS), getString(R.string.description_design)));
        courses.add(new Course(getString(R.string.course_title_digital_marketing), R.drawable.digitalmarketing, R.drawable.mentor_digitalmarketing, random.nextInt(FINISH_PROGRESS-START_PROGRESS), getString(R.string.description_digital_marketing)));
        courses.add(new Course(getString(R.string.course_title_web), R.drawable.web, R.drawable.mentor_web, random.nextInt(FINISH_PROGRESS-START_PROGRESS), getString(R.string.description_web)));

        courseAdapter = new CourseAdapter(courses);
        coursesRecycler.setAdapter(courseAdapter);

    }
}