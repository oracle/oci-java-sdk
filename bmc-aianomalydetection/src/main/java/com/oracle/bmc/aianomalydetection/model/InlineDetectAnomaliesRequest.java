/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = InlineDetectAnomaliesRequest.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "requestType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class InlineDetectAnomaliesRequest extends DetectAnomaliesDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("modelId")
        private String modelId;

        public Builder modelId(String modelId) {
            this.modelId = modelId;
            this.__explicitlySet__.add("modelId");
            return this;
        }
        /**
         * List of signal names.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("signalNames")
        private java.util.List<String> signalNames;

        /**
         * List of signal names.
         * @param signalNames the value to set
         * @return this builder
         **/
        public Builder signalNames(java.util.List<String> signalNames) {
            this.signalNames = signalNames;
            this.__explicitlySet__.add("signalNames");
            return this;
        }
        /**
         * Array containing data.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("data")
        private java.util.List<DataItem> data;

        /**
         * Array containing data.
         * @param data the value to set
         * @return this builder
         **/
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

    public Builder toBuilder() {
        return new Builder().copy(this);
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
    private final java.util.List<String> signalNames;

    /**
     * List of signal names.
     * @return the value
     **/
    public java.util.List<String> getSignalNames() {
        return signalNames;
    }

    /**
     * Array containing data.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("data")
    private final java.util.List<DataItem> data;

    /**
     * Array containing data.
     * @return the value
     **/
    public java.util.List<DataItem> getData() {
        return data;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("InlineDetectAnomaliesRequest(");
        sb.append("super=").append(super.toString());
        sb.append(", signalNames=").append(String.valueOf(this.signalNames));
        sb.append(", data=").append(String.valueOf(this.data));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof InlineDetectAnomaliesRequest)) {
            return false;
        }

        InlineDetectAnomaliesRequest other = (InlineDetectAnomaliesRequest) o;
        return java.util.Objects.equals(this.signalNames, other.signalNames)
                && java.util.Objects.equals(this.data, other.data)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.signalNames == null ? 43 : this.signalNames.hashCode());
        result = (result * PRIME) + (this.data == null ? 43 : this.data.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
