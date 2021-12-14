package ir.caten.pracapp.bottomappbarbackdrop;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.bottomappbar.BottomAppBar;

import ir.caten.pracapp.R;


public class BackDropActivity extends AppCompatActivity {
    FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_backdrop);

        BottomAppBar botttomAppBar = findViewById(R.id.bottomAppBar);
        fragmentManager = getSupportFragmentManager();
        if (getSupportActionBar() != null) {
            // getSupportActionBar().hide();
            botttomAppBar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    DrawerBottomSheetFragment backdrop = new DrawerBottomSheetFragment();
                    backdrop.show(getSupportFragmentManager(), "");
                }
            });
        }
    }
}