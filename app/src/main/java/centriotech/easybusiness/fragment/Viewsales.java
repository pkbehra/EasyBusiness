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

public class Viewsales extends Fragment {

    CardView view_add_sale, view_manage_sales;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.viewsales,container,false);
        view_add_sale = view.findViewById(R.id.view_add_sale);
        view_manage_sales = view.findViewById(R.id.view_manage_sales);

        view_manage_sales.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // Toast.makeText(getActivity(), "Manage Sales", Toast.LENGTH_SHORT).show();
                FragmentManager fm = getFragmentManager();
                Managesales managesales = new Managesales();
                fm.beginTransaction().replace(R.id.frame, managesales).addToBackStack("addclient").commit();


            }
        });

        view_add_sale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                FragmentManager fm = getFragmentManager();
                Createselectclient createselectclient = new Createselectclient();
                fm.beginTransaction().replace(R.id.frame, createselectclient).addToBackStack("addconsignment").commit();


            }
        });

        return view;
    }
}