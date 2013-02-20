(ns unack-server.core
  (:require [immutant.messaging :as messaging]))

(defn send-msg [msg]
  (immutant.messaging/publish (immutant.messaging/as-queue "SomeQueue") msg :encoding :json))

(defn send-2k []
  "Publishes 2,000 test messages to the queue."
  (take 2000 (repeatedly #(send-msg "foo"))))

(defn init
  "Start a local queue for test and development of drano."
  []
  (messaging/start (messaging/as-queue "SomeQueue")))
