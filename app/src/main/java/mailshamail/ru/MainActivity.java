package mailshamail.ru;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import mailshamail.ru.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {


    static {
        System.loadLibrary("ru");
    }

    private ActivityMainBinding binding;

    public native String getSerial(String text);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Button getSerial = binding.button;
        Button getPackages = binding.button2;

        TextView tv = binding.sampleText;

        getSerial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText("ID: " + getSerial(Settings.Secure.getString(getApplicationContext().getContentResolver(), Settings.Secure.ANDROID_ID)));
            }
        });

        getPackages.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }
}