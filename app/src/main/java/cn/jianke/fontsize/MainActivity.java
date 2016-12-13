package cn.jianke.fontsize;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import cn.jianke.fontsize.ageselector.AgeSelectorAlterDialog;
import cn.jianke.fontsize.ageselector.AgeSelectorDialog;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    // 字体内容
    private TextView fontContentTv;
    // 字体大小
    private TextView currentFontSizeTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // findView
        // 字体内容
        fontContentTv = (TextView) findViewById(R.id.tv_font_content);
        // 字体大小
        currentFontSizeTv = (TextView) findViewById(R.id.tv_current_font_size);
        // onClick
        findViewById(R.id.btn_font_select).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_font_select:
                // 字体选择
                fontSelect();
                break;
            default:
                break;
        }
    }

    /**
     * 字体选择
     * @author leibing
     * @createTime 2016/11/16
     * @lastModify 2016/11/16
     * @param
     * @return
     */
    private void fontSelect() {
        AgeSelectorAlterDialog.show(MainActivity.this,
                Integer.valueOf(currentFontSizeTv.getText().toString().trim()),
                new AgeSelectorDialog.DialogCallBack() {
                    @Override
                    public void getAge(String age) {
                        if (currentFontSizeTv != null){
                            currentFontSizeTv.setText(age.trim());
                        }
                        if (fontContentTv != null){
                            fontContentTv.setTextSize(Float.valueOf(age.trim()));
                        }
                    }
                });
    }
}
