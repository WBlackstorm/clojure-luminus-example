(ns clj-web-app.env
  (:require [selmer.parser :as parser]
            [clojure.tools.logging :as log]
            [clj-web-app.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[clj-web-app started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[clj-web-app has shut down successfully]=-"))
   :middleware wrap-dev})
