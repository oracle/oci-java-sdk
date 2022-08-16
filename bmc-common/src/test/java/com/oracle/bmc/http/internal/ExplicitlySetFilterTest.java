/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.internal;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.PropertyWriter;
import com.oracle.bmc.requests.BmcRequest;
import org.junit.Ignore;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.powermock.api.mockito.PowerMockito;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.Invocation;
import java.io.IOException;
import java.net.URI;
import java.util.Objects;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.when;

@Ignore("DEX-1801: Fix Mockito Problem in Release TeamCity Job")
public class ExplicitlySetFilterTest {
    @Test
    public void testFieldInSuperclass() throws Exception {
        Subclass pojo = Subclass.builder().baseVal(1).subVal("two").build();
        JsonGenerator jgen = mock(JsonGenerator.class);
        SerializerProvider provider = mock(SerializerProvider.class);
        PropertyWriter writer = mock(PropertyWriter.class);

        when(writer.getName()).thenReturn("baseVal");

        ExplicitlySetFilter.INSTANCE.serializeAsField(pojo, jgen, provider, writer);

        verify(writer, atLeast(1)).getName();
        verify(writer).serializeAsField(pojo, jgen, provider);
        verifyNoMoreInteractions(writer);
    }

    @Test
    public void testFieldInSubclass() throws Exception {
        Subclass pojo = Subclass.builder().baseVal(1).subVal("two").build();
        JsonGenerator jgen = mock(JsonGenerator.class);
        SerializerProvider provider = mock(SerializerProvider.class);
        PropertyWriter writer = mock(PropertyWriter.class);

        when(writer.getName()).thenReturn("subVal");

        ExplicitlySetFilter.INSTANCE.serializeAsField(pojo, jgen, provider, writer);

        verify(writer, atLeast(1)).getName();
        verify(writer).serializeAsField(pojo, jgen, provider);
        verifyNoMoreInteractions(writer);
    }

    @Test
    public void testExplicitNullFieldInSuperclass() throws Exception {
        Subclass pojo = Subclass.builder().baseVal(null).subVal("two").build();
        JsonGenerator jgen = mock(JsonGenerator.class);
        SerializerProvider provider = mock(SerializerProvider.class);
        PropertyWriter writer = mock(PropertyWriter.class);

        when(writer.getName()).thenReturn("baseVal");

        ExplicitlySetFilter.INSTANCE.serializeAsField(pojo, jgen, provider, writer);

        verify(writer, atLeast(1)).getName();
        verify(writer).serializeAsField(pojo, jgen, provider);
        verifyNoMoreInteractions(writer);
    }

    @Test
    public void testExplicitNullInSubclass() throws Exception {
        Subclass pojo = Subclass.builder().baseVal(1).subVal(null).build();
        JsonGenerator jgen = mock(JsonGenerator.class);
        SerializerProvider provider = mock(SerializerProvider.class);
        PropertyWriter writer = mock(PropertyWriter.class);

        when(writer.getName()).thenReturn("subVal");

        ExplicitlySetFilter.INSTANCE.serializeAsField(pojo, jgen, provider, writer);

        verify(writer, atLeast(1)).getName();
        verify(writer).serializeAsField(pojo, jgen, provider);
        verifyNoMoreInteractions(writer);
    }

    @Test
    public void testNullFieldInSuperclass() throws Exception {
        Subclass pojo = Subclass.builder().subVal("two").build();
        JsonGenerator jgen = mock(JsonGenerator.class);
        SerializerProvider provider = mock(SerializerProvider.class);
        PropertyWriter writer = mock(PropertyWriter.class);

        when(writer.getName()).thenReturn("baseVal");

        ExplicitlySetFilter.INSTANCE.serializeAsField(pojo, jgen, provider, writer);

        verify(writer, atLeast(1)).getName();
        verifyNoMoreInteractions(writer);
    }

    @Test
    public void testNullInSubclass() throws Exception {
        Subclass pojo = Subclass.builder().baseVal(1).build();
        JsonGenerator jgen = mock(JsonGenerator.class);
        SerializerProvider provider = mock(SerializerProvider.class);
        PropertyWriter writer = mock(PropertyWriter.class);

        when(writer.getName()).thenReturn("subVal");

        ExplicitlySetFilter.INSTANCE.serializeAsField(pojo, jgen, provider, writer);

        verify(writer, atLeast(1)).getName();
        verifyNoMoreInteractions(writer);
    }

    @Test
    public void deserializeNoDiscriminator() throws IOException {
        Subclass sub = Subclass.builder().baseVal(1).subVal("two").build();

        Client client = mock(Client.class);
        EntityFactory ef = mock(EntityFactory.class);
        URI requestURI = PowerMockito.mock(URI.class);

        try (RestClient rc = new RestClient(client, ef, null)) {
            Invocation.Builder ib = mock(Invocation.Builder.class);
            rc.post(new WrappedInvocationBuilder(ib, requestURI), sub, new BmcRequest());

            ArgumentCaptor<Object> bodyCaptor = ArgumentCaptor.forClass(Object.class);
            verify(ef).forPost(any(), bodyCaptor.capture());

            Object value = bodyCaptor.getValue();

            String serialized = value.toString();
            assertTrue(serialized.contains("\"type\":\"sub\""));
            String replaced = serialized.replace("sub", "unknown");
            assertTrue(replaced.contains("\"type\":\"unknown\""));

            Baseclass parsedSub =
                    RestClientFactory.getObjectMapper().readValue(serialized, Baseclass.class);
            assertEquals(Subclass.class, parsedSub.getClass());
            Baseclass parsedUnknown =
                    RestClientFactory.getObjectMapper().readValue(replaced, Baseclass.class);
            assertEquals(Baseclass.class, parsedUnknown.getClass());
        }
    }

    @Test
    public void serializeSnakeCasedParameter() {
        Subclass sub = Subclass.builder().baseVal(1).subVal("two").majorVersion("1.0").build();
        String serializedBody = serializeForPost(sub);

        assertTrue(serializedBody.contains("\"major_version\":\"1.0\""));
    }

    @Test
    public void serializeWeirdProperty() throws JsonProcessingException {
        Subclass sub = Subclass.builder().baseVal(1).subVal("two").ref("abc").build();
        String serializedBody = serializeForPost(sub);

        assertTrue(serializedBody.contains("\"$ref\":\"abc\""));

        Subclass deserialized =
                RestClientFactory.getObjectMapper().readValue(serializedBody, Subclass.class);
        assertEquals(sub, deserialized);

        sub = Subclass.builder().baseVal(1).subVal("two").build();
        serializedBody = serializeForPost(sub);

        assertFalse(serializedBody.contains("\"$ref\":\"abc\""));

        deserialized =
                RestClientFactory.getObjectMapper().readValue(serializedBody, Subclass.class);
        assertEquals(sub, deserialized);
    }

    private static String serializeForPost(Object o) {
        Client client = mock(Client.class);
        EntityFactory ef = mock(EntityFactory.class);
        URI requestURI = PowerMockito.mock(URI.class);
        try (RestClient rc = new RestClient(client, ef, null)) {

            Invocation.Builder ib = mock(Invocation.Builder.class);
            rc.post(new WrappedInvocationBuilder(ib, requestURI), o, new BmcRequest());

            ArgumentCaptor<Object> bodyCaptor = ArgumentCaptor.forClass(Object.class);
            verify(ef).forPost(any(), bodyCaptor.capture());

            return bodyCaptor.getValue().toString();
        }
    }

    @com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type",
        defaultImpl = Baseclass.class
    )
    @com.fasterxml.jackson.annotation.JsonSubTypes({
        @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = Subclass.class, name = "sub")
    })
    @com.fasterxml.jackson.annotation.JsonFilter(
            com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
    static class Baseclass extends ExplicitlySetBmcModel {
        @com.fasterxml.jackson.annotation.JsonProperty("baseVal")
        private final Integer baseVal;

        @com.fasterxml.jackson.annotation.JsonProperty("major_version")
        private final String majorVersion;

        protected Baseclass(
                @com.fasterxml.jackson.annotation.JsonProperty("baseVal") Integer baseVal,
                @com.fasterxml.jackson.annotation.JsonProperty("major_version")
                String majorVersion) {
            this.baseVal = baseVal;
            this.majorVersion = majorVersion;
        }

        public Integer getBaseVal() {
            return this.baseVal;
        }

        public String getMajorVersion() {
            return this.majorVersion;
        }

        public boolean equals(final Object o) {
            if (o == this) return true;
            if (!(o instanceof Baseclass)) return false;

            final Baseclass other = (Baseclass) o;
            return other.canEqual(this)
                    && Objects.equals(this.getBaseVal(), other.getBaseVal())
                    && Objects.equals(this.getMajorVersion(), other.getMajorVersion())
                    && super.equals(other);
        }

        protected boolean canEqual(final Object other) {
            return other instanceof Baseclass;
        }

        public int hashCode() {
            final int PRIME = 59;
            int result = super.hashCode();
            result = result * PRIME + (baseVal == null ? 43 : baseVal.hashCode());
            result = result * PRIME + (majorVersion == null ? 43 : majorVersion.hashCode());
            return result;
        }

        public String toString() {
            return "ExplicitlySetFilterTest.Baseclass(baseVal="
                    + this.getBaseVal()
                    + ", majorVersion="
                    + this.getMajorVersion()
                    + ", super="
                    + super.toString()
                    + ")";
        }
    }

    @com.fasterxml.jackson.annotation.JsonFilter(
            com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
    static final class Subclass extends Baseclass {
        @com.fasterxml.jackson.annotation.JsonProperty("subVal")
        private final String subVal;

        @com.fasterxml.jackson.annotation.JsonProperty("$ref")
        String ref;

        public Subclass(Integer baseVal, String majorVersion, String subVal, String ref) {
            super(baseVal, majorVersion);
            this.subVal = subVal;
            this.ref = ref;
        }

        public String getSubVal() {
            return this.subVal;
        }

        public String getRef() {
            return this.ref;
        }

        public boolean equals(final Object o) {
            if (o == this) return true;
            if (!(o instanceof Subclass)) return false;

            final Subclass other = (Subclass) o;
            return other.canEqual(this)
                    && Objects.equals(subVal, other.subVal)
                    && super.equals(other);
        }

        protected boolean canEqual(final Object other) {
            return other instanceof Subclass;
        }

        public int hashCode() {
            final int PRIME = 59;
            int result = super.hashCode();
            result = result * PRIME + (subVal == null ? 43 : subVal.hashCode());
            return result;
        }

        public String toString() {
            return "ExplicitlySetFilterTest.Subclass(super="
                    + super.toString()
                    + ", subVal="
                    + this.getSubVal()
                    + ", super="
                    + super.toString()
                    + ")";
        }

        @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
        public static class Builder {
            @com.fasterxml.jackson.annotation.JsonProperty("baseVal")
            private Integer baseVal;

            public Builder baseVal(Integer baseVal) {
                this.baseVal = baseVal;
                this.__explicitlySet__.add("baseVal");
                return this;
            }

            @com.fasterxml.jackson.annotation.JsonProperty("major_version")
            private String majorVersion;

            public Builder majorVersion(String majorVersion) {
                this.majorVersion = majorVersion;
                this.__explicitlySet__.add("majorVersion");
                return this;
            }

            @com.fasterxml.jackson.annotation.JsonProperty("$ref")
            private String ref;

            public Builder ref(String ref) {
                this.ref = ref;
                this.__explicitlySet__.add("ref");
                return this;
            }

            @com.fasterxml.jackson.annotation.JsonProperty("subVal")
            private String subVal;

            public Builder subVal(String subVal) {
                this.subVal = subVal;
                this.__explicitlySet__.add("subVal");
                return this;
            }

            @com.fasterxml.jackson.annotation.JsonIgnore
            private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

            public Subclass build() {
                Subclass model = new Subclass(baseVal, majorVersion, subVal, ref);
                for (String property : __explicitlySet__) {
                    model.markPropertyAsExplicitlySet(property);
                }
                return model;
            }

            @com.fasterxml.jackson.annotation.JsonIgnore
            public Builder copy(Subclass o) {
                return baseVal(o.getBaseVal()).subVal(o.getSubVal()).ref(o.getRef());
            }
        }

        /**
         * Create a new builder.
         */
        public static Builder builder() {
            return new Builder();
        }
    }
}
