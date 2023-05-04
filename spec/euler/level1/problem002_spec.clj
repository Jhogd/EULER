(ns euler.level1.problem002-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem002 :refer :all]))

; https://projecteuler.net/problem=2

(describe "Euler Problem #2"

  (it "should equal the second to last value in a sequence"
    (should= 4 (second-last (range 6)))
    )
  (it "should equal the sum of the last and second to last value in a seq"
    (should= 9 (sum-second-last (range 6))))
  #_(it "Should equal a fib sequence up to the given value"
    (should= [1 2 3] (fb-sequence 3 ))
    (should= [1 2 3 5 8] (fb-sequence 5 )))

  (it "Solves #2"
    (should= 44 (euler-2 90))
    (should= 4613732 (euler-2 4000000)))
  )

(run-specs)
