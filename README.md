# ProxyServer
#### 开发环境
IntelliJ IDEA<br>
java 1.8<br><br>

#### 本地开发
需要先完善 Conf 类如下属性<br>
TIDB_URL = "10.168.1.223:4000";<br>
TIDB_USER = "admin";<br>
TIDB_PASSWROD = "123456";<br>

HIVE_CONF_DIR = "src/main/resources/hive/"; <br>


注意：HIVE Conf 文件（本地开发时，把 conf 文件放到工程的 resources/hive/ 目录下，然后设置 HIVE_CONF_DIR = "src/main/resources/hive/" 即可）<br>
