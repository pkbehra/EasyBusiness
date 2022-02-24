package centriotech.easybusiness;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import centriotech.easybusiness.fragment.Admindashboard;
import centriotech.easybusiness.fragment.Adminprofile;

public class WelcomeActivity extends AppCompatActivity {

    BottomNavigationView nav_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        nav_view = findViewById(R.id.nav_view);

        Admindashboard admindashboard = new Admindashboard();
        FragmentManager fmmm = getSupportFragmentManager();
        fmmm.beginTransaction().replace(R.id.frame, admindashboard).commit();


        nav_view.setOnNavigationItemSelectedListener(navListener);

        nav_view.setItemBackground(null);

    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:

                    Admindashboard admindashboard = new Admindashboard();
                    FragmentManager fmmm = getSupportFragmentManager();
                    fmmm.beginTransaction().replace(R.id.frame, admindashboard).addToBackStack("Admin").commit();


                    break;

                case R.id.navigation_profile:

                    Adminprofile adminprofile = new Adminprofile();
                    FragmentManager fmmm1 = getSupportFragmentManager();
                    fmmm1.beginTransaction().replace(R.id.frame, adminprofile).commit();


                    break;


            }
            return true;
        }
    };


}