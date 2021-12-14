package ir.caten.pracapp;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.PopupMenu;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
TextView textView;
    ImageView imgMenu;
TextView remove;
 public static FragmentManager fragmentManager;
//    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      //  ShowDialog();
        imgMenu=findViewById(R.id.menu);
        imgMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
           showPopupMenu(v);
            }
        });
   
        textView=findViewById(R.id.add);
        remove=findViewById(R.id.remove);
       fragmentManager= getSupportFragmentManager();

    // testFragmentee =new TestFragmentee();
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//fragmentTransaction.add(R.id.framelayout,f)
            }
        });

      //  remove.setOnClickListener(new View.OnClickListener() {
           /* @Override
            public void onClick(View v) {
                getMenuInflater().inflate(R.menu.test_manu,me);
            }
        });*/

    }


   private void showPopupMenu(View view) {
        // inflate menu and attach it to a view onClick of which you want to display menu
        PopupMenu popup = new PopupMenu(MainActivity.this, view);
        MenuInflater inflater = popup.getMenuInflater();
        //inflate menu items to popup menu
        inflater.inflate(R.menu.test_manu, popup.getMenu());
        //assign a cutom onClick Listener to it.
        popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.menu_test_chart:
                        Toast.makeText(MainActivity.this, "chart", Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.menu_test_rep:
                        Toast.makeText(MainActivity.this, "rep", Toast.LENGTH_SHORT).show();
                        return true;
                        case R.id.menu_test_set:
                        Toast.makeText(MainActivity.this, "setting", Toast.LENGTH_SHORT).show();
                        return true;
                    default:
                        return false;
                }

            }
        });
        //Show Popup.
        popup.show();
    }



    private void ShowDialog() {
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.group_menu,menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_test_chart:
                Toast.makeText(MainActivity.this, "chart", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.menu_test_rep:
                Toast.makeText(MainActivity.this, "rep", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.menu_test_set:
                Toast.makeText(MainActivity.this, "setting", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return false;
        }

    }


    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.test_manu,menu);

    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_test_chart:
                Toast.makeText(MainActivity.this, "chart", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.menu_test_rep:
                Toast.makeText(MainActivity.this, "rep", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.menu_test_set:
                Toast.makeText(MainActivity.this, "setting", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return false;
        }
    }
}