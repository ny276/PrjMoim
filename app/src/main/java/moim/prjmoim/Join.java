package moim.prjmoim;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Join extends AppCompatActivity {

    static EditText etName1, etId1, etPwd1, etPwdCheck1, etPhone1, etEmail1;
    Button btCheck1, btJoin2, btCancel1;
    static String sName1, sId1, sPwd1, sPwdCheck1, sPhone1, sEmail1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.join);

        etName1 = findViewById(R.id.etName1);
        etId1 = findViewById(R.id.etId1);
        etPwd1 = findViewById(R.id.etPwd1);
        etPwdCheck1 = findViewById(R.id.etPwdCheck1);
        etPhone1 = findViewById(R.id.etPhone1);
        etEmail1 = findViewById(R.id.etE_mail1);

        btJoin2 = findViewById(R.id.btJoin2);
        btJoin2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Insert insert = new Insert();
                insert.dataInsert();
            }
        });

        btCancel1 = findViewById(R.id.btCancel1);
        btCancel1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
