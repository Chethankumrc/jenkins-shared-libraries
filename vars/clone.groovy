def call(string url, string branch){
  echo "this is code stage"
  git url: "${url}", branch: "${branch}"
  echo "git cloning successful"
}
