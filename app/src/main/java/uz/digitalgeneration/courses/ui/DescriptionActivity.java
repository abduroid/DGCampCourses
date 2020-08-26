package uz.digitalgeneration.courses.ui;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import uz.digitalgeneration.courses.R;

public class DescriptionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);

        String desc = getIntent().getStringExtra(getString(R.string.key_intent_extra_description));
        int courseImageResId = getIntent().getIntExtra(getString(R.string.key_intent_extra_course_image_res_id), 0);

        ImageView courseImage = findViewById(R.id.description_image);
        TextView descriptionText = findViewById(R.id.description_text);

        descriptionText.setText(desc);
        courseImage.setImageResource(courseImageResId);
    }
}
