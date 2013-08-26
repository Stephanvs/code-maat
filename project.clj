;;; Copyright (C) 2013 Adam Tornhill
;;;
;;; Distributed under the GNU General Public License v3.0,
;;; see http://www.gnu.org/licenses/gpl.html

(defproject code-maat "0.1.0"
  :description "A toolset to mine and analyze version control data"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.0-alpha5"]
                 [org.clojure/data.zip "0.1.0"]
		 [incanter "1.5.2"]
                 [org.clojure/tools.cli "0.2.4"]
                 [org.clojure/data.csv "0.1.2"]
                 [clj-time "0.5.1"]
                 [org.clojure/math.numeric-tower "0.0.2"]
                 [org.clojure/math.combinatorics "0.0.4"]]
  :main code-maat.core
  :aot [code-maat.core]
  :jvm-opts ["-Djava.awt.headless=true"])
