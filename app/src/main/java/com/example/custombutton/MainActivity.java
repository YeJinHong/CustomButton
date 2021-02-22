package com.example.custombutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

/** p.132 예제 : 커스텀 버튼 **/
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClick(View target){
        Toast.makeText(getApplicationContext(), "Beep Bop",
                Toast.LENGTH_SHORT).show();
    }
}