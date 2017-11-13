def file = new File("src/groovyFundamentals/xml/route.gpx")
println file.exists()

def sluper = new XmlSlurper()
def gpx = sluper.parse(file)

println gpx.rte.name
println gpx.@version
gpx.rte.rtept.each {println it.name}

def markupBuilder = new groovy.xml.StreamingMarkupBuilder()
def xml = markupBuilder.bind {
	points {
		gpx.rte.rtept.each { p->
			point {
				latitude(p.@lat)
				longitude(p.@lon)
			}
		}
	}
}

def output = new File("src/groovyFundamentals/xml/output.xml")
output.write(xml.toString())