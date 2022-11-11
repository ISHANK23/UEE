package com.example.uee;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class ViewAllProvideRetrieveActivity extends AppCompatActivity {

    EditText etName,etEmail,etAddress,etNumber,etItem_name;
    Spinner spinnerItemType;
    Button btnInsertData;

    DatabaseReference categoryDB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_all_provide_retrieve);

        etName = findViewById(R.id.etName);
        etEmail= findViewById(R.id.etEmail);
        etAddress = findViewById(R.id.etAddress);
        etNumber = findViewById(R.id.etNumber);
        spinnerItemType = findViewById(R.id.spinnerItemType);
        etItem_name = findViewById(R.id.etItem_name);
        btnInsertData = findViewById(R.id.btnInsertData);

        categoryDB = FirebaseDatabase.getInstance().getReference("category");
        btnInsertData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                insertCategoryData();
            }
        });


    }

    private void insertCategoryData(){
        String name = etName.getText().toString();
        String email = etEmail.getText().toString();
        String address = etAddress.getText().toString();
        String number = etNumber.getText().toString();
        String item_type = spinnerItemType.getSelectedItem().toString();
        String item_name = etItem_name.getText().toString();

        
        String id = categoryDB.push().getKey();

        Category category = new Category(id,name,email,address,number,item_type,item_name);
        assert id != null;

        categoryDB.child(id).setValue(category);
        Toast.makeText(ViewAllProvideRetrieveActivity.this,"data add",Toast.LENGTH_SHORT).show();
    }

}