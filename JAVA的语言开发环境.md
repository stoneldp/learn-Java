## Java开发工具

## JDK帮助文档下载与安装

## JDK的使用

### 应用程序：

```
//编写一个Java应用程序(文件名APP2_1)，其功能是在DOS窗口显示“Hello Java！”字符串
//filename:App2_1                            //简单的java程序
public class App2_1 {                        //定义App2_1类
    public static void main(String[] args) { //定义主方法
        System.out.println("Hello Java!");   //输出字符串
    }
}
```

##### Java应用程序源文件的命名规则:

- 首先源文件的扩展名必须是(.java);如果源文件中有多个类，则最多只能有一个public类，如果有，那么源文件的名字必须与这个public类的名字相同(文件名的大小写字母可以与public类名的大小写不同)
  ；如果源文件没有public类，那么源文件名由用户任意命名。
    - **说明**
        - 1.当源文件中有public类时，在命名时虽然要求文件名与public类名相同，且字母可以不区分大小写，但是良好的命名习惯应该是源文件名与public类名大小写完全相同。
        - 2.原文件名是由操作系统管理的，所以在使用javac的命令编译文件时，文件名是不区分大小写的
        - **注意：** 包含有main()方法的类时java应用程序的主类，主类无论是否是public类，但执行程序的时候必须输入主类名，即“java 主类名”，因为主类的main()方法程序执行的起始点。
-     