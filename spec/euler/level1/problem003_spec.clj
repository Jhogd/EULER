(ns euler.level1.problem003-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem003 :refer :all]))

; https://projecteuler.net/problem=3
(describe "Euler Problem #3"
  (it "Should give a statement on if a number
  is a factor of some number n"
    (should= true (is-a-factor? 4 2))
    (should= false (is-a-factor? 4 3))
    (should= true (is-a-factor? 10 2)))

  (it "Should loop and divide until the mod
  no longer equals 0"
    (should= 1  (mod-loop 4 2))
    (should= 25  (mod-loop 100 2))
    (should= 22 (mod-loop 550 5)))

  (it "Returns the largest prime factor"
    (should= 2 (euler-3 4))
    (should= 5 (euler-3 5))
    (should= 157 (euler-3 1256))
    (should= 6857 (euler-3 600851475143))))
(run-specs)
