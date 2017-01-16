package com.example.silvanadorantes.slider;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;

import com.viewpagerindicator.CirclePageIndicator;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private AdapterFragmentPager adapterFragmentPager;
    private CirclePageIndicator circlePageIndicator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Cambia la notification bar al color transparent
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
        }




        viewPager = (ViewPager) findViewById(R.id.viewpager);
        adapterFragmentPager = new AdapterFragmentPager(getSupportFragmentManager(), this);
        adapterFragmentPager.addFragment(SplashScreenFragment.newInstance());
        adapterFragmentPager.addFragment(SliderUnoFragment.newInstance());
        adapterFragmentPager.addFragment(SliderDosFragment.newInstance());
        adapterFragmentPager.addFragment(SliderTresFragment.newInstance());
        adapterFragmentPager.addFragment(SliderCuatroFragment.newInstance());

        viewPager.setAdapter(adapterFragmentPager);

        circlePageIndicator = (CirclePageIndicator)findViewById(R.id.indicator);
        circlePageIndicator.setViewPager(viewPager);





    }

    @Override
    public void onBackPressed() {
        if (viewPager.getCurrentItem() == 0)
            super.onBackPressed();
        else
            this.viewPager.setCurrentItem(this.viewPager.getCurrentItem() -1);

    }








    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
