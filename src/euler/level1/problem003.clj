(ns euler.level1.problem003)


(defn is-a-factor? [factored-num n]
  (zero? (mod factored-num n)))



(defn mod-loop [dividend factor]
  (loop [div dividend]
    (if (is-a-factor? div factor)
      (recur (/ div factor))
      div
      )))


(defn euler-3 [n]
  (loop [div n
         fact 2]
    (if (<= div 1)
      (- fact 1)
      (recur (mod-loop div fact) (+ fact 1))))
  )