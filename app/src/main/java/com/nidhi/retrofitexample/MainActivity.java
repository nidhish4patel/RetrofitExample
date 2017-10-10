package com.nidhi.retrofitexample;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONObject;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private ApiInterface apiInterface;

    private TextView tvresponse;

    private LinearLayout linearLayout;

    private Context context = MainActivity.this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //tvresponse = (TextView) findViewById(R.id.textview_response);
        linearLayout = (LinearLayout) findViewById(R.id.linear_main);


        /*-->to make the request, first getinstance of retrofit first
               //ApiClient.getApiClient()

        -->then call create method and pass the interface class name*/

        apiInterface = ApiClient.getApiClient().create(ApiInterface.class);

        Call<List<Student>> call = apiInterface.getdata();

        call.enqueue(new Callback<List<Student>>() {
            @Override
            public void onResponse(Call<List<Student>> call, Response<List<Student>> response) {
try {
    List<Student> Data = response.body();

    for (int i = 0; i < Data.size(); i++) {

        //JSONObject jsonObject = jsonArray.getJSONObject(i);

        TextView tvId = new TextView(context);
        tvId.setText(Data.get(i).getID());
        linearLayout.addView(tvId);

        TextView tvFname = new TextView(context);
        tvFname.setText(Data.get(i).getFIRSTNAME());
        linearLayout.addView(tvFname);

        TextView tvLname = new TextView(context);
        tvLname.setText(Data.get(i).getLASTNAME());
        linearLayout.addView(tvLname);

        TextView tvbuilding = new TextView(context);
        tvbuilding.setText(Data.get(i).getBUILDING());
        linearLayout.addView(tvbuilding);

        TextView tvphone = new TextView(context);
        tvphone.setText(Data.get(i).getPHONE());
        linearLayout.addView(tvphone);

        TextView tvemail = new TextView(context);
        tvemail.setText(Data.get(i).getEMAIL());
        linearLayout.addView(tvemail);

        TextView tvdept = new TextView(context);
        tvdept.setText(Data.get(i).getDEPT());
        linearLayout.addView(tvdept);


        TextView tvposition = new TextView(context);
        tvposition.setText(Data.get(i).getPOSITION());
        linearLayout.addView(tvposition);


        TextView tvurl = new TextView(context);
        tvurl.setText((CharSequence) Data.get(i).getURL());
        linearLayout.addView(tvurl);

        View view = new View(context);
        view.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 3));
        view.setBackgroundColor(Color.BLACK);
        linearLayout.addView(view);

    }
}


                      catch (Exception e) {
                        Log.d("onResponse", "There is an error");
                        e.printStackTrace();
                    }

                }



            @Override
            public void onFailure(Call<List<Student>> call, Throwable t) {

                onexit();

                Log.d("onFailure", t.toString());

            }
        });

    }

    private void onexit() {
        Toast.makeText(context, "error in code", Toast.LENGTH_SHORT).show();
    }
}
        /*call.enqueue(new Callback<List<Student>>() {
            @Override
            public void onResponse(Call<List<Student>> call, Response<Student> response) {

                try {

                    tvresponse.setText("StudentId  :  " + response.body().getStudentId());
                    TextView tvId = new TextView(context);
                    tvId.setText("ID : "+jsonObject.getInt("ID"));
                    linearLayout.addView(tvId);

                    TextView tvFname = new TextView(context);
                    tvFname.setText("FIRSTNAME : "+jsonObject.getString("FIRSTNAME"));
                    linearLayout.addView(tvFname);

                    TextView tvLname = new TextView(context);
                    tvLname.setText("LASTNAME : "+jsonObject.getString("LASTNAME"));
                    linearLayout.addView(tvLname);

                    TextView tvbuilding = new TextView(context);
                    tvbuilding.setText("BUILDING : "+jsonObject.getString("BUILDING"));
                    linearLayout.addView(tvbuilding);

                    TextView tvphone = new TextView(context);
                    tvphone.setText("PHONE : "+jsonObject.getString("PHONE"));
                    linearLayout.addView(tvphone);

                    TextView tvemail = new TextView(context);
                    tvemail.setText("EMAIL : "+jsonObject.getString("EMAIL"));
                    linearLayout.addView(tvemail);

                    TextView tvdept = new TextView(context);
                    tvdept.setText("DEPT : "+jsonObject.getString("DEPT"));
                    linearLayout.addView(tvdept);


                        TextView tvposition = new TextView(context);
                    tvposition.setText("POSITION : "+jsonObject.getString("POSITION"));
                    linearLayout.addView(tvposition);


                    TextView tvurl = new TextView(context);
                    tvurl.setText("URL : "+jsonObject.getString("URL"));
                    linearLayout.addView(tvurl);

                    View view = new View(context);
                    view.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,3));
                    view.setBackgroundColor(Color.BLACK);
                    linearLayout.addView(view);


                } catch (Exception e) {
                    Log.d("onResponse", "There is an error");
                    e.printStackTrace();
                }

            }

            @Override
            public void onFailure(Call<Student> call, Throwable t) {
                Log.d("onFailure", t.toString());
            }


        });
    }
}





// These two methods, onResponse and onFailure are executed on the main UI thread.*/