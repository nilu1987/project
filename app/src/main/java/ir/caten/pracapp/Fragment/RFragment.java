package ir.caten.pracapp.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import ir.caten.pracapp.R;
import ir.caten.pracapp.TestActivity;

public class RFragment extends Fragment{

    private View view;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.insde_flight_fragment, container);
        TestActivity.fragmentManager.beginTransaction().remove(RFragment.this).commit();
        return view;
    }
}
