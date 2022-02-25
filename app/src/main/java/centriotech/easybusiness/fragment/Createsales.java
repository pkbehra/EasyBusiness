package centriotech.easybusiness.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import centriotech.easybusiness.LoginActivity;
import centriotech.easybusiness.R;
import centriotech.easybusiness.ScannedBarcodeActivity;

public class Createsales extends Fragment {

    RelativeLayout newclientadd,scanQR;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.createsale, container, false);

        newclientadd=view.findViewById(R.id.newclientadd);

        scanQR=view.findViewById(R.id.scanQR);

        scanQR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

              //  Toast.makeText(getActivity(), "Scan QR Code", Toast.LENGTH_SHORT).show();


                Intent intent = new Intent(getActivity(), ScannedBarcodeActivity.class);

                startActivity(intent);
                // finish();

            }
        });

        newclientadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                FragmentManager fm = getFragmentManager();
                Addagent addagent = new Addagent();
                fm.beginTransaction().replace(R.id.frame, addagent).addToBackStack("addagent").commit();
            }
        });
        return view;
    }
    }
