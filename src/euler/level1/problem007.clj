(ns euler.level1.problem007)

(defn mod-equal-zero? [dividend divisor]
  (zero? (mod dividend divisor)))

(defn prime-number? [n]
  (if  (= n 1)
    false
    (empty? (filter #(mod-equal-zero? n %) (rest (rest (range n)))))))

(defn nth-prime [n]
  (nth (filter prime-number? (range)) n))

