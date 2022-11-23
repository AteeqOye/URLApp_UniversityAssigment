package com.example.intentassigment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private Button searchBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);

        editText = findViewById (R.id.url_et);
        searchBtn = findViewById (R.id.search_btn);
        searchingUrl ();
    }
    public void searchingUrl()
    {
        searchBtn.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                String url = editText.getText ().toString ();
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://"+url));
                startActivity(intent);
                Toast.makeText (MainActivity.this, "Searching...!", Toast.LENGTH_SHORT).show ();
            }
        });
    }
}