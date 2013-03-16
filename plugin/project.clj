(defproject rm-hull/lein-cljsbuild "0.3.1-SNAPSHOT"
  :description "ClojureScript Autobuilder Plugin"
  :url "http://github.com/rm-hull/lein-cljsbuild"
  :license
    {:name "Eclipse Public License - v 1.0"
     :url "http://www.eclipse.org/legal/epl-v10.html"
     :distribution :repo}
  :dependencies [[fs "1.3.3"]]
  :profiles {
    :dev {
      :dependencies [
        [midje "1.4.0"]
        [rm-hull/cljsbuild "0.3.1-SNAPSHOT"]]
      :plugins [[lein-midje "2.0.4"]]}}
  :eval-in-leiningen true)
