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
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import centriotech.easybusiness.LoginActivity;
import centriotech.easybusiness.R;
import centriotech.easybusiness.ScannedBarcodeActivity;

public class Createsales extends Fragment {

    CardView sale_client, scanQR, addsale_next,sale_review_submit;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.createsale, container, false);


        scanQR = view.findViewById(R.id.scanQR);

        sale_client = view.findViewById(R.id.sale_client);
        addsale_next = view.findViewById(R.id.addsale_next);
        sale_review_submit = view.findViewById(R.id.sale_review_submit);

        scanQR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                FragmentManager fm = getFragmentManager();
//                Barcodescanner barcodescanner = new Barcodescanner();
//                fm.beginTransaction().replace(R.id.frame, barcodescanner).addToBackStack("addagent").commit();

                sale_client.setVisibility(View.VISIBLE);
                addsale_next.setVisibility(View.VISIBLE);


            }
        });

        addsale_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                sale_client.setVisibility(View.GONE);
                addsale_next.setVisibility(View.GONE);
                Toast.makeText(getActivity(), "Added to Daily Sale Record", Toast.LENGTH_SHORT).show();


            }
        });

        sale_review_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                FragmentManager fm = getFragmentManager();
                Salereview salereview = new Salereview();
                fm.beginTransaction().replace(R.id.frame, salereview).commit();
            }
        });


        return view;
    }
}
