package ir.caten.pracapp;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;

public class AsyncCaller extends AsyncTask<Void, Void, Void> {
    Context context;
    public AsyncCaller(Context context) {
        this.context=context;
    }

    ProgressDialog pdLoading = new ProgressDialog(context);

@Override
protected void onPreExecute() {
        super.onPreExecute();

        //this method will be running on UI thread
        pdLoading.setMessage("\tLoading...");
        pdLoading.show();
        }
@Override
protected Void doInBackground(Void... params) {

        //this method will be running on background thread so don't update UI frome here
        //do your long running http tasks here,you dont want to pass argument and u can access the parent class' variable url over here


        return null;
        }

@Override
protected void onPostExecute(Void result) {
        super.onPostExecute(result);

        //this method will be running on UI thread

        pdLoading.dismiss();
        }

        }
