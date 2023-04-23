(ns proto-consumer.core
  (:gen-class)
  (:require [protobuf.core :as protobuf]))

(import '(com.jplfds.person Example$Person))

(defn createPerson
  ([]
(protobuf/create Example$Person {:id 0, :name ""}))
  ([payload]
(protobuf/create Example$Person payload)))

(defn serializeEntity [entity]
  (-> entity
      (assoc :name "Alice B. Carol")
      (assoc :likes ["climbing" "running" "jumping"])
      (protobuf/->bytes)))

(defn deserializeEntity [entity binaryPayload]
  (protobuf/bytes-> entity binaryPayload))

(def alice (createPerson
            {:id 108
             :name "Alice"
             :email "alice@example.com"}))

(def b (serializeEntity alice))

(defn -main [& args]
  (println (deserializeEntity (createPerson) b)))
