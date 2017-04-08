package com.mvpotter.kladrapi;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Assert;
import org.junit.Test;

import javax.ws.rs.ext.ContextResolver;
import java.io.IOException;

/**
 * @author mvpotter
 * @since 08/04/17
 */
public class ObjectMapperProviderTest {

    private static final String TEST_NAME = "testName";
    private static final String TEST_SURNAME = "testSurname";

    private static final String JSON = "{ \"name\": \"" + TEST_NAME + "\", \"surname\": \"" + TEST_SURNAME + "\" }";

    @Test
    public void testSkipUnknownFields() throws IOException {
        final ContextResolver<ObjectMapper> contextResolver = new ObjectMapperProvider();
        final ObjectMapper objectMapper = contextResolver.getContext(ObjectMapper.class);
        final TestEntity testEntity = objectMapper.readValue(JSON, TestEntity.class);
        Assert.assertEquals(TEST_NAME, testEntity.getName());
    }

    private static class TestEntity {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

}
