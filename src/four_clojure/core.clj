(ns four-clojure.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (def solutions (hash-map
  26 "#(take % (map last (iterate (fn [x] (cons (last x) (list (reduce + x)))) '(0 1))))"
  27 "asd"
  28 "asd"
  ))
  (println "\n === Solutions for 4Clojure problems: === \n")
  (println (reverse (map #(str "\n" (key %) ": " (solutions (key %)) "\n") solutions)))
  (println "\n ===   (>_<)   ===\n"))
