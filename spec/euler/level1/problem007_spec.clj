(ns euler.level1.problem007-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem007 :refer :all]))

; https://projecteuler.net/problem=7

(describe "Euler Problem #7"
  (it "should return true if the mod of
  two numbers is zero"
    (should= true (mod-equal-zero? 4 2))
    (should= false (mod-equal-zero? 5 2)))

  (it "Should test if a number is prime"
  (should= true (prime-number? 2))
  (should= false (prime-number? 4))
  (should= true (prime-number? 13)))

(it "returns the nth prime number"
  (should= 13 (nth-prime 6))
  (should= 104743 (nth-prime 10001))))


(run-specs)
