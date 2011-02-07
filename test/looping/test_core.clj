(ns looping.test-core
  (:use midje.sweet
        looping.core))

(facts "power"
       (power 2 2)  => 4
       (power 5 3)  => 125
       (power 7 0)  => 1
       (power 0 10) => 0)
