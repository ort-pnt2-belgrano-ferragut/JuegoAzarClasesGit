package ort.edu.juegoazarclases;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    // Componentes del juego: boton y resultado
    private Button buttonPlay;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonPlay = (Button) findViewById(R.id.buttonPlay);
        result = (TextView) findViewById(R.id.results);

        play();

    }
    protected void play(){
        buttonPlay.setOnClickListener(new View.OnClickListener() {
            Game game = new Game((ImageView) findViewById(R.id.imageLeft),
                    (ImageView) findViewById(R.id.imageCenter),
                    (ImageView)findViewById(R.id.imageRight));
            @Override
            public void onClick(View view) {
                game.play();
                setResultMessage(game.hasWon());
            }
        });
    }
    protected void setResultMessage(boolean hasWon){
        if (hasWon){
            result.setText("Ganaste!!! :)");

        }
        else result.setText("Proba de nuevo!! :(");
    }
}
