(defproject caribou-development-api "0.1.0-SNAPSHOT"
  :description "The api ring handler for caribou"
  :dependencies [[org.clojure/clojure "1.3.0"]
                 [antler/caribou-api "0.5.6"]]
  :jvm-opts ["-agentlib:jdwp=transport=dt_socket,server=y,suspend=n"]
  :resource-paths ["resources/" "../resources/"]            
  :ring {:handler caribou.api.core/app
         :servlet-name "caribou-development-api"
         :init caribou.api.core/init
         :join? false
         :port 33443})
