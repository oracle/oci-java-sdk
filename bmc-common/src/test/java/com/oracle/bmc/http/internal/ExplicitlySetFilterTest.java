/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.http.internal;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.PropertyWriter;
import com.oracle.bmc.requests.BmcRequest;
import org.junit.Ignore;
import org.junit.Test;
import org.mockito.ArgumentCaptor;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.Invocation;
import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

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
        try (RestClient rc = new RestClient(client, ef)) {
            Invocation.Builder ib = mock(Invocation.Builder.class);
            rc.post(new WrappedInvocationBuilder(ib), sub, new BmcRequest());

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

    private static String serializeForPost(Object o) {
        Client client = mock(Client.class);
        EntityFactory ef = mock(EntityFactory.class);
        try (RestClient rc = new RestClient(client, ef)) {

            Invocation.Builder ib = mock(Invocation.Builder.class);
            rc.post(new WrappedInvocationBuilder(ib), o, new BmcRequest());

            ArgumentCaptor<Object> bodyCaptor = ArgumentCaptor.forClass(Object.class);
            verify(ef).forPost(any(), bodyCaptor.capture());

            return bodyCaptor.getValue().toString();
        }
    }

    @lombok.Value
    @lombok.experimental.NonFinal
    @lombok.AllArgsConstructor(access = lombok.AccessLevel.PROTECTED)
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
    static class Baseclass {
        @com.fasterxml.jackson.annotation.JsonProperty("baseVal")
        Integer baseVal;

        @com.fasterxml.jackson.annotation.JsonProperty("major_version")
        String majorVersion;

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
    }

    @lombok.Value
    @lombok.ToString(callSuper = true)
    @lombok.EqualsAndHashCode(callSuper = true)
    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Subclass.Builder.class)
    @com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type"
    )
    @com.fasterxml.jackson.annotation.JsonFilter(
            com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
    static class Subclass extends Baseclass {
        @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
        @lombok.experimental.Accessors(fluent = true)
        public static class Builder {
            @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
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
                Subclass __instance__ = new Subclass(baseVal, majorVersion, subVal);
                __instance__.__explicitlySet__.addAll(__explicitlySet__);
                return __instance__;
            }

            @com.fasterxml.jackson.annotation.JsonIgnore
            public Builder copy(Subclass o) {
                return baseVal(o.getBaseVal()).subVal(o.getSubVal());
            }
        }

        /**
         * Create a new builder.
         */
        public static Builder builder() {
            return new Builder();
        }

        public Subclass(Integer baseVal, String majorVersion, String subVal) {
            super(baseVal, majorVersion);
            this.subVal = subVal;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("subVal")
        String subVal;

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
    }
}
