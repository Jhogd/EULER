(ns euler.level1.problem008)

(defn digit-seq [n]
  (if (zero? n)
    []
    (lazy-seq (conj (digit-seq (quot n 10)) (mod n 10)))))

(defn sequence-by-13 [n]

    (reverse (map reverse (partition 13 1 (digit-seq n)))))

(defn euler-8 [n]
  (let [seqs (sequence-by-13 n)
        prods (map #(reduce * %) seqs)]
    (if (seq seqs)
      (apply max prods))))