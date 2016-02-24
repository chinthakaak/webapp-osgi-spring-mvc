# webapp-servicemix-osgi-spring-mvc-war 

# Deployment Steps
1. Install ServiceMix 5.5.0 Download: https://servicemix.apache.org/downloads/servicemix-5.5.0.html

and start using ./servicemix

2. Clone the source and invoke

mvn clean install war:war

3. Install compatible spring and spring-web versions removing the new versions in servicemix 5.5
features:list|grep spring
features:uninstall spring
features:install spring/3.1.4.RELEASE
features:install spring-web/3.1.4.RELEASE

4. Install the war
install -s webbundle:file:/data/git_projects/webapp-servicemix-osgi-spring-mvc-war/target/webapp-servicemix-osgi-spring-mvc-war-1.0-SNAPSHOT.war

5. In web browser, go to http://localhost:8181/home/
