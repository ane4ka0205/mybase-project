#!/usr/bin/env groovy
@Library('jenkins-library@master') _

pipeline {
    agent any
    stages {
        stage('Git Checkout') {
            steps {
            gitCheckout(
                branch: "master",
                url: "https://github.com/ane4ka0205/mybase-project.git"
            )
            }
    }
    }
}