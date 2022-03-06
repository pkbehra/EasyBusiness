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
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import centriotech.easybusiness.R;
import centriotech.easybusiness.ScannedBarcodeActivity;

public class Createselectclient extends Fragment {
    CardView client_next;
    TextView newclientadd;

    Button producttype;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.createselectclient, container, false);

        newclientadd=view.findViewById(R.id.newclientadd);

        producttype=view.findViewById(R.id.producttype);

        client_next=view.findViewById(R.id.client_next);

        client_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                FragmentManager fm = getFragmentManager();
                Createsales createsales = new Createsales();
                fm.beginTransaction().replace(R.id.frame, createsales).addToBackStack("addagent").commit();

            }
        });
        producttype.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                showAlertDialog();

            }
        });

        newclientadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                FragmentManager fm = getFragmentManager();
                Addclient addclient = new Addclient();
                fm.beginTransaction().replace(R.id.frame, addclient).addToBackStack("addagent").commit();
            }
        });
        return view;
    }

    private void showAlertDialog() {

        AlertDialog.Builder alertDialog = new AlertDialog.Builder(getActivity());
        alertDialog.setTitle("Select Product Type");
        String[] items = {"Onion", "Potato","Tomato"};
        int checkedItem = 1;
        alertDialog.setSingleChoiceItems(items, checkedItem, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                switch (which) {
                    case 0:
                        producttype.setText("Onion");
                        dialog.dismiss();
                        break;
                    case 1:
                        producttype.setText("Potato");
                        dialog.dismiss();
                        break;
                    case 2:
                        producttype.setText("Tomato");
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
