#!/usr/bin/env groovy 
def call(){
    echo "builidn app artifact"
    sh "npm pack"
}