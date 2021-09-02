package info.androidhive.sqlite;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Toast;

import info.androidhive.sqlite.database.DatabaseHelper;

public class SignUp extends AppCompatActivity {

    private DatabaseHelper helper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
    }
    public SignUp(DatabaseHelper helper){
        this.helper = helper;
    }

    private void signIn(final String username, final String password) {
        this.helper.authenticate(username,password);
    }
}
