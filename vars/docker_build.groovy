def call(String image){
  echo "This is building the code"
  sh "docker build -t ${image} ."
}
