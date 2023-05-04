(ns euler.level1.problem002)

(defn second-last [n]
  (second (reverse n)))

(defn sum-second-last [n]
  (+ (second-last n) (last n)))


#_(defn fb-sequence [n]
    (loop [fibs [1 2]]
      (if (= n (count fibs))
        fibs
        (recur (conj fibs (sum-second-last fibs))))))


(defn euler-2 [n]
  (->> (take-while #(< (last %) n) (iterate #(conj % (sum-second-last %)) [1 2]))
       (last)
       (filter even?)
       (apply +)))
