/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.iot.model;

/**
 * Maps the metadata fields from the inbound payload using JQ. These mappings allow you to extract
 * specific metadata such as timestamps using JQ expressions. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250531")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = DigitalTwinAdapterEnvelopeMapping.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DigitalTwinAdapterEnvelopeMapping
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"timeObserved"})
    public DigitalTwinAdapterEnvelopeMapping(String timeObserved) {
        super();
        this.timeObserved = timeObserved;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * JQ expression to extract the observation timestamp from the payload. If not specified,
         * the system will default to using {@code timeReceived} as the timestamp.
         *
         * <p>Example: For payload {@code {"time": "<timestamp>","temp": 65,"hum": 55}}
         * 'timeObserved' can be mapped as [JQ Expression](https://jqplay.org/) {@code $.time}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeObserved")
        private String timeObserved;

        /**
         * JQ expression to extract the observation timestamp from the payload. If not specified,
         * the system will default to using {@code timeReceived} as the timestamp.
         *
         * <p>Example: For payload {@code {"time": "<timestamp>","temp": 65,"hum": 55}}
         * 'timeObserved' can be mapped as [JQ Expression](https://jqplay.org/) {@code $.time}.
         *
         * @param timeObserved the value to set
         * @return this builder
         */
        public Builder timeObserved(String timeObserved) {
            this.timeObserved = timeObserved;
            this.__explicitlySet__.add("timeObserved");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DigitalTwinAdapterEnvelopeMapping build() {
            DigitalTwinAdapterEnvelopeMapping model =
                    new DigitalTwinAdapterEnvelopeMapping(this.timeObserved);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DigitalTwinAdapterEnvelopeMapping model) {
            if (model.wasPropertyExplicitlySet("timeObserved")) {
                this.timeObserved(model.getTimeObserved());
            }
            return this;
        }
    }

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * JQ expression to extract the observation timestamp from the payload. If not specified, the
     * system will default to using {@code timeReceived} as the timestamp.
     *
     * <p>Example: For payload {@code {"time": "<timestamp>","temp": 65,"hum": 55}} 'timeObserved'
     * can be mapped as [JQ Expression](https://jqplay.org/) {@code $.time}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeObserved")
    private final String timeObserved;

    /**
     * JQ expression to extract the observation timestamp from the payload. If not specified, the
     * system will default to using {@code timeReceived} as the timestamp.
     *
     * <p>Example: For payload {@code {"time": "<timestamp>","temp": 65,"hum": 55}} 'timeObserved'
     * can be mapped as [JQ Expression](https://jqplay.org/) {@code $.time}.
     *
     * @return the value
     */
    public String getTimeObserved() {
        return timeObserved;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DigitalTwinAdapterEnvelopeMapping(");
        sb.append("super=").append(super.toString());
        sb.append("timeObserved=").append(String.valueOf(this.timeObserved));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DigitalTwinAdapterEnvelopeMapping)) {
            return false;
        }

        DigitalTwinAdapterEnvelopeMapping other = (DigitalTwinAdapterEnvelopeMapping) o;
        return java.util.Objects.equals(this.timeObserved, other.timeObserved)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.timeObserved == null ? 43 : this.timeObserved.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
