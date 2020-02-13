package com.example.recyclerview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import java.util.ArrayList;
import java.util.Arrays;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class QuestionsActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
//
//    private ArrayList<String> mPerguntas = new ArrayList<>();
//    private ArrayList<String> mOpcoes = new ArrayList<>();
//    private ArrayList<String> mRespostas = new ArrayList<>();
//    private RequestQueue mQueue;


    TextView tv;
    Button submitbutton, quitbutton;
    RadioGroup radio_g;
    RadioButton rb1,rb2,rb3,rb4;

//    private void jsonParse(){
//        String url = "http://192.168.1.66:3000/perguntas";
//        Log.d(TAG, "xx");
//        JsonObjectRequest request = new JsonObjectRequest(Request.Method.GET, url, null,
//                new Response.Listener<JSONObject>() {
//                    @Override
//                    public void onResponse(JSONObject response) {
//                        Log.d(TAG, "aa");
//                        try {
//                            JSONArray jsonArray = response.getJSONArray("perguntas");
//                            Log.d(TAG, "bb");
//                            for (int i = 0; i < jsonArray.length(); i++) {
//                                Log.d(TAG, "cc");
//                                JSONObject question = jsonArray.getJSONObject(i);
//
//                                String pergunta = question.getString("pergunta");
//                                String opcoes = question.getString("opcoes");
//                                String resposta = question.getString("resposta");
//
//                                mPerguntas.add(pergunta);
//                                mOpcoes.add(opcoes);
//                                mRespostas.add(resposta);
//                            }
//
//                        } catch (JSONException e) {
//                            Log.d(TAG, "dd");
//                            e.printStackTrace();
//                        }
//                    }
//                }, new Response.ErrorListener() {
//            @Override
//            public void onErrorResponse(VolleyError error) {
//                error.printStackTrace();
//            }
//        });
//        mQueue.add(request);
//    }



    int flag=0;
    public static int marks=0,correct=0,wrong=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);

//        mQueue = Volley.newRequestQueue(this);
//
//        jsonParse();

        final TextView score = (TextView)findViewById(R.id.textView4);
//        TextView textView=(TextView)findViewById(R.id.DispName);
        Intent intent = getIntent();
//        String name = intent.getStringExtra("myname");
        final String[] questions =  intent.getStringArrayExtra("questions");
        final String[] opt =  intent.getStringArrayExtra("opt");
        final String[] answers =  intent.getStringArrayExtra("answers");
//        Log.d(TAG, ""+ Arrays.toString(boda));

//        if (name.trim().equals(""))
//            textView.setText("Olá Jogador");
//        else
//        textView.setText("Olá " + name);

        submitbutton=(Button)findViewById(R.id.button3);
        quitbutton=(Button)findViewById(R.id.buttonquit);
        tv=(TextView) findViewById(R.id.tvque);

        radio_g=(RadioGroup)findViewById(R.id.answersgrp);
        rb1=(RadioButton)findViewById(R.id.radioButton);
        rb2=(RadioButton)findViewById(R.id.radioButton2);
        rb3=(RadioButton)findViewById(R.id.radioButton3);
        rb4=(RadioButton)findViewById(R.id.radioButton4);
        tv.setText(questions[flag]);
        rb1.setText(opt[0]);
        rb2.setText(opt[1]);
        rb3.setText(opt[2]);
        rb4.setText(opt[3]);
        submitbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //int color = mBackgroundColor.getColor();
                //mLayout.setBackgroundColor(color);

                if(radio_g.getCheckedRadioButtonId()==-1)
                {
                    Toast.makeText(getApplicationContext(), "Escolha uma Hipotese", Toast.LENGTH_SHORT).show();
                    return;
                }
                RadioButton uans = (RadioButton) findViewById(radio_g.getCheckedRadioButtonId());
                String ansText = uans.getText().toString();
//                Toast.makeText(getApplicationContext(), ansText, Toast.LENGTH_SHORT).show();
                if(ansText.equals(answers[flag])) {
                    correct++;
                    Toast.makeText(getApplicationContext(), "Correto", Toast.LENGTH_SHORT).show();
                }
                else {
                    wrong++;
                    Toast.makeText(getApplicationContext(), "Errado", Toast.LENGTH_SHORT).show();
                }

                flag++;

                if (score != null)
                    score.setText(""+correct);

                if(flag<questions.length)
                {
                    tv.setText(questions[flag]);
                    rb1.setText(opt[flag*4]);
                    rb2.setText(opt[flag*4 +1]);
                    rb3.setText(opt[flag*4 +2]);
                    rb4.setText(opt[flag*4 +3]);
                }
                else
                {
                    marks=correct;
                    Intent in = new Intent(getApplicationContext(),ResultActivity.class);
                    startActivity(in);
                }
                radio_g.clearCheck();
            }
        });

        quitbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),ResultActivity.class);
                startActivity(intent);
            }
        });
    }

}