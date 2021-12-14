package ir.caten.pracapp.PersistentBottomSheet;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.widget.NestedScrollView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.google.android.material.bottomsheet.BottomSheetBehavior;

import ir.caten.pracapp.R;

public class PersistentBottomSheetActivity extends AppCompatActivity {
    Button btnSheet;
    //LinearLayout sheetLayout;
    BottomSheetBehavior bottomSheet;
   NestedScrollView sheetLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persistent_bottom_sheet);
        btnSheet = findViewById(R.id.btn_expand);
        sheetLayout = findViewById(R.id.se);
        bottomSheet = BottomSheetBehavior.from(sheetLayout);

        btnSheet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (bottomSheet.getState() == BottomSheetBehavior.STATE_COLLAPSED) {

                    bottomSheet.setState(BottomSheetBehavior.STATE_EXPANDED);
                    btnSheet.setText("Collapse");

                }
                else if (bottomSheet.getState() == BottomSheetBehavior.STATE_EXPANDED) {

                    bottomSheet.setState(BottomSheetBehavior.STATE_COLLAPSED);
                    btnSheet.setText("Expand");

                }


            }
        });

    }
}