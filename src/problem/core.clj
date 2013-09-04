(ns problem.core
  (:require [clojure.core.typed :as t]))

(t/ann-protocol MyProto
 foo
 [MyProto -> nil])
(defprotocol MyProto
  (foo [my-proto]))

(t/ann-record MyRec [])
(defrecord MyRec []
  MyProto
  (foo [my-rec] nil))
