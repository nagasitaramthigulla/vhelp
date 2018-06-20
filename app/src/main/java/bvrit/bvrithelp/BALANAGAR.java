package bvrit.bvrithelp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.github.aakira.expandablelayout.ExpandableRelativeLayout;

public class BALANAGAR extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.balanagar);
        setTitle("BALANAGAR");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    public void balanagarinfo(View view) {
        ExpandableRelativeLayout expandableRelativeLayoutb1;
        ExpandableRelativeLayout expandableRelativeLayoutb2;
        ExpandableRelativeLayout expandableRelativeLayoutb3;
        ExpandableRelativeLayout expandableRelativeLayoutb4;
        ExpandableRelativeLayout expandableRelativeLayoutb5;
        ExpandableRelativeLayout expandableRelativeLayoutb6;
        ExpandableRelativeLayout expandableRelativeLayoutb7;
        ExpandableRelativeLayout expandableRelativeLayoutb8;
        ExpandableRelativeLayout expandableRelativeLayoutb9;
        ExpandableRelativeLayout expandableRelativeLayoutb10;

        expandableRelativeLayoutb1 = (ExpandableRelativeLayout) findViewById(R.id.b1view);
        expandableRelativeLayoutb2 = (ExpandableRelativeLayout) findViewById(R.id.b2view);
        expandableRelativeLayoutb3 = (ExpandableRelativeLayout) findViewById(R.id.b3view);
        expandableRelativeLayoutb4 = (ExpandableRelativeLayout) findViewById(R.id.b4view);
        expandableRelativeLayoutb5 = (ExpandableRelativeLayout) findViewById(R.id.b5view);
        expandableRelativeLayoutb6 = (ExpandableRelativeLayout) findViewById(R.id.b6view);
        expandableRelativeLayoutb7 = (ExpandableRelativeLayout) findViewById(R.id.b7view);
        expandableRelativeLayoutb8 = (ExpandableRelativeLayout) findViewById(R.id.b8view);
        expandableRelativeLayoutb9 = (ExpandableRelativeLayout) findViewById(R.id.b9view);
        expandableRelativeLayoutb10 = (ExpandableRelativeLayout) findViewById(R.id.b10view);
        if (view.getId() == R.id.b1) {
            expandableRelativeLayoutb1.toggle();
            expandableRelativeLayoutb2.collapse();
            expandableRelativeLayoutb3.collapse();
            expandableRelativeLayoutb4.collapse();
            expandableRelativeLayoutb5.collapse();
            expandableRelativeLayoutb6.collapse();
            expandableRelativeLayoutb7.collapse();
            expandableRelativeLayoutb8.collapse();
            expandableRelativeLayoutb9.collapse();
            expandableRelativeLayoutb10.collapse();
        }
        if (view.getId() == R.id.b2) {
            expandableRelativeLayoutb2.toggle();
            expandableRelativeLayoutb1.collapse();
            expandableRelativeLayoutb3.collapse();
            expandableRelativeLayoutb4.collapse();
            expandableRelativeLayoutb5.collapse();
            expandableRelativeLayoutb6.collapse();
            expandableRelativeLayoutb7.collapse();
            expandableRelativeLayoutb8.collapse();
            expandableRelativeLayoutb9.collapse();
            expandableRelativeLayoutb10.collapse();
        }
        if (view.getId() == R.id.b3) {
            expandableRelativeLayoutb3.toggle();
            expandableRelativeLayoutb2.collapse();
            expandableRelativeLayoutb1.collapse();
            expandableRelativeLayoutb4.collapse();
            expandableRelativeLayoutb5.collapse();
            expandableRelativeLayoutb6.collapse();
            expandableRelativeLayoutb7.collapse();
            expandableRelativeLayoutb8.collapse();
            expandableRelativeLayoutb9.collapse();
            expandableRelativeLayoutb10.collapse();
        }
        if (view.getId() == R.id.b4) {
            expandableRelativeLayoutb4.toggle();
            expandableRelativeLayoutb2.collapse();
            expandableRelativeLayoutb3.collapse();
            expandableRelativeLayoutb1.collapse();
            expandableRelativeLayoutb5.collapse();
            expandableRelativeLayoutb6.collapse();
            expandableRelativeLayoutb7.collapse();
            expandableRelativeLayoutb8.collapse();
            expandableRelativeLayoutb9.collapse();
            expandableRelativeLayoutb10.collapse();
        }
        if (view.getId() == R.id.b5) {
            expandableRelativeLayoutb5.toggle();
            expandableRelativeLayoutb2.collapse();
            expandableRelativeLayoutb3.collapse();
            expandableRelativeLayoutb4.collapse();
            expandableRelativeLayoutb1.collapse();
            expandableRelativeLayoutb6.collapse();
            expandableRelativeLayoutb7.collapse();
            expandableRelativeLayoutb8.collapse();
            expandableRelativeLayoutb9.collapse();
            expandableRelativeLayoutb10.collapse();
        }
        if (view.getId() == R.id.b6) {
            expandableRelativeLayoutb6.toggle();
            expandableRelativeLayoutb2.collapse();
            expandableRelativeLayoutb3.collapse();
            expandableRelativeLayoutb4.collapse();
            expandableRelativeLayoutb5.collapse();
            expandableRelativeLayoutb1.collapse();
            expandableRelativeLayoutb7.collapse();
            expandableRelativeLayoutb8.collapse();
            expandableRelativeLayoutb9.collapse();
            expandableRelativeLayoutb10.collapse();
        }
        if (view.getId() == R.id.b7) {
            expandableRelativeLayoutb7.toggle();
            expandableRelativeLayoutb2.collapse();
            expandableRelativeLayoutb3.collapse();
            expandableRelativeLayoutb4.collapse();
            expandableRelativeLayoutb5.collapse();
            expandableRelativeLayoutb6.collapse();
            expandableRelativeLayoutb1.collapse();
            expandableRelativeLayoutb8.collapse();
            expandableRelativeLayoutb9.collapse();
            expandableRelativeLayoutb10.collapse();
        }
        if (view.getId() == R.id.b8) {
            expandableRelativeLayoutb8.toggle();
            expandableRelativeLayoutb2.collapse();
            expandableRelativeLayoutb3.collapse();
            expandableRelativeLayoutb4.collapse();
            expandableRelativeLayoutb5.collapse();
            expandableRelativeLayoutb6.collapse();
            expandableRelativeLayoutb7.collapse();
            expandableRelativeLayoutb1.collapse();
            expandableRelativeLayoutb9.collapse();
            expandableRelativeLayoutb10.collapse();
        }
        if (view.getId() == R.id.b9) {
            expandableRelativeLayoutb9.toggle();
            expandableRelativeLayoutb2.collapse();
            expandableRelativeLayoutb3.collapse();
            expandableRelativeLayoutb4.collapse();
            expandableRelativeLayoutb5.collapse();
            expandableRelativeLayoutb6.collapse();
            expandableRelativeLayoutb7.collapse();
            expandableRelativeLayoutb8.collapse();
            expandableRelativeLayoutb1.collapse();
            expandableRelativeLayoutb10.collapse();
        }
        if (view.getId() == R.id.b10) {
            expandableRelativeLayoutb10.toggle();
            expandableRelativeLayoutb2.collapse();
            expandableRelativeLayoutb3.collapse();
            expandableRelativeLayoutb4.collapse();
            expandableRelativeLayoutb5.collapse();
            expandableRelativeLayoutb6.collapse();
            expandableRelativeLayoutb7.collapse();
            expandableRelativeLayoutb8.collapse();
            expandableRelativeLayoutb9.collapse();
            expandableRelativeLayoutb1.collapse();
        }


    }
}
