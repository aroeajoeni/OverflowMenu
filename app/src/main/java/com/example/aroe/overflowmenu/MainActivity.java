 package com.example.aroe.overflowmenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

 public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

     @Override
     public boolean onCreateOptionsMenu(Menu menu) {
         getMenuInflater().inflate(R.menu.menu,menu);
         return super.onCreateOptionsMenu(menu);
     }

     @Override
     public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId()== R.id.item1){
            Toast.makeText(this, "ITEM1 SELECTED", Toast.LENGTH_SHORT).show();
        }
        if (item.getItemId()== R.id.item2){
             Toast.makeText(this, "ITEM2 SELECTED", Toast.LENGTH_SHORT).show();
         }

         if (item.getItemId()== R.id.item3){
             Toast.makeText(this, "ITEM3 SELECTED", Toast.LENGTH_SHORT).show();
         }



         return super.onOptionsItemSelected(item);
     }
 }
