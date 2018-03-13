package com.example.william.homebuilder;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

public class ChoosePhillyContractorActivity extends AppCompatActivity {
    ListView contractorView;
    String[] contractors = new String[]{
            "Montrel Spearman (MS Enterprise): Construction", "Charles Brown (Individual): Construction","Isaiah Hudgins (Individual): Demolition"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_contractor_philladelphia);

        //------------------------------declaring list view------------------------------------
        contractorView = findViewById(R.id.lv);
        contractorView.setClickable(true);
        contractorView.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, contractors));

        //----------------------------setting an onClickListener for the view-----------------------------
        contractorView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                if(position == 0){
                    System.out.println("Trell");
                    AlertDialog.Builder builder = new AlertDialog.Builder(ChoosePhillyContractorActivity.this);
                    final View mView = getLayoutInflater().inflate(R.layout.dialog_message, null);
                    final EditText message = mView.findViewById(R.id.et);

                    final Button send = mView.findViewById(R.id.button2);
                    FloatingActionButton call = mView.findViewById(R.id.fabCall);
                    send.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            //------------------------what happens when the send button in the dialog is clicked--------------
                            final int REQUEST_SEND_SMS = 1;
                            final String sms = message.getText().toString();

                            //-------the if statement checks and asks for permission to send texts-------------------------------------
                            if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                                if (ContextCompat.checkSelfPermission(ChoosePhillyContractorActivity.this, Manifest.permission.SEND_SMS) != PackageManager.PERMISSION_GRANTED) {
                                    ActivityCompat.requestPermissions(ChoosePhillyContractorActivity.this, new String[]{Manifest.permission.SEND_SMS}, REQUEST_SEND_SMS);
                                }else{
                            //------------------------actuall message gets sent after permission (goes to home screen after message)-----------------------------------
                                    SmsManager smsManager = SmsManager.getDefault();
                                    smsManager.sendTextMessage("2158245998", null, "Sent from Homebuilder App: " + sms, null, null);
                                    Toast.makeText(ChoosePhillyContractorActivity.this,
                                            "Message Sent! You'll hear from us soon", Toast.LENGTH_LONG).show();
                            Intent intent = new Intent(ChoosePhillyContractorActivity.this, MainActivity.class);
                            startActivity(intent);}
                            }
                        }
                    });

                    //--------------------------onClickListener to call when the button is pressed-----------------------------
                    call.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            //--------------------------------when the call button is pressed-----------------------------------
                             final int REQUEST_PHONE_CALL = 1;
                            Intent callIntent = new Intent(Intent.ACTION_CALL);
                            callIntent.setData(Uri.parse("tel:2153804222"));
 //---------------------------------------checks for permission before placing the call-----------------------------------------
                            if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                                if (ContextCompat.checkSelfPermission(ChoosePhillyContractorActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                                    ActivityCompat.requestPermissions(ChoosePhillyContractorActivity.this, new String[]{Manifest.permission.CALL_PHONE}, REQUEST_PHONE_CALL);
                                } else {
                                    //-------------------------places the call--------------------------------------------------
                                    startActivity(callIntent);
                                }
                            }
                        }
                    });
                    builder.setView(mView);
                    AlertDialog dialog = builder.create();
                    dialog.show();
                }
                //------------------------code for next list item-----------------------------------------------------
                if(position == 1){

                }

                if(position == 2){
                    AlertDialog.Builder builder = new AlertDialog.Builder(ChoosePhillyContractorActivity.this);
                    final View mView = getLayoutInflater().inflate(R.layout.dialog_message, null);
                    final EditText message = mView.findViewById(R.id.et);

                    final Button send = mView.findViewById(R.id.button2);
                    FloatingActionButton call = mView.findViewById(R.id.fabCall);
                    send.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            //------------------------what happens when the send button in the dialog is clicked--------------
                            final int REQUEST_SEND_SMS = 1;
                            final String sms = message.getText().toString();

                            //-------the if statement checks and asks for permission to send texts-------------------------------------
                            if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                                if (ContextCompat.checkSelfPermission(ChoosePhillyContractorActivity.this, Manifest.permission.SEND_SMS) != PackageManager.PERMISSION_GRANTED) {
                                    ActivityCompat.requestPermissions(ChoosePhillyContractorActivity.this, new String[]{Manifest.permission.SEND_SMS}, REQUEST_SEND_SMS);
                                }else{
                                    //------------------------actuall message gets sent after permission (goes to home screen after message)-----------------------------------
                                    SmsManager smsManager = SmsManager.getDefault();
                                    smsManager.sendTextMessage("2676238497", null, "Sent from Homebuilder App: " + sms, null, null);
                                    Toast.makeText(ChoosePhillyContractorActivity.this,
                                            "Message Sent! You'll hear from us soon", Toast.LENGTH_LONG).show();
                                    Intent intent = new Intent(ChoosePhillyContractorActivity.this, MainActivity.class);
                                    startActivity(intent);}
                            }
                        }
                    });

                    //--------------------------onClickListener to call when the button is pressed-----------------------------
                    call.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            //--------------------------------when the call button is pressed-----------------------------------
                            final int REQUEST_PHONE_CALL = 1;
                            Intent callIntent = new Intent(Intent.ACTION_CALL);
                            callIntent.setData(Uri.parse("tel:2676238497"));
                            //---------------------------------------checks for permission before placing the call-----------------------------------------
                            if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                                if (ContextCompat.checkSelfPermission(ChoosePhillyContractorActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                                    ActivityCompat.requestPermissions(ChoosePhillyContractorActivity.this, new String[]{Manifest.permission.CALL_PHONE}, REQUEST_PHONE_CALL);
                                } else {
                                    //-------------------------places the call--------------------------------------------------
                                    startActivity(callIntent);
                                }
                            }
                        }
                    });
                    builder.setView(mView);
                    AlertDialog dialog = builder.create();
                    dialog.show();
                }

            }
        });
    }
}
