def call(){
    sh "npm ci --production"
    sh "npm run test"
}