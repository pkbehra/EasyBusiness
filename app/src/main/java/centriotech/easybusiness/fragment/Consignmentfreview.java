package centriotech.easybusiness.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import centriotech.easybusiness.R;

public class Consignmentfreview extends Fragment {

    CardView finalsub,finalcancel;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.consignmentfreview, container, false);
        finalsub=view.findViewById(R.id.finalsub);
        finalcancel=view.findViewById(R.id.finalcancel);

        finalsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                FragmentManager fm = getFragmentManager();
                Viewconsignment viewconsignment = new Viewconsignment();
//                fm.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                fm.beginTransaction().replace(R.id.frame, viewconsignment).commit();

                Toast.makeText(getActivity(), "Consignment Submit Sucessfull", Toast.LENGTH_SHORT).show();
            }
        });
        finalcancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                FragmentManager fm = getFragmentManager();
                Consignmentfinalsubmit consignmentfinalsubmit = new Consignmentfinalsubmit();
                fm.beginTransaction().replace(R.id.frame, consignmentfinalsubmit).commit();
            }
        });

        return view;
    }
}
