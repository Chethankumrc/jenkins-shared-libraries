def call(String url, String branch){
  echo "this is code stage"
  git url: "${url}", branch: "${branch}"
  echo "git cloning successful"
}
