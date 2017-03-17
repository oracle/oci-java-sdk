/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.http.internal;

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.net.URI;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientRequestContext;
import javax.ws.rs.core.Configuration;
import javax.ws.rs.core.Cookie;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;

import org.glassfish.jersey.internal.util.collection.StringKeyIgnoreCaseMultivaluedMap;
import org.junit.Test;

import com.oracle.bmc.http.internal.RequestIdFilter;

public class RequestIdFilterTest {

    private static final RequestIdFilter FILTER = new RequestIdFilter();

    @Test
    public void filter_headerExists() throws IOException {
        StubClientRequestContext context = new StubClientRequestContext();
        context.headerMap.putSingle("opc-request-id", "testVal");
        FILTER.filter(context);
        assertEquals(1, context.headerMap.get("opc-request-id").size());
        assertEquals("testVal", context.headerMap.getFirst("opc-request-id"));
    }

    @Test
    public void filter_headerAbsent() throws IOException {
        StubClientRequestContext context = new StubClientRequestContext();
        FILTER.filter(context);
        assertEquals(1, context.headerMap.get("opc-request-id").size());
        assertFalse(((String) context.headerMap.getFirst("opc-request-id")).isEmpty());
    }

    private static final class StubClientRequestContext implements ClientRequestContext {
        private final StringKeyIgnoreCaseMultivaluedMap<Object> headerMap =
                new StringKeyIgnoreCaseMultivaluedMap<>();

        @Override
        public Object getProperty(String name) {
            return null;
        }

        @Override
        public Collection<String> getPropertyNames() {
            return null;
        }

        @Override
        public void setProperty(String name, Object object) {}

        @Override
        public void removeProperty(String name) {}

        @Override
        public URI getUri() {
            return null;
        }

        @Override
        public void setUri(URI uri) {}

        @Override
        public String getMethod() {
            return null;
        }

        @Override
        public void setMethod(String method) {}

        @Override
        public MultivaluedMap<String, Object> getHeaders() {
            return headerMap;
        }

        @Override
        public MultivaluedMap<String, String> getStringHeaders() {
            return null;
        }

        @Override
        public String getHeaderString(String name) {
            return null;
        }

        @Override
        public Date getDate() {
            return null;
        }

        @Override
        public Locale getLanguage() {
            return null;
        }

        @Override
        public MediaType getMediaType() {
            return null;
        }

        @Override
        public List<MediaType> getAcceptableMediaTypes() {
            return null;
        }

        @Override
        public List<Locale> getAcceptableLanguages() {
            return null;
        }

        @Override
        public Map<String, Cookie> getCookies() {
            return null;
        }

        @Override
        public boolean hasEntity() {
            return false;
        }

        @Override
        public Object getEntity() {
            return null;
        }

        @Override
        public Class<?> getEntityClass() {
            return null;
        }

        @Override
        public Type getEntityType() {
            return null;
        }

        @Override
        public void setEntity(Object entity) {}

        @Override
        public void setEntity(Object entity, Annotation[] annotations, MediaType mediaType) {}

        @Override
        public Annotation[] getEntityAnnotations() {
            return null;
        }

        @Override
        public OutputStream getEntityStream() {
            return null;
        }

        @Override
        public void setEntityStream(OutputStream outputStream) {}

        @Override
        public Client getClient() {
            return null;
        }

        @Override
        public Configuration getConfiguration() {
            return null;
        }

        @Override
        public void abortWith(Response response) {}
    }
}
