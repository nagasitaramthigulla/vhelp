package bvrit.bvrithelp;


import android.content.Intent;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.github.aakira.expandablelayout.ExpandableRelativeLayout;

public class JNTU extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jntu);
        setTitle("JNTU");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    public void jntuinfo(View view) {
        ExpandableRelativeLayout expandableRelativeLayoutj1;
        ExpandableRelativeLayout expandableRelativeLayoutj2;
        ExpandableRelativeLayout expandableRelativeLayoutj3;
        ExpandableRelativeLayout expandableRelativeLayoutj5;
        ExpandableRelativeLayout expandableRelativeLayoutj6;
        ExpandableRelativeLayout expandableRelativeLayoutj7;
        ExpandableRelativeLayout expandableRelativeLayoutj8;
        ExpandableRelativeLayout expandableRelativeLayoutj9;
        ExpandableRelativeLayout expandableRelativeLayoutj10;
        ExpandableRelativeLayout expandableRelativeLayoutj11;

        expandableRelativeLayoutj1 = (ExpandableRelativeLayout) findViewById(R.id.j1view);
        expandableRelativeLayoutj2 = (ExpandableRelativeLayout) findViewById(R.id.j2view);
        expandableRelativeLayoutj3 = (ExpandableRelativeLayout) findViewById(R.id.j3view);
        expandableRelativeLayoutj5 = (ExpandableRelativeLayout) findViewById(R.id.j5view);
        expandableRelativeLayoutj6 = (ExpandableRelativeLayout) findViewById(R.id.j6view);
        expandableRelativeLayoutj7 = (ExpandableRelativeLayout) findViewById(R.id.j7view);
        expandableRelativeLayoutj8 = (ExpandableRelativeLayout) findViewById(R.id.j8view);
        expandableRelativeLayoutj9 = (ExpandableRelativeLayout) findViewById(R.id.j9view);
        expandableRelativeLayoutj10 = (ExpandableRelativeLayout) findViewById(R.id.j10view);
        expandableRelativeLayoutj11 = (ExpandableRelativeLayout) findViewById(R.id.j11view);
        if (view.getId() == R.id.j1) {
            expandableRelativeLayoutj1.toggle();
            expandableRelativeLayoutj2.collapse();
            expandableRelativeLayoutj3.collapse();
            expandableRelativeLayoutj5.collapse();
            expandableRelativeLayoutj6.collapse();
            expandableRelativeLayoutj7.collapse();
            expandableRelativeLayoutj8.collapse();
            expandableRelativeLayoutj9.collapse();
            expandableRelativeLayoutj10.collapse();
            expandableRelativeLayoutj11.collapse();
        }

        if (view.getId() == R.id.j2) {
            expandableRelativeLayoutj2.toggle();
            expandableRelativeLayoutj1.collapse();
            expandableRelativeLayoutj3.collapse();
            expandableRelativeLayoutj5.collapse();
            expandableRelativeLayoutj6.collapse();
            expandableRelativeLayoutj7.collapse();
            expandableRelativeLayoutj8.collapse();
            expandableRelativeLayoutj9.collapse();
            expandableRelativeLayoutj10.collapse();
            expandableRelativeLayoutj11.collapse();

        }
        if (view.getId() == R.id.j3) {
            expandableRelativeLayoutj3.toggle();
            expandableRelativeLayoutj1.collapse();
            expandableRelativeLayoutj2.collapse();
            expandableRelativeLayoutj5.collapse();
            expandableRelativeLayoutj6.collapse();
            expandableRelativeLayoutj7.collapse();
            expandableRelativeLayoutj8.collapse();
            expandableRelativeLayoutj9.collapse();
            expandableRelativeLayoutj10.collapse();
            expandableRelativeLayoutj11.collapse();

        }
        if (view.getId() == R.id.j5) {
            expandableRelativeLayoutj5.toggle();
            expandableRelativeLayoutj1.collapse();
            expandableRelativeLayoutj3.collapse();
            expandableRelativeLayoutj2.collapse();
            expandableRelativeLayoutj6.collapse();
            expandableRelativeLayoutj7.collapse();
            expandableRelativeLayoutj8.collapse();
            expandableRelativeLayoutj9.collapse();
            expandableRelativeLayoutj10.collapse();
            expandableRelativeLayoutj11.collapse();

        }
        if (view.getId() == R.id.j6) {
            expandableRelativeLayoutj6.toggle();
            expandableRelativeLayoutj1.collapse();
            expandableRelativeLayoutj3.collapse();
            expandableRelativeLayoutj5.collapse();
            expandableRelativeLayoutj2.collapse();
            expandableRelativeLayoutj7.collapse();
            expandableRelativeLayoutj8.collapse();
            expandableRelativeLayoutj9.collapse();
            expandableRelativeLayoutj10.collapse();
            expandableRelativeLayoutj11.collapse();

        }
        if (view.getId() == R.id.j7) {
            expandableRelativeLayoutj7.toggle();
            expandableRelativeLayoutj1.collapse();
            expandableRelativeLayoutj3.collapse();
            expandableRelativeLayoutj5.collapse();
            expandableRelativeLayoutj6.collapse();
            expandableRelativeLayoutj2.collapse();
            expandableRelativeLayoutj8.collapse();
            expandableRelativeLayoutj9.collapse();
            expandableRelativeLayoutj10.collapse();
            expandableRelativeLayoutj11.collapse();
        }
        if (view.getId() == R.id.j8) {
            expandableRelativeLayoutj8.toggle();
            expandableRelativeLayoutj1.collapse();
            expandableRelativeLayoutj3.collapse();
            expandableRelativeLayoutj5.collapse();
            expandableRelativeLayoutj6.collapse();
            expandableRelativeLayoutj7.collapse();
            expandableRelativeLayoutj2.collapse();
            expandableRelativeLayoutj9.collapse();
            expandableRelativeLayoutj10.collapse();
            expandableRelativeLayoutj11.collapse();

        }
        if (view.getId() == R.id.j9) {
            expandableRelativeLayoutj9.toggle();
            expandableRelativeLayoutj1.collapse();
            expandableRelativeLayoutj3.collapse();
            expandableRelativeLayoutj5.collapse();
            expandableRelativeLayoutj6.collapse();
            expandableRelativeLayoutj7.collapse();
            expandableRelativeLayoutj2.collapse();
            expandableRelativeLayoutj8.collapse();
            expandableRelativeLayoutj10.collapse();
            expandableRelativeLayoutj11.collapse();

        }
        if (view.getId() == R.id.j10) {
            expandableRelativeLayoutj10.toggle();
            expandableRelativeLayoutj1.collapse();
            expandableRelativeLayoutj3.collapse();
            expandableRelativeLayoutj5.collapse();
            expandableRelativeLayoutj6.collapse();
            expandableRelativeLayoutj7.collapse();
            expandableRelativeLayoutj2.collapse();
            expandableRelativeLayoutj9.collapse();
            expandableRelativeLayoutj8.collapse();
            expandableRelativeLayoutj11.collapse();

        }
        if (view.getId() == R.id.j11) {
            expandableRelativeLayoutj11.toggle();
            expandableRelativeLayoutj1.collapse();
            expandableRelativeLayoutj3.collapse();
            expandableRelativeLayoutj5.collapse();
            expandableRelativeLayoutj6.collapse();
            expandableRelativeLayoutj7.collapse();
            expandableRelativeLayoutj2.collapse();
            expandableRelativeLayoutj9.collapse();
            expandableRelativeLayoutj10.collapse();
            expandableRelativeLayoutj2.collapse();

        }
    }
}
