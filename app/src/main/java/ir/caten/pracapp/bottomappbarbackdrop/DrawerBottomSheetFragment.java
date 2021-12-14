package ir.caten.pracapp.bottomappbarbackdrop;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.google.android.material.navigation.NavigationView;

import ir.caten.pracapp.R;


public class DrawerBottomSheetFragment extends BottomSheetDialogFragment {

    private View view;
    ConstraintLayout parent;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.drawer_bottomsheet_fragment, container, false);
       parent = view.findViewById(R.id.cons_drawer_parent);

     NavigationView navigationView  = view.findViewById(R.id.navigationview);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.menu_test_chart:
                        Toast.makeText(getContext(), "chart", Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.menu_test_rep:
                        Toast.makeText(getContext(), "rep", Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.menu_test_set:
                        Toast.makeText(getContext(), "setting", Toast.LENGTH_SHORT).show();
                        return true;
                    default:
                        return false;
                }


            }

        });
        return view;
}}
