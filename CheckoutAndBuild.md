# Checkout source code and build #

1. checkout source code using subversion

```
http://code.google.com/p/sharobi-portal/source/checkout
```

2. Install maven2

3. Install mysql and create database sharobi

```
mysql> create database sharobi;
mysql> grant all on sharobi.* to sharobi@localhost identified by 'sharobi'
```

4. edit  src/main/resources/hibernate.cfg.xml

you need to change hibernate.cfg.xml configuration, and point hibernate-search index to apropriate folder

`<property name="hibernate.search.default.indexBase">/Users/ifnu/indexes</property>`

above configuration point index folder to /Users/ifnu/indexes change the folder to your folder, dont forget to make sure that the folder you put in this configuration already exist.

5. build source code

```
# mvn clean install
```

6. generate database

```
# mvn exec:java -Dexec.mainClass="com.sharobitech.resumeapp.utils.GenerateDatabaseUtils"
```

7. run application

```
#mvn jetty:run
```

8. Open browser and access url http://localhost:8080/sharobi/s/index