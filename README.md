jaxws-poc
=========

jaxws-poc

XSD/WSDL: app.wsdl, add.xsd

To run locally:

mvn jetty:run

To generate client:

wsdl2java -client -d output -p com.testing.poc.jaxws.client app.wsdl

Note:
This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
compliant code instead.
    
Sample war file is also created. See jaxws-poc.war. This can be uploaded to weblogic server

Sample client:

com.testing.poc.jaxws.client.OperationWS_OperationWSPort_Client

Source:

http://www.mkyong.com/webservices/jax-ws/jax-ws-spring-integration-example/




