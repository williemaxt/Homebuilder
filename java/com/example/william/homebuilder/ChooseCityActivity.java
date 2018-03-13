package com.example.william.homebuilder;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ChooseCityActivity extends AppCompatActivity {
    ListView cityView;
    String[] cities = new String[]{
      "Philadelphia", "Trenton", "Baltimore", "DC", "Delco", "New York", "Jersey City", "Bloomsburg", "London"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_city);
        //------------------------------declaring list view------------------------------------
        cityView = findViewById(R.id.lv);
        cityView.setClickable(true);
        cityView.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, cities));
        cityView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> arg0, View view, int position, long id) {
                if(position == 0){
                    System.out.println("Philadelphia");
                    Intent intent = new Intent(ChooseCityActivity.this, ChoosePhillyContractorActivity.class);
                    startActivity(intent);
                }
                if(position == 1){
                    //-----------creates the dialog, assigns positive, negative and neutral buttons-------------------------
                    AlertDialog.Builder builder = new AlertDialog.Builder(ChooseCityActivity.this);
                    builder.setTitle("Not In your Area");
                    builder.setMessage("We are very sorry but Homebuilder is not yet in your area");
                    builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                         dialogInterface.dismiss();
                        }
                    });
                    //------------------shows the dialog------------------------------------
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                }
                if(position == 2){
                    AlertDialog.Builder builder = new AlertDialog.Builder(ChooseCityActivity.this);
                    builder.setTitle("Not In your Area");
                    builder.setMessage("We are very sorry but Homebuilder is not yet in your area");
                    builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            dialogInterface.dismiss();
                        }
                    });
                    //------------------shows the dialog------------------------------------
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                }
                if(position == 3){
                    AlertDialog.Builder builder = new AlertDialog.Builder(ChooseCityActivity.this);
                    builder.setTitle("Not In your Area");
                    builder.setMessage("We are very sorry but Homebuilder is not yet in your area");
                    builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            dialogInterface.dismiss();
                        }
                    });
                    //------------------shows the dialog------------------------------------
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                }
                if(position == 4){
                   Intent intent = new Intent(ChooseCityActivity.this, ChoosePhillyContractorActivity.class);
                   startActivity(intent);
                }
                if(position == 5){
                    AlertDialog.Builder builder = new AlertDialog.Builder(ChooseCityActivity.this);
                    builder.setTitle("Not In your Area");
                    builder.setMessage("We are very sorry but Homebuilder is not yet in your area");
                    builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            dialogInterface.dismiss();
                        }
                    });
                    //------------------shows the dialog------------------------------------
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                }
                if(position == 6){
                    AlertDialog.Builder builder = new AlertDialog.Builder(ChooseCityActivity.this);
                    builder.setTitle("Not In your Area");
                    builder.setMessage("We are very sorry but Homebuilder is not yet in your area");
                    builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            dialogInterface.dismiss();
                        }
                    });
                    //------------------shows the dialog------------------------------------
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                }
                if(position == 7){
                    AlertDialog.Builder builder = new AlertDialog.Builder(ChooseCityActivity.this);
                    builder.setTitle("Not In your Area");
                    builder.setMessage("We are very sorry but Homebuilder is not yet in your area");
                    builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            dialogInterface.dismiss();
                        }
                    });
                    //------------------shows the dialog------------------------------------
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                }
                if(position == 8){
                    AlertDialog.Builder builder = new AlertDialog.Builder(ChooseCityActivity.this);
                    builder.setTitle("Not In your Area");
                    builder.setMessage("We are very sorry but Homebuilder is not yet in your area");
                    builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            dialogInterface.dismiss();
                        }
                    });
                    //------------------shows the dialog------------------------------------
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                }
            }
        });
         }
}
