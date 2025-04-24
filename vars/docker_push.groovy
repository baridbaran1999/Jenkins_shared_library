def call(String imageName){
  echo "This is pushing image to Docker Hub"
  withCredentials([usernamePassword(
                    credentialsId: "DockerHubCred",
                    usernameVariable: "dockerHubUser", 
                    passwordVariable: "dockerHubPass"
                )]) {
                    sh "docker login -u ${env.dockerHubUser} -p ${env.dockerHubPass}"
                    sh "docker image tag ${imageName} ${env.dockerHubUser}/notes-app:latest"
                    sh "docker push ${env.dockerHubUser}/${imageName}"
                }              
}
