def call(Map config = [:] as Map){
    def scriptcontents = libraryResource "com/planetpope/scripts/linux/${config.name}"
    writeFile file: "${config.name}", text: scriptcontents
    sh "chmod a+x ./${config.name}"
}