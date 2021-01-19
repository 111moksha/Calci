package com.example.mycalci;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button bt0,bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,btadd,btsub,btmul,btdiv,btdot,btequal,clear;
    EditText ed1;
    EditText Past;
    float res1 = 0,f=0;
    String res2, lastClicked;
    boolean Add, Sub, Mul, Div;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt0 = (Button)findViewById(R.id.bt0);
        bt1 = (Button)findViewById(R.id.bt1);
        bt2 = (Button)findViewById(R.id.bt2);
        bt3 = (Button)findViewById(R.id.bt3);
        bt4 = (Button)findViewById(R.id.bt4);
        bt5 = (Button)findViewById(R.id.bt5);
        bt6 = (Button)findViewById(R.id.bt6);
        bt7 = (Button)findViewById(R.id.bt7);
        bt8 = (Button)findViewById(R.id.bt8);
        bt9 = (Button)findViewById(R.id.bt9);
        btadd = (Button)findViewById(R.id.btadd);
        btsub = (Button)findViewById(R.id.btsub);
        btmul = (Button)findViewById(R.id.btmul);
        btdiv = (Button)findViewById(R.id.btdiv);
        btdot = (Button)findViewById(R.id.btdot);
        btequal = (Button)findViewById(R.id.btequal);
        clear = (Button)findViewById(R.id.clear);
        ed1 = (EditText)findViewById(R.id.editText);
        Past = (EditText)findViewById(R.id.Past);

        View.OnFocusChangeListener onFocusChangeListener = new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if (b){
                    ((EditText) view).setSelection(((EditText) view).getText().length());
                }
            }
        };

        bt0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Past.getText().toString().isEmpty()) {
                    res2 = "0";
                    f = 0;
                    ed1.setText(res2);
                    Past.setText(Past.getText() + "0");
                }
                else {
                    res2 = res2 + "0";
                    Past.setText(Past.getText() + "0");
                    res1 = Float.parseFloat(ed1.getText() + "");
                    if (Add == true) {
                        ed1.setText(0 + res1 + "");
                        Add = false;
                    }
                    else if (Sub==true){
                        ed1.setText(res1 - 0 + "");
                        Sub = false;
                    }
                    else if (Mul==true){
                        ed1.setText(res1 * 0 + "");
                        Mul = false;
                    }
                    else if (Div==true){
                        ed1.setText(res1 / 0 + "");
                        Div = false;
                    }
                    else {
                        if (lastClicked=="+"){
                            ed1.setText(f + Float.parseFloat(res2+"") + "");
                        }
                        else if (lastClicked=="-"){
                            ed1.setText(f - Float.parseFloat(res2+"") + "");
                        }
                        else if (lastClicked=="*"){
                            ed1.setText(f * Float.parseFloat(res2+"") + "");
                        }
                        else if (lastClicked=="/"){
                            ed1.setText(f / Float.parseFloat(res2+"") + "");
                        }
                        else{
                            ed1.setText(res2);
                        }
                    }
                }
            }
        });
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Past.getText().toString().isEmpty()) {
                    res2 = "1";
                    f = 0;
                    ed1.setText(res2);
                    Past.setText(Past.getText() + "1");
                }
                else {
                    res2 = res2 + "1";
                    Past.setText(Past.getText() + "1");
                    res1 = Float.parseFloat(ed1.getText() + "");
                    if (Add == true) {
                        ed1.setText(1 + res1 + "");
                        Add = false;
                    }
                    else if (Sub==true){
                        ed1.setText(res1 - 1 + "");
                        Sub = false;
                    }
                    else if (Mul==true){
                        ed1.setText(res1 * 1 + "");
                        Mul = false;
                    }
                    else if (Div==true){
                        ed1.setText(res1 / 1.0 + "");
                        Div = false;
                    }
                    else {
                        if (lastClicked=="+"){
                            ed1.setText(f + Float.parseFloat(res2+"") + "");
                        }
                        else if (lastClicked=="-"){
                            ed1.setText(f - Float.parseFloat(res2+"") + "");
                        }
                        else if (lastClicked=="*"){
                            ed1.setText(f * Float.parseFloat(res2+"") + "");
                        }
                        else if (lastClicked=="/"){
                            ed1.setText(f / Float.parseFloat(res2+"") + "");
                        }
                        else{
                            ed1.setText(res2);
                        }
                    }
                }
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Past.getText().toString().isEmpty()) {
                    res2 = "2";
                    f = 0;
                    ed1.setText(res2);
                    Past.setText(Past.getText() + "2");
                }
                else {
                    res2 = res2 + "2";
                    Past.setText(Past.getText() + "2");
                    res1 = Float.parseFloat(ed1.getText() + "");
                    if (Add == true) {
                        ed1.setText(2 + res1 + "");
                        Add = false;
                    }
                    else if (Sub==true){
                        ed1.setText(res1 - 2 + "");
                        Sub = false;
                    }
                    else if (Mul==true){
                        ed1.setText(res1 * 2 + "");
                        Mul = false;
                    }
                    else if (Div==true){
                        ed1.setText(res1 / 2.0 + "");
                        Div = false;
                    }
                    else {
                        if (lastClicked=="+"){
                            ed1.setText(f + Float.parseFloat(res2+"") + "");
                        }
                        else if (lastClicked=="-"){
                            ed1.setText(f - Float.parseFloat(res2+"") + "");
                        }
                        else if (lastClicked=="*"){
                            ed1.setText(f * Float.parseFloat(res2+"") + "");
                        }
                        else if (lastClicked=="/"){
                            ed1.setText(f / Float.parseFloat(res2+"") + "");
                        }
                        else{
                            ed1.setText(res2);
                        }
                    }
                }
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Past.getText().toString().isEmpty()) {
                    res2 = "3";
                    f = 0;
                    ed1.setText(res2);
                    Past.setText(Past.getText() + "3");
                }
                else {
                    res2 = res2 + "3";
                    Past.setText(Past.getText() + "3");
                    res1 = Float.parseFloat(ed1.getText() + "");
                    if (Add == true) {
                        ed1.setText(3 + res1 + "");
                        Add = false;
                    }
                    else if (Sub==true){
                        ed1.setText(res1 - 3 + "");
                        Sub = false;
                    }
                    else if (Mul==true){
                        ed1.setText(res1 * 3 + "");
                        Mul = false;
                    }
                    else if (Div==true){
                        ed1.setText(res1 / 3.0 + "");
                        Div = false;
                    }
                    else {
                        if (lastClicked=="+"){
                            ed1.setText(f + Float.parseFloat(res2+"") + "");
                        }
                        else if (lastClicked=="-"){
                            ed1.setText(f - Float.parseFloat(res2+"") + "");
                        }
                        else if (lastClicked=="*"){
                            ed1.setText(f * Float.parseFloat(res2+"") + "");
                        }
                        else if (lastClicked=="/"){
                            ed1.setText(f / Float.parseFloat(res2+"") + "");
                        }
                        else{
                            ed1.setText(res2);
                        }
                    }
                }
            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Past.getText().toString().isEmpty()) {
                    res2 = "4";
                    f = 0;
                    ed1.setText(res2);
                    Past.setText(Past.getText() + "4");
                }
                else {
                    res2 = res2 + "4";
                    Past.setText(Past.getText() + "4");
                    res1 = Float.parseFloat(ed1.getText() + "");
                    if (Add == true) {
                        ed1.setText(4 + res1 + "");
                        Add = false;
                    }
                    else if (Sub==true){
                        ed1.setText(res1 - 4 + "");
                        Sub = false;
                    }
                    else if (Mul==true){
                        ed1.setText(res1 * 4 + "");
                        Mul = false;
                    }
                    else if (Div==true){
                        ed1.setText(res1 / 4.0 + "");
                        Div = false;
                    }
                    else {
                        if (lastClicked=="+"){
                            ed1.setText(f + Float.parseFloat(res2+"") + "");
                        }
                        else if (lastClicked=="-"){
                            ed1.setText(f - Float.parseFloat(res2+"") + "");
                        }
                        else if (lastClicked=="*"){
                            ed1.setText(f * Float.parseFloat(res2+"") + "");
                        }
                        else if (lastClicked=="/"){
                            ed1.setText(f / Float.parseFloat(res2+"") + "");
                        }
                        else{
                            ed1.setText(res2);
                        }
                    }
                }
            }
        });
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Past.getText().toString().isEmpty()) {
                    res2 = "5";
                    f = 0;
                    ed1.setText(res2);
                    Past.setText(Past.getText() + "5");
                }
                else {
                    res2 = res2 + "5";
                    Past.setText(Past.getText() + "5");
                    res1 = Float.parseFloat(ed1.getText() + "");
                    if (Add == true) {
                        ed1.setText(5 + res1 + "");
                        Add = false;
                    }
                    else if (Sub==true){
                        ed1.setText(res1 - 5 + "");
                        Sub = false;
                    }
                    else if (Mul==true){
                        ed1.setText(res1 * 5 + "");
                        Mul = false;
                    }
                    else if (Div==true){
                        ed1.setText(res1 / 5.0 + "");
                        Div = false;
                    }
                    else {
                        if (lastClicked=="+"){
                            ed1.setText(f + Float.parseFloat(res2+"") + "");
                        }
                        else if (lastClicked=="-"){
                            ed1.setText(f - Float.parseFloat(res2+"") + "");
                        }
                        else if (lastClicked=="*"){
                            ed1.setText(f * Float.parseFloat(res2+"") + "");
                        }
                        else if (lastClicked=="/"){
                            ed1.setText(f / Float.parseFloat(res2+"") + "");
                        }
                        else{
                            ed1.setText(res2);
                        }
                    }
                }
            }
        });
        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Past.getText().toString().isEmpty()) {
                    res2 = "6";
                    f = 0;
                    ed1.setText(res2);
                    Past.setText(Past.getText() + "6");
                }
                else {
                    res2 = res2 + "6";
                    Past.setText(Past.getText() + "6");
                    res1 = Float.parseFloat(ed1.getText() + "");
                    if (Add == true) {
                        ed1.setText(6 + res1 + "");
                        Add = false;
                    }
                    else if (Sub==true){
                        ed1.setText(res1 - 6 + "");
                        Sub = false;
                    }
                    else if (Mul==true){
                        ed1.setText(res1 * 6 + "");
                        Mul = false;
                    }
                    else if (Div==true){
                        ed1.setText(res1 / 6.0 + "");
                        Div = false;
                    }
                    else {
                        if (lastClicked=="+"){
                            ed1.setText(f + Float.parseFloat(res2+"") + "");
                        }
                        else if (lastClicked=="-"){
                            ed1.setText(f - Float.parseFloat(res2+"") + "");
                        }
                        else if (lastClicked=="*"){
                            ed1.setText(f * Float.parseFloat(res2+"") + "");
                        }
                        else if (lastClicked=="/"){
                            ed1.setText(f / Float.parseFloat(res2+"") + "");
                        }
                        else{
                            ed1.setText(res2);
                        }
                    }
                }
            }
        });
        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Past.getText().toString().isEmpty()) {
                    res2 = "7";
                    f = 0;
                    ed1.setText(res2);
                    Past.setText(Past.getText() + "7");
                }
                else {
                    res2 = res2 + "7";
                    Past.setText(Past.getText() + "7");
                    res1 = Float.parseFloat(ed1.getText() + "");
                    if (Add == true) {
                        ed1.setText(7 + res1 + "");
                        Add = false;
                    }
                    else if (Sub==true){
                        ed1.setText(res1 - 7 + "");
                        Sub = false;
                    }
                    else if (Mul==true){
                        ed1.setText(res1 * 7 + "");
                        Mul = false;
                    }
                    else if (Div==true){
                        ed1.setText(res1 / 7.0 + "");
                        Div = false;
                    }
                    else {
                        if (lastClicked=="+"){
                            ed1.setText(f + Float.parseFloat(res2+"") + "");
                        }
                        else if (lastClicked=="-"){
                            ed1.setText(f - Float.parseFloat(res2+"") + "");
                        }
                        else if (lastClicked=="*"){
                            ed1.setText(f * Float.parseFloat(res2+"") + "");
                        }
                        else if (lastClicked=="/"){
                            ed1.setText(f / Float.parseFloat(res2+"") + "");
                        }
                        else{
                            ed1.setText(res2);
                        }
                    }
                }
            }
        });
        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Past.getText().toString().isEmpty()) {
                    res2 = "8";
                    f = 0;
                    ed1.setText(res2);
                    Past.setText(Past.getText() + "8");
                }
                else {
                    res2 = res2 + "8";
                    Past.setText(Past.getText() + "8");
                    res1 = Float.parseFloat(ed1.getText() + "");
                    if (Add == true) {
                        ed1.setText(8 + res1 + "");
                        Add = false;
                    }
                    else if (Sub==true){
                        ed1.setText(res1 - 8 + "");
                        Sub = false;
                    }
                    else if (Mul==true){
                        ed1.setText(res1 * 8 + "");
                        Mul = false;
                    }
                    else if (Div==true){
                        ed1.setText(res1 / 8.0 + "");
                        Div = false;
                    }
                    else {
                        if (lastClicked=="+"){
                            ed1.setText(f + Float.parseFloat(res2+"") + "");
                        }
                        else if (lastClicked=="-"){
                            ed1.setText(f - Float.parseFloat(res2+"") + "");
                        }
                        else if (lastClicked=="*"){
                            ed1.setText(f * Float.parseFloat(res2+"") + "");
                        }
                        else if (lastClicked=="/"){
                            ed1.setText(f / Float.parseFloat(res2+"") + "");
                        }
                        else{
                            ed1.setText(res2);
                        }
                    }
                }
            }
        });
        bt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Past.getText().toString().isEmpty()) {
                    res2 = "9";
                    f = 0;
                    ed1.setText(res2);
                    Past.setText(Past.getText() + "9");
                }
                else {
                    res2 = res2 + "9";
                    Past.setText(Past.getText() + "9");
                    res1 = Float.parseFloat(ed1.getText() + "");
                    if (Add == true) {
                        ed1.setText(9 + res1 + "");
                        Add = false;
                    }
                    else if (Sub==true){
                        ed1.setText(res1 - 9 + "");
                        Sub = false;
                    }
                    else if (Mul==true){
                        ed1.setText(res1 * 9 + "");
                        Mul = false;
                    }
                    else if (Div==true){
                        ed1.setText(res1 / 9.0 + "");
                        Div = false;
                    }
                    else {
                        if (lastClicked=="+"){
                            ed1.setText(f + Float.parseFloat(res2+"") + "");
                        }
                        else if (lastClicked=="-"){
                            ed1.setText(f - Float.parseFloat(res2+"") + "");
                        }
                        else if (lastClicked=="*"){
                            ed1.setText(f * Float.parseFloat(res2+"") + "");
                        }
                        else if (lastClicked=="/"){
                            ed1.setText(f / Float.parseFloat(res2+"") + "");
                        }
                        else{
                            ed1.setText(res2);
                        }
                    }
                }
            }
        });
        btdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Past.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(),"Field is Empty",Toast.LENGTH_SHORT).show();
                }
                else {
                    if (res2.indexOf('.')==-1){
                        res2 = res2 + ".";
                        Past.setText(Past.getText()+".");
                    }
                    else{
                        Toast.makeText(getApplicationContext(),"Value can have only one decimal",Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

        btadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Add==true || Sub==true || Mul==true || Div==true){
                    Toast.makeText(getApplicationContext(),"Already Pressed",Toast.LENGTH_SHORT).show();
                }
                else {
                    if(Past.getText().toString().isEmpty()){
                        Toast.makeText(getApplicationContext(),"Value not Given",Toast.LENGTH_SHORT).show();
                    }
                    else{
                        if (lastClicked=="+"){
                            f = f + Float.parseFloat(res2 +"");
                        }
                        else if (lastClicked=="-"){
                            f = f - Float.parseFloat(res2 +"");
                        }
                        else if (lastClicked=="*"){
                            f = f * Float.parseFloat(res2 +"");
                        }
                        else if (lastClicked=="/"){
                            f = f / Float.parseFloat(res2 +"");
                        }
                        else{
                            f = Float.parseFloat(res2+"");
                        }
                        res2 = "";
                        Add = true;
                        lastClicked = "+";
                        Past.setText(Past.getText()+"+");
                    }
                }
            }
        });
        btsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Add==true || Sub==true || Mul==true || Div==true){
                    Toast.makeText(getApplicationContext(),"Already Pressed",Toast.LENGTH_SHORT).show();
                }
                else {
                    if(Past.getText().toString().isEmpty()){
                        Toast.makeText(getApplicationContext(),"Value not Given",Toast.LENGTH_SHORT).show();
                    }
                    else{
                        if (lastClicked=="+"){
                            f = f + Float.parseFloat(res2 +"");
                        }
                        else if (lastClicked=="-"){
                            f = f - Float.parseFloat(res2 +"");
                        }
                        else if (lastClicked=="*"){
                            f = f * Float.parseFloat(res2 +"");
                        }
                        else if (lastClicked=="/"){
                            f = f / Float.parseFloat(res2 +"");
                        }
                        else{
                            f = Float.parseFloat(res2+"");
                        }
                        res2 = "";
                        Sub = true;
                        lastClicked = "-";
                        Past.setText(Past.getText()+"-");
                    }
                }
            }
        });
        btmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Add==true || Sub==true || Mul==true || Div==true){
                    Toast.makeText(getApplicationContext(),"Already Pressed",Toast.LENGTH_SHORT).show();
                }
                else {
                    if(Past.getText().toString().isEmpty()){
                        Toast.makeText(getApplicationContext(),"Value not Given",Toast.LENGTH_SHORT).show();
                    }
                    else{
                        if (lastClicked=="+"){
                            f = f + Float.parseFloat(res2 +"");
                        }
                        else if (lastClicked=="-"){
                            f = f - Float.parseFloat(res2 +"");
                        }
                        else if (lastClicked=="*"){
                            f = f * Float.parseFloat(res2 +"");
                        }
                        else if (lastClicked=="/"){
                            f = f / Float.parseFloat(res2 +"");
                        }
                        else{
                            f = Float.parseFloat(res2+"");
                        }
                        res2 = "";
                        Mul = true;
                        lastClicked = "*";
                        Past.setText(Past.getText()+"*");
                    }
                }
            }
        });
        btdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Add==true || Sub==true || Mul==true || Div==true){
                    Toast.makeText(getApplicationContext(),"Already Pressed",Toast.LENGTH_SHORT).show();
                }
                else {
                    if(Past.getText().toString().isEmpty()){
                        Toast.makeText(getApplicationContext(),"Value not Given",Toast.LENGTH_SHORT).show();
                    }
                    else{
                        if (lastClicked=="+"){
                            f = f + Float.parseFloat(res2 +"");
                        }
                        else if (lastClicked=="-"){
                            f = f - Float.parseFloat(res2 +"");
                        }
                        else if (lastClicked=="*"){
                            f = f * Float.parseFloat(res2 +"");
                        }
                        else if (lastClicked=="/"){
                            f = f / Float.parseFloat(res2 +"");
                        }
                        else{
                            f = Float.parseFloat(res2+"");
                        }
                        res2 = "";
                        Div = true;
                        lastClicked = "/";
                        Past.setText(Past.getText()+"/");
                    }
                }
            }
        });
        btequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Past.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(),"Value not Given",Toast.LENGTH_SHORT).show();
                }
                else {
                    ed1.setText(ed1.getText());
                }

            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed1.setText("");
                Past.setText("");
                res1 = 0;
                res2 = "";
                lastClicked="";
            }
        });

    }
}