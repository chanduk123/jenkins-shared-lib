#!/usr/bin/env groovy
def call() {
    withCredentials([usernamePassword(credentialsId: 'docker-private-repo', usernameVariable: 'USER',passwordVariable: 'PWD')]){
        echo 'building Docker image'
        sh 'docker build -t chandukanuri/demo-app:jma-3.2 .'
        sh "echo $PWD |docker login -u $USER --password-stdin "
        sh 'docker push chandukanuri/demo-app:jma-3.2'
}
}
