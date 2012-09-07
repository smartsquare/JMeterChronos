def logs = new File("mylogs.log").text
if(logs.contains("SomeException")) { 
  fail("The jmeter tests failed with SomeException!")
}