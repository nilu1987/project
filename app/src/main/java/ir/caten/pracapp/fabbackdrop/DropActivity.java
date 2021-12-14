package ir.caten.pracapp.fabbackdrop;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentManager;

import android.view.View;

import ir.caten.pracapp.R;
import ir.caten.pracapp.backdrop.DrawerFragment;

public class DropActivity extends AppCompatActivity {
FragmentManager fragmentManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drop);
        fragmentManager=getSupportFragmentManager();
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DrawerFragment drawerFragment=new DrawerFragment();
                drawerFragment.show(fragmentManager,"");
            }
        });
    }
}