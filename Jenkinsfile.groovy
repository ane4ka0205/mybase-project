#!/usr/bin/env groovy
@Library('jenkins-library@master') _

node {
    https://github.com/ane4ka0205/jenkins-library.git
    timeGradleBuild this, 'clean build'
}


    // stage('stage'){
    //     gitCheckout.printHello()
    // }
    // stage('bye'){
    //     gitCheckout.printBye()
    // }




