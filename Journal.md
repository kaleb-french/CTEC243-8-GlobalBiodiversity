# Journal
Write your Journal questions and notes here.

Phase 1-
created a HashMap that holds counts for planets species, the planet name is the key and value is the counts. A HashMap is greate for this because having a data set of counts for items allows 0(1) lookup via the hashmap, and no need for the data to be ordered in any way. An arrayList to hold the counts would also require you to keep up with what plants are what indices.

Phase 2-
It handles a first time by checking the map for the key and if it dosn't exist it creates the key and the inital value of 1. Mostly just remembering the syntax and remembering to put inside a tray catch or it wont compile.

Phase 3-
Added a counter for highest and lowest in the existing iteration loop. Added condition to check against current if it is higher or lower than highest and lowest and reassign the key if it is. The highest and lowest counts take O(N) full looping through all values to check while checking a single value by key in the table is a hash lookup of O(1). 

Phase 4-
Tried with empty file, tried with all 1s, tried with one animal with 55 entrys, all went off without a hitch.
