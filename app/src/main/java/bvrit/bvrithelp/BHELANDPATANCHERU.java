package bvrit.bvrithelp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.github.aakira.expandablelayout.ExpandableRelativeLayout;

public class BHELANDPATANCHERU extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bhelandpatancheru);
        setTitle("BHEL AND PATANCHERU");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void bhelinfo(View view) {
        ExpandableRelativeLayout expandableRelativeLayoutbh1;
        ExpandableRelativeLayout expandableRelativeLayoutbh2;
        ExpandableRelativeLayout expandableRelativeLayoutbh3;
        ExpandableRelativeLayout expandableRelativeLayoutbh4;
        ExpandableRelativeLayout expandableRelativeLayoutbh5;

        expandableRelativeLayoutbh1 = (ExpandableRelativeLayout) findViewById(R.id.bh1view);
        expandableRelativeLayoutbh2 = (ExpandableRelativeLayout) findViewById(R.id.bh2view);
        expandableRelativeLayoutbh3 = (ExpandableRelativeLayout) findViewById(R.id.bh3view);
        expandableRelativeLayoutbh4 = (ExpandableRelativeLayout) findViewById(R.id.bh4view);
        expandableRelativeLayoutbh5 = (ExpandableRelativeLayout) findViewById(R.id.bh5view);
        if (view.getId() == R.id.bh1) {
            expandableRelativeLayoutbh1.toggle();
            expandableRelativeLayoutbh2.collapse();
            expandableRelativeLayoutbh3.collapse();
            expandableRelativeLayoutbh4.collapse();
            expandableRelativeLayoutbh5.collapse();
        }
        if (view.getId() == R.id.bh2) {
            expandableRelativeLayoutbh2.toggle();
            expandableRelativeLayoutbh1.collapse();
            expandableRelativeLayoutbh3.collapse();
            expandableRelativeLayoutbh4.collapse();
            expandableRelativeLayoutbh5.collapse();
        }
        if (view.getId() == R.id.bh3) {
            expandableRelativeLayoutbh3.toggle();
            expandableRelativeLayoutbh2.collapse();
            expandableRelativeLayoutbh1.collapse();
            expandableRelativeLayoutbh4.collapse();
            expandableRelativeLayoutbh5.collapse();
        }
        if (view.getId() == R.id.bh4) {
            expandableRelativeLayoutbh4.toggle();
            expandableRelativeLayoutbh2.collapse();
            expandableRelativeLayoutbh3.collapse();
            expandableRelativeLayoutbh1.collapse();
            expandableRelativeLayoutbh5.collapse();
        }
        if (view.getId() == R.id.bh5) {
            expandableRelativeLayoutbh5.toggle();
            expandableRelativeLayoutbh2.collapse();
            expandableRelativeLayoutbh3.collapse();
            expandableRelativeLayoutbh4.collapse();
            expandableRelativeLayoutbh1.collapse();
        }
    }
}
