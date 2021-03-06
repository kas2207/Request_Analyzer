(defproject request-analyzer "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [compojure "1.1.6"]
                 [hiccup "1.0.5"]
                 [ring-server "0.3.1"]
                 [noir "1.3.0"]
                 [clojure-csv/clojure-csv "2.0.1"]
                 [org.clojure/data.csv "0.1.3"]
                 [clj-http "2.0.0"]]
  :plugins [[lein-ring "0.8.12"]]
  :ring {:handler request-analyzer.handler/app
         :init request-analyzer.handler/init
         :destroy request-analyzer.handler/destroy}
  :profiles
  {:uberjar {:aot :all}
   :production
   {:ring
    {:open-browser? false, :stacktraces? false, :auto-reload? false}}
   :dev
   {:dependencies [[ring-mock "0.1.5"] [ring/ring-devel "1.3.1"]]}})
