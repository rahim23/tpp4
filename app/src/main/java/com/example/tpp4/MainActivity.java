package com.example.tpp4;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private Button[][] buttons = new Button[3][3];
    private int player1point;
    private int player2point;

    int pplayer =1 ;
    private TextView textplayer1;
    private TextView textplayer2;
    private TextView chplayer;
    private Button resset;
    private  boolean player =true ;
private int count ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttons[0][0] = (Button) findViewById(R.id.button);
        buttons[0][1] = (Button) findViewById(R.id.button2);
        buttons[0][2] = (Button) findViewById(R.id.button3);
        buttons[1][0] = (Button) findViewById(R.id.button4);
        buttons[1][1] = (Button) findViewById(R.id.button5);
        buttons[1][2] = (Button) findViewById(R.id.button6);
        buttons[2][0] = (Button) findViewById(R.id.button7);
        buttons[2][1] = (Button) findViewById(R.id.button8);
        buttons[2][2] = (Button) findViewById(R.id.button9);

        textplayer1 = (TextView) findViewById(R.id.textView2);
        textplayer2 = (TextView) findViewById(R.id.textView3);


        chplayer = (TextView) findViewById(R.id.textView);

        count=0 ;

    }


    public void click1(View v) {

        if (player )
        {
            buttons[0][0].setText("X");
                buttons[0][0].setTextColor(Color.parseColor("#FF0000"));
           //String  name = buttons[0][0].getText().toString();

            pplayer = 2;


        }

        else
        {
            buttons[0][0].setText("O");
              buttons[0][0].setTextColor(Color.parseColor("#0000FF"));

            pplayer = 1;
        }
        count++ ;
        chplayer.setText("playerTurn : "+pplayer);

        if(result())
        {
            if(player)
            {
                player1point++ ;
                Toast.makeText(this, "player 1 win", Toast.LENGTH_LONG).show();
                resetbord() ;
                textplayer1.setText("player 1:"+player1point);
            }
            else
            {
                player2point++ ;
                Toast.makeText(this, "player 2 win", Toast.LENGTH_LONG).show();
                resetbord() ;
                textplayer2.setText("player 2:"+player2point);
            }

          } else if(count==9)
                   {
                       Toast.makeText(this, "draw", Toast.LENGTH_LONG).show();
                       resetbord() ;
                   }

            else {

                player=!player ;
               }

         }


  /*  public void click2(View v)
    {
        if (player == 1) {
            buttons [0][1].setText("X");
            player =2 ;
        }

        else if (player == 2) {
            buttons [0][1].setText("O");

            player =1 ;
        }



        chplayer.setText("palyer : " + player);


    }*/

    public void click2(View v) {

        if (player )
        {
            buttons[0][1].setText("X");
                 buttons[0][1].setTextColor(Color.parseColor("#FF0000"));
            pplayer = 2;


        }

        else
        {
            buttons[0][1].setText("O");
                buttons[0][1].setTextColor(Color.parseColor("#0000FF"));
            pplayer = 1;
        }
          chplayer.setText("playerTurn : "+pplayer);
     count++ ;

        if(result())
        {
            if(player)
            {
                player1point++ ;
                Toast.makeText(this, "player 1 win", Toast.LENGTH_LONG).show();
                resetbord() ;
                textplayer1.setText("player 1:"+player1point);
            }
            else
            {
                player2point++;
                Toast.makeText(this, "player 2 win", Toast.LENGTH_LONG).show();
                resetbord() ;
                textplayer2.setText("player 2:"+player2point);
            }


        } else if(count==9)
        {
            Toast.makeText(this, "draw", Toast.LENGTH_LONG).show();
            resetbord() ;
        }

        else {

            player=!player ;
        }





    }


    public void click3(View v) {

        if (player )
        {
            buttons[0][2].setText("X");
                buttons[0][2].setTextColor(Color.parseColor("#FF0000"));
            pplayer = 2;


        }

        else
        {
            buttons[0][2].setText("O");
                 buttons[0][2].setTextColor(Color.parseColor("#0000FF"));
            pplayer = 1;
        }
          chplayer.setText("playerTurn : "+pplayer);

        count++ ;
        if(result()) {
            if (player) {
                player1point++ ;
                Toast.makeText(this, "player 1 win", Toast.LENGTH_LONG).show();
                resetbord() ;
                textplayer1.setText("player 1:"+player1point);
            }
            else {
                player2point++ ;
                Toast.makeText(this, "player 2 win", Toast.LENGTH_LONG).show();
                resetbord() ;
                textplayer2.setText("player 2:"+player2point);
            }

        }
         else if(count==9)
        {
            Toast.makeText(this, "draw", Toast.LENGTH_LONG).show();

            resetbord() ;
        }

        else {

            player=!player ;
        }



        }




    public void click4(View v) {

        if (player )
        {
            buttons[1][0].setText("X");
                 buttons[1][0].setTextColor(Color.parseColor("#FF0000"));
            pplayer = 2;


        }

        else
        {
            buttons[1][0].setText("O");
               buttons[1][0].setTextColor(Color.parseColor("#0000FF"));
            pplayer = 1;
        }
          chplayer.setText("playerTurn : "+pplayer);

        count++ ;
        if(result()) {
            if (player) {
                player1point++ ;
                Toast.makeText(this, "player 1 win", Toast.LENGTH_LONG).show();
                resetbord() ;
                textplayer1.setText("player 1:"+player1point);
            }
            else {
                player2point++ ;
                Toast.makeText(this, "player 2 win", Toast.LENGTH_LONG).show();
                resetbord() ;
                textplayer2.setText("player 2:"+player2point);
            }

        }
        else if(count==9)
        {
            Toast.makeText(this, "draw", Toast.LENGTH_LONG).show();
            resetbord() ;
        }

        else {

            player=!player ;
        }





    }


    public void click5(View v) {

        if (player )
        {
            buttons[1][1].setText("X");
                 buttons[1][1].setTextColor(Color.parseColor("#FF0000"));
            pplayer = 2;


        }

        else
        {
            buttons[1][1].setText("O");
                  buttons[1][1].setTextColor(Color.parseColor("#0000FF"));
            pplayer = 1;
        }
          chplayer.setText("playerTurn : "+pplayer);
        count++ ;
        if(result()) {
            if (player) {
                player1point++ ;
                Toast.makeText(this, "player 1 win", Toast.LENGTH_LONG).show();
                resetbord() ;
                textplayer1.setText("player 1:"+player1point);
            }
            else {
                player2point++ ;
                Toast.makeText(this, "player 2 win", Toast.LENGTH_LONG).show();
                resetbord() ;
                textplayer2.setText("player 2:"+player2point);
            }

        }
        else if(count==9)
        {
            Toast.makeText(this, "draw", Toast.LENGTH_LONG).show();
            resetbord() ;
        }

        else {

            player=!player ;
        }




    }


    public void click6(View v) {

        if (player )
        {
            buttons[1][2].setText("X");
                buttons[1][2].setTextColor(Color.parseColor("#FF0000"));
            pplayer = 2;


        }

        else
        {
            buttons[1][2].setText("O");
                buttons[1][2].setTextColor(Color.parseColor("#0000FF"));
            pplayer = 1;
        }
          chplayer.setText("playerTurn : "+pplayer);
        count++ ;
        if(result()) {
            if (player) {
                player1point++ ;
                Toast.makeText(this, "player 1 win", Toast.LENGTH_LONG).show();
                resetbord() ;
                textplayer1.setText("player 1:"+player1point);
            }
            else {
                player2point++ ;
                Toast.makeText(this, "player 2 win", Toast.LENGTH_LONG).show();
                resetbord() ;
                textplayer2.setText("player 2:"+player2point);
            }

        }
        else if(count==9)
        {
            Toast.makeText(this, "draw", Toast.LENGTH_LONG).show();
            resetbord() ;
        }

        else {

            player=!player ;
        }




    }


    public void click7(View v) {

        if (player )
        {
            buttons[2][0].setText("X");
             buttons[2][0].setTextColor(Color.parseColor("#FF0000"));
            pplayer = 2;


        }

        else
        {
            buttons[2][0].setText("O");
               buttons[2][0].setTextColor(Color.parseColor("#0000FF"));
            pplayer = 1;
        }
          chplayer.setText("playerTurn : "+pplayer);
        count++ ;
        if(result()) {
            if (player) {
                player1point++ ;
                Toast.makeText(this, "player 1 win", Toast.LENGTH_LONG).show();
                resetbord() ;
                textplayer1.setText("player 1:"+player1point);
            }
            else {
                player2point++ ;
                Toast.makeText(this, "player 2 win", Toast.LENGTH_LONG).show();
                resetbord() ;
                textplayer2.setText("player 2:"+player2point);
            }

        }
        else if(count==9)
        {
            Toast.makeText(this, "draw", Toast.LENGTH_LONG).show();
            resetbord() ;
        }

        else {

            player=!player ;
        }




    }

    public void click8(View v) {

        if (player )
        {
            buttons[2][1].setText("X");
              buttons[2][1].setTextColor(Color.parseColor("#FF0000"));
            pplayer = 2;


        }

        else
        {
            buttons[2][1].setText("O");
             buttons[2][1].setTextColor(Color.parseColor("#0000FF"));
            pplayer = 1;
        }
          chplayer.setText("playerTurn : "+pplayer);
        count++ ;
        if(result()) {
            if (player) {
                player1point++ ;
                Toast.makeText(this, "player 1 win", Toast.LENGTH_LONG).show();
                resetbord() ;
                textplayer1.setText("player 1:"+player1point);
            }
            else {
                player2point++ ;
                Toast.makeText(this, "player 2 win", Toast.LENGTH_LONG).show();
                resetbord() ;
                textplayer2.setText("player 2:"+player2point);
            }

        }
        else if(count==9)
        {
            Toast.makeText(this, "draw", Toast.LENGTH_LONG).show();
            resetbord() ;
        }

        else {

            player=!player ;
        }




    }

    public void click9(View v) {

        if (player )
        {
            buttons[2][2].setText("X");
             buttons[2][2].setTextColor(Color.parseColor("#FF0000"));
            pplayer = 2;


        }

        else
        {
            buttons[2][2].setText("O");
             buttons[2][2].setTextColor(Color.parseColor("#0000FF"));
            pplayer = 1;
        }
          chplayer.setText("playerTurn : "+pplayer);
        count++ ;
        if(result()) {
            if (player) {
                player1point++ ;
                Toast.makeText(this, "player 1 win", Toast.LENGTH_LONG).show();
                resetbord() ;
                textplayer1.setText("player 1:"+player1point);
            }
            else {
                player2point++ ;
                Toast.makeText(this, "player 2 win", Toast.LENGTH_LONG).show();
                resetbord() ;
                textplayer2.setText("player 2:"+player2point);
            }

        }
        else if(count==9)
        {
            Toast.makeText(this, "draw", Toast.LENGTH_LONG).show();
            resetbord() ;
        }

        else {

            player=!player ;
        }




    }


    public boolean result()
    {
 String [][]tt= new String [3][3] ;
      for (int i=0 ; i<3 ;i++)
          for(int j=0 ; j<3 ;j++)
          {
              tt[i][j]=buttons[i][j].getText().toString();

          }


      for (int i=0 ; i<3 ; i++)
        {
            if ( (tt[i][0].equals(tt[i][1]) )&& ( tt[i][0].equals(tt[i][2]) )&& (! tt[i][0].equals("") ) )
               return true ;
        }


      for (int i=0 ; i<3 ; i++)
        {
            if ( (tt[0][i].equals(tt[1][i]) )&& ( tt[0][i].equals(tt[2][i]) )&& ( !tt[0][i].equals("") ) )
            return true ;
        }


            if ( (tt[0][0].equals(tt[1][1]) )&& ( tt[0][0].equals(tt[2][2]) )&& ( !tt[0][0].equals("") ) ) {
            return true ;}




            if ( (tt[0][2].equals(tt[1][1]) )&& ( tt[0][2].equals(tt[2][0]) )&& ( !tt[0][2].equals("") ) ) {
                return true ;
            }




            return false ;

    }




public void resetbord()
{
    for(int i=0 ;i<3 ;i++)
        for(int j=0 ; j<3 ; j++)
            buttons[i][j].setText("");
    chplayer.setText("playerTurn:1 ");

count=0 ;
player=true ;
}








}







