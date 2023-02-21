/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aianomalydetection.model;

/**
 * Base class for the DetectAnomalies call. It contains the identifier that is used for deciding
 * what type of request this is. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210101")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "requestType",
        defaultImpl = DetectAnomaliesDetails.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = InlineDetectAnomaliesRequest.class,
            name = "INLINE"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = EmbeddedDetectAnomaliesRequest.class,
            name = "BASE64_ENCODED")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public class DetectAnomaliesDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"modelId", "sensitivity"})
    protected DetectAnomaliesDetails(String modelId, Float sensitivity) {
        super();
        this.modelId = modelId;
        this.sensitivity = sensitivity;
    }

    /** The OCID of the trained model. */
    @com.fasterxml.jackson.annotation.JsonProperty("modelId")
    private final String modelId;

    /**
     * The OCID of the trained model.
     *
     * @return the value
     */
    public String getModelId() {
        return modelId;
    }

    /**
     * Sensitivity of the algorithm to detect anomalies - higher the value, more anomalies get
     * flagged. The value estimated during training is used by default. You can choose to provide a
     * custom value.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sensitivity")
    private final Float sensitivity;

    /**
     * Sensitivity of the algorithm to detect anomalies - higher the value, more anomalies get
     * flagged. The value estimated during training is used by default. You can choose to provide a
     * custom value.
     *
     * @return the value
     */
    public Float getSensitivity() {
        return sensitivity;
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
        sb.append("DetectAnomaliesDetails(");
        sb.append("super=").append(super.toString());
        sb.append("modelId=").append(String.valueOf(this.modelId));
        sb.append(", sensitivity=").append(String.valueOf(this.sensitivity));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DetectAnomaliesDetails)) {
            return false;
        }

        DetectAnomaliesDetails other = (DetectAnomaliesDetails) o;
        return java.util.Objects.equals(this.modelId, other.modelId)
                && java.util.Objects.equals(this.sensitivity, other.sensitivity)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.modelId == null ? 43 : this.modelId.hashCode());
        result = (result * PRIME) + (this.sensitivity == null ? 43 : this.sensitivity.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }

    /**
     * Type of request. This parameter is automatically populated by classes generated by the SDK.
     * For raw curl requests, you must provide this field.
     */
    public enum RequestType implements com.oracle.bmc.http.internal.BmcEnum {
        Inline("INLINE"),
        Base64Encoded("BASE64_ENCODED"),
        ;

        private final String value;
        private static java.util.Map<String, RequestType> map;

        static {
            map = new java.util.HashMap<>();
            for (RequestType v : RequestType.values()) {
                map.put(v.getValue(), v);
            }
        }

        RequestType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static RequestType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid RequestType: " + key);
        }
    };
}
