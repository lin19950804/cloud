一 将本地已经有的文件（仓库）提交到远程仓库（未与远程仓库关联）
1.初始化仓库
 git init

2.添加远程
git remote add origin git@gitee.com:linyang520/Springcloud.git

3.添加文件到缓存区
git add .

4.提交到本地仓库
git commit -m "提交信息"

5.修改提交流
git branch --set-upstream-to=origin/master master

6.提交到远程仓库
git push -u origin master

7.如果出现历史版本没有关联的问题，先执行下列命令拉取远程仓库的版本再执行步骤6
git pull origin master  --allow-unrelated-histories

二 拉取远程代码

1.拉取
git clone

2.进入项目目录
cd /项目目录

3.切换并创建本地开发分支(一般不在master上开发)
git checkout -b dev

4.更改远端跟踪分支
git fetch

5.修改提交流
git branch --set-upstream-to=origin/dev 


三、常用命令详细介绍

git init 在本地初始化一个仓库










