package ir.caten.pracapp.backdrop;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import ir.caten.pracapp.R;

public class BackdActivity extends AppCompatActivity {
    Button btnDrop;
    FragmentManager fragmentManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_backd);
        btnDrop = findViewById(R.id.button4);
        fragmentManager = getSupportFragmentManager();
        btnDrop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DrawerFragment drawerFragment=new DrawerFragment();
                drawerFragment.show(fragmentManager,"");
            }
        });
    }
}