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

public class Viewclients extends Fragment {

    CardView view_add_client, view_manage_client;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.viewclients,container,false);
        view_add_client = view.findViewById(R.id.view_add_client);
        view_manage_client = view.findViewById(R.id.view_manage_client);

        view_manage_client.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              //  Toast.makeText(getActivity(), "Manage Clients", Toast.LENGTH_SHORT).show();


                FragmentManager fm = getFragmentManager();
                Manageclients manageclients = new Manageclients();
                fm.beginTransaction().replace(R.id.frame, manageclients).addToBackStack("addclient").commit();



            }
        });

        view_add_client.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                FragmentManager fm = getFragmentManager();
                Addclient addclient = new Addclient();
                fm.beginTransaction().replace(R.id.frame, addclient).addToBackStack("addclient").commit();


            }
        });

        return view;
    }
}
