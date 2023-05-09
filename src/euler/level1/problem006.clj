(ns euler.level1.problem006)

(defn square-int [n]
  (* n n))

(defn apply-square-coll [coll]
  (map square-int coll))

(defn sum-squared-col [coll]
  (reduce + (apply-square-coll coll)))

(defn square-sum-coll [coll]
  (square-int (reduce + coll)))

(defn euler-6 [n]
  (- (square-sum-coll (rest (range (+ 1 n))))
     (sum-squared-col (rest (range (+ 1 n)))))
  )
