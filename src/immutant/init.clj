(ns immutant.init
  (:require [immutant.web :as web]
   		    [immutant.util :as util]
   			[cljhouston.fritter :as fritter]
   			[noir.server :as server]))

;; To start a Noir app:
(server/load-views (util/app-relative "src/cljhouston/views"))
(web/start "/" (server/gen-handler {:mode :dev :ns 'cljhouston}))

(fritter/start)

;; Messaging allows for starting (and stopping) destinations (queues & topics)
;; and listening for messages on a destination.

; (messaging/start "/queue/a-queue")
; (messaging/listen "/queue/a-queue" #(println "received: " %))

