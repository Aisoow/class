package com.example.myapp.bmi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    // Button元件的事件處理方法
    public void button_Click(View view) {
        EditText edtHeight = (EditText) findViewById(R.id.edtHeight);
        EditText edtWeight = (EditText) findViewById(R.id.edtWeight);
        String h = edtHeight.getText().toString();
        String w = edtWeight.getText().toString();
        // 取得輸入的身高和體重
        double height = Double.parseDouble(h)/100.0;
        double weight = Double.parseDouble(w);
        // 計算BMI值
        double BMI = weight / (height * height);
        // 顯示BMI值
        TextView txtResult = (TextView) findViewById(R.id.txtResult);
        txtResult.setText("BMI值=" + BMI);
    }
}
