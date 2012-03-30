package mjg

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.mock.web.MockHttpSession;

class HelloNameTests {
    HelloName servlet = new HelloName()

    @Test
    public void testDoGetWithNoName() {
        MockHttpServletRequest request = new MockHttpServletRequest()
        MockHttpServletResponse response = new MockHttpServletResponse()
        servlet.doGet(request, response)
        assert 'hello.jsp' == response.forwardedUrl
        assert request.getAttribute("name") == 'World'
    }

    @Test
    public void testDoGetWithName() {
        MockHttpServletRequest request = new MockHttpServletRequest()
        MockHttpServletResponse response = new MockHttpServletResponse()
        request.setParameter('name','Dolly')
        servlet.doGet(request, response)
        assert 'hello.jsp' == response.forwardedUrl
        assert request.getAttribute("name") == 'Dolly'
    }

    @Test
    public void testDoPostWithNoName() {
        MockHttpServletRequest request = new MockHttpServletRequest()
        MockHttpServletResponse response = new MockHttpServletResponse()
        servlet.doPost(request, response)
        assert 'hello.jsp' == response.forwardedUrl
        assert request.getAttribute("name") == 'World'
    }

    @Test
    public void testDoPostWithName() {
        MockHttpServletRequest request = new MockHttpServletRequest()
        MockHttpServletResponse response = new MockHttpServletResponse()
        request.setParameter('name','Dolly')
        servlet.doPost(request, response)
        assert 'hello.jsp' == response.forwardedUrl
        assert request.getAttribute("name") == 'Dolly'
    }
}
