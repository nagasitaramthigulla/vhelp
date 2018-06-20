package bvrit.bvrithelp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.github.aakira.expandablelayout.ExpandableRelativeLayout;

public class DepPhe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dep_phe);
        setTitle("pharmaceutical Engineering");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    public void depinfo(View view)
    {
        ExpandableRelativeLayout expandableRelativeLayouthod;
        expandableRelativeLayouthod=(ExpandableRelativeLayout)findViewById(R.id.phehodview);
        ExpandableRelativeLayout expandableRelativeLayoutfac;
        expandableRelativeLayoutfac=(ExpandableRelativeLayout)findViewById(R.id.phefacultyview);
        if(view.getId()==R.id.phehod) {
            expandableRelativeLayouthod.toggle();
            expandableRelativeLayoutfac.collapse();
        }
        if(view.getId()==R.id.phefaculty){
            expandableRelativeLayoutfac.toggle();
            expandableRelativeLayouthod.collapse();
        }
    }
}
