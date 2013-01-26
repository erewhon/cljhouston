(ns cljhouston.fritter
 (:require [clojure.tools.logging :as log]
  		   [immutant.messaging :as msg]))

(def topic "topic.fritter")

(def messages (atom []))

(defn receive-message [message]
 (log/info (str "Received message: " message))
 (swap! messages conj message))

(defn start []
  (msg/start topic)
  (msg/listen topic receive-message))

(defn get-messages-list []
  [:ul
    (map #(vector :li %) (reverse @messages))])

(defn publish [message]
  (log/info (str "Frittered message: " message))
  (msg/publish topic (str "Message: " message)))