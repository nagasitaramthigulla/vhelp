package bvrit.bvrithelp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.github.aakira.expandablelayout.ExpandableRelativeLayout;

public class DepBSC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dep_bsc);
        setTitle("Basic Sciences");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    public void depinfo(View view)
    {
        ExpandableRelativeLayout expandableRelativeLayouthod;
        expandableRelativeLayouthod=(ExpandableRelativeLayout)findViewById(R.id.bschodview);
        ExpandableRelativeLayout expandableRelativeLayoutfac;
        expandableRelativeLayoutfac=(ExpandableRelativeLayout)findViewById(R.id.bscfacultyview);
        if(view.getId()==R.id.bschod) {
            expandableRelativeLayouthod.toggle();
            expandableRelativeLayoutfac.collapse();
        }
        if(view.getId()==R.id.bscfaculty){
            expandableRelativeLayoutfac.toggle();
            expandableRelativeLayouthod.collapse();
        }
    }
}
