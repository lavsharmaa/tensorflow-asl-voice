package org.tensorflow.lite.examples.detection;

//import android.os.Build;
//import android.speech.tts.TextToSpeech;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;
//import android.widget.EditText;
//import android.widget.Toast;
//import androidx.appcompat.app.AppCompatActivity;
//import android.util.Log;
//
//import org.tensorflow.lite.examples.detection.env.Logger;
//
//import java.util.Locale;
//
//public class AndroidTextToSpeechActivity extends AppCompatActivity {
//
//    Button btnSpeak;
//    EditText editText;
//
//    TextToSpeech textToSpeech;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.tfe_od_layout_bottom_sheet);
//
//        // Init TextToSpeech
//        textToSpeech = new TextToSpeech(this, status -> {
//            if (status == TextToSpeech.SUCCESS) {
//                int result = textToSpeech.setLanguage(Locale.ENGLISH);
//                if (result == TextToSpeech.LANG_MISSING_DATA ||
//                        result == TextToSpeech.LANG_NOT_SUPPORTED) {
//                    Toast.makeText(getApplicationContext(), "This language is not supported!",
//                            Toast.LENGTH_SHORT);
//                } else {
//                    btnSpeak.setEnabled(true);
//                    textToSpeech.setPitch(0.6f);
//                    textToSpeech.setSpeechRate(1.0f);
//
//                    speak();
//                }
//            }
//        });
//
//        // Init View
//        btnSpeak = (Button)findViewById(R.id.btnSpeak);
//        editText = (EditText)findViewById(R.id.txtText);
//
//        btnSpeak.setOnClickListener(v -> speak());
//    }
//
//    private void speak() {
//        String text = editText.getText().toString();
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
//            textToSpeech.speak(text, TextToSpeech.QUEUE_FLUSH, null, null);
//        } else {
//            textToSpeech.speak(text, TextToSpeech.QUEUE_FLUSH, null);
//        }
//    }
//
//    @Override
//    protected void onDestroy() {
//        if (textToSpeech != null) {
//            textToSpeech.stop();
//            textToSpeech.shutdown();
//        }
//        super.onDestroy();
//    }
//}

//import android.app.Activity;
//import android.os.Bundle;
//import android.speech.tts.TextToSpeech;
//import android.view.View;
//import android.widget.Button;
//import android.widget.EditText;
//import java.util.Locale;
//import android.widget.Toast;
//
//public class AndroidTextToSpeechActivity extends Activity {
//    TextToSpeech t1;
//    EditText ed1;
//    Button b1;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.tfe_od_layout_bottom_sheet);
//        ed1=(EditText)findViewById(R.id.editText);
//        b1=(Button)findViewById(R.id.button);
//
//        t1=new TextToSpeech(getApplicationContext(), status -> {
//            if(status != TextToSpeech.ERROR) {
//                t1.setLanguage(Locale.UK);
//            }
//        });
//
//        b1.setOnClickListener(v -> {
//            String toSpeak = ed1.getText().toString();
//            Toast.makeText(getApplicationContext(), toSpeak,Toast.LENGTH_SHORT).show();
//            t1.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
//        });
//    }
//
//    public void onPause(){
//        if(t1 !=null){
//            t1.stop();
//            t1.shutdown();
//        }
//        super.onPause();
//    }
//}

//import android.media.MediaPlayer;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//public class AndroidTextToSpeechActivity extends AppCompatActivity {
//    Button bt;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState){
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.tfe_od_layout_bottom_sheet);
//        bt = (Button)findViewById(R.id.button);
//        final MediaPlayer mp = MediaPlayer.create(this, R.raw.letter-a);
//        bt.setOnClickListener(new View.OnClickListener(){
//            public void onClick(View view){
//                np.start();
//            }
//        }
//    }
//}