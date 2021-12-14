package ir.caten.pracapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.Toast;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;

import ir.caten.pracapp.Fragment.HahaFragment;
import ir.caten.pracapp.Fragment.InsideFightFragment;
import ir.caten.pracapp.Fragment.LoginDialog;
import ir.caten.pracapp.bottomappbarbackdrop.BackDropActivity;

public class TestActivity extends AppCompatActivity {
    Button btnDialog, btnAlertDialog, btnAddFragment, btnRemoveFragment, btnShared, btnMenu, btnBackDrop,btnThread;
    public static FragmentManager fragmentManager;
    FrameLayout frameLayout;
    InsideFightFragment insideFightFragment;
    SharedPreferences sharedPreferences;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        fragmentManager = getSupportFragmentManager();
        insideFightFragment = new InsideFightFragment();
        sharedPreferences = getSharedPreferences("settting", MODE_PRIVATE);

        setupViews();


    }

    private void setupViews() {
        btnDialog = findViewById(R.id.btn_test_dialog);
        btnAlertDialog = findViewById(R.id.btn_test_alertDialog);
        btnAddFragment = findViewById(R.id.btn_test_addFragment);
        btnRemoveFragment = findViewById(R.id.btn_test_removeFragment);
        btnMenu = findViewById(R.id.btn_test_menu);
        btnBackDrop = findViewById(R.id.btn_test_backDrop);
        btnThread = findViewById(R.id.btn_test_thread);
        frameLayout = findViewById(R.id.fl);
        btnShared = findViewById(R.id.btn_test_shared);


        btnDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ShowDialog();
            }
        });
        btnAlertDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showAlertDialog();
            }
        });

        btnAddFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
                beginTransaction.add(R.id.fl, new HahaFragment());
                beginTransaction.addToBackStack("");
                beginTransaction.commit();


                // addFragment();

            }
        });

        btnRemoveFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // fragmentManager.beginTransaction().remove("شی از فرگمنت مورد نظر پاس بده").commit();
            }
        });

        btnShared.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putBoolean("night", false);
                editor.putString("font", "roz");
                editor.putInt("pass", 123);
                editor.apply();

                //if you want read from shered
               /* sharedPreferences.getString("font","");
                if(){

                }*/
            }
        });

        btnMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TestActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        btnBackDrop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TestActivity.this,
                        BackDropActivity.class);
                startActivity(intent);

            }
        });
        btnThread.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TestActivity.this,
                        ThreadActivity.class);
                startActivity(intent);

            }
        });
    }

    private void addFragment() {

        FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
        beginTransaction.add(R.id.fl, new InsideFightFragment());
        //  beginTransaction.replace(R.id.fl,new InsideFightFragment());
        beginTransaction.addToBackStack("");
        beginTransaction.commit();
    }

    private void showAlertDialog() {
        AlertDialog alertDialog = new MaterialAlertDialogBuilder(TestActivity.this).create();
        alertDialog.setTitle("welcome");
        alertDialog.setMessage("jgjohioahre");
        alertDialog.setButton(AlertDialog.BUTTON_NEGATIVE, "yes", (dialog, which) -> Toast.makeText(this, "yes clickkkk", Toast.LENGTH_SHORT).show());
        alertDialog.setButton(AlertDialog.BUTTON_POSITIVE, "no", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(TestActivity.this, "no click", Toast.LENGTH_SHORT).show();
            }
        });
        alertDialog.show();

    }

    private void ShowDialog() {
        LoginDialog loginDialog = new LoginDialog();
        loginDialog.show(fragmentManager, "");
    }


}
