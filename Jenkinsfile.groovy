#!/usr/bin/env groovy
@Library('jenkins-library@master') _

node {
    timedCommand.cmd = 'ls -la'
    echo timedCommand.cmd
    timedCommand.runCommand()
    echo timedCommand.getOutput()
    //https://github.com/ane4ka0205/jenkins-library.git

    // stage('stage'){
    //     gitCheckout.printHello()
    // }
    // stage('bye'){
    //     gitCheckout.printBye()
    // }

    stage('stage'){
        gitCheckout.setCommand
    }

    stage('stage'){
        gitCheckout.getCommand
    }

    stage('stage'){
        gitCheckout.runCommand
    }

    stage('stage'){
        gitCheckout.getOutput
    }
}


