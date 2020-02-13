package com.example.recyclerview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    //vars

    private ArrayList<String> mPerguntas = new ArrayList<>();
    private ArrayList<String> mOpcoes = new ArrayList<>();
    private ArrayList<String> mRespostas = new ArrayList<>();
    private RequestQueue mQueue;

    private void jsonParse(){
        String url = "http://192.168.1.66:3000/perguntas";
//        Log.d(TAG, "xx");
        JsonObjectRequest request = new JsonObjectRequest(Request.Method.GET, url, null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
//                        Log.d(TAG, "aa");
                        try {
                            JSONArray jsonArray = response.getJSONArray("perguntas");
//                            Log.d(TAG, "bb");
                            for (int i = 0; i < jsonArray.length(); i++) {
//                                Log.d(TAG, "cc");
                                JSONObject question = jsonArray.getJSONObject(i);

                                String pergunta = question.getString("pergunta");
                                String opcao1 = question.getString("opcao1");
                                String opcao2 = question.getString("opcao2");
                                String opcao3 = question.getString("opcao3");
                                String opcao4 = question.getString("opcao4");
                                String resposta = question.getString("resposta");

                                mPerguntas.add(pergunta);
                                mOpcoes.add(opcao1);
                                mOpcoes.add(opcao2);
                                mOpcoes.add(opcao3);
                                mOpcoes.add(opcao4);
                                mRespostas.add(resposta);
                            }
                            String[] questions = new String[ mPerguntas.size() ];
                            mPerguntas.toArray( questions );
                            String[] opt = new String[ mOpcoes.size() ];
                            mOpcoes.toArray( opt );
                            String[] answers = new String[ mRespostas.size() ];
                            mRespostas.toArray( answers );
//                            Log.d(TAG, ""+questions.length);
//                            Log.d(TAG, ""+mPerguntas);
                            Intent intent=new Intent(getApplicationContext(),QuestionsActivity.class);
                            intent.putExtra("questions", questions);
                            intent.putExtra("opt", opt);
                            intent.putExtra("answers", answers);
                            startActivity(intent);
                        } catch (JSONException e) {
//                            Log.d(TAG, "dd");
                            e.printStackTrace();
                        }
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                error.printStackTrace();
            }
        });
        mQueue.add(request);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mQueue = Volley.newRequestQueue(this);

        Button startbutton=(Button)findViewById(R.id.button);
//        final EditText nametext=(EditText)findViewById(R.id.editName);

                startbutton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
//                        String name=nametext.getText().toString();
//                        Intent intent=new Intent(getApplicationContext(),QuestionsActivity.class);
//                        intent.putExtra("myname",name);
//                        startActivity(intent);
                        jsonParse();
                    }
                });

    }

}
