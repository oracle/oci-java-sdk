/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aianomalydetection.model;

/**
 * This is the specialised JSON format that we accept as Training data, with an additional
 * field for 'requestType' which is a required field used deciding whether it is an inline
 * request or contains embedded data.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210101")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = InlineDetectAnomaliesRequest.Builder.class
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "requestType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class InlineDetectAnomaliesRequest extends DetectAnomaliesDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("modelId")
        private String modelId;

        public Builder modelId(String modelId) {
            this.modelId = modelId;
            this.__explicitlySet__.add("modelId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("signalNames")
        private java.util.List<String> signalNames;

        public Builder signalNames(java.util.List<String> signalNames) {
            this.signalNames = signalNames;
            this.__explicitlySet__.add("signalNames");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("data")
        private java.util.List<DataItem> data;

        public Builder data(java.util.List<DataItem> data) {
            this.data = data;
            this.__explicitlySet__.add("data");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public InlineDetectAnomaliesRequest build() {
            InlineDetectAnomaliesRequest __instance__ =
                    new InlineDetectAnomaliesRequest(modelId, signalNames, data);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(InlineDetectAnomaliesRequest o) {
            Builder copiedBuilder =
                    modelId(o.getModelId()).signalNames(o.getSignalNames()).data(o.getData());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    @Deprecated
    public InlineDetectAnomaliesRequest(
            String modelId, java.util.List<String> signalNames, java.util.List<DataItem> data) {
        super(modelId);
        this.signalNames = signalNames;
        this.data = data;
    }

    /**
     * List of signal names.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("signalNames")
    java.util.List<String> signalNames;

    /**
     * Array containing data.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("data")
    java.util.List<DataItem> data;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
