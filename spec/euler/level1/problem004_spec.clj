(ns euler.level1.problem004-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem004 :refer :all]))

; https://projecteuler.net/problem=4

(describe "Euler Problem #4"

  (it "should return true if the string input is a
  palindrome
  "(should= true (is-palindrome? "racecar"))
    (should= false (is-palindrome? "Hello"))
    (should= true (is-palindrome? "4004")))


  (it "Should multiply two numbers and convert to string"
    (should= "4" (product-string 2 2))
    (should= "10" (product-string 5 2)))


  (it "should return the largest palindrome
  that you can create with 3 digit numbers"
    (should= 906609 (euler-4 ))))


(run-specs)
