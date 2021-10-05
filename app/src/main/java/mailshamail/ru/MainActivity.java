package mailshamail.ru;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

import mailshamail.ru.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {


    static {
        System.loadLibrary("ru");
    }

    private ActivityMainBinding binding;

    public native String getSerial(String text);
    public native List getPackage(List list);

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
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                PackageManager pm = getPackageManager();
                Package pack = new Package(pm);

                tv.setText(String.valueOf(getPackage(pack.getAllPackages())));

            }
        });
    }
}