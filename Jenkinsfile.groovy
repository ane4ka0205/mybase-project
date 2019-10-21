#!/usr/bin/env groovy
@Library('jenkins-library@master') _

def common = new com.example.Pipeline()
common.runPipeline()