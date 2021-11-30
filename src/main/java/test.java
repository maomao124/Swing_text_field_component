import javax.swing.*;
import java.awt.*;

/**
 * Project name(项目名称)：Swing文本域组件
 * Package(包名): PACKAGE_NAME
 * Class(类名): test
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2021/11/30
 * Time(创建时间)： 21:29
 * Version(版本): 1.0
 * Description(描述)： Swing JTextArea：文本域组件
 * JTextArea()：创建一个默认的文本域。
 * JTextArea(int rows,int columns)：创建一个具有指定行数和列数的文本域。
 * JTextArea(String text)：创建一个包含指定文本的文本域。
 * JTextArea(String text,int rows,int columns)：创建一个既包含指定文本，又包含指定行数和列数的多行文本域。
 * JTextArea类的常用方法
 * 方法名称	说明
 * void append(String str)	将字符串 str 添加到文本域的最后位置
 * void setColumns(int columns)	设置文本域的行数
 * void setRows(int rows)	设置文本域的列数
 * int getColumns()	获取文本域的行数
 * void setLineWrap(boolean wrap)	设置文本域的换行策略
 * int getRows()	获取文本域的列数
 * void insert(String str,int position)	插入指定的字符串到文本域的指定位置
 * void replaceRange(String str,int start,int end)	将指定的开始位 start 与结束位 end 之间的字符串用指定的字符串 str 取代
 */

public class test
{
    public static void main(String[] args)
    {
        JFrame jFrame = new JFrame("测试");
        JPanel jPanel = new JPanel();
        JTextArea jTextArea = new JTextArea("请输入内容：", 30, 50);
        System.out.println(jTextArea.getText());
        System.out.println(jTextArea.getRows());
        System.out.println(jTextArea.getColumns());
        jTextArea.setLineWrap(true);
        jTextArea.setBackground(Color.cyan);
        jTextArea.setFont(new Font("楷体", Font.BOLD, 16));
        JScrollPane jScrollPane = new JScrollPane(jTextArea);    //将文本域放入滚动窗口
        Dimension size = jTextArea.getPreferredSize();    //获得文本域的首选大小
        jScrollPane.setBounds(110, 90, size.width, size.height);
        jPanel.add(jScrollPane);    //将JScrollPane添加到JPanel容器中
        jFrame.add(jPanel);    //将JPanel容器添加到JFrame容器中
        jFrame.setBackground(Color.MAGENTA);
        jFrame.setLocation(200, 200);
        jFrame.setSize(1280, 720);    //设置JFrame容器的大小
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jTextArea.append("123");
        jTextArea.insert("0", 6);
        jTextArea.replaceRange("-6-",7,8);
    }
}
