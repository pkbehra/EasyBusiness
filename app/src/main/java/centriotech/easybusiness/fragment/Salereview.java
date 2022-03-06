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

public class Salereview extends Fragment {

    CardView salesub,salecancel;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.salereview,container,false);
        salesub=view.findViewById(R.id.salesub);
        salecancel=view.findViewById(R.id.salecancel);

        salesub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                FragmentManager fm = getFragmentManager();
                Viewsales viewsales = new Viewsales();
//                fm.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                fm.beginTransaction().replace(R.id.frame, viewsales).commit();

                Toast.makeText(getActivity(), "Sale Submit Sucessfull", Toast.LENGTH_SHORT).show();
            }
        });
        salecancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                FragmentManager fm = getFragmentManager();
                Createsales createsales = new Createsales();
                fm.beginTransaction().replace(R.id.frame, createsales).commit();
            }
        });


        return view;
    }
}
