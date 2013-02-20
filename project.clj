(defproject unack-server "0.1.0-SNAPSHOT"
  :description "Example app to demonstrate unacknowledged message issue."
  :url "http://github.com/rboyd/unack-server"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :immutant { :init unack-server.core/init
              :nrepl-port 4118 }
  :dependencies [[org.clojure/clojure "1.4.0"]]
  :main unack-server.core)
