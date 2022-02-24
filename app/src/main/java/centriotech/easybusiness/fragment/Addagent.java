package centriotech.easybusiness.fragment;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import centriotech.easybusiness.LoginActivity;
import centriotech.easybusiness.R;
import centriotech.easybusiness.WelcomeActivity;

public class Addagent extends Fragment {


    Button slelect_userstatus;
    RelativeLayout addagent;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.addagent, container, false);

        slelect_userstatus = view.findViewById(R.id.slelect_userstatus);
        addagent = view.findViewById(R.id.addagent);

        addagent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getActivity(), WelcomeActivity.class);
//                intent.addFlags(intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
                // finish();

                Toast.makeText(getActivity(), "Agent Add sucessfully", Toast.LENGTH_SHORT).show();
            }
        });

        slelect_userstatus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Toast.makeText(LoginActivity.this, "Select Types", Toast.LENGTH_SHORT).show();

                showAlertDialog();


            }
        });

        return view;
    }

    private void showAlertDialog() {
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(getActivity());
        alertDialog.setTitle("Select User Status");
        String[] items = {"Active", "Deactive", "Hold"};
        int checkedItem = 1;
        alertDialog.setSingleChoiceItems(items, checkedItem, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                switch (which) {
                    case 0:
                        slelect_userstatus.setText("Active");
                        dialog.dismiss();
                        break;
                    case 1:
                        slelect_userstatus.setText("Deactive");
                        dialog.dismiss();
                        break;
                    case 2:
                        slelect_userstatus.setText("Hold");
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