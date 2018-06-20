package bvrit.bvrithelp;

import android.content.Intent;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class TrainingPlacements extends AppCompatActivity {

    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle actionBarDrawerToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.training_placements);
        setTitle("Placement Cell");
        mDrawerLayout = (DrawerLayout) findViewById(R.id.placements);
        actionBarDrawerToggle = new ActionBarDrawerToggle(this, mDrawerLayout, R.string.open, R.string.close);

        mDrawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    @Override
    public void onBackPressed() {
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId() == R.id.home) {
            Intent i = new Intent(TrainingPlacements.this, MainActivity.class);
            startActivity(i);
        }
        if (item.getItemId() == R.id.departments) {
            Intent i = new Intent(TrainingPlacements.this, departments.class);
            startActivity(i);
        }
        if (item.getItemId() == R.id.principal) {
            Intent i = new Intent(TrainingPlacements.this, Principal.class);
            startActivity(i);
        }
        if (item.getItemId() == R.id.aboutus) {
            Intent i = new Intent(TrainingPlacements.this, AboutUs.class);
            startActivity(i);
        }
        if (item.getItemId() == R.id.library) {
            Intent i = new Intent(TrainingPlacements.this, Library.class);
            startActivity(i);
        }
        if (item.getItemId() == R.id.transport) {
            Intent i = new Intent(TrainingPlacements.this, Transport.class);
            startActivity(i);
        }
        if (item.getItemId() == R.id.hostels) {
            Intent i = new Intent(TrainingPlacements.this, Hostels.class);
            startActivity(i);
        }
        if (item.getItemId() == R.id.wellnesscenter) {
            Intent i = new Intent(TrainingPlacements.this, WellnessCenter.class);
            startActivity(i);
        }
        if (item.getItemId() == R.id.adminaccounts) {
            Intent i = new Intent(TrainingPlacements.this, AdminAccouns.class);
            startActivity(i);
        }
        if (item.getItemId() == R.id.exambranch) {
            Intent i = new Intent(TrainingPlacements.this, ExamBranch.class);
            startActivity(i);
        }
        if (item.getItemId() == R.id.cetsupport) {
            Intent i = new Intent(TrainingPlacements.this, CetSupport.class);
            startActivity(i);
        }
        if (item.getItemId() == R.id.contactus) {
            Intent i = new Intent(TrainingPlacements.this, ContactUs.class);
            startActivity(i);
        }
        if (item.getItemId() == R.id.placements) {
            Intent i = new Intent(TrainingPlacements.this, TrainingPlacements.class);
            startActivity(i);
        }
        if (actionBarDrawerToggle.onOptionsItemSelected(item)) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
