package com.example.regoli;

        import androidx.appcompat.app.AppCompatActivity;

        import android.os.Bundle;

        import android.os.Handler;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.ImageButton;
        import android.widget.LinearLayout;
        import android.widget.ProgressBar;
        import android.widget.TextView;
        import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    //linearlayouts
    private LinearLayout first_layout, second_layout, third_layout, fourth_layout, fifth_layout, sixth_layout,seventh_lauout, eigth_layout;


    //First Layout
    private Button signin,create_account;



    //Second Layout
    private EditText pnumber;
    private ImageButton pnumber_next;
    private  String number;



    //Third Layout
    private ProgressBar progressBar;

    //Fourth Layout
    private EditText verify;
    private ImageButton verify_next;
    private TextView entered_number;

    //Fifth Layout
    private  EditText name;
    private  ImageButton name_next;

    //Sixth Layout
    private EditText email;
    private ImageButton email_next;


    //Seventh Layout
    private Button blood_a,blood_b,blood_ab,blood_o;
    private String blood_type="";



    //eighth Layout



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        first_layout=(LinearLayout) findViewById(R.id.first_layout);
        second_layout=(LinearLayout) findViewById(R.id.second_layout);
        third_layout=(LinearLayout) findViewById(R.id.third_layout);
        fourth_layout=(LinearLayout) findViewById(R.id.fourth_layout);
        fifth_layout=(LinearLayout) findViewById(R.id.fifth_layout);
        sixth_layout=(LinearLayout) findViewById(R.id.sixth_layout);
        seventh_lauout=(LinearLayout) findViewById(R.id.seventh_layout);
        eigth_layout=(LinearLayout) findViewById(R.id.eight_layout);



        first_layout.setVisibility(View.VISIBLE);

        //******

        signin = (Button)findViewById(R.id.signin);
        create_account=(Button)findViewById(R.id.create_account);

        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "signIn", Toast.LENGTH_SHORT).show();
            }
        });
        create_account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                first_layout.setVisibility(View.GONE);
                second_layout.setVisibility(View.VISIBLE);
            }
        });


        //****

        pnumber_next=(ImageButton)findViewById(R.id.pnumber_next);
        pnumber=(EditText)findViewById(R.id.pnumber);

        //store phone Number
         number = pnumber.getText().toString();

            String k ="hello";

        pnumber_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                second_layout.setVisibility(View.GONE);
                fourth_layout.setVisibility(View.VISIBLE);



            }
        });

        //******
//        progressBar =(ProgressBar)findViewById(R.id.progress_circular);
//
//        Handler handler = new Handler();
//        handler.postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                third_layout.setVisibility(View.GONE);
//                fourth_layout.setVisibility(View.VISIBLE);
//
//            }
//        },2);


        //******
        entered_number=(TextView)findViewById(R.id.yr_phnnumber);
        verify=(EditText)findViewById(R.id.verify);
        verify_next =(ImageButton)findViewById(R.id.verify_next);
        entered_number.setText("+91"+ k);

        //store verification Code (OTP)


        String verification_code =  verify.getText().toString();

        verify_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fourth_layout.setVisibility(View.GONE);
                fifth_layout.setVisibility(View.VISIBLE);
            }
        });


        //**************


        name=(EditText)findViewById(R.id.name);
        name_next=(ImageButton)findViewById(R.id.name_next);

        name_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fifth_layout.setVisibility(View.GONE);
                sixth_layout.setVisibility(View.VISIBLE);
            }
        });

            //********
        email=(EditText)findViewById(R.id.name);
        email_next=(ImageButton)findViewById(R.id.email_next);

        email_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sixth_layout.setVisibility(View.GONE);
                seventh_lauout.setVisibility(View.VISIBLE);
            }
        });



        //**********
        blood_a=(Button)findViewById(R.id.blood_a);
        blood_b=(Button)findViewById(R.id.blood_b);
        blood_ab=(Button)findViewById(R.id.blood_ab);
        blood_o=(Button)findViewById(R.id.blood_o);


        //store blood type


        blood_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                blood_type="A";
                seventh_lauout.setVisibility(View.GONE);
                eigth_layout.setVisibility(View.VISIBLE);
                Toast.makeText(MainActivity.this, blood_type, Toast.LENGTH_SHORT).show();

            }
        });
        blood_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                blood_type="B";
                seventh_lauout.setVisibility(View.GONE);
                eigth_layout.setVisibility(View.VISIBLE);
                Toast.makeText(MainActivity.this, blood_type, Toast.LENGTH_SHORT).show();

            }
        });
        blood_ab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                blood_type="AB";
                seventh_lauout.setVisibility(View.GONE);
                eigth_layout.setVisibility(View.VISIBLE);
                Toast.makeText(MainActivity.this, blood_type, Toast.LENGTH_SHORT).show();

            }
        });
        blood_o.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                blood_type="O";
                seventh_lauout.setVisibility(View.GONE);
                eigth_layout.setVisibility(View.VISIBLE);
                Toast.makeText(MainActivity.this, blood_type, Toast.LENGTH_SHORT).show();

            }
        });


    }
}







