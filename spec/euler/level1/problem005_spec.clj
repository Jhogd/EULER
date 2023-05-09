(ns euler.level1.problem005-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem005 :refer :all]))

; https://projecteuler.net/problem=5

(describe "Euler Problem #5"
  (it "should return true if the mod of
  two numbers is zero"
    (should= true (mod-equal-zero? 4 2))
    (should= false (mod-equal-zero? 5 2)))
  (it "should return the smallest exponent
  that can be used while remaining under a given number"
    (should= 2 (smallest-exponent 2 5))
    (should= 1 (smallest-exponent 3 5)))
  (it "Should test if a number is prime"
    (should= true (prime-number? 2))
    (should= false (prime-number? 4))
    (should= true (prime-number? 13)))
  (it "should return a list of primes up until
  a given integer"
    (should= [2 3 5] (list-primes 6))
    (should= [2 3 5 7] (list-primes 10))
    (should= [2 3 5 7 11 13 17 19] (list-primes 20)))
  (it "should  return a collection of all the smallest
  exponents needed for a given collection and max number"
    (should= [3 2 1 1]  (exponent-coll [2 3 5 7] 10 ))
    (should= [4 2 1 1] (exponent-coll [2 4 7 9] 20) ))
  (it "should replace Math/pow and calculate exponents"
    (should= 1 (pow 1 2))
    (should= 9 (pow 3 2))
    (should= 3125 (pow 5 5)))

  (it "will apply math/pow to each value in a collection
  using a collection of exponents"
    (should= [8 9 5 7] (applied-exponents [2 3 5 7] [3 2 1 1]))
    (should= [1 4 9 16] (applied-exponents [1 2 3 4] [2 2 2 2])))

  (it "Solves #5"
    (should= 232792560 (euler-5 20)))
  )

(run-specs)
