def gitDownload(repo){
  git "https://github.com/IntelliqDevops/maven.git"
}

def  buildArtifact(){
  sh 'mvn package'
}
