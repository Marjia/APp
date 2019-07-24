package com.terrestrialit.ltd.numberverificationwithsms;

import android.accounts.Account;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.facebook.accountkit.AccountKit;
import com.facebook.accountkit.AccountKitCallback;
import com.facebook.accountkit.AccountKitError;
import com.facebook.accountkit.PhoneNumber;

public class SignedIn extends AppCompatActivity {

    Button signout;
    TextView tvPhoneNumber, tvEmail;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signed_in);

        signout=findViewById(R.id.btn_logout);
        tvPhoneNumber=findViewById(R.id.et_phonenumber);
        tvEmail=findViewById(R.id.et_email);
//        signout.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                AccountKit.logOut();
//            }
//        });

//        AccountKit.getCurrentAccount(new AccountKitCallback<Account>() {
//            @Override
//            public void onSuccess(final Account account) {
//// Get Account Kit ID
//                String accountKitId = account.getId();
//// Get phone number
//                PhoneNumber phoneNumber = account.getPhoneNumber();
//                if (phoneNumber != null) {
//                    String phoneNumberString = phoneNumber.toString();
//                }
//// Get email
//                String email = account.getEmail();
//            }
//            @Override
//            public void onError(final AccountKitError error) {
//// Handle Error
//            }
//        });
    }
}
