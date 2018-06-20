package bvrit.bvrithelp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.github.aakira.expandablelayout.ExpandableRelativeLayout;

public class SECUNDRABAD extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secundrabad);
        setTitle("SECUNDRABAD");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    public void secundrabadinfo(View view) {
        ExpandableRelativeLayout expandableRelativeLayouts1;
        ExpandableRelativeLayout expandableRelativeLayouts2;
        ExpandableRelativeLayout expandableRelativeLayouts3;
        ExpandableRelativeLayout expandableRelativeLayouts4;
        ExpandableRelativeLayout expandableRelativeLayouts5;


        expandableRelativeLayouts1 = (ExpandableRelativeLayout) findViewById(R.id.s1view);
        expandableRelativeLayouts2 = (ExpandableRelativeLayout) findViewById(R.id.s2view);
        expandableRelativeLayouts3 = (ExpandableRelativeLayout) findViewById(R.id.s3view);
        expandableRelativeLayouts4 = (ExpandableRelativeLayout) findViewById(R.id.s4view);
        expandableRelativeLayouts5 = (ExpandableRelativeLayout) findViewById(R.id.s5view);
        if (view.getId() == R.id.s1) {
            expandableRelativeLayouts1.toggle();
            expandableRelativeLayouts2.collapse();
            expandableRelativeLayouts3.collapse();
            expandableRelativeLayouts4.collapse();
            expandableRelativeLayouts5.collapse();
        }
        if (view.getId() == R.id.s2) {
            expandableRelativeLayouts2.toggle();
            expandableRelativeLayouts1.collapse();
            expandableRelativeLayouts3.collapse();
            expandableRelativeLayouts4.collapse();
            expandableRelativeLayouts5.collapse();
        }
        if (view.getId() == R.id.s3) {
            expandableRelativeLayouts3.toggle();
            expandableRelativeLayouts2.collapse();
            expandableRelativeLayouts1.collapse();
            expandableRelativeLayouts4.collapse();
            expandableRelativeLayouts5.collapse();
        }
        if (view.getId() == R.id.s4) {
            expandableRelativeLayouts4.toggle();
            expandableRelativeLayouts2.collapse();
            expandableRelativeLayouts1.collapse();
            expandableRelativeLayouts3.collapse();
            expandableRelativeLayouts5.collapse();
        }
        if (view.getId() == R.id.s5) {
            expandableRelativeLayouts5.toggle();
            expandableRelativeLayouts2.collapse();
            expandableRelativeLayouts1.collapse();
            expandableRelativeLayouts4.collapse();
            expandableRelativeLayouts3.collapse();
        }

    }
}
