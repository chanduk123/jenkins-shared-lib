#!/usr/bin/env groovy
def call() {
    echo "creating jar file at branch $BRANCH_NAME"
    sh 'mvn package'
}