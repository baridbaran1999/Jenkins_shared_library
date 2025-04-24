def cloneRepo(String url,String branch){
  echo "This is cloning the code"
  sh 'which git'
  sh 'git --version'
  git url: "${url}", branch: "${branch}"
  echo "Cloned successfully !!"
}
