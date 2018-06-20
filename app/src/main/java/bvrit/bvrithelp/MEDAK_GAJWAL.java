package bvrit.bvrithelp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.github.aakira.expandablelayout.ExpandableRelativeLayout;

public class MEDAK_GAJWAL extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.medak__gajwal);
        setTitle("MEDAK-GAJWEL");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    public void medgajinfo(View view) {
        ExpandableRelativeLayout expandableRelativeLayoutg1;
        ExpandableRelativeLayout expandableRelativeLayoutg2;

        expandableRelativeLayoutg1 = (ExpandableRelativeLayout) findViewById(R.id.g1view);
        expandableRelativeLayoutg2 = (ExpandableRelativeLayout) findViewById(R.id.g2view);
        if (view.getId() == R.id.g1) {
            expandableRelativeLayoutg1.toggle();
            expandableRelativeLayoutg2.collapse();
        }
        if (view.getId() == R.id.g2) {
            expandableRelativeLayoutg2.toggle();
            expandableRelativeLayoutg1.collapse();
        }
    }
}
