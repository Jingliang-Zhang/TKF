# TKF
*Three Kindoms Fight*
## 1. 使用Git贡献代码（阿动学一下！）

### 1.1 Git for Windows
下载地址：[https://gitforwindows.org/](https://gitforwindows.org/)，双击安装，你懂的。

### 1.2 Git Bash
从开始菜单运行"Git Bash"，这是一个简单的命令行终端，我们用它来使用Git。

常用命令：

**ls: List (content in current folder)**
```
phil@LAPTOP-IG5DOVO3 MINGW64 ~/test
$ ls
i_am_a_directory/  i_am_a_file
```

**cd: Change Directory**
```
phil@LAPTOP-IG5DOVO3 MINGW64 ~/test
$ cd /c/

phil@LAPTOP-IG5DOVO3 MINGW64 /c
```

### 1.3 一个非常简单的贡献代码的例子
#### 1.3.1 克隆代码
cd到一个你想要存放代码的文件夹，运行**git clone**
```
phil@LAPTOP-IG5DOVO3 MINGW64 ~
$ git clone https://github.com/Jingliang-Zhang/TKF.git
Cloning into 'TKF'...
```
成功后，该文件夹下会多一个TKF的子文件夹，TKF里就是本代码库的代码。

#### 1.3.2 修改代码
所有对TKF文件夹下的内容进行的增删改都视为修改代码。在下面这个例子中，我们增加了一个交roles的文件夹，在roles中创建了一个叫zhangfei.json的文件，并在根目录中增加了一个叫framework.java的java源代码文件。所有对TKF的修改都可以通过**git status**查看
```
phil@LAPTOP-IG5DOVO3 MINGW64 ~/TKF (main)
$ git status
On branch main
Your branch is up to date with 'origin/main'.

Untracked files:
  (use "git add <file>..." to include in what will be committed)
        framework.java
        roles/

nothing added to commit but untracked files present (use "git add" to track)
```
Untracked files下标识了有多少文件被修改过

#### 1.3.3 提交代码
首先我们需要告诉git我们需要提交哪些代码，**git add**后面跟需要提交的文件或文件夹，**git add**可以被多次执行。
```
phil@LAPTOP-IG5DOVO3 MINGW64 ~/TKF (main)
$ git add framework.java roles/
```

把所有需要提交的内容add完之后，用**git commit**生成一个commit，commit是git提交代码的最小单位
```
phil@LAPTOP-IG5DOVO3 MINGW64 ~/TKF (main)
$ git commit -m "这里写一些描述这个commit的文字，随便填"
```

最后就可以用**git push**向github提交代码了
```
phil@LAPTOP-IG5DOVO3 MINGW64 ~/TKF (main)
$ git push
```
