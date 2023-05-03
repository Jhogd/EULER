(ns euler.level1.problem001)

(defn multiple-of-5-3? [n]
  (or (zero? (mod n 3))
      (zero? (mod n 5))))

(defn multiples-less-than [n]
  (filter multiple-of-5-3? (rest (range n))))

(defn euler-1 [n]
  (apply + (multiples-less-than n)))
