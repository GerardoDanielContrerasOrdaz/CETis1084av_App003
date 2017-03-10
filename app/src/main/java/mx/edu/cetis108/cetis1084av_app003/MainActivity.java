package mx.edu.cetis108.cetis1084av_app003;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.security.PublicKey;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btn;
    TextView txtView;
    EditText edText1,edText2;
    Integer num1,num2,resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.btnAceptar);
        edText1 = (EditText) findViewById(R.id.editText1);
        edText2 = (EditText) findViewById(R.id.editText2);
        txtView = (TextView) findViewById(R.id.textView);

        btn.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        num1=Integer.parseInt(edText1.getText().toString());
        num2=Integer.parseInt(edText2.getText().toString());
        if(num1>num2)
        {
            resultado =num1 - num2;
            txtView.setText(resultado.toString());
           Toast toast=Toast.makeText(getApplicationContext(),"El numero "+num1+" es mayor que "+num2,Toast.LENGTH_SHORT);
            toast.show();

        }
        else if(num2>num1)
        {
            resultado=num2 + num1;
            txtView.setText(resultado.toString());
            Toast toast=Toast.makeText(getApplicationContext(),"El numero "+num2+" es mayor que "+num1,Toast.LENGTH_SHORT);
            toast.show();
        }
        else {

            txtView.setText("00");
            Toast toast=Toast.makeText(getApplicationContext(),"Los numeros son iguales "+num1,Toast.LENGTH_SHORT);
            toast.show();
        }

    }
}



