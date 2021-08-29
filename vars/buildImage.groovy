#!/usr/bin/env groovy
def call(String imageName) {
    withCredentials([usernamePassword(credentialsId: 'docker-private-repo', usernameVariable: 'USER',passwordVariable: 'PWD')]){
        echo 'building Docker image'
        sh "docker build -t $imageName ."
        sh "echo $PWD |docker login -u $USER --password-stdin "
        sh "docker push $imageName"
}
}
