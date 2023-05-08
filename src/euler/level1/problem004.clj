(ns euler.level1.problem004)

(defn is-palindrome? [potential-pal]
  (= potential-pal (apply str (reverse potential-pal))))

(defn product-string [int1 int2]
  (str (* int1 int2)))

(defn euler-4 []
  (apply max
     (for [i (reverse (range 100 1000))
           j (reverse (range 100 1000))
          :let [largest-palindrome (product-string i j)]
          :when (is-palindrome? (product-string i j))]
       (Integer/parseInt largest-palindrome))))



