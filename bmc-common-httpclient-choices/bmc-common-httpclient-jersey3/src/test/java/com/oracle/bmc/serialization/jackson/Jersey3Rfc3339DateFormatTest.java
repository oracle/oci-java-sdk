/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.serialization.jackson;

import com.oracle.bmc.http.client.Serializer;
import com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel;
import org.junit.Test;

import java.io.IOException;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Objects;

import static org.junit.Assert.assertEquals;

public class Jersey3Rfc3339DateFormatTest {

    private static final Serializer mapper = Serializer.getDefault();

    @Test
    public void deserializeNanos() throws IOException {
        testDeserializeOne("1937-01-01T12:00:27.873834939+00:20");
        testDeserializeOne("1937-01-01T12:00:27.873834939Z");
        testDeserializeOne("2021-04-29T10:00:00Z");
        testDeserializeOne("2021-05-13T10:58:09.628313-07:00");
    }

    private void testDeserializeOne(String dateString) throws IOException {
        // Test date deserialization matches expected
        Date expected =
                Date.from(DateTimeFormatter.ISO_OFFSET_DATE_TIME.parse(dateString, Instant::from));
        assertEquals(expected, mapper.readValue('"' + dateString + '"', Date.class));

        // Test date deserialization in an object
        TestResource expectedResource =
                TestResource.builder().id("ocid").timeCreated(expected).build();
        String json = "{\"id\":\"ocid\",\"timeCreated\":\"" + dateString + "\"}";
        assertEquals(expectedResource, mapper.readValue(json, TestResource.class));
    }

    @Test
    public void serializeNanos() throws IOException {
        testSerializeOne("1937-01-01T12:00:27.873834939+00:20", "1937-01-01T11:40:27.873Z");
        testSerializeOne("1937-01-01T12:00:27.873834939Z", "1937-01-01T12:00:27.873Z");
        testSerializeOne("2021-04-29T10:00:00Z", "2021-04-29T10:00:00.000Z");
        testSerializeOne("2021-05-13T10:58:09.628313-07:00", "2021-05-13T17:58:09.628Z");
    }

    private void testSerializeOne(String dateString, String expectedSerialized) throws IOException {
        // Test that matches expected
        Date date =
                Date.from(DateTimeFormatter.ISO_OFFSET_DATE_TIME.parse(dateString, Instant::from));
        assertEquals('"' + expectedSerialized + '"', mapper.writeValueAsString(date));

        // Test that matches inside a resource
        TestResource testResource = TestResource.builder().id("ocid").timeCreated(date).build();
        String expectedJson = "{\"id\":\"ocid\",\"timeCreated\":\"" + expectedSerialized + "\"}";
        assertEquals(expectedJson, mapper.writeValueAsString(testResource));
    }

    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = TestResource.Builder.class)
    @com.fasterxml.jackson.annotation.JsonFilter(ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
    public static final class TestResource extends ExplicitlySetBmcModel {
        @Deprecated
        @java.beans.ConstructorProperties({"id", "timeCreated"})
        public TestResource(String id, Date timeCreated) {
            this.id = id;
            this.timeCreated = timeCreated;
        }

        public String getId() {
            return this.id;
        }

        public Date getTimeCreated() {
            return this.timeCreated;
        }

        public boolean equals(final Object o) {
            if (o == this) return true;
            if (!(o instanceof TestResource)) return false;
            final TestResource other = (TestResource) o;
            return Objects.equals(id, other.id)
                    && Objects.equals(timeCreated, other.timeCreated)
                    && super.equals(other);
        }

        public int hashCode() {
            final int PRIME = 59;
            int result = PRIME + (id == null ? 43 : id.hashCode());
            result = result * PRIME + (timeCreated == null ? 43 : timeCreated.hashCode());
            result = result * PRIME + super.hashCode();
            return result;
        }

        public String toString() {
            return "RFC3339DateFormatTest.TestResource(id="
                    + this.getId()
                    + ", timeCreated="
                    + this.getTimeCreated()
                    + ", super="
                    + super.toString()
                    + ")";
        }

        @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
        public static class Builder {
            @com.fasterxml.jackson.annotation.JsonProperty("id")
            private String id;

            Builder() {}

            public Builder id(String id) {
                this.id = id;
                this.__explicitlySet__.add("id");
                return this;
            }

            @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
            private java.util.Date timeCreated;

            public Builder timeCreated(java.util.Date timeCreated) {
                this.timeCreated = timeCreated;
                this.__explicitlySet__.add("timeCreated");
                return this;
            }

            @com.fasterxml.jackson.annotation.JsonIgnore
            private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<>();

            public TestResource build() {
                TestResource __instance__ = new TestResource(id, timeCreated);
                for (String prop : __explicitlySet__) {
                    __instance__.markPropertyAsExplicitlySet(prop);
                }
                return __instance__;
            }

            public String toString() {
                return "RFC3339DateFormatTest.TestResource.Builder(id="
                        + this.id
                        + ", timeCreated="
                        + this.timeCreated
                        + ", __explicitlySet__="
                        + this.__explicitlySet__
                        + ")";
            }
        }

        /** Create a new builder. */
        public static Builder builder() {
            return new Builder();
        }

        /** The OCID of the resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private final String id;

        /** Time the resource was created. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private final java.util.Date timeCreated;
    }
}
