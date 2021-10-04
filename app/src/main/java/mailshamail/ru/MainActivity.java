package mailshamail.ru;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import mailshamail.ru.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {


    static {
        System.loadLibrary("ru");
    }

    private ActivityMainBinding binding;

    public native String getSerial();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Button getSerial = binding.button;
        Button getPackages = binding.button2;

        TextView tv = binding.sampleText;
        //tv.setText(stringFromJNI());

        getSerial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText(Build.SERIAL);
            }
        });

        getPackages.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }


    public native String stringFromJNI();

}