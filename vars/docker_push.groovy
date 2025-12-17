def call(String Project, String ImageTag, String dockerHubUser){
  sh "withCredentials([usernamePassword(credentailsId:"dockerHubCred", passwordVariable: "dockerHubPass", usernameVariable: "dockerHubuser"){
  sh "docker login -u ${env.dockerHubUser} -p ${env.dockerHubPass}"
  sh "docker push ${dockerHubUser}/${Project}:${ImageTag}"
}
}
