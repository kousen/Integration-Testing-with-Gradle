package mjg;

import static org.junit.Assert.*;

import groovyx.net.http.ContentType;
import groovyx.net.http.HTTPBuilder
import org.junit.Test;

class ServletIntegrationTests {
    def httpPort = 8080
    
    @Test
    void testHelloServlet() {
        String response = "http://localhost:$httpPort/sample/hello".toURL().text.trim()
        assert response == 'Hello, Servlet!'
    }
    
    @Test
    void testNameServletGetWithoutName() {
        def http = new HTTPBuilder("http://localhost:$httpPort")
        http.get(path:'sample/helloname') { resp, html ->
            assert html.text().contains('Hello, World!')
        }
    }

    @Test
    void testNameServletGetWithName() {
        def http = new HTTPBuilder("http://localhost:$httpPort")
        http.get(path:'sample/helloname', 
            query:[name:'Dolly']) { resp, html ->
            assert html.text().contains('Hello, Dolly!')
        }
    }

    @Test
    void testNameServletPostWithoutName() {
        def http = new HTTPBuilder("http://localhost:$httpPort")
        http.post(path:'sample/helloname') { resp, html ->
            assert html.text().contains('Hello, World!')
        }
    }

    @Test
    void testNameServletPostWithName() {
        def http = new HTTPBuilder("http://localhost:$httpPort")
        http.get(path:'sample/helloname', 
            query:[name:'Dolly']) { resp, html ->
            assert html.text().contains('Hello, Dolly!')
        }
    }
}
