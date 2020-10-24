package co.com.umb.johancanon.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /**
     * Logica de la aplicacion
     *
     * @param savedInstanceState
     */

    private Button btn_suma;
    private Button btn_resta;
    private Button btn_multip;
    private Button btn_div;

    private TextView text_respuesta;
    private EditText edit_num_1;
    private EditText edit_num_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text_respuesta = findViewById( R.id.respuesta );
        edit_num_1 = findViewById( R.id.valor_1 );
        edit_num_2 = findViewById( R.id.valor_2 );

        btn_suma = findViewById( R.id.btn_suma );
        btn_suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text_respuesta.setText( suma( Integer.parseInt( edit_num_1.getText().toString() ) ,
                        Integer.parseInt( edit_num_2.getText().toString() ) ) + "" );
            }
        });


        btn_resta = findViewById( R.id.btn_resta );
        btn_resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text_respuesta.setText( resta( Integer.parseInt( edit_num_1.getText().toString() ) ,
                        Integer.parseInt( edit_num_2.getText().toString() ) ) + "" );
            }
        });

        btn_multip = findViewById( R.id.btn_mult );
        btn_multip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text_respuesta.setText( multiplicacion( Integer.parseInt( edit_num_1.getText().toString() ) ,
                        Integer.parseInt( edit_num_2.getText().toString() ) ) + "" );
            }
        });


        btn_div = findViewById( R.id.btn_div );
        btn_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text_respuesta.setText( division( Integer.parseInt( edit_num_1.getText().toString() ) ,
                        Integer.parseInt( edit_num_2.getText().toString() ) ) + "" );
            }
        });


    }

    //Metodos de operaciones
    public int suma(int a, int b){
        return a + b;
    }

    public int resta(int a, int b){
        return a - b;
    }

    public int multiplicacion(int a, int b){
        return a * b;
    }

    public int division(int a, int b){
        int respuesta = 0;
        if( b != 0 ){
            return respuesta = a/b;
        }
        return respuesta;
    }

}