(defproject four-clojure "0.1.0-SNAPSHOT"
  :description "Solutions for 4Clojure problems."
  :url "https://github.com/ollikarppinen/4Clojure"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :main ^:skip-aot four-clojure.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
