def call(Map config = [:]) {
    try {
      def proj = config.var.split("-")
      def num = proj[1].split("[^0-9]")
      return "${proj[0]}-${num[0]}"

    } catch(Exception ex) {     
      sh "Catching the exception"
      return null
    }   
}