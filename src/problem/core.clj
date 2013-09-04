(ns problem.core
  (:require [clojure.core.typed :as t]))

(defprotocol MyProto
  (foo [my-proto]))

(defrecord MyRec []
  MyProto
  (foo [my-rec] nil))
