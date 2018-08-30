package seekbar.cursoandroid.com.seekbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private SeekBar seek;
    private TextView progr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

     seek = (SeekBar) findViewById(R.id.skId);

     progr = (TextView) findViewById(R.id.txtPrId);



     seek.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
         @Override
         public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

             progr.setText("Progresso "  + progress + " / " + seekBar.getMax());

         }

         @Override
         public void onStartTrackingTouch(SeekBar seekBar) {

             Toast.makeText(MainActivity.this,"Botão Pressionado",Toast.LENGTH_SHORT).show();

         }

         @Override
         public void onStopTrackingTouch(SeekBar seekBar) {

             Toast.makeText(MainActivity.this,"Botão não pressionado", Toast.LENGTH_SHORT).show();

         }
     });


    }
}
