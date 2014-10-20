package cn.edu.gdmec.s07131032.eventdemo;

import android.os.Bundle;
import android.app.Activity;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnKeyListener;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	private EditText entryText = null;
	private TextView labelView = null;
	private CheckBox checkBox = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        entryText = (EditText)findViewById(R.id.editText1);
        labelView = (TextView)findViewById(R.id.textView1);
        checkBox = (CheckBox)findViewById(R.id.checkBox1);
        
        entryText.setOnKeyListener(new OnKeyListener(){

			@Override
			public boolean onKey(View v, int keyCode, KeyEvent event) {
				 int metaState = event.getMetaState();
			        int unicodeChar = event.getUnicodeChar();
			        String msg="";
			        msg +="��������:" + String.valueOf(event.getAction())+"\n";
			        msg +="��������:" + String.valueOf(keyCode)+"\n";
			        msg +="�����ַ�:" + (char)unicodeChar+"\n";
			        msg +="UNICODE:" + String.valueOf(unicodeChar)+"\n";
			        msg +="�ظ�����:" + String.valueOf(event.getRepeatCount())+"\n";
			        msg +="���ܼ�״̬:" + String.valueOf(metaState)+"\n";
			        msg +="Ӳ������:" + String.valueOf(event.getScanCode())+"\n";
			        msg +="������־:" + String.valueOf(event.getFlags())+"\n";
			        labelView.setText(msg);

		        if(checkBox.isChecked()){
		        	return true;
		        }else{
		        	return false;
		        }
			}
			
        	
        }
        		);
        
        
			}
        	
        
   

        	



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
