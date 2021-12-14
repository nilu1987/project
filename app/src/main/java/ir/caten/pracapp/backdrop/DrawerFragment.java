package ir.caten.pracapp.backdrop;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

import ir.caten.pracapp.R;

public class DrawerFragment extends BottomSheetDialogFragment {
    TextView txtTitle;
    Button btnLogin;
    private View view;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.drawer_fragment, container, false);
        setupViews();
        return view;
    }

    private void setupViews() {
        txtTitle=view.findViewById(R.id.txt_nav_login);
        btnLogin=view.findViewById(R.id.btn_nav_login);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "loginnnnnnnnnn", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
