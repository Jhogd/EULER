(ns euler.level1.problem001-spec
  (:use
    [speclj.core]
    [euler.level1.problem001]))

; http://projecteuler.net/index.php?section=problems&id=1

(describe "Euler Problem #1"

  (it "knows if n is a multiple of 3 or 5"
    (should= false (multiple-of-5-3? 8))
    (should= true (multiple-of-5-3? 3))
    (should= true (multiple-of-5-3? 5)))

  (it "finds multiples less than n"
    (should= [3 5 6 9] (multiples-less-than 10))
    (should= [3 5 6 9 10 12 15] (multiples-less-than 16)))

  (it "Solves #1"
    (should= 23 (euler-1 10))
    (should= 233168 (euler-1 1000)))

  )