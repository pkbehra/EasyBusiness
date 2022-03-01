package centriotech.easybusiness.fragment;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import centriotech.easybusiness.R;

public class Addconsignment extends Fragment {

    RelativeLayout next;
    Button ownertype,cons_material,packagetype;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.addconsignment, container, false);

        next=view.findViewById(R.id.next);
        ownertype=view.findViewById(R.id.ownertype);
        cons_material=view.findViewById(R.id.cons_material);
        packagetype=view.findViewById(R.id.packagetype);


        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Consignmentfinalsubmit consignmentfinalsubmit = new Consignmentfinalsubmit();
                FragmentManager fmmm = getFragmentManager();
                fmmm.beginTransaction().replace(R.id.frame, consignmentfinalsubmit).addToBackStack("Con").commit();

            }
        });

        ownertype.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showAlertDialog();

            }
        });

        cons_material.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showAlertDialog1();

            }
        });
        packagetype.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showAlertDialog2();

            }
        });

        return view;
    }

    private void showAlertDialog() {
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(getActivity());
        alertDialog.setTitle("Select Owner Type");
        String[] items = {"Merchant", "Agent"};
        int checkedItem = 1;
        alertDialog.setSingleChoiceItems(items, checkedItem, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                switch (which) {
                    case 0:
                        ownertype.setText("Merchant");
                        dialog.dismiss();
                        break;
                    case 1:
                        ownertype.setText("Agent");
                        dialog.dismiss();
                        break;

                }
            }
        });
        AlertDialog alert = alertDialog.create();
        alert.setCanceledOnTouchOutside(false);
        alert.show();
    }
    private void showAlertDialog1() {
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(getActivity());
        alertDialog.setTitle("Select Consignment Material");
        String[] items = {"Onion", "Potato","Tomato"};
        int checkedItem = 1;
        alertDialog.setSingleChoiceItems(items, checkedItem, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                switch (which) {
                    case 0:
                        cons_material.setText("Onion");
                        dialog.dismiss();
                        break;
                    case 1:
                        cons_material.setText("Potato");
                        dialog.dismiss();
                        break;
                    case 2:
                        cons_material.setText("Tomato");
                        dialog.dismiss();
                        break;

                }
            }
        });
        AlertDialog alert = alertDialog.create();
        alert.setCanceledOnTouchOutside(false);
        alert.show();
    }
    private void showAlertDialog2() {
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(getActivity());
        alertDialog.setTitle("Select Packaging Type");
        String[] items = {"Gunny Bags","Carets"};
        int checkedItem = 1;
        alertDialog.setSingleChoiceItems(items, checkedItem, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                switch (which) {
                    case 0:
                        packagetype.setText("Gunny Bags");
                        dialog.dismiss();
                        break;
                    case 1:
                        packagetype.setText("Carets");
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
