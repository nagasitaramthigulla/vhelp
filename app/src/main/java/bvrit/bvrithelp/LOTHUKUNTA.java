package bvrit.bvrithelp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.github.aakira.expandablelayout.ExpandableRelativeLayout;

public class LOTHUKUNTA extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lothukunt);
        setTitle("LOTHUKUNTA");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    public void lothukuntainfo(View view) {
        ExpandableRelativeLayout expandableRelativeLayoutl1;
        ExpandableRelativeLayout expandableRelativeLayoutl2;
        ExpandableRelativeLayout expandableRelativeLayoutl3;
        ExpandableRelativeLayout expandableRelativeLayoutl4;
        ExpandableRelativeLayout expandableRelativeLayoutl5;


        expandableRelativeLayoutl1 = (ExpandableRelativeLayout) findViewById(R.id.l1view);
        expandableRelativeLayoutl2 = (ExpandableRelativeLayout) findViewById(R.id.l2view);
        expandableRelativeLayoutl3 = (ExpandableRelativeLayout) findViewById(R.id.l3view);
        expandableRelativeLayoutl4 = (ExpandableRelativeLayout) findViewById(R.id.l4view);
        expandableRelativeLayoutl5 = (ExpandableRelativeLayout) findViewById(R.id.l5view);
        if (view.getId() == R.id.l1) {
            expandableRelativeLayoutl1.toggle();
            expandableRelativeLayoutl2.collapse();
            expandableRelativeLayoutl3.collapse();
            expandableRelativeLayoutl4.collapse();
            expandableRelativeLayoutl5.collapse();
        }
        if (view.getId() == R.id.l2) {
            expandableRelativeLayoutl2.toggle();
            expandableRelativeLayoutl1.collapse();
            expandableRelativeLayoutl3.collapse();
            expandableRelativeLayoutl4.collapse();
            expandableRelativeLayoutl5.collapse();
        }
        if (view.getId() == R.id.l3) {
            expandableRelativeLayoutl3.toggle();
            expandableRelativeLayoutl2.collapse();
            expandableRelativeLayoutl1.collapse();
            expandableRelativeLayoutl4.collapse();
            expandableRelativeLayoutl5.collapse();
        }
        if (view.getId() == R.id.l4) {
            expandableRelativeLayoutl4.toggle();
            expandableRelativeLayoutl2.collapse();
            expandableRelativeLayoutl1.collapse();
            expandableRelativeLayoutl3.collapse();
            expandableRelativeLayoutl5.collapse();
        }
        if (view.getId() == R.id.l5) {
            expandableRelativeLayoutl5.toggle();
            expandableRelativeLayoutl2.collapse();
            expandableRelativeLayoutl1.collapse();
            expandableRelativeLayoutl4.collapse();
            expandableRelativeLayoutl3.collapse();
        }

    }
}
