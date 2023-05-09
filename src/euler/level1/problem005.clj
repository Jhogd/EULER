(ns euler.level1.problem005)

(defn mod-equal-zero? [dividend divisor]
  (zero? (mod dividend divisor)))

(defn pow [base power]
  (reduce *' (repeat power base)))

(defn smallest-exponent [base largest-num]
  (->> (filter #(< (pow base %) largest-num) (range largest-num))
       (last)))

(defn prime-number? [n]
  (if  (= n 1)
    false
    (empty? (filter #(mod-equal-zero? n %) (rest (rest (range n)))))))

(defn list-primes [n]
  (rest (filter prime-number? (range n))))

(defn exponent-coll [n largest-num]
  (map #(smallest-exponent % largest-num) n))

(defn applied-exponents [prime-collection exponent-collection]
  (map pow prime-collection exponent-collection))

(defn euler-5 [n]
  (->> (applied-exponents (list-primes n)
                          (exponent-coll (list-primes n) n))
       (apply *)))
