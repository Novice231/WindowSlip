package net.hunau.windowslip.Fragment;

import android.app.Activity;
import android.os.Bundle;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import net.hunau.windowslip.R;

public class FragmentThree extends Fragment {

    /*@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item3);
    }*/
    TextView text;

    //@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // 第一个参数是这个Fragment将要显示的界面布局,第二个参数是这个Fragment所属的Activity,第三个参数是决定此fragment是否附属于Activity
        View view=inflater.inflate(R.layout.item3, container, false);
        //text = (TextView) view.findViewById(R.id.text);
        //text.setText("第3张");
        return view;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        System.out.println("FragmentThree onCreate");
    }

    public void onResume(){
        super.onResume();
        System.out.println("FragmentThree onResume");
    }

    @Override
    public void onPause(){
        super.onPause();
        System.out.println("FragmentThree onPause");
    }

    @Override
    public void onStop(){
        super.onStop();
        System.out.println("FragmentThree onStop");
    }

}
