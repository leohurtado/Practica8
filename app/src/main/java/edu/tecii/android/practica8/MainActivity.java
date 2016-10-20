package edu.tecii.android.practica8;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText txtCM, txtCP, txtRM, txtRMi, txtRP, txtRY;
    Button btnSuma;
    double cm, cp, rm, rmi, rp, ry, cantpulg, cantmet, aux;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtCM = (EditText)findViewById(R.id.txtCM);
        txtCP = (EditText)findViewById(R.id.txtCP);
        txtRM = (EditText)findViewById(R.id.txtRM);
        txtRP = (EditText)findViewById(R.id.txtRP);
        txtRY = (EditText)findViewById(R.id.txtRY);
        txtRMi = (EditText)findViewById(R.id.txtRMi);
        btnSuma = (Button)findViewById(R.id.btnSuma);
    }
    public void Sumar (View v){
        cm = Double.parseDouble(txtCM.getText().toString());
        cp = Double.parseDouble(txtCP.getText().toString());
        cantpulg = cp * 12;
        cantmet = cantpulg / 0.0254;
        aux = cm / 0.0254;
        rm = cm + cantmet;
        rmi = 1609 * (cm + cantmet);
        rp = aux + cantpulg;
        ry = (cp + aux) * 3;
        txtRY.setText(ry+"");
        txtRP.setText(rp+"");
        txtRM.setText(rm+"");
        txtRMi.setText(rmi+"");
    }
}
