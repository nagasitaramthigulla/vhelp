package bvrit.bvrithelp;

import android.content.Intent;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class CetSupport extends AppCompatActivity {

    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle actionBarDrawerToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cet_support);
        setTitle("CET Support");
        mDrawerLayout = (DrawerLayout) findViewById(R.id.cetsupport);
        actionBarDrawerToggle = new ActionBarDrawerToggle(this, mDrawerLayout, R.string.open, R.string.close);

        mDrawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId() == R.id.placements) {
            Intent i = new Intent(CetSupport.this, TrainingPlacements.class);
            startActivity(i);
        }
        if(item.getItemId()==R.id.home)
        {
            Intent i=new Intent(CetSupport.this,MainActivity.class);
            startActivity(i);
        }
        if(item.getItemId()==R.id.departments)
        {
            Intent i=new Intent(CetSupport.this,departments.class);
            startActivity(i);
        }
        if(item.getItemId()==R.id.principal)
        {
            Intent i=new Intent(CetSupport.this,Principal.class);
            startActivity(i);
        }
        if(item.getItemId()==R.id.aboutus)
        {
            Intent i=new Intent(CetSupport.this,AboutUs.class);
            startActivity(i);
        }
        if(item.getItemId()==R.id.library)
        {
            Intent i=new Intent(CetSupport.this,Library.class);
            startActivity(i);
        }
        if(item.getItemId()==R.id.transport)
        {
            Intent i=new Intent(CetSupport.this,Transport.class);
            startActivity(i);
        }
        if(item.getItemId()==R.id.hostels)
        {
            Intent i=new Intent(CetSupport.this,Hostels.class);
            startActivity(i);
        }
        if(item.getItemId()==R.id.wellnesscenter)
        {
            Intent i=new Intent(CetSupport.this,WellnessCenter.class);
            startActivity(i);
        }
        if(item.getItemId()==R.id.adminaccounts)
        {
            Intent i=new Intent(CetSupport.this,AdminAccouns.class);
            startActivity(i);
        }
        if(item.getItemId()==R.id.exambranch)
        {
            Intent i=new Intent(CetSupport.this,ExamBranch.class);
            startActivity(i);
        }
        if(item.getItemId()==R.id.cetsupport)
        {
            Intent i=new Intent(CetSupport.this,CetSupport.class);
            startActivity(i);
        }
        if(item.getItemId()==R.id.contactus)
        {
            Intent i=new Intent(CetSupport.this,ContactUs.class);
            startActivity(i);
        }
        if (actionBarDrawerToggle.onOptionsItemSelected(item)) {
            return true;
        }
        return super.onOptionsItemSelected(item);

    }
    @Override
    public void onBackPressed() {
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
