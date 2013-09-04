(ns problem.core
  (:require [clojure.core.typed :as t]))

(defprotocol MyProto
  (foo [my-proto]))

(defrecord MyRec []
  MyProto
  (foo [my-rec] nil))

(t/ann my-rec [-> MyRec])
(defn my-rec []
  (->MyRec))
