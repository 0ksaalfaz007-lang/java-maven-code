 docker run -d -p 9000:9000 sonarcube

 mvn clean verify sonar:sonar "-Dsonar.projectKey=demo-app" "-Dsonar.host.url=http://localhost:9000" "-Dsonar.login=sqp_07e413b22859d09b1480718dc27bc90802af4e50"


 Sonar-project-key : 0ksaalfaz007-lang_java-maven-code
organization-key : 0ksaalfaz007-lang
sonar-token : 27d3c7eabf0b11fd8be1abba7ca520929eb013fa