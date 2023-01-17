/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.internal;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.Test;

import java.text.ParseException;
import java.util.Date;
import java.util.Set;

public class RFC3339DateFormatTest {
    @Test
    public void parseNanos() throws ParseException {
        RFC3339DateFormat df = new RFC3339DateFormat();
        df.parse("1937-01-01T12:00:27.873834939+00:20");
        df.parse("1937-01-01T12:00:27.873834939Z");
        df.parse("2021-04-29T10:00:00Z");
        df.parse("2021-05-13T10:58:09.628313-07:00");
    }

    @Test
    public void deserializeNanos() throws JsonProcessingException {
        com.oracle.bmc.http.Serialization.getObjectMapper()
                .readValue(
                        "{\"id\": \"ocid\", \"timeCreated\": \"1937-01-01T12:00:27.873834939+00:20\"}",
                        TestResource.class);
        com.oracle.bmc.http.Serialization.getObjectMapper()
                .readValue(
                        "{\"id\": \"ocid\", \"timeCreated\": \"1937-01-01T12:00:27.873834939Z\"}",
                        TestResource.class);
        com.oracle.bmc.http.Serialization.getObjectMapper()
                .readValue(
                        "{\"id\": \"ocid\", \"timeCreated\": \"2021-04-29T10:00:00Z\"}",
                        TestResource.class);
        com.oracle.bmc.http.Serialization.getObjectMapper()
                .readValue(
                        "{\"id\": \"ocid\", \"timeCreated\": \"2021-05-13T10:58:09.628313-07:00\"}",
                        TestResource.class);
    }

    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = TestResource.Builder.class)
    @com.fasterxml.jackson.annotation.JsonFilter(
            com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
    public static final class TestResource {
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

        public Set<String> get__explicitlySet__() {
            return this.__explicitlySet__;
        }

        public boolean equals(final Object o) {
            if (o == this) return true;
            if (!(o instanceof TestResource)) return false;
            final TestResource other = (TestResource) o;
            final Object this$id = this.getId();
            final Object other$id = other.getId();
            if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
            final Object this$timeCreated = this.getTimeCreated();
            final Object other$timeCreated = other.getTimeCreated();
            if (this$timeCreated == null
                    ? other$timeCreated != null
                    : !this$timeCreated.equals(other$timeCreated)) return false;
            final Object this$__explicitlySet__ = this.get__explicitlySet__();
            final Object other$__explicitlySet__ = other.get__explicitlySet__();
            if (this$__explicitlySet__ == null
                    ? other$__explicitlySet__ != null
                    : !this$__explicitlySet__.equals(other$__explicitlySet__)) return false;
            return true;
        }

        public int hashCode() {
            final int PRIME = 59;
            int result = 1;
            final Object $id = this.getId();
            result = result * PRIME + ($id == null ? 43 : $id.hashCode());
            final Object $timeCreated = this.getTimeCreated();
            result = result * PRIME + ($timeCreated == null ? 43 : $timeCreated.hashCode());
            final Object $__explicitlySet__ = this.get__explicitlySet__();
            result =
                    result * PRIME
                            + ($__explicitlySet__ == null ? 43 : $__explicitlySet__.hashCode());
            return result;
        }

        public String toString() {
            return "RFC3339DateFormatTest.TestResource(id="
                    + this.getId()
                    + ", timeCreated="
                    + this.getTimeCreated()
                    + ", __explicitlySet__="
                    + this.get__explicitlySet__()
                    + ")";
        }

        public Builder toBuilder() {
            return new Builder().id(this.id).timeCreated(this.timeCreated);
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
            private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

            public TestResource build() {
                TestResource __instance__ = new TestResource(id, timeCreated);
                __instance__.__explicitlySet__.addAll(__explicitlySet__);
                return __instance__;
            }

            @com.fasterxml.jackson.annotation.JsonIgnore
            public Builder copy(TestResource o) {
                Builder copiedBuilder = id(o.getId()).timeCreated(o.getTimeCreated());

                copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
                return copiedBuilder;
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

        /**
         * Create a new builder.
         */
        public static Builder builder() {
            return new Builder();
        }

        /**
         * The OCID of the resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private final String id;

        /**
         * Time the resource was created.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private final java.util.Date timeCreated;

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
    }
}
