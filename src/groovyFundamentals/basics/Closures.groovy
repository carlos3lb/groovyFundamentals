def myClosure = {println "In my closure at ${new Date()}"}
myClosure()

for (i in 1..3) { myClosure() sleep 1000}

(1..3).each {myClosure()}
(1..3).each { print it}
(1..3).each {i -> print i}
println''
(1..10).findAll({it%2==0}).each({print it})