package bvrit.bvrithelp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.github.aakira.expandablelayout.ExpandableRelativeLayout;

public class NIZAMPET extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nizampet);
        setTitle("NIZAMPET");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void nizampetinfo(View view) {
        ExpandableRelativeLayout expandableRelativeLayoutn1;
        ExpandableRelativeLayout expandableRelativeLayoutn2;
        ExpandableRelativeLayout expandableRelativeLayoutn3;

        expandableRelativeLayoutn1 = (ExpandableRelativeLayout) findViewById(R.id.n1view);
        expandableRelativeLayoutn2 = (ExpandableRelativeLayout) findViewById(R.id.n2view);
        expandableRelativeLayoutn3 = (ExpandableRelativeLayout) findViewById(R.id.n3view);
        if (view.getId() == R.id.n1) {
            expandableRelativeLayoutn1.toggle();
            expandableRelativeLayoutn2.collapse();
            expandableRelativeLayoutn3.collapse();
        }
        if (view.getId() == R.id.n2) {
            expandableRelativeLayoutn2.toggle();
            expandableRelativeLayoutn1.collapse();
            expandableRelativeLayoutn3.collapse();
        }
        if (view.getId() == R.id.n3) {
            expandableRelativeLayoutn3.toggle();
            expandableRelativeLayoutn2.collapse();
            expandableRelativeLayoutn1.collapse();
        }
    }
}
