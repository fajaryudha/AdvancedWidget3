package id.sch.smktelkom_mlg.xirpl3011.advancedwidget3;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import id.sch.smktelkom_mlg.xirpl3011.advancedwidget3.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    String nama;
    ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setNama(nama);

    }
}
