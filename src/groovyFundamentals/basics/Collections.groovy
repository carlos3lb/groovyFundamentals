def galacticos = ["Zidane", "Beckham", "Figo", "Ronaldo"]
def minus = "-"
galacticos.each {println "$minus $it"}
println "Best: ${galacticos[2]}"

println galacticos.size()
println galacticos[-1]
galacticos.eachWithIndex {galactico, index -> println "${index+1}: $galactico"}

println ((1..10).collect{it*2})
println ((1..10).find{it<5})
println ((1..10).findAll{it<5})
println ((1..10).sum())
println ((1..10).sum(1000))
println ((1..10).max())
