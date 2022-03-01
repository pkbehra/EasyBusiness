package centriotech.easybusiness.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import centriotech.easybusiness.R;

public class Admindashboard extends Fragment {

    CardView view_users, view_consignment, view_sales, view_clients;
    Button btnedit;

    CardView dailyupdate;

    EditText onion_et,tomato_et,potato_et;
    TextView onion_tv,tomato_tv,potato_tv;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.admindashboard, container, false);

        view_users = (CardView) view.findViewById(R.id.a1);

        view_consignment = (CardView) view.findViewById(R.id.a2);
        view_sales = (CardView) view.findViewById(R.id.a3);
        view_clients = (CardView) view.findViewById(R.id.a4);
//        btnedit = view.findViewById(R.id.btnedit);
//        dailyupdate = view.findViewById(R.id.dailyupdate);
//
//        onion_et = view.findViewById(R.id.onion_et);
//        tomato_et = view.findViewById(R.id.tomato_et);
//        potato_et = view.findViewById(R.id.potato_et);
//        onion_tv = view.findViewById(R.id.onion_tv);
//        tomato_tv = view.findViewById(R.id.tomato_tv);
//        potato_tv = view.findViewById(R.id.potato_tv);



        view_users.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fm = getFragmentManager();
                Viewusers viewusers = new Viewusers();
                fm.beginTransaction().replace(R.id.frame, viewusers).addToBackStack("viewusers").commit();


            }
        });

        view_consignment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fm = getFragmentManager();
                Viewconsignment viewconsignment = new Viewconsignment();
                fm.beginTransaction().replace(R.id.frame, viewconsignment).addToBackStack("viewconsignment").commit();


            }
        });
        view_sales.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fm = getFragmentManager();
                Viewsales viewsales = new Viewsales();
                fm.beginTransaction().replace(R.id.frame, viewsales).addToBackStack("viewsales").commit();


            }
        });
        view_clients.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fm = getFragmentManager();
                Viewclients viewclients = new Viewclients();
                fm.beginTransaction().replace(R.id.frame, viewclients).addToBackStack("viewclients").commit();


            }
        });

        return view;
    }
}
