#!/usr/bin/env groovy
def call() {
    echo 'creating jar file'
    sh 'mvn package'
}