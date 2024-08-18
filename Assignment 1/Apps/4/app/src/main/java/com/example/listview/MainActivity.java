package com.example.listview;
import android.os.Bundle;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import com.example.listview.model.Contact;
import java.util.ArrayList;
import java.util.List;
import com.example.listview.ContactAdapter;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Contact> contacts = new ArrayList<>();
        contacts.add(new Contact("Aysha", R.drawable.ic_contact,"80987766545"));
        contacts.add(new Contact("Khadeeja Beevi", R.drawable.ic_contact,"4554656677"));
        contacts.add(new Contact("Manu", R.drawable.ic_contact,"7645455687"));
        contacts.add(new Contact("Muhammed Faris", R.drawable.ic_contact,"4334344567"));
        contacts.add(new Contact("Navas", R.drawable.ic_contact,"345788997"));
        contacts.add(new Contact("Sahala", R.drawable.ic_contact,"3424556677"));

        ListView listView = findViewById(R.id.contactListView);
        ContactAdapter adapter = new ContactAdapter(this, contacts);
        listView.setAdapter(adapter);
    }
}
