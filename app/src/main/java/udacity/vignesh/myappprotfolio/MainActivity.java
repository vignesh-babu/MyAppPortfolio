package udacity.vignesh.myappprotfolio;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        context = getApplicationContext();
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

    public void spotifyMessage(View view) {
        Toast.makeText(context, "This button will launch Spotify App", Toast.LENGTH_SHORT).show();
    }

    public void scoresMessage(View view) {
        Toast.makeText(context, "This button will launch Scores App", Toast.LENGTH_SHORT).show();
    }

    public void libraryMessage(View view) {
        Toast.makeText(context, "This button will launch Library App", Toast.LENGTH_SHORT).show();
    }

    public void buildItMessage(View view) {
        Toast.makeText(context, "This button will launch Build It Bigger App", Toast.LENGTH_SHORT).show();
    }

    public void xyzMessage(View view) {
        Toast.makeText(context, "This button will launch XYZ Reader App", Toast.LENGTH_SHORT).show();
    }

    public void capstoneMessage(View view) {
        Toast.makeText(context, "This button will launch Capstone App", Toast.LENGTH_SHORT).show();
    }

}
