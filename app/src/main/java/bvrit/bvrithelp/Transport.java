package bvrit.bvrithelp;

import android.content.Intent;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.github.aakira.expandablelayout.ExpandableRelativeLayout;

public class Transport extends AppCompatActivity {

    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle actionBarDrawerToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.transport);
        setTitle("Transport");
        mDrawerLayout = (DrawerLayout) findViewById(R.id.transport);
        actionBarDrawerToggle = new ActionBarDrawerToggle(this, mDrawerLayout, R.string.open, R.string.close);

        mDrawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.placements) {
            Intent i = new Intent(Transport.this, TrainingPlacements.class);
            startActivity(i);
        }
        if (item.getItemId() == R.id.home) {
            Intent i = new Intent(Transport.this, MainActivity.class);
            startActivity(i);
        }
        if (item.getItemId() == R.id.departments) {
            Intent i = new Intent(Transport.this, departments.class);
            startActivity(i);
        }
        if (item.getItemId() == R.id.principal) {
            Intent i = new Intent(Transport.this, Principal.class);
            startActivity(i);
        }
        if (item.getItemId() == R.id.aboutus) {
            Intent i = new Intent(Transport.this, AboutUs.class);
            startActivity(i);
        }
        if (item.getItemId() == R.id.library) {
            Intent i = new Intent(Transport.this, Library.class);
            startActivity(i);
        }
        if (item.getItemId() == R.id.transport) {
            Intent i = new Intent(Transport.this, Transport.class);
            startActivity(i);
        }
        if (item.getItemId() == R.id.hostels) {
            Intent i = new Intent(Transport.this, Hostels.class);
            startActivity(i);
        }
        if (item.getItemId() == R.id.wellnesscenter) {
            Intent i = new Intent(Transport.this, WellnessCenter.class);
            startActivity(i);
        }
        if (item.getItemId() == R.id.adminaccounts) {
            Intent i = new Intent(Transport.this, AdminAccouns.class);
            startActivity(i);
        }
        if (item.getItemId() == R.id.exambranch) {
            Intent i = new Intent(Transport.this, ExamBranch.class);
            startActivity(i);
        }
        if (item.getItemId() == R.id.cetsupport) {
            Intent i = new Intent(Transport.this, CetSupport.class);
            startActivity(i);
        }
        if (item.getItemId() == R.id.contactus) {
            Intent i = new Intent(Transport.this, ContactUs.class);
            startActivity(i);
        }
        if (actionBarDrawerToggle.onOptionsItemSelected(item)) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }




    public void NextPage(View view)
    {
        if(view.getId()==R.id.jntu)
        {
            Intent intent=new Intent(Transport.this,JNTU.class);
            startActivity(intent);
        }

        if(view.getId()==R.id.nizampet)
        {
            Intent intent=new Intent(Transport.this,NIZAMPET.class);
            startActivity(intent);
        }

        if(view.getId()==R.id.miyapur)
        {
            Intent intent=new Intent(Transport.this,MIYAPUR.class);
            startActivity(intent);
        }

        if(view.getId()==R.id.bhelandpatancheru)
        {
            Intent intent=new Intent(Transport.this,BHELANDPATANCHERU.class);
            startActivity(intent);
        }


        if(view.getId()==R.id.balanagar)
        {
            Intent intent=new Intent(Transport.this,BALANAGAR.class);
            startActivity(intent);
        }


        if(view.getId()==R.id.medchal)
        {
            Intent intent=new Intent(Transport.this,MEDCHAL.class);
            startActivity(intent);
        }

        if(view.getId()==R.id.secundrabad)
        {
            Intent intent=new Intent(Transport.this,SECUNDRABAD.class);
            startActivity(intent);
        }

        if(view.getId()==R.id.lothukunta)
        {
            Intent intent=new Intent(Transport.this,LOTHUKUNTA.class);
            startActivity(intent);
        }

        if(view.getId()==R.id.sangareddy)
        {
            Intent intent=new Intent(Transport.this,SANGAREDDY.class);
            startActivity(intent);
        }

        if(view.getId()==R.id.medakgajwel)
        {
            Intent intent=new Intent(Transport.this,MEDAK_GAJWAL.class);
            startActivity(intent);
        }
    }


    @Override
    public void onBackPressed() {
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
