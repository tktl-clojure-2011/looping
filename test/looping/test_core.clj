(ns looping.test-core
  (:use midje.sweet
        looping.core))

(facts "power"
       (power 2 2)  => 4
       (power 5 3)  => 125
       (power 7 0)  => 1
       (power 0 10) => 0)

(facts "last-element"
       (last-element [])      => nil?
       (last-element [1 2 3]) => 3
       (last-element [2 5])   => 5)

(facts "seq="
       (seq= [1 2 4] '(1 2 4))  => true
       (seq= [1 2 3] [1 2 3 4]) => false
       (seq= [1 3 5] [])        => false)

(facts "find-first-index"
       (find-first-index zero? [1 1 1 0 3 7 0 2])            => 3
       (find-first-index zero? [1 1 3 7 2])                  => nil
       (find-first-index #(= % 6) [:cat :dog :six :blorg 6]) => 4
       (find-first-index nil? [])                            => nil)
