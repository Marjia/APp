package com.terrestrialit.ltd.numberverificationwithsms;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.facebook.accountkit.AccountKitLoginResult;
import com.facebook.accountkit.ui.AccountKitActivity;
import com.facebook.accountkit.ui.AccountKitConfiguration;
import com.facebook.accountkit.ui.LoginType;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "OTP ACTIVITY";
//    public static int REQUEST_CODE=999;
    Button btnOTP, btnEmail;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnOTP=findViewById(R.id.btn_otp);
        btnEmail=findViewById(R.id.btn_email);

//        btnOTP.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                StartLoginPage(LoginType.PHONE);
//            }
//        });
//        btnEmail.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                StartLoginPage(LoginType.EMAIL);
//            }
//        });



        printHashKey(MainActivity.this);
    }

//    private void StartLoginPage(LoginType loginType) {
//        if (loginType == LoginType.EMAIL) {
//            final Intent intent = new Intent(this, AccountKitActivity.class);
//            AccountKitConfiguration.AccountKitConfigurationBuilder configurationBuilder =
//                    new AccountKitConfiguration.AccountKitConfigurationBuilder(
//                            LoginType.EMAIL,
//                            AccountKitActivity.ResponseType.CODE); // Use token when 'Enable client Access Token Flow' is YES
//            intent.putExtra(
//                    AccountKitActivity.ACCOUNT_KIT_ACTIVITY_CONFIGURATION,
//                    configurationBuilder.build());
//            startActivityForResult(intent, REQUEST_CODE);
//        } else if (loginType == LoginType.PHONE) {
//            final Intent intent = new Intent(this, AccountKitActivity.class);
//            AccountKitConfiguration.AccountKitConfigurationBuilder configurationBuilder =
//                    new AccountKitConfiguration.AccountKitConfigurationBuilder(
//                            LoginType.PHONE,
//                            AccountKitActivity.ResponseType.CODE); // Use token when 'Enable client Access Token Flow' is YES
//            intent.putExtra(
//                    AccountKitActivity.ACCOUNT_KIT_ACTIVITY_CONFIGURATION,
//                    configurationBuilder.build());
//            startActivityForResult(intent, REQUEST_CODE);
//        }
//    }
//
//
//    @Override
//    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
//        super.onActivityResult(requestCode, resultCode, data);
//
//        if (requestCode == REQUEST_CODE) { // confirm that this response matches your request
//            AccountKitLoginResult loginResult = data.getParcelableExtra(AccountKitLoginResult.RESULT_KEY);
//            String toastMessage;
//            if (loginResult.getError() != null) {
//                toastMessage = loginResult.getError().getErrorType().getMessage();
//                return;
//            } else if (loginResult.wasCancelled()) {
//                toastMessage = "Login Cancelled";
//                return;
//            } else {
//                if (loginResult.getAccessToken() != null) {
//                    toastMessage = "Success:" + loginResult.getAccessToken().getAccountId();
//                } else {
//                    toastMessage = String.format(
//                            "Success:%s...",
//                            loginResult.getAuthorizationCode().substring(0,10));
//                }
//                Intent intent=new Intent(this,SignedIn.class);
//                startActivity(intent);
//            }
//            Toast.makeText(
//                    this,
//                    toastMessage,
//                    Toast.LENGTH_LONG)
//                    .show();
//        }
//    }
//

    public void printHashKey(Context pContext) {
        try {
            PackageInfo info = getPackageManager().getPackageInfo(getPackageName(), PackageManager.GET_SIGNATURES);
            for (Signature signature : info.signatures) {
                MessageDigest md = MessageDigest.getInstance("SHA");
                md.update(signature.toByteArray());
                String hashKey = new String(Base64.encode(md.digest(), 0));
                Log.i(TAG, "printHashKey() Hash Key: " + hashKey);
            }
        } catch (NoSuchAlgorithmException e) {
            Log.e(TAG,"printHashKey()", e);
        } catch (Exception e) {
            Log.e(TAG, "printHashKey()", e);
        }
    }

}
