(defproject lein-v-test :lein-v
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :plugins [[com.roomkey/lein-v "6.2.1"]]
  :main ^:skip-aot lein-v-test.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}}
  :release-tasks [["vcs" "assert-committed"]
                  ["v" "update"] ;; compute new version & tag it
                  ["vcs" "push"]
                  ["deploy"]])
