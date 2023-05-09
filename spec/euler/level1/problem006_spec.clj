(ns euler.level1.problem006-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem006 :refer :all]))

; https://projecteuler.net/problem=6

(describe "Euler Problem #6"
  (it "should give the square of an integer
  "(should= 1 (square-int 1))
    (should= 4 (square-int 2))
    (should= 9 (square-int 3)))
  (it "should generate a collection of numbers
  up till input and square all of them"
    (should= [1 4] (apply-square-coll [1 2]))
    (should= [1 4 9 16] (apply-square-coll [1 2 3 4]))
    (should= [9 25 36] (apply-square-coll [3 5 6])))
  (it "should sum a collections squared contents"
    (should= 5 (sum-squared-col [1 2]))
    (should= 29 (sum-squared-col [2 3 4])))
  (it "should sum the contents and square the result"
    (should= 4 (square-sum-coll [1 1]))
    (should= 9 (square-sum-coll [1 2]))
    (should= 16 (square-sum-coll [2 2])))

  (it "Solves #6 by taking the difference between
  the sum of squares and the square of sums to n"

    (should= 170 (euler-6 5))
    (should= 2640 (euler-6 10))
    (should= 25164150 (euler-6 100)))
  )

(run-specs)
