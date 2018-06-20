package bvrit.bvrithelp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.github.aakira.expandablelayout.ExpandableRelativeLayout;

public class DepBME extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dep_bme);
        setTitle("Bio Medical");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    public void depinfo(View view)
    {
        ExpandableRelativeLayout expandableRelativeLayouthod;
        expandableRelativeLayouthod=(ExpandableRelativeLayout)findViewById(R.id.bmehodview);
        ExpandableRelativeLayout expandableRelativeLayoutfac;
        expandableRelativeLayoutfac=(ExpandableRelativeLayout)findViewById(R.id.bmefacultyview);
        if(view.getId()==R.id.bmehod) {
            expandableRelativeLayouthod.toggle();
            expandableRelativeLayoutfac.collapse();
        }
        if(view.getId()==R.id.bmefaculty){
            expandableRelativeLayoutfac.toggle();
            expandableRelativeLayouthod.collapse();
        }
    }
}
