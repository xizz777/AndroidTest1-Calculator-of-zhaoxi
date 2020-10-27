package com.example.calculatorofzhaoxi;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import java.lang.CharSequence;
import java.util.LinkedList;
import java.math.BigDecimal;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText editText;
    private final LinkedList<String> linkedList = new LinkedList<>();
    String string = "";
    boolean ifhave = false;
    //boolean ifint =true;
    boolean needclear =false;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button0 = (Button) findViewById(R.id.Button_0);
        Button button1 = (Button) findViewById(R.id.Button_1);
        Button button2 = (Button) findViewById(R.id.Button_2);
        Button button3 = (Button) findViewById(R.id.Button_3);
        Button button4 = (Button) findViewById(R.id.Button_4);
        Button button5 = (Button) findViewById(R.id.Button_5);
        Button button6 = (Button) findViewById(R.id.Button_6);
        Button button7 = (Button) findViewById(R.id.Button_7);
        Button button8 = (Button) findViewById(R.id.Button_8);
        Button button9 = (Button) findViewById(R.id.Button_9);
        Button buttonjia = (Button) findViewById(R.id.Button_jia);
        Button buttondengyu = (Button) findViewById(R.id.Button_dengyu);
        Button buttonqingling = (Button) findViewById(R.id.Button_qingling);
        Button buttonjianfa = (Button) findViewById(R.id.Button_jianfa);
        Button buttonchengfa = (Button) findViewById(R.id.Button_chengfa);
        Button buttonchufa = (Button) findViewById(R.id.Button_chufa);
        Button buttonfushu = (Button) findViewById(R.id.Button_fushu);
        Button buttondian = (Button) findViewById(R.id.Button_dian);
        Button buttonkaipingfang = (Button) findViewById(R.id.Button_kaipingfang);
        //Button buttonjiecheng = (Button) findViewById(R.id.Button_jiecheng);
        editText = (EditText) findViewById(R.id.edit_text);
        button0.setOnClickListener(this);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        buttonjia.setOnClickListener(this);
        buttondengyu.setOnClickListener(this);
        buttonqingling.setOnClickListener(this);
        buttonjianfa.setOnClickListener(this);
        buttonchengfa.setOnClickListener(this);
        buttonchufa.setOnClickListener(this);
        buttonfushu.setOnClickListener(this);
        buttondian.setOnClickListener(this);
        buttonkaipingfang.setOnClickListener(this);
        //buttonjiecheng.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.Button_0:
                if(ifnum(string)==true){
                    if (string.length()>=10) {
                        break;
                    }
                }
                if(ifnum(string)==false) {
                    if (string.length() >= 9) {
                        break;
                    }
                }
                if(needclear){
                    string = "";
                }
                if(string.equals("0")){
                    break;
                }
                string = string + "0";
                editText.setText(string);
                needclear=false;
                break;
            case R.id.Button_1:
                if(ifnum(string)){
                    if (string.length()>=11) {
                        break;
                    }
                }
                if(ifnum(string)==false) {
                    if (string.length() >= 9) {
                        break;
                    }
                }
                if(needclear){
                    string = "";
                }
                if(string.equals("0")){
                    string="";
                }
                string = string + "1";
                editText.setText(string);
                needclear=false;
                break;
            case R.id.Button_2:
                if(ifnum(string)){
                    if (string.length()>=11) {
                        break;
                    }
                }
                if(ifnum(string)==false) {
                    if (string.length() >= 9) {
                        break;
                    }
                }
                if(needclear){
                    string = "";
                }
                if(string.equals("0")){
                    string="";
                }
                string = string + "2";
                editText.setText(string);
                needclear=false;
                break;
            case R.id.Button_3:
                if(ifnum(string)){
                    if (string.length()>=11) {
                        break;
                    }
                }
                if(ifnum(string)==false) {
                    if (string.length() >= 9) {
                        break;
                    }
                }
                if(needclear){
                    string = "";
                }
                if(string.equals("0")){
                    string="";
                }
                string = string + "3";
                editText.setText(string);
                needclear=false;
                break;
            case R.id.Button_4:
                if(ifnum(string)){
                    if (string.length()>=11) {
                        break;
                    }
                }
                if(ifnum(string)==false) {
                    if (string.length() >= 9) {
                        break;
                    }
                }
                if(needclear){
                    string = "";
                }
                if(string.equals("0")){
                    string="";
                }
                string = string + "4";
                editText.setText(string);
                needclear=false;
                break;
            case R.id.Button_5:
                if(ifnum(string)){
                    if (string.length()>=11) {
                        break;
                    }
                }
                if(ifnum(string)==false) {
                    if (string.length() >= 9) {
                        break;
                    }
                }
                if(needclear){
                    string = "";
                }
                if(string.equals("0")){
                    string="";
                }
                string = string + "5";
                editText.setText(string);
                needclear=false;
                break;
            case R.id.Button_6:
                if(ifnum(string)){
                    if (string.length()>=11) {
                        break;
                    }
                }
                if(ifnum(string)==false) {
                    if (string.length() >= 9) {
                        break;
                    }
                }
                if(needclear){
                    string = "";
                }
                if(string.equals("0")){
                    string="";
                }
                string = string + "6";
                editText.setText(string);
                needclear=false;
                break;
            case R.id.Button_7:
                if(ifnum(string)){
                    if (string.length()>=11) {
                        break;
                    }
                }
                if(ifnum(string)==false) {
                    if (string.length() >= 9) {
                        break;
                    }
                }
                if(needclear){
                    string = "";
                }
                if(string.equals("0")){
                    string="";
                }
                string = string + "7";
                editText.setText(string);
                needclear=false;
                break;
            case R.id.Button_8:
                if(ifnum(string)){
                    if (string.length()>=11) {
                        break;
                    }
                }
                if(ifnum(string)==false) {
                    if (string.length() >= 9) {
                        break;
                    }
                }
                if(needclear){
                    string = "";
                }
                if(string.equals("0")){
                    string="";
                }
                string = string + "8";
                editText.setText(string);
                needclear=false;
                break;
            case R.id.Button_9:
                if(ifnum(string)){
                    if (string.length()>=11) {
                        break;
                    }
                }
                if(ifnum(string)==false) {
                    if (string.length() >= 9) {
                        break;
                    }
                }
                if(needclear){
                    string = "";
                }
                if(string.equals("0")){
                    string="";
                }
                string = string + "9";
                editText.setText(string);
                needclear=false;
                break;
            case R.id.Button_dian:
               for(int i =0;i<string.length();i++){
                   String string1 = string.substring(i,i+1);
                   if(string1.equals(".")){
                        ifhave = true;
                    }
                }
                if(ifhave==true){
                    break;
                }
                if(ifhave==false) {
                    if(string.equals("")){
                        string = "0";
                    }
                    string = string + ".";
                    editText.setText(string);
                    break;
                }
                break;
            case R.id.Button_jia:
                if (linkedList.isEmpty()) {
                    if (string.equals("")) {
                        break;
                    }
                    editText.setText("+");
                    linkedList.push(string);
                    linkedList.push("+");
                    string = "";
                    break;
                }
                if (!linkedList.isEmpty()) {
                    if (string.equals("")) {
                        break;
                    }
                    switch (linkedList.pop()) {
                        case "+":
                            Double a = Double.parseDouble(linkedList.pop());
                            Double b = Double.parseDouble(string);
                            Double c = a + b;
                            BigDecimal bd = new BigDecimal(c.toString());
                            string=bd.toPlainString();
                            editText.setText(string);
                            linkedList.push(string);
                            linkedList.push("+");
                            string = "";
                            break;
                        case "-":
                            Double a1 = Double.parseDouble(linkedList.pop());
                            Double b1 = Double.parseDouble(string);
                            Double c1 = a1 - b1;
                            BigDecimal bd1 = new BigDecimal(c1.toString());
                            string=bd1.toPlainString();
                            editText.setText(string);
                            linkedList.push(string);
                            linkedList.push("+");
                            string = "";
                            break;
                        case "*":
                            Double a2 = Double.parseDouble(linkedList.pop());
                            Double b2 = Double.parseDouble(string);
                            Double c2 = a2 * b2;
                            BigDecimal bd2 = new BigDecimal(c2.toString());
                            string=bd2.toPlainString();
                            editText.setText(string);
                            linkedList.push(string);
                            linkedList.push("+");
                            string = "";
                            break;
                        case "/":
                            if(string.equals("0")){
                                Toast.makeText(MainActivity.this, "除数不能为0", Toast.LENGTH_SHORT).show();
                                string="";
                                editText.setText(string);
                                linkedList.clear();
                                break;
                            }
                            Double a3 = Double.parseDouble(linkedList.pop());
                            Double b3 = Double.parseDouble(string);
                            Double c3 = a3 / b3;
                            BigDecimal bd3 = new BigDecimal(c3.toString());
                            string=bd3.toPlainString();
                            editText.setText(string);
                            linkedList.push(string);
                            linkedList.push("+");
                            string = "";
                            break;
                    }
                }
                break;
            case R.id.Button_jianfa:
                if (linkedList.isEmpty()) {
                    if (string.equals("")) {
                        break;
                    }
                    editText.setText("-");
                    linkedList.push(string);
                    linkedList.push("-");
                    string = "";
                    break;
                }
                if (!linkedList.isEmpty()) {
                    if (string.equals("")) {
                        break;
                    }
                    switch (linkedList.pop()) {
                        case "+":
                            Double a = Double.parseDouble(linkedList.pop());
                            Double b = Double.parseDouble(string);
                            Double c = a + b;
                            BigDecimal bd = new BigDecimal(c.toString());
                            string=bd.toPlainString();
                            editText.setText(string);
                            linkedList.push(string);
                            linkedList.push("-");
                            string = "";
                            break;
                        case "-":
                            Double a1 = Double.parseDouble(linkedList.pop());
                            Double b1 = Double.parseDouble(string);
                            Double c1 = a1 - b1;
                            BigDecimal bd1 = new BigDecimal(c1.toString());
                            string=bd1.toPlainString();
                            editText.setText(string);
                            linkedList.push(string);
                            linkedList.push("-");
                            string = "";
                            break;
                        case "*":
                            Double a2 = Double.parseDouble(linkedList.pop());
                            Double b2 = Double.parseDouble(string);
                            Double c2 = a2 * b2;
                            BigDecimal bd2 = new BigDecimal(c2.toString());
                            string=bd2.toPlainString();
                            editText.setText(string);
                            linkedList.push(string);
                            linkedList.push("-");
                            string = "";
                            break;
                        case "/":
                            if(string.equals("0")){
                                Toast.makeText(MainActivity.this, "除数不能为0", Toast.LENGTH_SHORT).show();
                                string="";
                                editText.setText(string);
                                linkedList.clear();
                                break;
                            }
                            Double a3 = Double.parseDouble(linkedList.pop());
                            Double b3 = Double.parseDouble(string);
                            Double c3 = a3 / b3;
                            BigDecimal bd3 = new BigDecimal(c3.toString());
                            string=bd3.toPlainString();
                            editText.setText(string);
                            linkedList.push(string);
                            linkedList.push("-");
                            string = "";
                            break;

                    }
                    break;
                }
            case R.id.Button_chengfa:
                if (linkedList.isEmpty()) {
                    if (string.equals("")) {
                        break;
                    }
                    editText.setText("*");
                    linkedList.push(string);
                    linkedList.push("*");
                    string = "";
                    break;
                }
                if (!linkedList.isEmpty()) {
                    if (string.equals("")) {
                        break;
                    }
                    switch (linkedList.pop()) {
                        case "+":
                            Double a = Double.parseDouble(linkedList.pop());
                            Double b = Double.parseDouble(string);
                            Double c = a + b;
                            BigDecimal bd = new BigDecimal(c.toString());
                            string=bd.toPlainString();
                            editText.setText(string);
                            linkedList.push(string);
                            linkedList.push("*");
                            string = "";
                            break;
                        case "-":
                            Double a1 = Double.parseDouble(linkedList.pop());
                            Double b1 = Double.parseDouble(string);
                            Double c1 = a1 - b1;
                            BigDecimal bd1 = new BigDecimal(c1.toString());
                            string=bd1.toPlainString();
                            editText.setText(string);
                            linkedList.push(string);
                            linkedList.push("*");
                            string = "";
                            break;
                        case "*":
                            Double a2 = Double.parseDouble(linkedList.pop());
                            Double b2 = Double.parseDouble(string);
                            Double c2 = a2 * b2;
                            BigDecimal bd2 = new BigDecimal(c2.toString());
                            string=bd2.toPlainString();
                            editText.setText(string);
                            linkedList.push(string);
                            linkedList.push("*");
                            string = "";
                            break;
                        case "/":
                            if(string.equals("0")){
                                Toast.makeText(MainActivity.this, "除数不能为0", Toast.LENGTH_SHORT).show();
                                string="";
                                editText.setText(string);
                                linkedList.clear();
                                break;
                            }
                            Double a3 = Double.parseDouble(linkedList.pop());
                            Double b3 = Double.parseDouble(string);
                            Double c3 = a3 / b3;
                            BigDecimal bd3 = new BigDecimal(c3.toString());
                            string=bd3.toPlainString();
                            editText.setText(string);
                            linkedList.push(string);
                            linkedList.push("*");
                            string = "";
                            break;
                    }
                    break;
                }
            case R.id.Button_chufa:
                if (linkedList.isEmpty()) {
                    if (string.equals("")) {
                        break;
                    }
                    editText.setText("➗");
                    linkedList.push(string);
                    linkedList.push("/");
                    string = "";
                    break;
                }
                if (!linkedList.isEmpty()) {
                    if (string.equals("")) {
                        break;
                    }
                    switch (linkedList.pop()) {
                        case "+":
                            Double a = Double.parseDouble(linkedList.pop());
                            Double b = Double.parseDouble(string);
                            Double c = a + b;
                            BigDecimal bd = new BigDecimal(c.toString());
                            string=bd.toPlainString();
                            editText.setText(string);
                            linkedList.push(string);
                            linkedList.push("/");
                            string = "";
                            break;
                        case "-":
                            Double a1 = Double.parseDouble(linkedList.pop());
                            Double b1 = Double.parseDouble(string);
                            Double c1 = a1 - b1;
                            BigDecimal bd1 = new BigDecimal(c1.toString());
                            string=bd1.toPlainString();
                            editText.setText(string);
                            linkedList.push(string);
                            linkedList.push("/");
                            string = "";
                            break;
                        case "*":
                            Double a2 = Double.parseDouble(linkedList.pop());
                            Double b2 = Double.parseDouble(string);
                            Double c2 = a2 * b2;
                            BigDecimal bd2 = new BigDecimal(c2.toString());
                            string=bd2.toPlainString();
                            editText.setText(string);
                            linkedList.push(string);
                            linkedList.push("/");
                            string = "";
                            break;
                        case "/":
                            if (string.equals("0")) {
                                Toast.makeText(MainActivity.this, "除数不能为0", Toast.LENGTH_SHORT).show();
                                string = "";
                                editText.setText(string);
                                linkedList.clear();
                                break;
                            }
                            Double a3 = Double.parseDouble(linkedList.pop());
                            Double b3 = Double.parseDouble(string);
                            Double c3 = a3 / b3;
                            BigDecimal bd3 = new BigDecimal(c3.toString());
                            string=bd3.toPlainString();
                            editText.setText(string);
                            linkedList.push(string);
                            linkedList.push("/");
                            string = "";
                            break;
                    }
                }
                    break;
            case R.id.Button_dengyu:
                if(string.equals("")){
                    break;
                }
                if(linkedList.isEmpty()){
                    break;
                }
                switch (linkedList.pop()) {
                    case "+":
                        Double a = Double.parseDouble(linkedList.pop());
                        Double b = Double.parseDouble(string);
                        Double c = a + b;
                        BigDecimal bd = new BigDecimal(c.toString());
                        string=bd.toPlainString();
                        editText.setText(string);
                        needclear=true;
                        break;
                    case "-":
                        Double a1 = Double.parseDouble(linkedList.pop());
                        Double b1 = Double.parseDouble(string);
                        Double c1 = a1 - b1;
                        BigDecimal bd1 = new BigDecimal(c1.toString());
                        string=bd1.toPlainString();
                        editText.setText(string);
                        needclear=true;
                        break;
                    case "*":
                        Double a2 = Double.parseDouble(linkedList.pop());
                        Double b2 = Double.parseDouble(string);
                        Double c2 = a2 * b2;
                        BigDecimal bd2 = new BigDecimal(c2.toString());
                        string=bd2.toPlainString();
                        editText.setText(string);
                        needclear=true;
                        break;
                    case "/":
                        if(string.equals("0")){
                            Toast.makeText(MainActivity.this, "除数不能为0", Toast.LENGTH_SHORT).show();
                            string="";
                            editText.setText(string);
                            linkedList.clear();
                            needclear=true;
                            break;
                        }
                        Double a3 = Double.parseDouble(linkedList.pop());
                        Double b3 = Double.parseDouble(string);
                        Double c3 = a3 / b3;
                        BigDecimal bd3 = new BigDecimal(c3.toString());
                        string=bd3.toPlainString(); //只有除法牵涉到浮点数运算中的精度问题，进行格式转换实现四舍五入
                        editText.setText(string);
                        break;
                }
                break;

            case R.id.Button_qingling:
                string = "";
                editText.setText("0");
                linkedList.clear();
                break;
            case R.id.Button_kaipingfang:
                if(string.equals("")) {
                    break;//开平方根需要对现有数字进行，当string为空时要么未输入数字，要么当前为符号，都不能进行开平方根运算;
                }
                if(string.startsWith("-")){//负数也不能开平方根
                    Toast.makeText(MainActivity.this, "负数不能开平方根", Toast.LENGTH_SHORT).show();
                    string ="";
                    linkedList.clear();
                    editText.setText(string);
                    break;
                }
                else{
                    double x = Double.parseDouble(string);
                    string = String.format("%.2f", Math.sqrt(x));
                    editText.setText(string);
                    needclear=true;
                    break;
                }
            /*case R.id.Button_jiecheng:
                if(string.equals("")) {
                    break;//阶乘同样需要对现有数字进行，当string为空时要么未输入数字，要么当前为符号，都不能进行开平方根运算;
                }
                if(ifnum(string)==true){
                    Toast.makeText(MainActivity.this, "负数或非整数不能阶乘", Toast.LENGTH_SHORT).show();
                    string ="";
                    linkedList.clear();
                    editText.setText(string);
                    break;
                }
                /*if(ifint==false){
                    Toast.makeText(MainActivity.this, "非整数不能阶乘", Toast.LENGTH_SHORT).show();
                    string ="";
                    linkedList.clear();
                    editText.setText(string);
                    break;
                }

                else{
                    int x = Integer.parseInt(string);
                    for(int a = x-1; a>=1; a--){
                        x *=a;
                    }
                    string =String.valueOf(x);
                    editText.setText(string);
                    break;
                }*/

            case R.id.Button_fushu:
                //if(string.equals("")&&editText.length()!=0){ //根据前面的四种计算方式，当Edittext中存在内容且string为空时，此时界面上为计算方法字符的显示，这时切换正负号的按钮无意义。
                //    break;
                //}
                //else{
                if(string.equals("")) { //可以在运算过程中以负号为开头创建负数
                    string = "-";
                    editText.setText(string);
                    needclear=false;
                    break;
                }
                    if(string.startsWith("-")) { // 截取当前的string中第一个字符，如果当前有负号
                        string = string.substring(1, string.length());//则截取第一个字符之后的string进行替换，即此时去掉负号，改变为正数
                        editText.setText(string);
                        break;
                    }
                    if(!string.startsWith("-")){ // 截取当前的第一个字符。如果无负号
                        string = "-" + string; //向string首字符添加负号，即改变为负数
                        editText.setText(string);
                        break;
                    }
                //}
                break;
        }
    }
    public boolean ifnum(String s){
        boolean isNum = s.matches(".+");
        boolean isfu = s.matches("-+");
        if(isNum==true||isfu==true){
            return true;
        }
        else {
            return false;
        }
    }
}
