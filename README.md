#### SpringBoot + Spring Data MongoDB的案例项目

#### 如何运行:
  
 
  
   
   1.MongoDB开启用户认证:
   
   `mongod --auth`
   
   并创建了管理员用户admin:
   ```
   > use admin
   switched to db admin
   > db.createUser({user:"admin",pwd:"123456",roles:["root"]})
   Successfully added user: { "user" : "admin", "roles" : [ "root" ] }
   ```
   
  2.登录mongodb的admin数据库:
     
   `mongo admin`
      
   `db.auth("admin","123456")`
   
  或:`mongo 127.0.0.1:27017/admin -u admin -p 123456`
  
  3.创建一个测试连接的数据库命名为db_mongo_test,并添加管理员用户到数据库:
  
  `use db_mongo_test`
  
  `db.createUser( { user: "admin",  pwd: "123456",  roles: [ { role: "root", db: "admin" } ] } )`
  
  4. 配置好项目的application.yml文件的连接配置, 就可以运行测试方法来测试连接了,跟使用Jpa的方式类似.
  
  (提示: Idea可以安装Mongodb Plugin来查看管理数据库)
      