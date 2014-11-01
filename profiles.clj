{:user {:plugins [
                  ;; [lein-pedantic "0.0.5"]
                  ;; [lein-ritz "0.6.0"]
                  ;; [lein-checkout-deps "1.0.0"]
                  ;; [lein-haml-sass "0.2.4"]
                  ;; [lein-midje "2.0.1"]

                  ;; development
                  [cider/cider-nrepl "0.8.0-SNAPSHOT"]; better IDEs
                  [mvxcvi/whidbey "0.4.1"]; pretty printer
                  [lein-try "0.4.3"] ; try libs from CLI
                  [lein-ancient "0.5.5"];; find outdated things; for this file use upgrade-profiles

                  ;; [lein-plz "0.3.0"] ; plz add om hiccup
                  
                  ;; deployment
                  [lein-bin "0.3.4"] ; plz add om hiccup

                  ;; web
                  ;; [hiccup-bridge "1.0.1"] ;; convert html to hiccup

                  ;; linters
                  [lein-checkall "0.1.1"]; all linters at once
                  ;; [lein-kibit "0.0.8"]

                  ]
        :dependencies [
                       [slamhound "1.5.5"]
                       ]
        :aliases {"slamhound" ["run" "-m" "slam.hound"]
                  "r" ["run"]}}}

;; https://github.com/cldwalker/leinfiles/blob/master/profiles.clj{
;;  { :user {
;;    :plugins [
;;              ;[lein-clojars "0.9.0"]
;;              ;[lein-light "0.0.4"]
;;              [lein-difftest "2.0.0"]
;;              [lein-grep "0.1.0"]
;;              [lein-open "0.1.0"]
;;              [lein-outdated "1.0.0"]
;;              [lein-exec "0.3.0"]
;;              [lein-pprint "1.1.1"]
;;              [lein-spell "0.1.0"]
;;              ]
;;    :repl-options {
;;      :init (do
;;        (use '[table.core :only (table)])
;;        (use 'desc.core)
;;        (use 'rubydoc.core)
;;        (use '[clojure.repl :only (dir-fn)])
;;        (load-file (str (System/getProperty "user.home") "/.lein/user.clj"))) }
;;    :dependencies [[table "0.4.0"]
;;                   [desc "0.1.0"]
;;                   [rubydoc "0.4.0"]]
;;  }
;; }

;; http://z.caudate.me/give-your-clojure-workflow-more-flow/
;; {:user {:plugins [[lein-cljsbuild "1.0.0"]
;;                   [lein-clojars "0.9.1"]
;;                   [lein-midje    "3.1.3"]
;;                   [lein-midje-doc "0.0.18"]
;;                   [codox "0.6.6"]]
;;          :dependencies [[spyscope "0.1.4"]
;;                         [org.clojure/tools.namespace "0.2.4"]
;;                         [io.aviso/pretty "0.1.8"]
;;                         [im.chit/vinyasa "0.1.2"]]
;;          :injections [(require 'spyscope.core)
;;                       (require 'vinyasa.inject)
;;
;;                       (vinyasa.inject/inject 'clojure.core
;;                         '[[vinyasa.inject [inject inject]]
;;                           [vinyasa.pull [pull pull]]
;;                           [vinyasa.lein [lein lein]]
;;                           [clojure.repl apropos dir doc find-doc source
;;                                         [root-cause cause]]
;;                           [clojure.tools.namespace.repl [refresh refresh]]
;;                           [clojure.pprint [pprint >pprint]]
;;                           [io.aviso.binary [write-binary >bin]]])
;;
;;                       (require 'io.aviso.repl
;;                                'clojure.repl
;;                                'clojure.main)
;;                       (alter-var-root #'clojure.main/repl-caught
;;                         (constantly @#'io.aviso.repl/pretty-pst))
;;                       (alter-var-root #'clojure.repl/pst
;;                         (constantly @#'io.aviso.repl/pretty-pst))]}}

;; {:user {:plugins [[lein-swank "1.4.5"]
;;                   ;; [lein-pedantic "0.0.5"]
;;                   ;; [lein-ritz "0.6.0"]
;;                   [lein-checkout-deps "1.0.0"]
;;                   ;; [lein-haml-sass "0.2.4"]
;;                   [lein-midje "2.0.1"]
;;                   [lein-kibit "0.0.7"]]}
;;        {:dependencies [[slamhound "1.3.0"]]}
;;        {:aliases {"slamhound" ["run" "-m" "slam.hound"]}}}

;; https://github.com/chadharrington/my-profiles-clj/blob/master/profiles.clj
;; {:user
;;  {:signing {:gpg-key "chad@farbetter.com"}
;;   :dependencies [[pjstadig/humane-test-output "0.6.0"]]
;;   :injections [(require 'pjstadig.humane-test-output)
;;                (pjstadig.humane-test-output/activate!)]
;;   :plugins [[cider/cider-nrepl "0.7.0"]
;;             [com.jakemccrary/lein-test-refresh "0.5.4"]
;;             [lein-ancient "0.5.5"]
;;             [lein-cloverage "1.0.2"]]}}
