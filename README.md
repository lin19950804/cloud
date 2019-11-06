Spring cloud
学习教程 https://blog.csdn.net/forezp/article/details/70148833


一 将本地已经有的文件提交到远程仓库（未与远程仓库关联）

1.初始化仓库
 git init

2.添加远程
git remote add origin git@github.com:lin19950804/cloud.git

3.添加文件到缓存区
git add .

4.提交到本地仓库
git commit -m "提交信息"

5.建立本地分支和远程分支的关联
git branch --set-upstream-to=origin/master master

6.提交到远程仓库
git push -u origin master

7.如果出现历史版本没有关联的问题，先执行下列命令拉取远程仓库的版本再执行步骤(6)

git pull origin master  --allow-unrelated-histories

二 拉取远程代码

1.克隆
git clone

2.进入项目目录
cd /项目目录

3.切换并创建本地开发分支(一般不在master上开发)
git checkout -b dev

4.建立本地分支和远程分支的关联
git branch --set-upstream-to=origin/dev 


三、常用命令详细介绍


在本地初始化一个仓库 ：git init 

查看本地分支 ： git branch

查看所有分支 ： git branch -a

创建分支：git branch <name>

切换分支：git checkout <name> 

创建切换分支（如：git checkout -b dev）：git checkout -b <name>

合并分支到当前分支上: git merge <name> 

删除本地分支： git branch -d [branchname]

删除远程分支 ：git push origin --delete [branchname]

解除远程分支关联：git remote remove origin

添加远程分支：git remote add origin https://xxx.xxx.git

查看当前仓库状态（仓库下的工作区文件是否被修改过）： git status

查看工作区的readme.txt与缓存区的readme.txt的区别：git diff readme.txt

比较暂存区（stage/index）和分支（master）的区别：git diff --cached  

查看最近到最远的提交记录（详情: commit id + Author + Date + comment）：git log

回到上一个版本（HEAD: 当前版本，HEAD^: 上一个版本，HEAD~100: 往上100个版本）：git reset --hard HEAD^

回到指定版本号commit id（此处：commit id 假设为1234567******，Git会根据commit id的前几位自动寻找对应的版本）：git reset --hard 1234567

第一次推送master分支的所有内容：git push -u origin master

从远程库克隆：git clone git@github.com:lin19950804/cloud.git 

查看远程库详细信息： git remote -v

创建标签 ：git tag <tagname> 

查看所有标签 ：git tag 

为某次提交创建指定标签 ：git tag <tagname> commitId  

查看指定标签具体内容 ： git show <tagname> 

为某次指定的提交创建标签，同时添加标签注释 ：git tag -a <tagname> -m "v0.1 released" commitId 

删除某个标签：git tag -d <tagname> 

推送某个标签到远程库：git push origin <tagname>

一次性推送所有标签到远程库 ：git push origin --tags // 

删除远程库标签（第一步：删除本地库标签）：git tag -d v1.0.1

删除远程库标签（第二步：从远程库删除标签）：git push origin :refs/tags/v1.0.1

拉取远程仓库代码更新：git pull或者（git fetch+git merge）






