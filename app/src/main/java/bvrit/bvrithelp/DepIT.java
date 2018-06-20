package bvrit.bvrithelp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.github.aakira.expandablelayout.ExpandableRelativeLayout;

public class DepIT extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dep_it);
        setTitle("Information Technology");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void depinfo(View view)
    {
        ExpandableRelativeLayout expandableRelativeLayouthod;
        expandableRelativeLayouthod=(ExpandableRelativeLayout)findViewById(R.id.ithodview);
        ExpandableRelativeLayout expandableRelativeLayoutfac;
        expandableRelativeLayoutfac=(ExpandableRelativeLayout)findViewById(R.id.itfacultyview);
        if(view.getId()==R.id.ithod) {
            expandableRelativeLayouthod.toggle();
            expandableRelativeLayoutfac.collapse();
        }
        if(view.getId()==R.id.itfaculty){
            expandableRelativeLayoutfac.toggle();
            expandableRelativeLayouthod.collapse();
        }
    }
}
