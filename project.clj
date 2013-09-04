(defproject core.typed-record-problem "0.1.0-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/core.typed "0.2.2"]]
  :aot [problem.core]
  :plugins [[lein-typed "0.3.0"]]
  :core.typed {:check [problem.core]})
