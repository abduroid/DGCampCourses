package uz.digitalgeneration.courses.adapter;

import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import uz.digitalgeneration.courses.R;
import uz.digitalgeneration.courses.model.Course;
import uz.digitalgeneration.courses.ui.DescriptionActivity;
import uz.digitalgeneration.courses.ui.MainActivity;

public class CourseAdapter extends RecyclerView.Adapter<CourseAdapter.CourseViewHolder> {

    private ArrayList<Course> courses;
    
    @NonNull
    @Override
    public CourseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = (CardView) LayoutInflater.from(parent.getContext()).inflate(R.layout.item_course_card, parent, false);

        return new CourseViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final CourseViewHolder holder, int position) {

        final Course course = courses.get(position);

        holder.courseCoolImage.setImageResource(course.getCourseCoolImageResId());
        holder.courseMentorImage.setImageResource(course.getCourseMentorImageResId());
        holder.courseTitle.setText(course.getCourseTitle());
        holder.courseProgressBar.setProgress(course.getProgress());
        holder.courseProgressNumber.setText(courseProgressNumberFormatter(course.getProgress()));

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(v.getContext(), course.getCourseTitle() + " bosildi", Toast.LENGTH_SHORT).show();
                //TODO bosganda description Activtyga o'tkazish
                
                Intent intent = new Intent(v.getContext(), DescriptionActivity.class);
                intent.putExtra(v.getContext().getString(R.string.key_intent_extra_description), course.getCourseDescription());
                intent.putExtra(v.getContext().getString(R.string.key_intent_extra_course_image_res_id), course.getCourseCoolImageResId());
                v.getContext().startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return courses.size();
    }
    
    public CourseAdapter(ArrayList<Course> courses) {
        this.courses = courses;
    }

    public static class CourseViewHolder extends RecyclerView.ViewHolder {

        ImageView courseCoolImage;
        ImageView courseMentorImage;
        TextView courseTitle;
        ProgressBar courseProgressBar;
        TextView courseProgressNumber;

        public CourseViewHolder(View view) {
            super(view);

            courseCoolImage = view.findViewById(R.id.item_course_cool_image);
            courseMentorImage = view.findViewById(R.id.item_course_mentor_image);
            courseTitle = view.findViewById(R.id.item_course_title_text);
            courseProgressBar = view.findViewById(R.id.item_course_progress);
            courseProgressNumber = view.findViewById(R.id.item_course_progress_number);
        }

    }

    private String courseProgressNumberFormatter(Integer progressNumber) {

        return String.format("%d / 6", progressNumber);
    }

}
