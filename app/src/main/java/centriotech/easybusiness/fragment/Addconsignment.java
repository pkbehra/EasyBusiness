package centriotech.easybusiness.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import centriotech.easybusiness.R;

public class Addconsignment extends Fragment {

    RelativeLayout next;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.addconsignment, container, false);

        next=view.findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Consignmentfinalsubmit consignmentfinalsubmit = new Consignmentfinalsubmit();
                FragmentManager fmmm = getFragmentManager();
                fmmm.beginTransaction().replace(R.id.frame, consignmentfinalsubmit).addToBackStack("Con").commit();

            }
        });
        return view;
    }
}
