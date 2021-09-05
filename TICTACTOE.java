package com.example.koushik.myapps_escanor;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class TICTACTOE extends AppCompatActivity implements View.OnClickListener {
    int chance = 0,i=0,j=0,k=0;
    TextView tv, tv1;
    Button bu1, bu2, bu3, bu4, bu5, bu6, bu7, bu8, bue,resk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tictactoe);
        tv = findViewById(R.id.textView17);
        tv1 = findViewById(R.id.textView18);
        bu1 = findViewById(R.id.bu8);
        bu2 = findViewById(R.id.bu9);
        bu3 = findViewById(R.id.bu10);
        bu4 = findViewById(R.id.bu11);
        bu5 = findViewById(R.id.bu12);
        bu6 = findViewById(R.id.bu13);
        bu7 = findViewById(R.id.bu14);
        bu8 = findViewById(R.id.bu15);
        bue = findViewById(R.id.bu16);
        resk = findViewById(R.id.bui);


        bu1.setOnClickListener(this);
        bu2.setOnClickListener(this);
        bu3.setOnClickListener(this);
        bu4.setOnClickListener(this);
        bu5.setOnClickListener(this);
        bu6.setOnClickListener(this);
        bu7.setOnClickListener(this);
        bu8.setOnClickListener(this);
        bue.setOnClickListener(this);
        resk.setOnClickListener(this);


    }

    @SuppressLint("NewApi")
    @Override
    public void onClick(View v) {




        switch (v.getId()) {
            case R.id.bu8:
                if (bu1.getText().toString().equals("")) {
                    if (chance == 0) {
                        chance = 1;
                        bu1.setText("O");
                        k++;
                        result();
                    } else {
                        chance = 0;
                        bu1.setText("X");
                        k++;
                        result();
                    }
                }
                break;
            case R.id.bu9:
                if (bu2.getText().toString().equals("")) {
                    if (chance == 0) {
                        chance = 1;
                        bu2.setText("O");
                        k++;
                        result();
                    } else {
                        chance = 0;
                        bu2.setText("X");
                        k++;
                        result();
                    }
                }
                break;
            case R.id.bu10:
                if (bu3.getText().toString().equals("")) {
                    if (chance == 0) {
                        chance = 1;
                        bu3.setText("O");
                        k++;
                        result();
                    } else {
                        chance = 0;
                        bu3.setText("X");
                        k++;
                        result();
                    }
                }
                break;
            case R.id.bu11:
                if (bu4.getText().toString().equals("")) {
                    if (chance == 0) {
                        chance = 1;
                        bu4.setText("O");
                        k++;
                        result();
                    } else {
                        chance = 0;
                        bu4.setText("X");
                        k++;
                        result();
                    }
                }
                break;
            case R.id.bu12:
                if (bu5.getText().toString().equals("")) {
                    if (chance == 0) {
                        chance = 1;
                        bu5.setText("O");
                        k++;
                        result();
                    } else {
                        chance = 0;
                        bu5.setText("X");
                        k++;
                        result();
                    }
                }
                break;
            case R.id.bu13:
                if (bu6.getText().toString().equals("")) {
                    if (chance == 0) {
                        chance = 1;
                        bu6.setText("O");
                        k++;
                        result();
                    } else {
                        chance = 0;
                        bu6.setText("X");
                        k++;
                        result();
                    }
                }
                break;
            case R.id.bu14:
                if (bu7.getText().toString().equals("")) {
                    if (chance == 0) {
                        chance = 1;
                        bu7.setText("O");
                        k++;
                        result();
                    } else {
                        chance = 0;
                        bu7.setText("X");
                        k++;
                        result();
                    }
                }
                break;
            case R.id.bu15:
                if (bu8.getText().toString().equals("")) {
                    if (chance == 0) {

                        chance = 1;
                        bu8.setText("O");
                        k++;
                        result();
                    } else {
                        chance = 0;
                        bu8.setText("X");
                        k++;
                        result();
                    }
                }
                break;
            case R.id.bu16:
                if (bue.getText().toString().equals("")) {
                    if (chance == 0) {
                        chance = 1;
                        bue.setText("O");
                        k++;
                        result();
                    } else {
                        chance = 0;
                        bue.setText("X");
                        k++;
                        result();
                    }
                }
                break;

            case R.id.bui:

                if(bu1.getText().toString().equals("X") || bu1.getText().toString().equals("O"))
                {
                    bu1.setText("");
                    bu1.setBackgroundColor(Color.GRAY);
                }
                else
                {
                    bu1.setBackgroundColor(Color.GRAY);
                }

                if(bu2.getText().toString().equals("X") || bu2.getText().toString().equals("O"))
                {
                    bu2.setText("");
                    bu2.setBackgroundColor(Color.GRAY);
                }
                else
                {
                    bu2.setBackgroundColor(Color.GRAY);
                }

                if(bu3.getText().toString().equals("X") || bu3.getText().toString().equals("O"))
                {
                    bu3.setText("");
                    bu3.setBackgroundColor(Color.GRAY);
                }
                else {
                    bu3.setBackgroundColor(Color.GRAY);
                }

                if(bu4.getText().toString().equals("X") || bu4.getText().toString().equals("O"))
                {
                    bu4.setText("");
                    bu4.setBackgroundColor(Color.GRAY);
                }
                else
                {
                    bu4.setBackgroundColor(Color.GRAY);
                }

                if(bu5.getText().toString().equals("X") || bu5.getText().toString().equals("O"))
                {
                    bu5.setText("");
                    bu5.setBackgroundColor(Color.GRAY);
                }
                else
                {
                    bu5.setBackgroundColor(Color.GRAY);
                }

                if(bu6.getText().toString().equals("X") || bu6.getText().toString().equals("O"))
                {
                    bu6.setText("");
                    bu6.setBackgroundColor(Color.GRAY);
                }
                else
                {
                    bu6.setBackgroundColor(Color.GRAY);
                }

                if(bu7.getText().toString().equals("X") || bu7.getText().toString().equals("O"))
                {
                    bu7.setText("");
                    bu7.setBackgroundColor(Color.GRAY);
                }
                else
                {
                    bu7.setBackgroundColor(Color.GRAY);
                }

                if(bu8.getText().toString().equals("X") || bu8.getText().toString().equals("O"))
                {
                    bu8.setText("");
                    bu8.setBackgroundColor(Color.GRAY);
                }
                else {
                    bu8.setBackgroundColor(Color.GRAY);
                }

                if(bue.getText().toString().equals("X") || bue.getText().toString().equals("O"))
                {
                    bue.setText("");
                    bue.setBackgroundColor(Color.GRAY);
                }
                else
                {
                    bue.setBackgroundColor(Color.GRAY);
                }

                break;

        }
    }

    public void result() {
        if (bu1.getText().toString().equals("X") && bu2.getText().toString().equals("X") && bu3.getText().toString().equals("X")) {
            Toast.makeText(this, "PLAYER X WINS", Toast.LENGTH_LONG).show();
            j++;
            tv1.setText("PLAYER 'X':"+Integer.toString(j));
            resk.callOnClick();
            bu1.setBackgroundColor(Color.GREEN);
            bu2.setBackgroundColor(Color.GREEN);
            bu3.setBackgroundColor(Color.GREEN);

        } else if (bu4.getText().toString().equals("X") && bu5.getText().toString().equals("X") && bu6.getText().toString().equals("X")) {
            Toast.makeText(this, "PLAYER X WINS", Toast.LENGTH_LONG).show();
            j++;
            tv1.setText("PLAYER 'X':"+Integer.toString(j));
            resk.callOnClick();
            bu4.setBackgroundColor(Color.GREEN);
            bu5.setBackgroundColor(Color.GREEN);
            bu6.setBackgroundColor(Color.GREEN);


        } else if (bu7.getText().toString().equals("X") && bu8.getText().toString().equals("X") && bue.getText().toString().equals("X")) {
            Toast.makeText(this, "PLAYER X WINS", Toast.LENGTH_LONG).show();
            j++;
            tv1.setText("PLAYER 'X':"+Integer.toString(j));
            resk.callOnClick();
            bu7.setBackgroundColor(Color.GREEN);
            bu8.setBackgroundColor(Color.GREEN);
            bue.setBackgroundColor(Color.GREEN);
        } else if (bu1.getText().toString().equals("X") && bu4.getText().toString().equals("X") && bu7.getText().toString().equals("X")) {
            Toast.makeText(this, "PLAYER X WINS", Toast.LENGTH_LONG).show();
            j++;
            tv1.setText("PLAYER 'X':"+Integer.toString(j));
            resk.callOnClick();
            bu1.setBackgroundColor(Color.GREEN);
            bu4.setBackgroundColor(Color.GREEN);
            bu7.setBackgroundColor(Color.GREEN);

        } else if (bu5.getText().toString().equals("X") && bu2.getText().toString().equals("X") && bu8.getText().toString().equals("X")) {
            Toast.makeText(this, "PLAYER X WINS", Toast.LENGTH_LONG).show();
            j++;
            tv1.setText("PLAYER 'X':"+Integer.toString(j));
            resk.callOnClick();
            bu5.setBackgroundColor(Color.GREEN);
            bu2.setBackgroundColor(Color.GREEN);
            bu8.setBackgroundColor(Color.GREEN);

        } else if (bu3.getText().toString().equals("X") && bu6.getText().toString().equals("X") && bue.getText().toString().equals("X")) {
            Toast.makeText(this, "PLAYER X WINS", Toast.LENGTH_LONG).show();
            j++;
            tv1.setText("PLAYER 'X':"+Integer.toString(j));
            resk.callOnClick();
            bu3.setBackgroundColor(Color.GREEN);
            bu6.setBackgroundColor(Color.GREEN);
            bue.setBackgroundColor(Color.GREEN);

        } else if (bu7.getText().toString().equals("X") && bu5.getText().toString().equals("X") && bu3.getText().toString().equals("X")) {
            Toast.makeText(this, "PLAYER X WINS", Toast.LENGTH_LONG).show();
            j++;
            tv1.setText("PLAYER 'X':"+Integer.toString(j));
            resk.callOnClick();
            bu7.setBackgroundColor(Color.GREEN);
            bu5.setBackgroundColor(Color.GREEN);
            bu3.setBackgroundColor(Color.GREEN);

        } else if (bu1.getText().toString().equals("X") && bu5.getText().toString().equals("X") && bue.getText().toString().equals("X")) {
            Toast.makeText(this, "PLAYER X WINS", Toast.LENGTH_LONG).show();
            j++;
            tv1.setText("PLAYER 'X':"+Integer.toString(j));
            resk.callOnClick();
            bu1.setBackgroundColor(Color.GREEN);
            bue.setBackgroundColor(Color.GREEN);
            bu5.setBackgroundColor(Color.GREEN);

        } else if (bu1.getText().toString().equals("O") && bu2.getText().toString().equals("O") && bu3.getText().toString().equals("O")) {
            Toast.makeText(this, "PLAYER O WINS", Toast.LENGTH_LONG).show();
            i++;
            tv.setText("PLAYER 'O':"+Integer.toString(i));
            resk.callOnClick();
            bu1.setBackgroundColor(Color.GREEN);
            bu2.setBackgroundColor(Color.GREEN);
            bu3.setBackgroundColor(Color.GREEN);
        } else if (bu4.getText().toString().equals("O") && bu5.getText().toString().equals("O") && bu6.getText().toString().equals("O")) {
            Toast.makeText(this, "PLAYER O WINS", Toast.LENGTH_LONG).show();
            i++;
            tv.setText("PLAYER 'O':"+Integer.toString(i));
            resk.callOnClick();
            bu4.setBackgroundColor(Color.GREEN);
            bu5.setBackgroundColor(Color.GREEN);
            bu6.setBackgroundColor(Color.GREEN);

        } else if (bu7.getText().toString().equals("O") && bu8.getText().toString().equals("O") && bue.getText().toString().equals("O")) {
            Toast.makeText(this, "PLAYER O WINS", Toast.LENGTH_LONG).show();
            i++;
            tv.setText("PLAYER 'O':"+Integer.toString(i));
            resk.callOnClick();
            bu7.setBackgroundColor(Color.GREEN);
            bu8.setBackgroundColor(Color.GREEN);
            bue.setBackgroundColor(Color.GREEN);

        } else if (bu1.getText().toString().equals("O") && bu4.getText().toString().equals("O") && bu7.getText().toString().equals("O")) {
            Toast.makeText(this, "PLAYER O WINS", Toast.LENGTH_LONG).show();
            i++;
            tv.setText("PLAYER 'O':"+Integer.toString(i));
            resk.callOnClick();
            bu1.setBackgroundColor(Color.GREEN);
            bu4.setBackgroundColor(Color.GREEN);
            bu7.setBackgroundColor(Color.GREEN);


        } else if (bu5.getText().toString().equals("O") && bu2.getText().toString().equals("O") && bu8.getText().toString().equals("O")) {
            Toast.makeText(this, "PLAYER O WINS", Toast.LENGTH_LONG).show();
            i++;
            tv.setText("PLAYER 'O':"+Integer.toString(i));
            resk.callOnClick();
            bu5.setBackgroundColor(Color.GREEN);
            bu2.setBackgroundColor(Color.GREEN);
            bu8.setBackgroundColor(Color.GREEN);





        } else if (bu3.getText().toString().equals("O") && bu6.getText().toString().equals("O") && bue.getText().toString().equals("O")) {
            Toast.makeText(this, "PLAYER O WINS", Toast.LENGTH_LONG).show();
            i++;
            tv.setText("PLAYER 'O':"+Integer.toString(i));
            resk.callOnClick();
            bu3.setBackgroundColor(Color.GREEN);
            bu6.setBackgroundColor(Color.GREEN);
            bue.setBackgroundColor(Color.GREEN);


        } else if (bu7.getText().toString().equals("O") && bu5.getText().toString().equals("O") && bu3.getText().toString().equals("O")) {
            Toast.makeText(this, "PLAYER O WINS", Toast.LENGTH_LONG).show();
            i++;
            tv.setText("PLAYER 'O':"+Integer.toString(i));
            resk.callOnClick();

            bu7.setBackgroundColor(Color.GREEN);
            bu5.setBackgroundColor(Color.GREEN);
            bu3.setBackgroundColor(Color.GREEN);

        } else if (bu1.getText().toString().equals("O") && bu5.getText().toString().equals("O") && bue.getText().toString().equals("O")) {
            Toast.makeText(this, "PLAYER O WINS", Toast.LENGTH_LONG).show();
            i++;
            tv.setText("PLAYER 'O':" + Integer.toString(i));
            resk.callOnClick();
            bu1.setBackgroundColor(Color.GREEN);
            bu5.setBackgroundColor(Color.GREEN);
            bue.setBackgroundColor(Color.GREEN);
        }
             else if((bu1.getText().toString().equals("X") || bu1.getText().toString().equals("O")) && (bu2.getText().toString().equals("X") || bu2.getText().toString().equals("O"))
                              && (bu3.getText().toString().equals("X") || bu3.getText().toString().equals("O")) && (bu4.getText().toString().equals("X") || bu4.getText().toString().equals("O")) && (bu5.getText().toString().equals("X") || bu5.getText().toString().equals("O")) &&
                                        (bu6.getText().toString().equals("X") || bu6.getText().toString().equals("O")) && (bu7.getText().toString().equals("X") || bu7.getText().toString().equals("O")) &&
                (bu8.getText().toString().equals("X") || bu8.getText().toString().equals("O")) && (bue.getText().toString().equals("X") || bue.getText().toString().equals("O")))
        {
            bu1.setBackgroundColor(Color.RED);
            bu2.setBackgroundColor(Color.RED);
            bu3.setBackgroundColor(Color.RED);
            bu4.setBackgroundColor(Color.RED);
            bu5.setBackgroundColor(Color.RED);
            bu6.setBackgroundColor(Color.RED);
            bu7.setBackgroundColor(Color.RED);
            bu8.setBackgroundColor(Color.RED);
            bue.setBackgroundColor(Color.RED);
            Toast.makeText(this, "NO ONE WINS! A DRAW!!", Toast.LENGTH_LONG).show();

        }



        }
    }


