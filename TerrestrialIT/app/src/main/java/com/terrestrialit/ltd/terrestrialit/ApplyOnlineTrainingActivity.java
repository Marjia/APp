package com.terrestrialit.ltd.terrestrialit;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import com.takisoft.datetimepicker.DatePickerDialog;
import com.takisoft.datetimepicker.widget.DatePicker;

import java.text.DateFormatSymbols;
import java.util.Calendar;

public class ApplyOnlineTrainingActivity extends ToolbarClass {

    EditText NameEDT,MobileEDT,AddressEDT,EmailEDT,NationalIdEDT,FacebookIdEDT,DateofBirthEDT,EducationEDT,ProfessionEDT,LaptopEDT,PreferredEDT;

    Spinner EducationSpinner,PreferredTrainingSpinner,ProfessionSpinner,PersonalLaptopSpinner;

    String[] EducationQSTR={"SSC","HSC","Graduation","Post Graduation"};
    String[] PreferredTrainingSTR={"Advance Illustrator","Web Development","Graphic Design","Wordpress","Ecommerce","SEO","CCNA","Desktop Application"};
    String[] ProfessionSTR={"Student","Service","House Wife","Other"};
    String[] LaptopSTR={"Yes","No"};

    TextView datofbirthtxt;

    int yearO,dayO,monthO;

    Button SendMailBTN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apply_online_training);
        String title="Apply";
        ToolbarMethod(title);
        SocialMediaClickMethod();
        SendMailMethod();

        MakeAnimationMathod();
    }

    public void SendMailMethod() {

        final String[] edu = new String[1];
        final String[] PreferredTrainingS = new String[1];
        final String[] Profession = new String[1];
        final String[] laptop = new String[1];

        SendMailBTN=(Button)findViewById(R.id.send_mail_id);


        NameEDT=(EditText)findViewById(R.id.name_id);
        MobileEDT=(EditText)findViewById(R.id.mobile_id);
        AddressEDT=(EditText)findViewById(R.id.address_id);
        EmailEDT=(EditText)findViewById(R.id.email_id);
        NationalIdEDT=(EditText)findViewById(R.id.nationalidnumber_id);
        FacebookIdEDT=(EditText)findViewById(R.id.facebookid_id);

        //EducationEDT=(EditText)view.findViewById(R.id.education_qualification_id);
        //ProfessionEDT=(EditText)view.findViewById(R.id.profession_id);
        //LaptopEDT=(EditText)view.findViewById(R.id.laptop_id);
        //PreferredEDT=(EditText)view.findViewById(R.id.preferred_training_id);


        //----------Education Qualification Spinner--------------------------------

        //--usingCalenderDailogue--------

        Calendar calendar= Calendar.getInstance();
        yearO=calendar.get(Calendar.YEAR);
        monthO = calendar.get(Calendar.MONTH);
        dayO = calendar.get(Calendar.DAY_OF_MONTH);
        DateofBirthEDT=(EditText)findViewById(R.id.date_of_birth_id);
        datofbirthtxt=(TextView)findViewById(R.id.dateofbirthtxt_id);

        DateofBirthEDT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                DatePickerDialog datePickerDialog = new DatePickerDialog(ApplyOnlineTrainingActivity.this, R.style.MyDatePickerDialogStyle, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int monthofyear, int dayofmonth) {

                        //monthofyear=monthofyear+1;
//                        text.setText(dayofmonth+"/"+monthofyear+"/"+year+"-");
//
//                        String t=text.getText().toString();
//                        System.out.printf("\n\n--------------------"+t+"\n\n");
                        int yearO = year;
                        int monthO = monthofyear;
                        int dayO = dayofmonth;
                        Calendar c = Calendar.getInstance();
                        c.set(Calendar.YEAR, year);
                        c.set(Calendar.MONTH, monthofyear);
                        c.set(Calendar.DAY_OF_MONTH, dayofmonth);

                        String monstr = new DateFormatSymbols().getShortMonths()[monthO];

                        String date = dayO+"/"+monthO+"/"+yearO;
                        //System.out.printf("\n\n--------------------"+dateEDT+"\n\n");
//                        int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
//                        String weekday = new DateFormatSymbols().getWeekdays()[dayOfWeek];
                        //text.setText(dayofmonth + "/" + monthofyear + "/" + year + "--" + weekday);
//                        text.setText(yearO+"");
//                        wekdaymonttXT.setText(weekday+", "+monstr+" "+dayO);
//                        wekdaymonttXT.setPaintFlags(wekdaymonttXT.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
                        //System.out.printf("\n\n--------------------"+t+"\n\n");


                        DateofBirthEDT.setText(date);
                    }
                }, yearO, monthO, dayO);
//                showDate(view);
//                selectEDT.setText(getdate());

                datePickerDialog.show();


                // datePickerDialog.setVersion(DatePickerDialog.Version.VERSION_2);
            }


        });




        EducationSpinner=(Spinner)findViewById(R.id.education_spinner_id);

        ArrayAdapter<String> eduarrayAdapter=new ArrayAdapter<>(getApplicationContext(),android.R.layout.simple_spinner_dropdown_item,EducationQSTR);
        EducationSpinner.setAdapter(eduarrayAdapter);
        EducationSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {


                ((TextView) parent.getChildAt(0)).setTextColor(R.color.colorTextHeader);
                ((TextView) parent.getChildAt(0)).setTextSize(15);
                edu[0]=EducationSpinner.getSelectedItem().toString();
                //Toast.makeText(getContext(),"selected"+EducationQSTR[position],Toast.LENGTH_LONG).show();

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });




        //-----------------Preferred Training Spinner----------------------------------


        PreferredTrainingSpinner=(Spinner)findViewById(R.id.preferred_training_spinner_id);

        ArrayAdapter<String> preferredarrayAdapter=new ArrayAdapter<>(getApplicationContext(),android.R.layout.simple_spinner_dropdown_item,PreferredTrainingSTR);
        PreferredTrainingSpinner.setAdapter(preferredarrayAdapter);
        PreferredTrainingSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {


                ((TextView) parent.getChildAt(0)).setTextColor(R.color.colorTextHeader);
                ((TextView) parent.getChildAt(0)).setTextSize(15);

                PreferredTrainingS[0]=PreferredTrainingSpinner.getSelectedItem().toString();
                //Toast.makeText(getContext(),"selected"+PreferredTrainingSTR[position],Toast.LENGTH_LONG).show();

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        //----------Profession Spinner----------


        ProfessionSpinner=(Spinner)findViewById(R.id.profession_spinner_id);

        ArrayAdapter<String> professionarrayAdapter=new ArrayAdapter<>(getApplicationContext(),android.R.layout.simple_spinner_dropdown_item,ProfessionSTR);
        ProfessionSpinner.setAdapter(professionarrayAdapter);
        ProfessionSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {


                ((TextView) parent.getChildAt(0)).setTextColor(R.color.colorTextHeader);
                ((TextView) parent.getChildAt(0)).setTextSize(15);
                Profession[0]=ProfessionSpinner.getSelectedItem().toString();
                //Toast.makeText(getContext(),"selected"+ProfessionSTR[position],Toast.LENGTH_LONG).show();

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        //------------Personal Laptop Spinner--------------


        PersonalLaptopSpinner=(Spinner)findViewById(R.id.personal_laptop_spinner_id);

        ArrayAdapter<String> laptoparrayAdapter=new ArrayAdapter<>(getApplicationContext(),android.R.layout.simple_spinner_dropdown_item,LaptopSTR);
        PersonalLaptopSpinner.setAdapter(laptoparrayAdapter);
        PersonalLaptopSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {


                ((TextView) parent.getChildAt(0)).setTextColor(R.color.colorTextHeader);
               ((TextView) parent.getChildAt(0)).setTextSize(15);
                laptop[0]=PersonalLaptopSpinner.getSelectedItem().toString();
                //Toast.makeText(getContext(),"selected"+LaptopSTR[position],Toast.LENGTH_LONG).show();

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });




        //textView=(TextView)view.findViewById(R.id.name_txt_id);

        SendMailBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String subjectstr="Apply for Training";
                String nanamestr=NameEDT.getText().toString().trim();
                String namestr=nanamestr;
                String mobilestr=MobileEDT.getText().toString().trim();

                System.out.print("\n----------------------------------------"+mobilestr+"-----------------\n");
                String addressstr=AddressEDT.getText().toString().trim();
                String emailstr=EmailEDT.getText().toString().trim();
                String nationalidstr=NationalIdEDT.getText().toString().trim();
                String facebookidstr=FacebookIdEDT.getText().toString().trim();

                String dateofbirthstr=DateofBirthEDT.getText().toString().trim();
                //String educationstr=EducationEDT.getText().toString().trim();
                //String professionstr=ProfessionEDT.getText().toString().trim();
                //String laptopstr=LaptopEDT.getText().toString().trim();
                //String preferredstr=PreferredEDT.getText().toString().trim();

                //      textView.setText(namestr+" "+addressstr);

                Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                        "mailto","terrestrialit@gmail.com", null));
                intent.putExtra(Intent.EXTRA_SUBJECT, subjectstr);
                intent.putExtra(Intent.EXTRA_TEXT, "Full Name: "+namestr
                        +"\n"+"Address: "+addressstr+"\n"
                        +"\n"+"Mobile: "+mobilestr+"\n"
                        +"\n"+"Email: "+emailstr+"\n"
                        +"\n"+"national: "+nationalidstr+"\n"
                        +"\n"+"FaceBook ID: "+facebookidstr+"\n"
                        +"\n"+"Date of Birth: "+dateofbirthstr+"\n"
                        +"\n"+"Education Qualification: "+edu[0]+"\n"
                        +"\n"+"Profession: "+Profession[0]+"\n"
                        +"\n"+"Have personal Laptop?: "+laptop[0]+"\n"
                        +"\n"+"Preferred Training: "+PreferredTrainingS[0]+"\n");
                startActivity(Intent.createChooser(intent, "Choose an Email client :"));


                intent.putExtra(Intent.EXTRA_SUBJECT,"");

                NameEDT.setText("");
                MobileEDT.setText("");
                AddressEDT.setText("");
                EmailEDT.setText("");
                NationalIdEDT.setText("");
                FacebookIdEDT.setText("");
                DateofBirthEDT.setText("");
                //EducationEDT.setText("");
                //ProfessionEDT.setText("");
                //LaptopEDT.setText("");
                //PreferredEDT.setText("");

            }
        });


    }

    public void SocialMediaClickMethod() {
        ImageView Fb,Twit,Googleplus,Linkedin,Skype;

        Fb=(ImageView)findViewById(R.id.facebook_id);
        Twit=(ImageView)findViewById(R.id.twitter_id);
        Googleplus=(ImageView)findViewById(R.id.googleplus);
        Linkedin=(ImageView)findViewById(R.id.linkedin_id);
        Skype=(ImageView)findViewById(R.id.skype_id);


        Fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://www.facebook.com/TerrestrialIT/"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        Twit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Uri uri = Uri.parse("https://twitter.com/terrestrialit"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);


            }
        });
        Googleplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Uri uri = Uri.parse("https://plus.google.com/+terrestrialit"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);


            }
        });

        Linkedin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Uri uri = Uri.parse("https://www.linkedin.com/company/terrestrial-it"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);


            }
        });

        Skype.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Uri uri = Uri.parse("skype:terrestrialit?call"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);


            }
        });
    }

    public void MakeAnimationMathod(){


        TextView title = (TextView) findViewById(R.id.txtTitle);
        Animation scaleAnimation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.scaleanimation);
        title.setText(R.string.apply_training);
        scaleAnimation.setRepeatMode(Animation.RESTART);
        scaleAnimation.setRepeatCount(Animation.INFINITE);
        title.startAnimation(scaleAnimation);
    }
}
