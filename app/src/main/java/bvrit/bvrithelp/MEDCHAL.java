package bvrit.bvrithelp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.github.aakira.expandablelayout.ExpandableRelativeLayout;

public class MEDCHAL extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.medchal);
        setTitle("MEDCHAL");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void medchalinfo(View view) {
        ExpandableRelativeLayout expandableRelativeLayoutmed1;

        expandableRelativeLayoutmed1 = (ExpandableRelativeLayout) findViewById(R.id.med1view);
        if (view.getId() == R.id.med1) {
            expandableRelativeLayoutmed1.toggle();
        }
    }
}
