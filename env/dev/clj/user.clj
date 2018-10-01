(ns user
  (:require [clj-web-app.config :refer [env]]
            [clojure.spec.alpha :as s]
            [expound.alpha :as expound]
            [mount.core :as mount]
            [clj-web-app.core :refer [start-app]]))

(alter-var-root #'s/*explain-out* (constantly expound/printer))

(defn start []
  (mount/start-without #'clj-web-app.core/repl-server))

(defn stop []
  (mount/stop-except #'clj-web-app.core/repl-server))

(defn restart []
  (stop)
  (start))


