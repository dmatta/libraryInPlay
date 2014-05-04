name := "services"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  javaJdbc,
  cache,
  "mysql" % "mysql-connector-java" % "5.1.29",
  "org.hibernate" % "hibernate-entitymanager" % "4.3.4.Final",
  "org.hibernate" % "hibernate-core" % "4.3.4.Final",
  "org.springframework" % "spring-context" % "4.0.2.RELEASE",
  "org.springframework" % "spring-core" % "4.0.2.RELEASE",
  "javax.mail" % "mail" % "1.4.3",
  "org.springframework" % "spring-context-support" % "4.0.2.RELEASE",
  "org.springframework" % "spring-jdbc" % "4.0.2.RELEASE",
  "org.springframework" % "spring-orm" % "4.0.2.RELEASE",
  "org.slf4j" % "slf4j-log4j12" % "1.7.2",
  "org.apache.httpcomponents" % "httpclient" % "4.3.3",
  "org.apache.velocity" % "velocity" % "1.7",
  "com.fasterxml.jackson.core" % "jackson-core" % "2.3.2",
  "com.fasterxml.jackson.core" % "jackson-databind" % "2.3.2",
  "org.apache.httpcomponents" % "fluent-hc" % "4.3.1",
  "net.htmlparser.jericho" % "jericho-html" % "3.3",
  "junit" % "junit" % "4.8.2" % "test",
  "org.springframework" % "spring-test" % "4.0.2.RELEASE" % "test",
  "org.hsqldb" % "hsqldb" % "2.3.2" % "test"
)
