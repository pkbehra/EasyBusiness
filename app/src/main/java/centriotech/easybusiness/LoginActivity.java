package centriotech.easybusiness;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    TextView forgotpass;
    EditText et_num, et_pass;
    RelativeLayout btn_signin;

    Button slectlogtype;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        et_num = findViewById(R.id.phone);
        et_pass = findViewById(R.id.password);
        btn_signin = findViewById(R.id.login);
        forgotpass = findViewById(R.id.tvForgotPass);

        slectlogtype = findViewById(R.id.slelect_logtype);


        slectlogtype.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // Toast.makeText(LoginActivity.this, "Select Types", Toast.LENGTH_SHORT).show();

                showAlertDialog();


            }
        });

        forgotpass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ForgotPassActivity.class);
                startActivity(intent);
//                finish();
            }
        });

        btn_signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), WelcomeActivity.class);
                startActivity(intent);
//                finish();
            }
        });

    }

    private void showAlertDialog() {
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(LoginActivity.this);
        alertDialog.setTitle("Select Login Credentials");
        String[] items = {"Admin", "Agent"};
        int checkedItem = 1;
        alertDialog.setSingleChoiceItems(items, checkedItem, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                switch (which) {
                    case 0:
                        slectlogtype.setText("Admin");
                        dialog.dismiss();
                        break;
                    case 1:
                        slectlogtype.setText("Agent");
                        dialog.dismiss();
                        break;

                }
            }
        });
        AlertDialog alert = alertDialog.create();
        alert.setCanceledOnTouchOutside(false);
        alert.show();
    }
}