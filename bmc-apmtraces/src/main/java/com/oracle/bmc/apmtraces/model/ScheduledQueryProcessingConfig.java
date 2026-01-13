/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmtraces.model;

/**
 * Definition of the scheduled query processing configuration. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ScheduledQueryProcessingConfig.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ScheduledQueryProcessingConfig
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"streaming", "objectStorage", "customMetric"})
    public ScheduledQueryProcessingConfig(
            Streaming streaming, ObjectStorage objectStorage, CustomMetric customMetric) {
        super();
        this.streaming = streaming;
        this.objectStorage = objectStorage;
        this.customMetric = customMetric;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("streaming")
        private Streaming streaming;

        public Builder streaming(Streaming streaming) {
            this.streaming = streaming;
            this.__explicitlySet__.add("streaming");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("objectStorage")
        private ObjectStorage objectStorage;

        public Builder objectStorage(ObjectStorage objectStorage) {
            this.objectStorage = objectStorage;
            this.__explicitlySet__.add("objectStorage");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("customMetric")
        private CustomMetric customMetric;

        public Builder customMetric(CustomMetric customMetric) {
            this.customMetric = customMetric;
            this.__explicitlySet__.add("customMetric");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ScheduledQueryProcessingConfig build() {
            ScheduledQueryProcessingConfig model =
                    new ScheduledQueryProcessingConfig(
                            this.streaming, this.objectStorage, this.customMetric);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ScheduledQueryProcessingConfig model) {
            if (model.wasPropertyExplicitlySet("streaming")) {
                this.streaming(model.getStreaming());
            }
            if (model.wasPropertyExplicitlySet("objectStorage")) {
                this.objectStorage(model.getObjectStorage());
            }
            if (model.wasPropertyExplicitlySet("customMetric")) {
                this.customMetric(model.getCustomMetric());
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

    @com.fasterxml.jackson.annotation.JsonProperty("streaming")
    private final Streaming streaming;

    public Streaming getStreaming() {
        return streaming;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("objectStorage")
    private final ObjectStorage objectStorage;

    public ObjectStorage getObjectStorage() {
        return objectStorage;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("customMetric")
    private final CustomMetric customMetric;

    public CustomMetric getCustomMetric() {
        return customMetric;
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
        sb.append("ScheduledQueryProcessingConfig(");
        sb.append("super=").append(super.toString());
        sb.append("streaming=").append(String.valueOf(this.streaming));
        sb.append(", objectStorage=").append(String.valueOf(this.objectStorage));
        sb.append(", customMetric=").append(String.valueOf(this.customMetric));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ScheduledQueryProcessingConfig)) {
            return false;
        }

        ScheduledQueryProcessingConfig other = (ScheduledQueryProcessingConfig) o;
        return java.util.Objects.equals(this.streaming, other.streaming)
                && java.util.Objects.equals(this.objectStorage, other.objectStorage)
                && java.util.Objects.equals(this.customMetric, other.customMetric)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.streaming == null ? 43 : this.streaming.hashCode());
        result =
                (result * PRIME)
                        + (this.objectStorage == null ? 43 : this.objectStorage.hashCode());
        result = (result * PRIME) + (this.customMetric == null ? 43 : this.customMetric.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
