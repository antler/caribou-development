(defproject caribou-development-frontend "0.1.0-SNAPSHOT"
  :description "The page routing ring handler for caribou"
  :dependencies [[org.clojure/clojure "1.3.0"]
                 [antler/caribou-frontend "0.3.1"]]
  :jvm-opts ["-agentlib:jdwp=transport=dt_socket,server=y,suspend=n"]
  :ring {:handler caribou.app.core/app
         :servlet-name "caribou-development-frontend"
         :init caribou.app.core/init
         :port 33333})
