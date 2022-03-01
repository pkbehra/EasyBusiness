package centriotech.easybusiness.fragment;

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

public class Viewconsignment extends Fragment {

    CardView view_add_consignment, view_manage_consignment;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.viewconsignment, container, false);
        view_add_consignment = view.findViewById(R.id.view_add_consignment);
        view_manage_consignment = view.findViewById(R.id.view_manage_consignment);

        view_manage_consignment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // Toast.makeText(getActivity(), "Manage Consignment", Toast.LENGTH_SHORT).show();
                FragmentManager fm = getFragmentManager();
                Manageconsignment manageconsignment = new Manageconsignment();
                fm.beginTransaction().replace(R.id.frame, manageconsignment).addToBackStack("addclient").commit();


            }
        });

        view_add_consignment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                FragmentManager fm = getFragmentManager();
                Addconsignment addconsignment = new Addconsignment();
                fm.beginTransaction().replace(R.id.frame, addconsignment).addToBackStack("addconsignment").commit();


            }
        });

        return view;
    }
}