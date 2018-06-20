package bvrit.bvrithelp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.github.aakira.expandablelayout.ExpandableRelativeLayout;

public class DepMBA extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dep_mba);
        setTitle("MBA");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    public void depinfo(View view)
    {
        ExpandableRelativeLayout expandableRelativeLayouthod;
        expandableRelativeLayouthod=(ExpandableRelativeLayout)findViewById(R.id.mbahodview);
        ExpandableRelativeLayout expandableRelativeLayoutfac;
        expandableRelativeLayoutfac=(ExpandableRelativeLayout)findViewById(R.id.mbafacultyview);
        if(view.getId()==R.id.mbahod) {
            expandableRelativeLayouthod.toggle();
            expandableRelativeLayoutfac.collapse();
        }
        if(view.getId()==R.id.mbafaculty){
            expandableRelativeLayoutfac.toggle();
            expandableRelativeLayouthod.collapse();
        }
    }
}
