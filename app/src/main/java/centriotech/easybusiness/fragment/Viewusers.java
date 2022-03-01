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

public class Viewusers extends Fragment {

    CardView view_add_agent, view_manage_agent;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.viewusers, container, false);
        view_add_agent = view.findViewById(R.id.view_add_agent);
        view_manage_agent = view.findViewById(R.id.view_manage_agent);

        view_manage_agent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // Toast.makeText(getActivity(), "Manage Agents", Toast.LENGTH_SHORT).show();
                FragmentManager fm = getFragmentManager();
                Manageagents manageagents = new Manageagents();
                fm.beginTransaction().replace(R.id.frame, manageagents).addToBackStack("addclient").commit();


            }
        });

        view_add_agent.setOnClickListener(new View.OnClickListener() {
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
