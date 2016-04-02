(ns four-clojure.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (def solutions (sorted-map
  26 "#(take % (map last (iterate (fn [x] (cons (last x) (list (reduce + x)))) '(0 1))))"
  27 "(fn isPalindrome [s] (if (< (count s) 2)  true (if (= (first s) (last s)) (isPalindrome (drop 1 (drop-last s))) false)))"
  28 "(fn f [x] (mapcat #(if (coll? %) (f %) (list %)) x))"
  ))
  (println "\n === Solutions for 4Clojure problems: === \n")
  (println (map #(str "\n" (key %) ": " (solutions (key %)) "\n") solutions))
  (println "\n ===   (>_<)   ===\n"))
