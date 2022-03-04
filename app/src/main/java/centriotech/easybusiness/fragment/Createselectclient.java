package centriotech.easybusiness.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import centriotech.easybusiness.R;
import centriotech.easybusiness.ScannedBarcodeActivity;

public class Createselectclient extends Fragment {
    CardView newclientadd,client_next;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.createselectclient, container, false);

        newclientadd=view.findViewById(R.id.newclientadd);

        client_next=view.findViewById(R.id.client_next);

        client_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                FragmentManager fm = getFragmentManager();
                Createsales createsales = new Createsales();
                fm.beginTransaction().replace(R.id.frame, createsales).addToBackStack("addagent").commit();

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
}
