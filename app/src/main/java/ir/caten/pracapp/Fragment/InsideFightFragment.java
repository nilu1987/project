package ir.caten.pracapp.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import ir.caten.pracapp.R;
import ir.caten.pracapp.TestActivity;

public class InsideFightFragment extends Fragment {
    Button btnRemove;
    View view;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       view = inflater.inflate(R.layout.insde_flight_fragment, container,false);
        setupViews();
        return view;
    }

    private void setupViews() {
        btnRemove=view.findViewById(R.id.button2);
        btnRemove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TestActivity.fragmentManager.beginTransaction().remove(InsideFightFragment.this).commit();
            }
        });
    }
}
