import groovy.lang.Grapes
@Grapes(
	@Grab(group = 'joda-time', module = 'joda-time', version = '2.3')	
)
import org.joda.time.DateTime
import org.joda.time.format.DateTimeFormat

def time = new DateTime('2015-12-05T12:00:00Z')
def format = DateTimeFormat.forPattern 'dd/MM/yyyy'
println time.toString(format)
