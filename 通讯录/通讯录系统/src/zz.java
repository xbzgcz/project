import java.sql.*;
import java.text.ParseException;
import java.util.*;
import javax.swing.*;

import java.io.*;
import java.util.Scanner;
import java.awt.*;
import java.awt.event.*;

import javax.swing.event.*;
public class zz {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Dispose dispose=new Dispose();
        Main a=new Main();
        a.printMain();
        while (true) {

            int select = scanner.nextInt();
            switch (select) {
                case 1: {
                    dispose.addNumber();
                    System.out.println();
                }
                break;
                case 2: {
                    System.out.println("删除");
                    if(dispose.number==null)
                        System.out.println("无内容");
                    else
                        dispose.showNumber();
                    System.out.println();
                }
                break;
                case 3: {
                    System.out.println("存储");
                    dispose.insertNumber();
                    System.out.println();
                }
                break;
                case 4: {
                    System.out.println("查询");
                    if(dispose.number.size()==0)
                        System.out.println("查询失败");
                    else
                    {
                        dispose.searchNumber();
                    }
                    System.out.println();
                }
                break;
                case 5: {
                    System.out.println("修改");
                    dispose.updateNumber();
                    System.out.println();
                }
                break;
                case 6: {
                    System.out.println("排序");
                    dispose.soltNumber();
                    System.out.println();
                }
                break;
                case 7: {
                    System.out.println("删除");
                    dispose.deleteNumber();
                    System.out.println();
                }
                break;
                case 8:{
                    System.out.println("数据库数据显示");
                    dispose.iNumber();
                    System.out.println();
                }
                break;
                case 9:{
                    System.out.println("数据库数据删除");
                    dispose.delete();
                }
                break;
                case 10:{
                    System.out.println("数据库数据修改");
                    dispose.update();
                    System.out.println();
                }
                break;
                case 11:{
                    System.out.println("数据库数据添加");
                    dispose.addDate();
                    System.out.println();
                }
                break;
                default:System.exit(0);

            }

       }

    }
}
class Main{
    public  void printMain(){
        System.out.println("    =====欢迎来到通讯录系统====     ");
        System.out.println("===================================");
        System.out.println();
        System.out.println("               1.添加              ");
        System.out.println("               2.显示              ");
        System.out.println("               3.存储              ");
        System.out.println("               4.查询              ");
        System.out.println("               5.修改              ");
        System.out.println("               6.排序              ");
        System.out.println("               7.删除              ");
        System.out.println("               8.数据库数据显示              ");
        System.out.println("               9.数据库数据删除              ");
        System.out.println("               10.数据库数据修改              ");
        System.out.println("               11.数据库数据添加              ");
        System.out.println();
        System.out.println();
        System.out.println(" 请输入你的选择 ");
    }
}
class Message{

    //手机号
    private String name;//姓名
    private String telephone;//电话
    private String address;//地址
    private String postalCode;//邮政编码
    private String Email;//Email
    private String homePhone;//家庭电话
    private String remark;//备注

    public Message(){
        name="0";
        telephone="0";
        address ="0";
        postalCode="0";
        Email="0";
        homePhone="0";
        remark="0";
    }

    public Message(String name,String telephone,  String address, String postalCode, String Email, String homePhone, String remark){
        this.name=name;
        this.telephone=telephone;
        this.address =address;
        this.postalCode=postalCode;
        this.Email=Email;
        this.homePhone=homePhone;
        this.remark=remark;
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getTelephone() {
        return telephone;
    }
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setAddress(String address){
        this.address = address;
    }
    public String getAddress(){
        return address;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
    public String getPostalCode() {
        return postalCode;
    }

    public void setEmail(String email) {
        this.Email = email;
    }
    public String getEmail() {
        return Email;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }
    public String getHomePhone() {
        return homePhone;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
    public String getRemark() {
        return remark;
    }

    public void toMessage() {

        System.out.println("  姓名：   "+getName()+"  电话：    "+getTelephone()+
                "   地址：   "+getAddress()+"   邮政编码：    "+getPostalCode()+
                "   Email：     "+getEmail()+"    家庭号码：   "+getHomePhone()+"  备注：   "+getRemark());
    }

}
class Dispose {

    static int index = 0;
    static ArrayList<Message> number = new ArrayList();
    static int len = number.size();

    void addNumber() {//添加信息
        System.out.println("请输入添加信息：");
        Scanner sc = new Scanner(System.in);
        Message x = new Message("", "", "", "", "", "", "");
        //System.out.println("请输入添加信息：");
        // Message x=new Message(sc.next(),sc.next(),sc.next(),sc.next(),sc.next(), sc.next(),sc.next());
        System.out.println("输入姓名：");
        x.setName(sc.next());
        System.out.println("输入电话：：");
        x.setTelephone(sc.next());
        System.out.println("输入地址：");
        x.setAddress(sc.next());
        System.out.println("输入邮政编码：");
        x.setPostalCode(sc.next());
        System.out.println("输入Email：");
        x.setEmail(sc.next());
        System.out.println("输入家庭电话：");
        x.setHomePhone(sc.next());
        System.out.println("输入备注：");
        x.setRemark(sc.next());
        number.add(x);
        index++;
        if (number.isEmpty()) {
            System.out.println("数据添加失败啦");
        } else {
            System.out.println("数据添加成功啦");
            len++;//list集合长度加一
        }
    }

    void deleteNumber() {//删除信息
        System.out.println("输入要删除的联系人的姓名");
        Scanner in = new Scanner(System.in);
        String d1 = in.nextLine();
        java.util.Iterator<Message> it = number.iterator();
        int b=0;
        while (it.hasNext()) {
            Message message = it.next();
            if (message.getName().equals(d1)) {
                it.remove();
                b++;
                --index;//一定要加这个，否则当做了删除操作再做添加操作的时候会出现异常（类似于指针，栈）
                System.out.println("删除完毕" + "此时通讯录记录条数为：" + --len);
            }
        }
        if(b==0)
            System.out.println("删除失败，查无此人");

    }

    void insertNumber() throws ClassNotFoundException {//存储信息
        String driver = "com.mysql.jdbc.Driver";
        //URL指向要访问的数据库名mydata
        String url = "jdbc:mysql://localhost:3306/telephonemanage?useSSL=false&useUnicode=true&characterEncoding=UTF-8&autoReconnect=true&allowMultiQueries=true";
        //MySQL配置时的用户名
        String user = "root";
        //MySQL配置时的密码
        String password = "123456";
        try {
            Class.forName(driver);
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stmt = con.createStatement();
            for (int i = 0; i < len; i++) {
                String sql = "insert into telephoneDate values('" + number.get(i).getName() + "','" + number.get(i).getTelephone() + "','" + number.get(i).getAddress() + "','" + number.get(i).getPostalCode() + "','" + number.get(i).getEmail() + "','" + number.get(i).getHomePhone() + "','" + number.get(i).getRemark() + "')";
                stmt.execute(sql);
                if (number.get(i).getName().length() == 0 | number.get(i).getTelephone().length() == 0 | number.get(i).getAddress().length() == 0 | number.get(i).getPostalCode().length() == 0 | number.get(i).getEmail().length() == 0 | number.get(i).getHomePhone().length() == 0 | number.get(i).getRemark().length() == 0) {
                    System.out.println("错误，请输入完整信息后保存");
                }
            }
            stmt.close();
            con.close();
        }
            catch (SQLException ex)                      // 捕捉异常
            {

                while (ex != null)
                {
                    ex = ex.getNextException();
                }
            }
         catch (Exception ce) {
            ce.printStackTrace();
        }

    }

    void updateNumber() {//修改
        System.out.println("输入要修改的通讯录的姓名");
        Scanner sc = new Scanner(System.in);
        String r1 = sc.nextLine();
        for (int a = 0; a < len; a++) {
            if (r1.equals(number.get(a).getName())) {
                System.out.println("输入电话：：");
                number.get(a).setTelephone(sc.next());
                System.out.println("输入地址：");
                number.get(a).setAddress(sc.next());
                System.out.println("输入邮政编码：");
                number.get(a).setPostalCode(sc.next());
                System.out.println("输入Email：");
                number.get(a).setEmail(sc.next());
                System.out.println("输入家庭电话：");
                number.get(a).setHomePhone(sc.next());
                System.out.println("输入备注：");
                number.get(a).setRemark(sc.next());
                System.out.println("数据修改完毕");
            }
        }
    }

    void searchNumber() throws Exception {//
        System.out.println("请输入要查询的姓名：");
        Scanner in = new Scanner(System.in);
        int c=0;
        String s1 = in.nextLine();
        for (int a = 0; a < len; a++) {//切记，，这里不能用a<=list.size(),否则会数组越界异常
            if (s1.equals(number.get(a).getName())) {
                c++;
                number.get(a).toMessage();
            }
        }
        if(c==0)
            System.out.println("查无此人");
    }

    void showNumber() {//显示
        for (int i = 0; i < len; i++) {
            number.get(i).toMessage();
        }
    }

    void soltNumber() {//按邮政编码排序

        Collections.sort(number, new Comparator<Message>() {
            @Override
            public int compare(Message o1, Message o2) {

                if(Integer.valueOf(o1.getPostalCode())>Integer.valueOf(o2.getPostalCode()))
                    return 1;
                else if(Integer.valueOf(o1.getPostalCode())<Integer.valueOf(o2.getPostalCode()))
                    return -1;
                else
                return 0;
            }
        });

    }

    void iNumber() throws ClassNotFoundException {//对数据库进行数据显示
        String driver = "com.mysql.jdbc.Driver";

        //URL指向要访问的数据库名mydata
        String url = "jdbc:mysql://localhost:3306/telephonemanage?useSSL=false&useUnicode=true&characterEncoding=UTF-8&autoReconnect=true&allowMultiQueries=true";
        //MySQL配置时的用户名
        String user = "root";
        //MySQL配置时的密码
        String password = "123456";
        try {
            Class.forName(driver);
            Connection con=DriverManager.getConnection(url,user,password);
            Statement  stmt=con.createStatement();
            String sql="select * from telephoneDate ";
            ResultSet rs=null;
            rs=stmt.executeQuery(sql);
            //LinkedList<Message> x=new LinkedList<>();
            while(rs.next())
            {
               // System.out.println("|  姓名  |  电话  |  地址  |  邮政编码  |  Email  |  家庭号码  |  备注  |");
                System.out.println("姓名:  "+rs.getObject("name")+"电话  "+rs.getObject("telephone")
               +"邮政编码：  "+rs.getObject("address")+" "+"Email：  "+rs.getObject("postalCode")+" "
                +rs.getObject("Email")+" "+"家庭号码：  "+ rs.getObject("homePhone")+
                        " "+"备注：  "+rs.getObject("remark"));
            }
            rs.close();
            stmt.close();
            con.close();

        }
        catch (SQLException ex)                      // 捕捉异常
        {

            while (ex != null)
            {
                ex = ex.getNextException();
            }
        }
        catch (Exception ce) {
            ce.printStackTrace();
        }

    }

    void delete() throws SQLException, ParseException {//删除信息

        String driver = "com.mysql.jdbc.Driver";
        //URL指向要访问的数据库名mydata
        String url = "jdbc:mysql://localhost:3306/telephonemanage?useSSL=false&useUnicode=true&characterEncoding=UTF-8&autoReconnect=true&allowMultiQueries=true";
        //MySQL配置时的用户名
        String user = "root";
        //MySQL配置时的密码
        String password = "123456";
        try {
            Class.forName(driver);
            Connection con=DriverManager.getConnection(url,user,password);
            Statement  stmt=con.createStatement();
            System.out.println("姓名：");
            Scanner sc = new Scanner(System.in);
            String r = sc.next();
            String sql="DELETE FROM telephoneDate WHERE name=\""+r+"\"";
            stmt.executeUpdate(sql);
            stmt.close();
            con.close();
        }
        catch (SQLException ex)                      // 捕捉异常
        {
            while (ex != null)
            {
                ex = ex.getNextException();
            }
        }
        catch (Exception ce) {
            ce.printStackTrace();
        }
    }

    void update() throws SQLException, ParseException {//修改信息

        String driver = "com.mysql.jdbc.Driver";
        //URL指向要访问的数据库名mydata
        String url = "jdbc:mysql://localhost:3306/telephonemanage?useSSL=false&useUnicode=true&characterEncoding=UTF-8&autoReconnect=true&allowMultiQueries=true";
        //MySQL配置时的用户名
        String user = "root";
        //MySQL配置时的密码
        String password = "123456";
        try {
            Class.forName(driver);
            Connection con=DriverManager.getConnection(url,user,password);
            Statement  stmt=con.createStatement();
            System.out.println("姓名：");
            Scanner sc = new Scanner(System.in);
            String r = sc.next();

            System.out.println("输入电话：  地址：  邮政编码： Email： 家庭电话： 备注： ");

            String sql = "update telephoneDate set telephone='"+sc.next()+"',address='"+sc.next()+"',postalCode='"+sc.next()+"',Email='"+sc.next()+"',homePhone='"+sc.next()+"',remark='"+sc.next()+"' where name ='"+r+"'";
            // ResultSet rs=stmt.executeQuery(sql);
            stmt.execute(sql);
            stmt.close();

            //String sql="update telephoneDate set  WHERE name=\""+r+"\"";
            //stmt.executeUpdate(sql);
            //stmt.close();
            con.close();
        }
        catch (SQLException ex)                      // 捕捉异常
        {
            while (ex != null)
            {
                ex = ex.getNextException();
            }
        }
        catch (Exception ce) {
            ce.printStackTrace();
        }
    }

    void addDate() throws SQLException, ParseException {//添加信息

        String driver = "com.mysql.jdbc.Driver";
        //URL指向要访问的数据库名mydata
        String url = "jdbc:mysql://localhost:3306/telephonemanage?useSSL=false&useUnicode=true&characterEncoding=UTF-8&autoReconnect=true&allowMultiQueries=true";
        //MySQL配置时的用户名
        String user = "root";
        //MySQL配置时的密码
        String password = "123456";
        try {
            Class.forName(driver);
            Connection con=DriverManager.getConnection(url,user,password);
            Statement  stmt=con.createStatement();

            System.out.println("请输入添加信息：");
            Scanner sc = new Scanner(System.in);
            Message x = new Message("", "", "", "", "", "", "");
            //System.out.println("请输入添加信息：");
            // Message x=new Message(sc.next(),sc.next(),sc.next(),sc.next(),sc.next(), sc.next(),sc.next());
            System.out.println("输入姓名：");
            x.setName(sc.next());
            System.out.println("输入电话：：");
            x.setTelephone(sc.next());
            System.out.println("输入地址：");
            x.setAddress(sc.next());
            System.out.println("输入邮政编码：");
            x.setPostalCode(sc.next());
            System.out.println("输入Email：");
            x.setEmail(sc.next());
            System.out.println("输入家庭电话：");
            x.setHomePhone(sc.next());
            System.out.println("输入备注：");
            x.setRemark(sc.next());

            String sql = "insert into telephoneDate values('"+x.getName() +"','"+x.getTelephone() +"','"+x.getAddress() +"','"+x.getPostalCode() +"','"+x.getEmail() +"','"+x.getHomePhone() +"','"+x.getRemark() +"');";
            stmt.execute(sql);
            stmt.close();
            System.out.println("添加成功");
            System.out.println();

//            String sql = "update telephoneDate set telephone='"+sc.next()+"',address='"+sc.next()+"',postalCode='"+sc.next()+"',Email='"+sc.next()+"',homePhone='"+sc.next()+"',remark='"+sc.next()+"' where name ='"+r+"'";
//            // ResultSet rs=stmt.executeQuery(sql);
//            stmt.execute(sql);
//            stmt.close();

            //String sql="update telephoneDate set  WHERE name=\""+r+"\"";
            //stmt.executeUpdate(sql);
            //stmt.close();
            con.close();
        }
        catch (SQLException ex)                      // 捕捉异常
        {
            while (ex != null)
            {
                ex = ex.getNextException();
            }
        }
        catch (Exception ce) {
            ce.printStackTrace();
        }
    }

}


