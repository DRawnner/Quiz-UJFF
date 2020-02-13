package com.example.recyclerview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.QuickContactBadge;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ResultActivity extends AppCompatActivity {
    TextView tv, tv2, tv3;
    Button btnRestart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        tv = (TextView)findViewById(R.id.tvres);
        tv2 = (TextView)findViewById(R.id.tvres2);
        tv3 = (TextView)findViewById(R.id.tvres3);
        btnRestart = (Button) findViewById(R.id.btnRestart);

//        StringBuffer sb = new StringBuffer();
//        sb.append("Respostas Corretas: " + QuestionsActivity.correct + "\n");
        StringBuffer sb2 = new StringBuffer();
        if (QuestionsActivity.correct < 5)
            sb2.append("Péssimo. \n Sabes muito pouco acerca da tua freguesia.\n");
        else if (QuestionsActivity.correct >= 5 && QuestionsActivity.correct <=9)
            sb2.append("Mau. \n Tens ainda um conhecimento diminuto sobre a tua freguesia. \n Procura saber mais!\n");
        else if (QuestionsActivity.correct >= 10 && QuestionsActivity.correct <=12)
            sb2.append("Razoável. \n O teu conhecimento sobre a tua freguesia é satisfatório, mas desafiamos-te a aprofundar o teu conhecimento sobre a mesma. \n Afinal de contas o saber não ocupa lugar.\n");
        else if (QuestionsActivity.correct >= 13 && QuestionsActivity.correct <=15)
            sb2.append("Bom. Estás de parabéns! \n Tens já um bom conhecimento sobre a tua freguesia.\n");
        else if (QuestionsActivity.correct >= 16)
            sb2.append("Excelente. Parabéns! \n O teu conhecimento sobre a tua freguesia é excepcional!\n");
        StringBuffer sb3 = new StringBuffer();
        sb3.append("Resultado Final: " + QuestionsActivity.correct + "\n");
//        tv.setText(sb);
        tv2.setText(sb2);
        tv3.setText(sb3);

        QuestionsActivity.correct=0;
        QuestionsActivity.wrong=0;

        btnRestart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(in);
            }
        });
    }

}
