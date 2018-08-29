package fr.citelum.kbenmamar.testmultilangue;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView message_cache = findViewById(R.id.hidden_message);
        message_cache.setVisibility(View.GONE);
        final Button bouton = findViewById(R.id.button);

        bouton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                if (message_cache.getVisibility() == View.GONE)
                {
                    bouton.setText(R.string.button_hide);
                    message_cache.setVisibility(View.VISIBLE);

                    Toast.makeText(MainActivity.this, getString(R.string.message), Toast.LENGTH_SHORT).show();
                }
                else
                {
                    bouton.setText(R.string.button_show);
                    message_cache.setVisibility(View.GONE);

                    Toast.makeText(MainActivity.this, getString(R.string.thanks), Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}