package ir.caten.pracapp.Fragment;

import android.app.Dialog;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.DialogFragment;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;

import ir.caten.pracapp.R;

public class LoginDialog extends DialogFragment {
    ImageView imgMenu;
    View view;
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder=new MaterialAlertDialogBuilder(getContext());
        view= LayoutInflater.from(getContext()).inflate(R.layout.login_dialog, null);
        builder.setView(view);
        setupViews();
        return builder.create();
    }



    private void setupViews() {


    }
}
