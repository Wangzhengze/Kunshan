# Unix
##1.认识Linux
1. 提起linux的缘起，不能不涉及UNIX。UNIX系统早期之所以能够取得巨大成功并迅速得到普及，主要在于其三个重要特点：简洁性、开放性与可移植性。向大学和研究机构公开了源代码，激发了软件开发人员的兴趣，从而使诸多大学以UNIX作为操作系统课程的研究对象，使UNIX成为大学操作系统课程的代名词，同时也培养了许多潜在的系统用户。
而后期的商业化运作方式，使得UNIX系统及其源代码成为专属产品，从而限制了对UNIX的研究、开发和使用。另外，为了考虑特定的及其结构，商业化的UNIX也变得越来越复杂，基本上失去了可移植性的特点。所以催生了Linux。
1984年，Richard Stallman发起了异常自由软件共享活动，创建了一个自由软件基金会，支持开发与共享自由软件，其中的GUN项目旨在开发一个完全免费的类似UNIX的系统，到了1990年，GUN几乎都有了自己的相应软件，但是缺乏一个内核。1991年在芬兰赫尔辛基大学读书的Linus Torvalds创建了一个类似于UNIX操作系统的内核，推出了Linux0.01版。
目前，存在许多不同版本的Linux产品，其中比较著名的就是Red Hat,Fedora,Deebian,Ubuntu等。Ubuntu Linux系统是众多Linux发行品牌之一。在Linux世界中，Ubuntu只是一后来者，短短几年就发展成为了一个流行的、成熟的以及桌面环境丰富的Linux系统，受到了从Linux初学者到资深专家的大批Linux用户的追捧。
2. Linux系统结构(洋葱图)
    1. Kernel：内核：驱动硬件工作的第一个软件
   2. Shell：提供给用户一种交互方式。基于命令式的交互
   3. File System:文件系统
   4. Application:应用程序
    ![](media/15974544898138.jpg)
3. Kernel
    内核是操作系统的核心，具有很多最基本功能：
    1. 它负责管理系统的进程、内存、设备驱动程序、文件和网络系统，决定着系统的性能和稳定性。
    2. 控制系统程序，系统工具和系统硬件的交互
    3. 管理交换空间，精灵程序，文件系统和其他功能。

4. Shell
    shell是系统的用户界面，提供了用户与内核进行交互操作的一种接口。它接收用户输入的命令并把它送入内核去执行，是一个命令解释器。另外，shell编程语言具有普通编程语言的很多特点，用这种编程语言编写的shell程序与其他应用程序具有同样的效果。目前主要有下列版本的shell。
    1. Bourne Shell:是贝尔实验室开发的。由Stephen Bourne为AT&T Unix而写,是最早最有名的Shell。
    2. BASH：是GNU的Bourne Again Shell，是GNU操作系统上默认的shell,大部分linux的发行套件使用的都是这种shell。
    3. Korn Shell：是对Bourne SHell的发展，在大部分内容上与Bourne Shell兼容。 　　　
    4. C Shell：是SUN公司Shell的BSD版本。

5. The File System
     /: 根路径
    /opt:存放自己安装的第三方的软件,补丁
    /etc:系统管理和配置文件,随着系统启动就会读取的文件，如passwd等cd
    /dev:设备文件，该目录存放的是linux的外部设备，如硬盘，分区，键盘，鼠标，usb等。
    /usr:一般存放系统自带的,但是供所有用户使用的。最庞大的目录，要用到的应用程序和文件几乎都在这个目录、
    /usr/include: linux下开发和编译引用程序所需要的头文件。
    /usr/local: 本地增加的命令和库。
    /usr/sbin: 超级用户的一些管理程序
    /usr/src：源代码
    /usr/bin: 众多的而应用程序，二进制可执行程序
    /usr/share:共享文件
    /usr/lib:常用的动态链接库和软件包的配置文件。
    /boot:存放内核程序(unix叫kernel),系统启动文件，包括Grub,lilo启动器程序。
    /var: 存放管理员特有的，如系统日志
    /home:用来存放用户的主目录(用户家目录)。在Linux中，每个用户都有一个自己的目录，一般该目录名是以用户的账号命名的。
    /bin: 存放系统中最常用的可执行文件 例如ls
    /lib：存放共享的库文件，包含许多被/bin和/sbin中程序使用的库文件
    /lost+found:这个目录一般情况下是空的，当系统非法关机后，这里就存放了一些零散文件
    /media:ubuntu系统自动挂载的光驱、usb设备，存放临时读入的文件
    /mnt：作为被挂载的的文件系统得挂载点。
    /proc:这个目录是一个虚拟的目录，它是系统内存的映射，我们可以通过直接访问这个目录来获取系统信息，这里存放所有标志位文件的进程。
    /root:该目录为系统管理员，也称作超级权限者的用户主目录。
    /sbin:s就是Super User的意思，这里存放的是系统管理员使用的系统管理程序，如系统管理，目录查询等关键命令文件。
    /srv:存放系统所提供的服务数据
    /sys:系统设备和文件层次结构，并向用户程序提供详细的内核数据信息。
    /tmp:这个目录用来存放一些临时的文件，所有用户对此目录都有读写权限。
    下图为solaris的文件系统:
    ![](media/15974546393322.jpg)

6. 路径名通过指定特定的文件或目录的位置唯一地标识该文件或目录。路径中每个目录名之间的/(斜杠)表示不同的目录，第一个位置的/表示根目录。路径分为以下两种：
    1. 绝对路径：以/开头的路径,用来指明文件或目录与根目录之间的关系。
    2. 相对路径：不以/开头的路径,指定一个文件和当前工作目录之间的关系。
    
##2. Basic Linux Commands
1. 命令行语法
  Command [options] [arguments]  
   注意：
	1.命令一定使用空格进行分割
	2.命令一定严格区分大小写。
	3.单行命令一般不超过256个字符
2. 基本命令
    ctrl+alt+t 进入Ubuntu终端
  exit 来退出终端
  ctrl+shift+t是在terminal中打开多个标签
  多个标签之间的切换ctrl + pageUp  ctrl + pageDown.
  关闭触摸板： 
  sudo modprobe -r psmouse 
  打开触摸板： 
  sudo modprobe psmouse
  ctrl -   字体缩小
  ctrl +(有的电脑是“ ctrl shift  +  ”  三个键同时按下)字体放大
  ctrl 0 恢复正常模式
  ctrl+ d：关闭一个terminal快捷键
    1. clear:清屏命令
    2. pwd:显示当前工作路径的绝对路径名
    3. 修改密码：
	命令：passwd
	作用：修改当前或指定用户密码
	例如：
		(1)修改当前用户密码：
		 
        ``` passwd  
        		  Changing password for briup.
        		  (current) UNIX password: 
        		  Enter new UNIX password: 
        		  Retype new UNIX password: 
        ```
		(2)修改指定用户密码： `passwd username`
超级管理员 : root 
新建的linux 超级管理员用户是没有密码的，需要先设置密码。
  	`sudo passwd root`
`[sudo] password for briup: briup`
`输入新的 UNIX 密码： root
重新输入新的 UNIX 密码： root`

4. 切换用户
    su - username:  切换到某个用户之下  
    su username:  还在当前目录之下（以当前系统身份切换）
    切换到管理员: su root
    注：刚创建的操作系统root用户是没有密码的，没有密码的root用户不能使用
	设置密码：sudo passwd  如图2-1：
	![](media/15974550962643.jpg)
5. cd:切换目录  cd pathname
6. ls [options] pathname:列出文件和目录的列表
    ls -t: 按照最后一次修改时间顺序显示文件和目录
    显示格式：-rw-rw-r-- 1 briup briup  109 Jun 22 17:08 note.txt
    1. 文件类型：
		- -：普通文件
		- d：目录文件
		- l：链接文件
		- s：套接字文件
		- p：管道文件
		- b：块设备文件
		- c：字符设备文件
    2. 权限
    2. 链接号
    3. 拥有者
    4. 拥有组
    5. 文件大小
    6. 最后一次修改时间
    7. 文件名
7. chmod : 修改文件权限
    1. chmod mode filename :权限模式
        chmod o+w HelloWorld.java
    2. 八进制数的形式标识:权限值模式
       
        ![](media/15974553454847.jpg)

8. touch: 创建新的空的文件或者更新文件的最后一次访问时间
9. mkdir:创建目录 -p
10. cp : 拷贝文件
    - -i：提示是否覆盖
    - 源是目录 必须加-r 代表进入目录

11. mv 移动或者重命名文件或目录
12. rm : 删除文件或者非空目录
    rm -r : 删除非空目录
    rm -i ：删除的同时提示用户，让用户选择是否删除
13. man  
    常用指令：
    	 spacebar(空格键) : 一次滚动一个屏幕
   		enter(回车) : 一次滚动一行(一行一行往下翻)
   		b:向前移动一屏幕
   		f:向后移动一屏幕
   		q:退出man命令
   		/string:查找匹配字符串
   		n:查找匹配字符串的下一次出现
   	
14. 网络工具
    1. telnet ip 远程访问主机
    2. ifconfig 

##3 Metacharacters
1. 元字符
    1. 常用元字符
        1. * : 代表0-n个任意字符  例如：ls j* 显示所有以j开头的文件或目录名字
        2. ？：代表任意一个字符   例如：ls j? 以j开头 后面有一位的文件或目录
        3. ; : 多个命令的分隔符    例如：cd;ls 先切换再显示列表；
date;cal;pwd 查看当前日期、查看当前日历和显示当前工作路径的绝对路径名
        4. [] : 从[]指定的集合或者范围中选择一个字符
        例如：[a-c]:aAbBc
              [abc]:abc  
              ls[a-c]*:查找以包含aAbBc字母开头的文件或目录
        5. > : 重定向命令的输出到文件而不是屏幕（覆盖源文件）
例如：cal 10 2004 > a.txt 将2004年10月份的日历输出到a.txt文件中
        6. >> : 将命令的输出追加到一个已经存在的文件
例如：cal 10 2004 >> a.txt 将2004年10月份的日历追加到a.txt文件中 
        7. | : 将前一个命令的输出作为下一个命令的输入
例如：ls -l /etc | more 使用more命令查看/etc目录下的内容             

2. Text Viewer
    1. cat
        作用：
        - (1)将文本文件的内容一次性显示在屏幕上
        - (2)常用来将两个或者更多的文件整合成一个文件
		
		例如cat a.txt: 将a.txt文件中的内容显示到屏幕上
	        `cat a.txt b.txt > large.txt` 将a.txt以及b.txt中的内容输出到large.txt
清空文件：
	 /dev/null 这个文件是linux中的黑洞,无论向这个文件中输入什么文件还是空 
		比如：cal > /dev/null 依旧是空
awk:处理文字程序，以行为单位来处理文字
       -F指定分隔符
       注意：-F和分隔符之间没有空格
      '{print }':打印语句的固定格式
  \$1 "\t" $6
  $1:分割后的第1个部分
  $6:分割后的第6个部分
  \t:制表符
  \n:换行符
  \:续行符
    
    2. more
语法：more filenames
作用：一次一屏幕的显示文本文件内容
指令：
	space bar : 一次滚动一屏幕
	return  :  一次向下一行。
	b	:	  一次回退一屏幕
	f	:	  一次向前一屏幕
	h/?	:	  显示帮助信息文档
	q	:	  退出，回到shell终端
	/String :    向前查找字符串
	n	:	  查找下一个字符串
head: -c 4,显示文件头的前4个字节，
      -n 5， 显示前5行
tail: -c 4,显示文件头的后4个字节，
      -n 5， 显示后5行
      -F ：实时监控文件变更
      
## 4. Full-screen Text Editor  
1. 满屏文本编辑器
    1. vi介绍
        作用：满屏文本编辑器。
	vi编辑器的三种模式：
		1. 底行模式
		2. 命令行模式
		3. 输入模式	

		模式转换：
		1. 命令行模式-----》输入模式：
		  插入：
		    a： 在光标所在位置之后插入
			A： 在光标所在行的行尾插入
			i： 在光标所在位置插入
			I： 在光标所在行的行首插入			
			o： 在光标所在行的下一行插入
			O： 在光标所在行之上插入
		 
        2. 输入模式------》命令行模式
			Esc
        3. 命令行模式-----》底行模式
                    ESC+:or / or ?
                    
    2. 打开vi
    3. 保存文件 :w newFile      : 存成新文件
    4. 退出vi 
    5. 删除文本 
    x:  删除一个字符
		s:  删除当前字符，并进入输入模式
		dw： 删除当前词
		ndw: 删除n个词
		dd:  删除当前行
		ndd: 删除之后的n行
		:5,10d: 删除5-10行之间的内容
	6. 修改文本
	   r ： 替换一个字符，
		cw ：替换一个单词，	进入输入模式
		cc ：替换一行，	   	进入输入模式
		C  ：替换从光标至行尾。	进入输入模式
	7. 复制和粘贴文本
	   yw	:  拷贝词
		yy	： 拷贝行
		p	: 当前行下粘贴
		:1,2co3:  拷贝行1，行2在行3之后
		:4,5m6:	  移动行4，行5在行6之后。
	8. 高级功能
	    u	： 废除刚才的编辑操作
	    :set nu	: 显示行标
	    /str	     从当前行往下查找
  ?str	     从当前行往上查找
   :1,$s/old/new/g	替换文本(%s/old/new/g)
 
##5.Setup Initialization Files  
 1. 配置文件
    1. 定义
        系统配置文件用来记录一些系统运行时需要的相关配置信息，环境变量信息等
    2. 种类
        1. 系统级别：/etc/profile
一般存放在/etc目录下
例如:
（1）/etc/enviroment 是系统的环境变量。
（2）/etc/profile： 是所有用户的环境变量。当用户第一次登录时,该文件被执行.并从/etc/profile.d目录的配置文件中搜集shell的设置。
（3）/etc/bashrc: 为每一个运行bash shell的用户执行此文件.当bash shell被打开时,该文件被读取。
        2. 用户级别:~/.bashrc
        一般存在用户家目录之下
        例如：
            1. ~/.bash_profile: 每个用户都可使用该文件输入专用于自己使用的shell信息,当用户登录时,该文件仅仅执行一次!默认情况下,他设置一些环境变量,执行用户的.bashrc文件。
            2. ~/.bashrc: 该文件包含专用于你的bash shell的bash信息,当登录时以及每次打开新的shell时,该该文件被读取。
            3.  ~/.bash_logout:当每次退出系统(退出bash shell)时,执行该文件. 另外,/etc/profile中设定的变量(全局)的可以作用于任何用户,而~/.bashrc等中设定的变量(局部)只能继承 /etc/profile中的变量,他们是”父子”关系。
            4. ~/.bash_profile 是交互式、login 方式进入 bash 运行的~/.bashrc 是交互式 non-login 方式进入 bash 运行的通常二者设置大致相同，所以通常前者会调用后者。
       3. 内容
            1. 设置默认的创建权限
            2. 设置环境变量
            3. 设置默认终端提示符
            4. 设置默认命令行命令的路径
            5. 设置客户自定义命令

        4. 相关指令
            1. 设置环境变量
	 (1)在Shell中定义临时变量：
varName=value   
(2)定义用户级别的环境变量
在用户级别的配置文件中:常用的~/.bashrc
		export varName=value
       让文件执行：source ~/.bashrc
	 (3)定义系统级别的环境变量
		 在系统级别的配置文件中：常用的/etc/profile
		 export varName=value
            2. 读取变量的值：
		echo $varName   	
            3. path变量：
path环境变量用来指明操作系统下常用命令的搜索路径	
            4. which 
语法: which commandName
作用：在系统环境变量中查找指定命令的路径名
	 which是根据使用者所配置的 PATH 变量内的目录去搜寻可运行文档的！所以，不同的 PATH 配置内容所找到的命令可能不一样！
            5. whereis
语法：whereis commandName
作用：whereis命令只能用于程序名的搜索，而且只搜索二进制文件（参数-b）、man说明文件（参数-m）和源代码文件（参数-s）。如果省略参数，则返回所有信息。 whereis查找的速度非常快，这是因为linux系统会将 系统内的所有文件都记录在一个数据库文件中，当使用whereis时，会从数据库中查找数据，而不是通过遍历硬盘来查找，效率自然会很高。但是该数据库文件并不是实时更新，默认情况下时一星期更新一次，因此，我们在用whereis时，有时会找到已经被删除的数据，或者刚刚建立文件，却无法查找到，原因就是因为数据库文件没有被更新。
            6. history
显示命令行历史记录
history 10 显示最近的10条记录
!n  执行第n条历史命令
!!  执行刚刚执行过的历史命令	
            7. alias
语法：alias 别名=命令
作用：用来给一个长的命令，起一个简单的别名	
例如：
	给history起个别名h
		alias h=history
	查看所有的别名
		alias
	取消绑定
		unalias h
            8. umask	
	跟系统创建的目录和文件的默认权限相关。
	这个值决定了当前用户所创建文件和目录的默认权限
	目录权限： 777 - umask
	文件权限： 777 - umask - 所有人的执行权限
            9. 各个不同后缀的含义如下：
.tar打包格式：tar程序打包的数据，并没有压缩过
.gz压缩格式：gzip程序压缩的文件
.tar.gz打包压缩：tar程序打包的文件，其中并且经过 gzip 的压缩
.tar
压缩：tar cvf FileName.tar FileName
解压：tar xvf FileName.tar
.gz
解压：tar zxvf FileName.tar.gz -C ./d 
压缩：tar zcvf FileName.tar.gz DirName
-C把文件解压到 特定目录中
