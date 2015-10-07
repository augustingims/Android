package app.gims.com.menu;

import android.os.SystemClock;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity implements View.OnLongClickListener {
    RelativeLayout view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        view = (RelativeLayout)findViewById(R.id.view1);
        view.setOnLongClickListener(this);
    }

    private void onCreateMenu(Menu menu){
        SubMenu m = menu.addSubMenu(0,200,0,"Menu +");
        m.add(1,103,0,"Copier").setIcon(android.R.drawable.ic_input_add);
        m.add(1,104,0,"Coller").setIcon(android.R.drawable.ic_input_get);
        m.add(1,105,0,"Renomer").setIcon(android.R.drawable.ic_menu_edit);
        m.add(1,106,0,"Supprimer").setIcon(android.R.drawable.ic_input_delete);
        m.setIcon(android.R.drawable.ic_menu_agenda);
        m.setHeaderIcon(android.R.drawable.ic_menu_add);
        menu.add(0,101,0,"Options");
        menu.add(0,102,0,"Quitter");
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        onCreateMenu(menu);
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        switch (id){
            case 101:
                Toast.makeText(this,"Menu Option",Toast.LENGTH_LONG).show();
                break;
            case 102:
                Toast.makeText(this,"Menu Quitter",Toast.LENGTH_LONG).show();
                break;
            case 103:
                Toast.makeText(this,"Menu Copier",Toast.LENGTH_LONG).show();
                break;
            case 104:
                Toast.makeText(this,"Menu Collerr",Toast.LENGTH_LONG).show();
                break;
            case 105:
                Toast.makeText(this,"Menu Renomer",Toast.LENGTH_LONG).show();
                break;
            case 106:
                Toast.makeText(this,"Menu Supprimer",Toast.LENGTH_LONG).show();
                break;
        }
        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        menu.findItem(200).setTitle(""+ SystemClock.elapsedRealtime());
        return super.onPrepareOptionsMenu(menu);
    }

    @Override
    public boolean onLongClick(View v) {
        v.showContextMenu();
        return false;
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        onCreateMenu(menu);
        super.onCreateContextMenu(menu, v, menuInfo);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id){
            case 101:
                Toast.makeText(this,"Menu Option",Toast.LENGTH_LONG).show();
                break;
            case 102:
                Toast.makeText(this,"Menu Quitter",Toast.LENGTH_LONG).show();
                break;
            case 103:
                Toast.makeText(this,"Menu Copier",Toast.LENGTH_LONG).show();
                break;
            case 104:
                Toast.makeText(this,"Menu Collerr",Toast.LENGTH_LONG).show();
                break;
            case 105:
                Toast.makeText(this,"Menu Renomer",Toast.LENGTH_LONG).show();
                break;
            case 106:
                Toast.makeText(this,"Menu Supprimer",Toast.LENGTH_LONG).show();
                break;
        }
        return super.onContextItemSelected(item);
    }
}
