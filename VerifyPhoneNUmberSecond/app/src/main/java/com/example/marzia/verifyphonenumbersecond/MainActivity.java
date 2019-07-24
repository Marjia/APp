package com.example.marzia.verifyphonenumbersecond;

import android.Manifest;
import android.accounts.Account;
import android.accounts.AccountManager;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    TextView textView, Txttwo;
    //String device_unique_id = "kichui na", IMEI;
    Button BTN;



    //private static final int MY_PERMISSIONS_REQUEST_READ_PHONE_STATE = 0;

    String TAG = "PhoneActivityTAG";
    Activity activity = MainActivity.this;
    String wantPermission = Manifest.permission.READ_PHONE_STATE;
    private static final int PERMISSION_REQUEST_CODE = 1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.text_id);
        Txttwo=(TextView)findViewById(R.id.texttwo_id);





        BTN = (Button) findViewById(R.id.btn_id);

        BTN.setOnClickListener(new View.OnClickListener() {
            //            @SuppressLint("SetTextI18n")
//            @Override
            public void onClick(View view) {

//
//                String main_data[] = {"data1", "is_primary", "data3", "data2", "data1",
//                        "is_primary", "photo_uri", "mimetype"};
//                Object object = getContentResolver().
//                        query(Uri.withAppendedPath(android.provider.ContactsContract.Profile.CONTENT_URI, "data"),
//                                main_data, "mimetype=?",
//                                new String[]{"vnd.android.cursor.item/phone_v2"},
//                                "is_primary DESC");
//                String s1="";
//                if (object != null) {
//                    do {
//                        if (!((Cursor) (object)).moveToNext())
//                            break;
//                        // This is the phoneNumber
//                        s1 =s1+"---"+ ((Cursor) (object)).getString(4);
//                    } while (true);
//                    ((Cursor) (object)).close();
//                }
//
//                textView.setText(s1);


               findingphonenumber();

                 //findphoneNumberSUB();

//                String number = getMyPhoneNO();
//                Toast.makeText(getApplicationContext(), "My Phone Number is: "
//                        + number, Toast.LENGTH_SHORT).show();
//
//                //Txttwo=(TextView)findViewById(R.id.texttwo_id);
//                textView.setText("My Phone Nnumber is: " + number);
//
//                Toast.makeText(getApplicationContext(),"My Phone number "+number,Toast.LENGTH_SHORT).show();
//                GetImei(view);

//                AccountManager am = AccountManager.get(MainActivity.this);
//                Account[] accounts = am.getAccounts();
//
//
//                ArrayList<String> googleAccounts = new ArrayList<String>();
//                for (Account ac : accounts) {
//                    String acname = ac.name;
//                    String actype = ac.type;
//                    // Take your time to look at all available accounts
//                    System.out.println("\n\n-------------------------Accounts : " + acname + ", " + actype+"---------------\n\n");
//
//                    if(actype.equals("com.whatsapp")){
//                        String phoneNumberwh = ac.name;
//                        Txttwo.setText("--------"+phoneNumberwh);
//                    }
//
//                }
                //String s=phoneNumberwh;
            }
        });

    }

//
//    public void findphoneNumberSUB() {
//        //String num=null;
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
//            List<SubscriptionInfo> subscription = SubscriptionManager.from(getApplicationContext()).getActiveSubscriptionInfoList();
//
//
//            for (int i = 0; i < subscription.size(); i++) {
//                SubscriptionInfo info = subscription.get(i);
//                Log.d(TAG, "number " + info.getNumber());
//                Log.d(TAG, "network name : " + info.getCarrierName());
//                Log.d(TAG, "country iso " + info.getCountryIso());
//                Toast.makeText(getApplicationContext(), "number " + info.getNumber() + "\n network name  " + info.getCarrierName() + "\n Country iso " + info.getCountryIso(), Toast.LENGTH_LONG).show();
//                Toast.makeText(getApplicationContext(), "network name  " + info.getCarrierName(), Toast.LENGTH_LONG).show();
//                Toast.makeText(getApplicationContext(), "Country iso " + info.getCountryIso(), Toast.LENGTH_LONG).show();
//
//                String n = info.getNumber();
//                textView.setText(n);
//
//                 //num= info.getNumber();
//
//
//
//            }
//
//
//        }
//
//        System.out.print("\n\n\n------------------------------------------------------------------ha ha  ha ha----------------\n\n\n");
//       // return num;
//    }

//    //-------------------------------------------**********************************************----------------------------
//
  public void findingphonenumber(){
      if (!checkPermission(wantPermission)) {
          requestPermission(wantPermission);
      } else {

          //Log.d(TAG, "Phone number: " + getMy10DigitPhoneNumber());
          Log.d(TAG, "Phone number: " + getPhone());
          textView.setText(getPhone());
          //findphoneNumberSUB();
      }
  }
//
//  //------------------------------------------***********************************************-----------------------------------
//
////
////    private String getMy10DigitPhoneNumber(){
////        String s = getPhone();
////        return s != null && s.length() > 2 ? s.substring(2) : null;
////    }
//
//
//    //----------------------------------------------------------------***************************************------------------------

    private String getPhone() {
        TelephonyManager phoneMgr = (TelephonyManager) getSystemService(Context.TELEPHONY_SERVICE);
        if (ActivityCompat.checkSelfPermission(activity, wantPermission) != PackageManager.PERMISSION_GRANTED) {
            return "";
        }
        Txttwo.setText(phoneMgr.getSimOperatorName());
        Toast.makeText(getApplicationContext(),"phone number"+phoneMgr.getLine1Number(),Toast.LENGTH_LONG).show();
        return phoneMgr.getLine1Number();
    }

    private void requestPermission(String permission){
        if (ActivityCompat.shouldShowRequestPermissionRationale(activity, permission)){
            Toast.makeText(activity, "Phone state permission allows us to get phone number. Please allow it for additional functionality.", Toast.LENGTH_LONG).show();
        }
        ActivityCompat.requestPermissions(activity, new String[]{permission},PERMISSION_REQUEST_CODE);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String permissions[], int[] grantResults) {
        switch (requestCode) {
            case PERMISSION_REQUEST_CODE:
                if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    Log.d(TAG, "Phone number: " + getPhone());
                } else {
                    Toast.makeText(activity,"Permission Denied. We can't get phone number.", Toast.LENGTH_LONG).show();
                }
                break;
        }
    }

    private boolean checkPermission(String permission){
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            int result = ContextCompat.checkSelfPermission(activity, permission);
            if (result == PackageManager.PERMISSION_GRANTED){
                return true;
            } else {
                return false;
            }
        } else {
            return true;
        }
    }


    //------------------------**************************************************-------------------------------------------

//    public void GetImei(View view) {
//
//
//        loadIMEI();
//
//    }
//
//    //@RequiresApi(api = Build.VERSION_CODES.O)
//    public void loadIMEI() {
//        // Check if the READ_PHONE_STATE permission is already available.
//        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.READ_PHONE_STATE)
//                != PackageManager.PERMISSION_GRANTED) {
//            if (ActivityCompat.shouldShowRequestPermissionRationale(this,
//                    Manifest.permission.READ_PHONE_STATE)) {
////                get_imei_data();
//            } else {
//                ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.READ_PHONE_STATE},
//                        MY_PERMISSIONS_REQUEST_READ_PHONE_STATE);
//            }
//        } else {
//
//            TelephonyManager mngr = (TelephonyManager) getSystemService(Context.TELEPHONY_SERVICE);
//            IMEI = mngr.getDeviceId();
//            device_unique_id = Settings.Secure.getString(this.getContentResolver(),
//                    Settings.Secure.ANDROID_ID);
//            textView.setText("haha"+ mngr.getSimSerialNumber() + "----" +mngr.getLine1Number()+"---"+mngr.getImei()+"hhhh");
//            // READ_PHONE_STATE permission is already been granted.
//            Toast.makeText(this, "Alredy granted", Toast.LENGTH_SHORT).show();
//        }
//    }
//
//    @Override
//    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
//
//        if (requestCode == MY_PERMISSIONS_REQUEST_READ_PHONE_STATE) {
//
//            if (grantResults.length == 1 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
//
////                Toast.makeText(this,"Alredy DONE",Toast.LENGTH_SHORT).show();
//                TelephonyManager mngr = (TelephonyManager) getSystemService(Context.TELEPHONY_SERVICE);
//                if (ActivityCompat.checkSelfPermission(this, Manifest.permission.READ_PHONE_STATE) != PackageManager.PERMISSION_GRANTED) {
//                    // TODO: Consider calling
//                    //    ActivityCompat#requestPermissions
//                    // here to request the missing permissions, and then overriding
//                    //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
//                    //                                          int[] grantResults)
//                    // to handle the case where the user grants the permission. See the documentation
//                    // for ActivityCompat#requestPermissions for more details.
//                    return;
//                }
//                IMEI = mngr.getDeviceId();
//                //String phoneNumber = mngr.getLine1Number();
//                device_unique_id = Settings.Secure.getString(this.getContentResolver(), Settings.Secure.ANDROID_ID);
//                //System.out.print("\n\n--------------------------------------------------------------------phone number=" + mngr.getLine1Number() + "------------------------"+mngr.getSimSerialNumber()+"--------\n\n");
//                if (ActivityCompat.checkSelfPermission(this, Manifest.permission.READ_SMS) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.READ_PHONE_NUMBERS) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.READ_PHONE_STATE) != PackageManager.PERMISSION_GRANTED) {
//                    // TODO: Consider calling
//                    //    ActivityCompat#requestPermissions
//                    // here to request the missing permissions, and then overriding
//                    //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
//                    //                                          int[] grantResults)
//                    // to handle the case where the user grants the permission. See the documentation
//                    // for ActivityCompat#requestPermissions for more details.
//                    return;
//                }
//                //textView.setText(mngr.getSimSerialNumber() + "----------" + mngr.getLine1Number());
//
//            } else {
//                Toast.makeText(this, "ehgehfg", Toast.LENGTH_SHORT).show();
//            }
//        }
//    }
}