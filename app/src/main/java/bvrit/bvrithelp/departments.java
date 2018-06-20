package bvrit.bvrithelp;

import android.content.Intent;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class departments extends AppCompatActivity {

    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle actionBarDrawerToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.departments);
        setTitle("Departments");
        mDrawerLayout = (DrawerLayout) findViewById(R.id.departments);
        actionBarDrawerToggle = new ActionBarDrawerToggle(this, mDrawerLayout, R.string.open, R.string.close);

        mDrawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.placements) {
            Intent i = new Intent(departments.this, TrainingPlacements.class);
            startActivity(i);
        }
        if(item.getItemId()==R.id.home)
        {
            Intent i=new Intent(departments.this,MainActivity.class);
            startActivity(i);
        }
        if(item.getItemId()==R.id.departments)
        {
            Intent i=new Intent(departments.this,departments.class);
            startActivity(i);
        }
        if(item.getItemId()==R.id.principal)
        {
            Intent i=new Intent(departments.this,Principal.class);
            startActivity(i);
        }
        if(item.getItemId()==R.id.aboutus)
        {
            Intent i=new Intent(departments.this,AboutUs.class);
            startActivity(i);
        }
        if(item.getItemId()==R.id.library)
        {
            Intent i=new Intent(departments.this,Library.class);
            startActivity(i);
        }
        if(item.getItemId()==R.id.transport)
        {
            Intent i=new Intent(departments.this,Transport.class);
            startActivity(i);
        }
        if(item.getItemId()==R.id.hostels)
        {
            Intent i=new Intent(departments.this,Hostels.class);
            startActivity(i);
        }
        if(item.getItemId()==R.id.wellnesscenter)
        {
            Intent i=new Intent(departments.this,WellnessCenter.class);
            startActivity(i);
        }
        if(item.getItemId()==R.id.adminaccounts)
        {
            Intent i=new Intent(departments.this,AdminAccouns.class);
            startActivity(i);
        }
        if(item.getItemId()==R.id.exambranch)
        {
            Intent i=new Intent(departments.this,ExamBranch.class);
            startActivity(i);
        }
        if(item.getItemId()==R.id.cetsupport)
        {
            Intent i=new Intent(departments.this,CetSupport.class);
            startActivity(i);
        }
        if(item.getItemId()==R.id.contactus)
        {
            Intent i=new Intent(departments.this,ContactUs.class);
            startActivity(i);
        }
        if (actionBarDrawerToggle.onOptionsItemSelected(item)) {
            return true;
        }
        return super.onOptionsItemSelected(item);

    }
    public void NextPage(View view)
    {
        if(view.getId()==R.id.phe)
        {
            Intent intent=new Intent(departments.this,DepPhe.class);
            startActivity(intent);
        }
        if(view.getId()==R.id.bio_medical)
        {
            Intent intent=new Intent(departments.this,DepBME.class);
            startActivity(intent);
        }

        if(view.getId()==R.id.basic_sciences)
        {
            Intent intent=new Intent(departments.this,DepBSC.class);
            startActivity(intent);
        }

        if(view.getId()==R.id.chemical)
        {
            Intent intent=new Intent(departments.this,DepCHEM.class);
            startActivity(intent);
        }

        if(view.getId()==R.id.civil)
        {
            Intent intent=new Intent(departments.this,DepCIVIL.class);
            startActivity(intent);
        }


        if(view.getId()==R.id.cse)
        {
            Intent intent=new Intent(departments.this,DepCSE.class);
            startActivity(intent);
        }


        if(view.getId()==R.id.ece)
        {
            Intent intent=new Intent(departments.this,DepECE.class);
            startActivity(intent);
        }

        if(view.getId()==R.id.eee)
        {
            Intent intent=new Intent(departments.this,DepEEE.class);
            startActivity(intent);
        }

        if(view.getId()==R.id.it)
        {
            Intent intent=new Intent(departments.this,DepIT.class);
            startActivity(intent);
        }

        if(view.getId()==R.id.mechanical)
        {
            Intent intent=new Intent(departments.this,DepMECH.class);
            startActivity(intent);
        }

        if(view.getId()==R.id.mba)
        {
            Intent intent=new Intent(departments.this,DepMBA.class);
            startActivity(intent);
        }
    }
    @Override
    public void onBackPressed() {
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
