package bvrit.bvrithelp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.github.aakira.expandablelayout.ExpandableRelativeLayout;

public class MIYAPUR extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.miyapur);
        setTitle("MIYAPUR");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    public void miyapurinfo(View view) {
        ExpandableRelativeLayout expandableRelativeLayoutm1;
        ExpandableRelativeLayout expandableRelativeLayoutm2;
        ExpandableRelativeLayout expandableRelativeLayoutm3;
        ExpandableRelativeLayout expandableRelativeLayoutm4;
        ExpandableRelativeLayout expandableRelativeLayoutm5;
        ExpandableRelativeLayout expandableRelativeLayoutm6;
        ExpandableRelativeLayout expandableRelativeLayoutm7;

        expandableRelativeLayoutm1 = (ExpandableRelativeLayout) findViewById(R.id.m1view);
        expandableRelativeLayoutm2 = (ExpandableRelativeLayout) findViewById(R.id.m2view);
        expandableRelativeLayoutm3 = (ExpandableRelativeLayout) findViewById(R.id.m3view);
        expandableRelativeLayoutm4 = (ExpandableRelativeLayout) findViewById(R.id.m4view);
        expandableRelativeLayoutm5 = (ExpandableRelativeLayout) findViewById(R.id.m5view);
        expandableRelativeLayoutm6 = (ExpandableRelativeLayout) findViewById(R.id.m6view);
        expandableRelativeLayoutm7 = (ExpandableRelativeLayout) findViewById(R.id.m7view);
        if (view.getId() == R.id.m1) {
            expandableRelativeLayoutm1.toggle();
            expandableRelativeLayoutm2.collapse();
            expandableRelativeLayoutm3.collapse();
            expandableRelativeLayoutm4.collapse();
            expandableRelativeLayoutm5.collapse();
            expandableRelativeLayoutm6.collapse();
            expandableRelativeLayoutm7.collapse();
        }
        if (view.getId() == R.id.m2) {
            expandableRelativeLayoutm2.toggle();
            expandableRelativeLayoutm1.collapse();
            expandableRelativeLayoutm3.collapse();
            expandableRelativeLayoutm4.collapse();
            expandableRelativeLayoutm5.collapse();
            expandableRelativeLayoutm6.collapse();
            expandableRelativeLayoutm7.collapse();
        }
        if (view.getId() == R.id.m3) {
            expandableRelativeLayoutm3.toggle();
            expandableRelativeLayoutm2.collapse();
            expandableRelativeLayoutm1.collapse();
            expandableRelativeLayoutm4.collapse();
            expandableRelativeLayoutm5.collapse();
            expandableRelativeLayoutm6.collapse();
            expandableRelativeLayoutm7.collapse();
        }
        if (view.getId() == R.id.m4) {
            expandableRelativeLayoutm4.toggle();
            expandableRelativeLayoutm2.collapse();
            expandableRelativeLayoutm1.collapse();
            expandableRelativeLayoutm3.collapse();
            expandableRelativeLayoutm5.collapse();
            expandableRelativeLayoutm6.collapse();
            expandableRelativeLayoutm7.collapse();
        }
        if (view.getId() == R.id.m5) {
            expandableRelativeLayoutm5.toggle();
            expandableRelativeLayoutm2.collapse();
            expandableRelativeLayoutm1.collapse();
            expandableRelativeLayoutm4.collapse();
            expandableRelativeLayoutm3.collapse();
            expandableRelativeLayoutm6.collapse();
            expandableRelativeLayoutm7.collapse();
        }
        if (view.getId() == R.id.m6) {
            expandableRelativeLayoutm6.toggle();
            expandableRelativeLayoutm2.collapse();
            expandableRelativeLayoutm1.collapse();
            expandableRelativeLayoutm4.collapse();
            expandableRelativeLayoutm5.collapse();
            expandableRelativeLayoutm3.collapse();
            expandableRelativeLayoutm7.collapse();
        }
        if (view.getId() == R.id.m7) {
            expandableRelativeLayoutm7.toggle();
            expandableRelativeLayoutm2.collapse();
            expandableRelativeLayoutm1.collapse();
            expandableRelativeLayoutm4.collapse();
            expandableRelativeLayoutm5.collapse();
            expandableRelativeLayoutm6.collapse();
            expandableRelativeLayoutm3.collapse();
        }
}
}

