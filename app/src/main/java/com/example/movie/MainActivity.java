package com.example.movie;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText ed1,ed2,ed3,ed4,ed5;
    Button btn;
    String getMovieName,getActor,getActress,getDirector,getCamera;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1=(EditText)findViewById(R.id.mn);
        ed2=(EditText)findViewById(R.id.actor);
        ed3=(EditText)findViewById(R.id.actress);
        ed4=(EditText)findViewById(R.id.dirc);
        ed5=(EditText)findViewById(R.id.cam);
        btn=(Button)findViewById(R.id.but);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                getMovieName=ed1.getText().toString();
                getActor=ed2.getText().toString();
                getActress=ed3.getText().toString();
                getDirector=ed4.getText().toString();
                getCamera=ed5.getText().toString();
                Toast.makeText(getApplicationContext(),getMovieName + "" + getActor + "" + getActress + "" +
                        "" + getDirector+ " "+ getCamera,Toast.LENGTH_SHORT).show();



            }
        });
    }
}
